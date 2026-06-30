package com.tencent.thumbplayer.composition;

/* loaded from: classes16.dex */
public class TPMediaCommonAsset implements com.tencent.thumbplayer.api.composition.ITPMediaAsset {
    private com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam mExtraParam;
    private java.util.Map<java.lang.String, java.lang.String> mHttpHeader;

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam getExtraParam() {
        return this.mExtraParam;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.util.Map<java.lang.String, java.lang.String> getHttpHeader() {
        return this.mHttpHeader;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public int getMediaType() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public java.lang.String getUrl() {
        return "";
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public void setExtraParam(com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam iTPMediaAssetExtraParam) {
        this.mExtraParam = iTPMediaAssetExtraParam;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAsset
    public void setHttpHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mHttpHeader = map;
    }
}
