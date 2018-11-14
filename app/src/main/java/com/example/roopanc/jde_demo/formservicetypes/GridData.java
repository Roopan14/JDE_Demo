package com.example.roopanc.jde_demo.formservicetypes;

public class GridData
{     
    protected GridSummary summary = new GridSummary();
    
    public GridData()
    {
    }
    
    public void setSummary(GridSummary summary)
    {
        this.summary = summary;
    }

    public GridSummary getSummary()
    {
        return summary;
    }	
	
}