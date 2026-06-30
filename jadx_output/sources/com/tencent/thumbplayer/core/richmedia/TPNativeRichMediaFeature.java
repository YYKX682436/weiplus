package com.tencent.thumbplayer.core.richmedia;

/* loaded from: classes16.dex */
public class TPNativeRichMediaFeature {
    private java.lang.String mFeatureType;
    private java.lang.String[] mBinding = new java.lang.String[0];
    private boolean mIsSelected = false;

    public java.lang.String[] getBinding() {
        return this.mBinding;
    }

    public java.lang.String getFeatureType() {
        return this.mFeatureType;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public void setBinding(java.lang.String[] strArr) {
        this.mBinding = strArr;
    }

    public void setFeatureType(java.lang.String str) {
        this.mFeatureType = str;
    }

    public void setSelected(boolean z17) {
        this.mIsSelected = z17;
    }
}
