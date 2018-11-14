package com.example.roopanc.jde_demo.Data;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.roopanc.jde_demo.R;

import java.util.List;

/**
 * Created by Roopan C on 9/10/2018.
 */

public class RowAdapter extends RecyclerView.Adapter<RowAdapter.MyViewHolder> {

    private Context context;
    List<GridRowPOJO> gridRowPOJOS;

    public RowAdapter (Context context, List<GridRowPOJO> gridRowPOJOS){
        this.context = context;
        this.gridRowPOJOS = gridRowPOJOS;
    }

    @Override
    public RowAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.addressitem, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RowAdapter.MyViewHolder holder, int position) {

        GridRowPOJO gridRowPOJO = gridRowPOJOS.get(position);
        holder.addnumTV.setText(gridRowPOJO.getValues()[0]);
        holder.alphnameTV.setText(gridRowPOJO.getValues()[1]);
        holder.longaddTV.setText(gridRowPOJO.getValues()[2]);
        holder.schtypeTV.setText(gridRowPOJO.getValues()[3]);
        holder.taxidTV.setText(gridRowPOJO.getValues()[4]);

    }

    @Override
    public int getItemCount() {
        return gridRowPOJOS.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView addnumTV, schtypeTV, alphnameTV, taxidTV, longaddTV;

        public MyViewHolder(View itemView) {
            super(itemView);

            addnumTV = itemView.findViewById(R.id.addnum);
            schtypeTV = itemView.findViewById(R.id.schtype);
            alphnameTV = itemView.findViewById(R.id.alphaname);
            taxidTV = itemView.findViewById(R.id.taxid);
            longaddTV = itemView.findViewById(R.id.longaddress);

        }
    }
}
