package com.example.roopanc.jde_demo.formservicetypes.p01012;

import com.example.roopanc.jde_demo.formservicetypes.FormFieldMobile;

import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.java.beans.PropertyChangeListener;

public class P01012_W01012B_FormData {

    private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this); 

    public void addPropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l) {
        propertyChangeSupport.removePropertyChangeListener(l);
    }
    private FormFieldMobile txtAlphaName_58 = new FormFieldMobile();
    private FormFieldMobile lblAlphaName_57 = new FormFieldMobile();
    private FormFieldMobile txtSearchType_54 = new FormFieldMobile();
    private FormFieldMobile lblSearchType_53 = new FormFieldMobile();
    private P01012_W01012B_GridData gridData = new P01012_W01012B_GridData();
    private FormFieldMobile lblDL01_66 = new FormFieldMobile();
    private FormFieldMobile chkDisplayAddress_63 = new FormFieldMobile();
    private FormFieldMobile chkDisplayPhone_62 = new FormFieldMobile();

    public void setTxtAlphaName_58(FormFieldMobile txtAlphaName_58) {
        FormFieldMobile oldtxtAlphaName_58 = this.txtAlphaName_58;
        this.txtAlphaName_58 = txtAlphaName_58;
        propertyChangeSupport.firePropertyChange("txtAlphaName_58", oldtxtAlphaName_58,txtAlphaName_58);
    }

    public FormFieldMobile getTxtAlphaName_58() {
        return txtAlphaName_58;
    }

    public void setZ_ALPH_58(FormFieldMobile z_ALPH_58) {
        FormFieldMobile oldZ_ALPH_58 = this.txtAlphaName_58;
        this.txtAlphaName_58 = z_ALPH_58;
        propertyChangeSupport.firePropertyChange("txtAlphaName_58", oldZ_ALPH_58,z_ALPH_58);
    }

    public FormFieldMobile getZ_ALPH_58() {
        return txtAlphaName_58;
    }

    public void setLblAlphaName_57(FormFieldMobile lblAlphaName_57) {
        FormFieldMobile oldlblAlphaName_57 = this.lblAlphaName_57;
        this.lblAlphaName_57 = lblAlphaName_57;
        propertyChangeSupport.firePropertyChange("lblAlphaName_57", oldlblAlphaName_57,lblAlphaName_57);
    }

    public FormFieldMobile getLblAlphaName_57() {
        return lblAlphaName_57;
    }

    public void setZ_ALPH_57(FormFieldMobile z_ALPH_57) {
        FormFieldMobile oldZ_ALPH_57 = this.lblAlphaName_57;
        this.lblAlphaName_57 = z_ALPH_57;
        propertyChangeSupport.firePropertyChange("lblAlphaName_57", oldZ_ALPH_57,z_ALPH_57);
    }

    public FormFieldMobile getZ_ALPH_57() {
        return lblAlphaName_57;
    }

    public void setTxtSearchType_54(FormFieldMobile txtSearchType_54) {
        FormFieldMobile oldtxtSearchType_54 = this.txtSearchType_54;
        this.txtSearchType_54 = txtSearchType_54;
        propertyChangeSupport.firePropertyChange("txtSearchType_54", oldtxtSearchType_54,txtSearchType_54);
    }

    public FormFieldMobile getTxtSearchType_54() {
        return txtSearchType_54;
    }

    public void setZ_AT1_54(FormFieldMobile z_AT1_54) {
        FormFieldMobile oldZ_AT1_54 = this.txtSearchType_54;
        this.txtSearchType_54 = z_AT1_54;
        propertyChangeSupport.firePropertyChange("txtSearchType_54", oldZ_AT1_54,z_AT1_54);
    }

    public FormFieldMobile getZ_AT1_54() {
        return txtSearchType_54;
    }

    public void setLblSearchType_53(FormFieldMobile lblSearchType_53) {
        FormFieldMobile oldlblSearchType_53 = this.lblSearchType_53;
        this.lblSearchType_53 = lblSearchType_53;
        propertyChangeSupport.firePropertyChange("lblSearchType_53", oldlblSearchType_53,lblSearchType_53);
    }

    public FormFieldMobile getLblSearchType_53() {
        return lblSearchType_53;
    }

    public void setZ_AT1_53(FormFieldMobile z_AT1_53) {
        FormFieldMobile oldZ_AT1_53 = this.lblSearchType_53;
        this.lblSearchType_53 = z_AT1_53;
        propertyChangeSupport.firePropertyChange("lblSearchType_53", oldZ_AT1_53,z_AT1_53);
    }

    public FormFieldMobile getZ_AT1_53() {
        return lblSearchType_53;
    }

    public void setGridData(P01012_W01012B_GridData gridData) {
        P01012_W01012B_GridData oldgridData = this.gridData;
        this.gridData = gridData;
        propertyChangeSupport.firePropertyChange("gridData", oldgridData,gridData);
    }

    public P01012_W01012B_GridData getGridData() {
        return gridData;
    }

    public void setLblDL01_66(FormFieldMobile lblDL01_66) {
        FormFieldMobile oldlblDL01_66 = this.lblDL01_66;
        this.lblDL01_66 = lblDL01_66;
        propertyChangeSupport.firePropertyChange("lblDL01_66", oldlblDL01_66,lblDL01_66);
    }

    public FormFieldMobile getLblDL01_66() {
        return lblDL01_66;
    }

    public void setZ_DL01_66(FormFieldMobile z_DL01_66) {
        FormFieldMobile oldZ_DL01_66 = this.lblDL01_66;
        this.lblDL01_66 = z_DL01_66;
        propertyChangeSupport.firePropertyChange("lblDL01_66", oldZ_DL01_66,z_DL01_66);
    }

    public FormFieldMobile getZ_DL01_66() {
        return lblDL01_66;
    }

    public void setChkDisplayAddress_63(FormFieldMobile chkDisplayAddress_63) {
        FormFieldMobile oldchkDisplayAddress_63 = this.chkDisplayAddress_63;
        this.chkDisplayAddress_63 = chkDisplayAddress_63;
        propertyChangeSupport.firePropertyChange("chkDisplayAddress_63", oldchkDisplayAddress_63,chkDisplayAddress_63);
    }

    public FormFieldMobile getChkDisplayAddress_63() {
        return chkDisplayAddress_63;
    }

    public void setZ_EV01_63(FormFieldMobile z_EV01_63) {
        FormFieldMobile oldZ_EV01_63 = this.chkDisplayAddress_63;
        this.chkDisplayAddress_63 = z_EV01_63;
        propertyChangeSupport.firePropertyChange("chkDisplayAddress_63", oldZ_EV01_63,z_EV01_63);
    }

    public FormFieldMobile getZ_EV01_63() {
        return chkDisplayAddress_63;
    }

    public void setChkDisplayPhone_62(FormFieldMobile chkDisplayPhone_62) {
        FormFieldMobile oldchkDisplayPhone_62 = this.chkDisplayPhone_62;
        this.chkDisplayPhone_62 = chkDisplayPhone_62;
        propertyChangeSupport.firePropertyChange("chkDisplayPhone_62", oldchkDisplayPhone_62,chkDisplayPhone_62);
    }

    public FormFieldMobile getChkDisplayPhone_62() {
        return chkDisplayPhone_62;
    }

    public void setZ_EV01_62(FormFieldMobile z_EV01_62) {
        FormFieldMobile oldZ_EV01_62 = this.chkDisplayPhone_62;
        this.chkDisplayPhone_62 = z_EV01_62;
        propertyChangeSupport.firePropertyChange("chkDisplayPhone_62", oldZ_EV01_62,z_EV01_62);
    }

    public FormFieldMobile getZ_EV01_62() {
        return chkDisplayPhone_62;
    }
}
