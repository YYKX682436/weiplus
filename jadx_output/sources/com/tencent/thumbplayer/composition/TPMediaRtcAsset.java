package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaRtcAsset extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset {
    private static final java.lang.String TAG = "TPMediaWebrtcAsset";
    private int mSdpExchangeType;
    private java.lang.String mServerUrl;
    private java.lang.String mStreamUrl;

    public TPMediaRtcAsset(java.lang.String str, java.lang.String str2) {
        this.mSdpExchangeType = 0;
        this.mStreamUrl = str;
        this.mServerUrl = str2;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset
    public int getRtcSdpExchangeType() {
        return this.mSdpExchangeType;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset
    public java.lang.String getRtcServerUrl() {
        return this.mServerUrl;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaRTCAsset
    public java.lang.String getRtcStreamUrl() {
        return this.mStreamUrl;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        try {
            return com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildXmlPathFromRtcAsset(this);
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return "";
        }
    }

    public TPMediaRtcAsset(java.lang.String str, java.lang.String str2, int i17) {
        this.mStreamUrl = str;
        this.mServerUrl = str2;
        this.mSdpExchangeType = i17;
    }
}
