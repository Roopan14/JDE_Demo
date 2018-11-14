package com.example.roopanc.jde_demo;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.roopanc.jde_demo.Data.GridRowPOJO;
import com.example.roopanc.jde_demo.Data.RowAdapter;
import com.example.roopanc.jde_demo.formservicetypes.p01012.P01012_W01012B_FormParent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.e1.aisclient.FSREvent;
import com.oracle.e1.aisclient.FormRequest;
import com.oracle.e1.aisclient.JDERestServiceException;
import com.oracle.e1.aisclient.JDERestServiceProvider;
import com.oracle.e1.aisclient.LoginEnvironment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roopan C on 9/10/2018.
 */

public class WorkWithAddress extends Fragment implements View.OnClickListener {

    String alpha_name, search_type;
    EditText alphanameET, searchtypeET;
    ImageView searchBT;
    LoginEnvironment loginEnvironment;
    ProgressBar progressBar;
    P01012_W01012B_FormParent p01012form;
    int no_of_records;
    List<GridRowPOJO> gridRowPOJOS;
    RowAdapter rowAdapter;
    RecyclerView recyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getActivity(), loginEnvironment.getAisServerURL(), Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_work_with_addresses, container, false);
        progressBar = view.findViewById(R.id.progress_wwa);
        alphanameET = view.findViewById(R.id.alphanameET);
        searchtypeET = view.findViewById(R.id.searchtypeET);
        searchBT = view.findViewById(R.id.searchBT);
        searchBT.setOnClickListener(this);
        gridRowPOJOS = new ArrayList<>();
        rowAdapter = new RowAdapter(getActivity(), gridRowPOJOS);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(rowAdapter);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Work With Addresses");
    }

    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle(getString(R.string.app_name));
    }

    public void setLoginEnvironment(LoginEnvironment loginEnvironment)
    {
        this.loginEnvironment = loginEnvironment;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.searchBT:
                alpha_name = alphanameET.getText().toString().trim();
                search_type = searchtypeET.getText().toString().trim();
                P01012();
                break;
        }
    }

    private void P01012() {

        recyclerView.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);

        FormRequest formRequest = new FormRequest(loginEnvironment);
        formRequest.setFormName("P01012_W01012B");
        formRequest.setFormServiceAction("R");
        formRequest.setMaxPageSize("25"); //only get 30 records
        formRequest.setReturnControlIDs("54|1[19,20,48,50,51]");

        FSREvent fsrEvent = new FSREvent();

        if (!alpha_name.equals(""))
        {
            fsrEvent.setFieldValue("58", alpha_name);
        }

        if (!search_type.equals(""))
        {
            fsrEvent.setFieldValue("54", search_type);
        }

        fsrEvent.doControlAction("15");

        formRequest.addFSREvent(fsrEvent);

        new MyTask().execute(loginEnvironment, formRequest);

    }

    class MyTask extends AsyncTask<Object, Void, String>
    {
        LoginEnvironment loginEnvironment;
        FormRequest formRequest;

        @Override
        protected String doInBackground(Object... objects) {
            loginEnvironment = (LoginEnvironment) objects[0];
            formRequest = (FormRequest) objects[1];
            String response = null;
            try {
                response = JDERestServiceProvider.jdeRestServiceCall(loginEnvironment, formRequest, JDERestServiceProvider.POST_METHOD, JDERestServiceProvider.FORM_SERVICE_URI);
                p01012form = loginEnvironment.getObjectMapper().readValue(response, P01012_W01012B_FormParent.class);
                no_of_records = p01012form.getFs_P01012_W01012B().getData().getGridData().getSummary().getRecords();
                Log.d("response", response);
                Log.d("count", no_of_records + "");
            } catch (JDERestServiceException e) {
                e.printStackTrace();
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return response ;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            gridRowPOJOS.clear();

            for (int i = 0; i<no_of_records; i++)
            {
                int rowindex = p01012form.getRowIndexForRow(i);
                String[] values = {p01012form.getZ_AN8_19ForRow(i), p01012form.getZ_ALPH_20ForRow(i), p01012form.getZ_ALKY_48ForRow(i), p01012form.getZ_AT1_50ForRow(i), p01012form.getZ_TAX_51ForRow(i)};
                GridRowPOJO gridRowPOJO = new GridRowPOJO();
                gridRowPOJO.setRowindex(rowindex);
                gridRowPOJO.setValues(values);
                gridRowPOJOS.add(gridRowPOJO);
            }

            rowAdapter.notifyDataSetChanged();
            progressBar.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
        }
    }
}
