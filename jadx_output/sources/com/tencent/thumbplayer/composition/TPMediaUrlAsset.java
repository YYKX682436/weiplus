package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaUrlAsset extends com.tencent.thumbplayer.composition.TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset {
    private static final java.lang.String TAG = "TPMediaUrlAsset";
    private java.lang.String mStreamUrl;

    public TPMediaUrlAsset(java.lang.String str) {
        this.mStreamUrl = str;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset
    public java.lang.String getStreamUrl() {
        return this.mStreamUrl;
    }

    @Override // com.tencent.thumbplayer.composition.TPMediaCommonAsset, com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        try {
            return com.tencent.thumbplayer.composition.TPMediaCompositionXmlGenerator.buildXmlPathFromUrlAsset(this);
        } catch (java.io.IOException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return "";
        }
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaUrlAsset
    public void setStreamUrl(java.lang.String str) {
        this.mStreamUrl = str;
    }
}
