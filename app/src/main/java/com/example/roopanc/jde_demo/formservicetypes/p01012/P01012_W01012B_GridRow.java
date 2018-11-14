package com.example.roopanc.jde_demo.formservicetypes.p01012;

import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.java.beans.PropertyChangeListener;

import com.example.roopanc.jde_demo.formservicetypes.Field;
import com.example.roopanc.jde_demo.formservicetypes.GridRowMobile;

public class P01012_W01012B_GridRow extends GridRowMobile {

    Field mnAddressNumber_19 = new Field();
    Field sAlphaName_20 = new Field();
    Field sLongAddress_48 = new Field();
    Field sIndustryClass_49 = new Field();
    Field sSchTyp_50 = new Field();
    Field sTaxID_51 = new Field();

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this); 

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
    public P01012_W01012B_GridRow() {
        super();
    }

    public void setMnAddressNumber_19(Field mnAddressNumber_19) {
        Field oldmnAddressNumber_19 = this.mnAddressNumber_19;
        this.mnAddressNumber_19 = mnAddressNumber_19;
        propertyChangeSupport.firePropertyChange("mnAddressNumber_19", oldmnAddressNumber_19,mnAddressNumber_19);
    }

    public Field getMnAddressNumber_19() {
        return mnAddressNumber_19;
    }

    public void setZ_AN8_19(Field z_AN8_19) {
        Field oldZ_AN8_19 = this.mnAddressNumber_19;
        this.mnAddressNumber_19 = z_AN8_19;
        propertyChangeSupport.firePropertyChange("mnAddressNumber_19", oldZ_AN8_19,z_AN8_19);
    }

    public Field getZ_AN8_19() {
        return mnAddressNumber_19;
    }

    public void setSAlphaName_20(Field sAlphaName_20) {
        Field oldsAlphaName_20 = this.sAlphaName_20;
        this.sAlphaName_20 = sAlphaName_20;
        propertyChangeSupport.firePropertyChange("sAlphaName_20", oldsAlphaName_20,sAlphaName_20);
    }

    public Field getSAlphaName_20() {
        return sAlphaName_20;
    }

    public void setZ_ALPH_20(Field z_ALPH_20) {
        Field oldZ_ALPH_20 = this.sAlphaName_20;
        this.sAlphaName_20 = z_ALPH_20;
        propertyChangeSupport.firePropertyChange("sAlphaName_20", oldZ_ALPH_20,z_ALPH_20);
    }

    public Field getZ_ALPH_20() {
        return sAlphaName_20;
    }

    public void setSLongAddress_48(Field sLongAddress_48) {
        Field oldsLongAddress_48 = this.sLongAddress_48;
        this.sLongAddress_48 = sLongAddress_48;
        propertyChangeSupport.firePropertyChange("sLongAddress_48", oldsLongAddress_48,sLongAddress_48);
    }

    public Field getSLongAddress_48() {
        return sLongAddress_48;
    }

    public void setZ_ALKY_48(Field z_ALKY_48) {
        Field oldZ_ALKY_48 = this.sLongAddress_48;
        this.sLongAddress_48 = z_ALKY_48;
        propertyChangeSupport.firePropertyChange("sLongAddress_48", oldZ_ALKY_48,z_ALKY_48);
    }

    public Field getZ_ALKY_48() {
        return sLongAddress_48;
    }

    public void setSIndustryClass_49(Field sIndustryClass_49) {
        Field oldsIndustryClass_49 = this.sIndustryClass_49;
        this.sIndustryClass_49 = sIndustryClass_49;
        propertyChangeSupport.firePropertyChange("sIndustryClass_49", oldsIndustryClass_49,sIndustryClass_49);
    }

    public Field getSIndustryClass_49() {
        return sIndustryClass_49;
    }

    public void setZ_SIC_49(Field z_SIC_49) {
        Field oldZ_SIC_49 = this.sIndustryClass_49;
        this.sIndustryClass_49 = z_SIC_49;
        propertyChangeSupport.firePropertyChange("sIndustryClass_49", oldZ_SIC_49,z_SIC_49);
    }

    public Field getZ_SIC_49() {
        return sIndustryClass_49;
    }

    public void setSSchTyp_50(Field sSchTyp_50) {
        Field oldsSchTyp_50 = this.sSchTyp_50;
        this.sSchTyp_50 = sSchTyp_50;
        propertyChangeSupport.firePropertyChange("sSchTyp_50", oldsSchTyp_50,sSchTyp_50);
    }

    public Field getSSchTyp_50() {
        return sSchTyp_50;
    }

    public void setZ_AT1_50(Field z_AT1_50) {
        Field oldZ_AT1_50 = this.sSchTyp_50;
        this.sSchTyp_50 = z_AT1_50;
        propertyChangeSupport.firePropertyChange("sSchTyp_50", oldZ_AT1_50,z_AT1_50);
    }

    public Field getZ_AT1_50() {
        return sSchTyp_50;
    }

    public void setSTaxID_51(Field sTaxID_51) {
        Field oldsTaxID_51 = this.sTaxID_51;
        this.sTaxID_51 = sTaxID_51;
        propertyChangeSupport.firePropertyChange("sTaxID_51", oldsTaxID_51,sTaxID_51);
    }

    public Field getSTaxID_51() {
        return sTaxID_51;
    }

    public void setZ_TAX_51(Field z_TAX_51) {
        Field oldZ_TAX_51 = this.sTaxID_51;
        this.sTaxID_51 = z_TAX_51;
        propertyChangeSupport.firePropertyChange("sTaxID_51", oldZ_TAX_51,z_TAX_51);
    }

    public Field getZ_TAX_51() {
        return sTaxID_51;
    }
}
