package com.example.roopanc.jde_demo.formservicetypes.p01012;

import com.example.roopanc.jde_demo.formservicetypes.FormMobile;
import oracle.adfmf.java.beans.PropertyChangeListener;
import oracle.adfmf.java.beans.PropertyChangeSupport;

public class P01012_W01012B extends FormMobile {

    private P01012_W01012B_FormData data = new P01012_W01012B_FormData();
    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this); 

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }

    public P01012_W01012B() {
        super();
    }

    public void setData(P01012_W01012B_FormData data) {
        P01012_W01012B_FormData olddata = this.data;
        this.data = data;
        propertyChangeSupport.firePropertyChange("data", olddata,data);
    }

    public P01012_W01012B_FormData getData() {
        return data;
    }
}
