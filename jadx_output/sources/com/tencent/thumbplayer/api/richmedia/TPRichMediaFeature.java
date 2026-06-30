package com.tencent.thumbplayer.api.richmedia;

/* loaded from: classes16.dex */
public class TPRichMediaFeature {
    private final java.util.List<java.lang.String> mBinding;
    private final java.lang.String mFeatureType;
    private final boolean mIsSelected;

    public TPRichMediaFeature(com.tencent.thumbplayer.core.richmedia.TPNativeRichMediaFeature tPNativeRichMediaFeature) {
        this.mFeatureType = tPNativeRichMediaFeature.getFeatureType();
        this.mBinding = new java.util.ArrayList(java.util.Arrays.asList(tPNativeRichMediaFeature.getBinding()));
        this.mIsSelected = tPNativeRichMediaFeature.isSelected();
    }

    public java.util.List<java.lang.String> getBinding() {
        return this.mBinding;
    }

    public java.lang.String getFeatureType() {
        return this.mFeatureType;
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }
}
