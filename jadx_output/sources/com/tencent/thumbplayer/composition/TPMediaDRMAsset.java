package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaDRMAsset extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset {
    private static final java.lang.String TAG = "TPMediaDRMAsset";
    private java.util.Map<java.lang.String, java.lang.String> mDrmPropertyMap = new java.util.HashMap();

    @com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE
    private int mDrmType;
    private java.util.Map<java.lang.String, java.lang.String> mLicenseHttpHeaders;
    private java.lang.String mPlayUrl;

    public TPMediaDRMAsset(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17, java.lang.String str) {
        this.mPlayUrl = str;
        this.mDrmType = i17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public java.util.Map<java.lang.String, java.lang.String> getDrmAllProperties() {
        return this.mDrmPropertyMap;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public java.lang.String getDrmPlayUrl() {
        return this.mPlayUrl;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public java.lang.String getDrmProperty(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.util.Map<java.lang.String, java.lang.String> map = this.mDrmPropertyMap;
        return (map == null || map.isEmpty() || (str3 = this.mDrmPropertyMap.get(str)) == null) ? str2 : str3;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    @com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE
    public int getDrmType() {
        return this.mDrmType;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public java.util.Map<java.lang.String, java.lang.String> getLicenseHttpHeaders() {
        return this.mLicenseHttpHeaders;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        try {
            return com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildXmlPathFromDrmAsset(this);
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmPlayUrl(java.lang.String str) {
        this.mPlayUrl = str;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmProperty(java.lang.String str, java.lang.String str2) {
        this.mDrmPropertyMap.put(str, str2);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setDrmType(@com.tencent.thumbplayer.api.TPCommonEnum.TP_DRM_TYPE int i17) {
        this.mDrmType = i17;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaDRMAsset
    public void setLicenseHttpHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mLicenseHttpHeaders = map;
    }
}
