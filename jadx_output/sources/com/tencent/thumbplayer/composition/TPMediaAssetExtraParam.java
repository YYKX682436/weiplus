package com.tencent.thumbplayer.composition;

/* loaded from: classes13.dex */
public class TPMediaAssetExtraParam implements com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam {
    private static final java.lang.String TAG = "TPMediaAssetExtraParam";
    private java.util.HashMap<java.lang.String, java.io.Serializable> mExtraParamMap = new java.util.HashMap<>();

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public int getExtraInt(java.lang.String str) {
        if (this.mExtraParamMap.containsKey(str)) {
            return ((java.lang.Integer) this.mExtraParamMap.get(str)).intValue();
        }
        return -1;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam getExtraObject(java.lang.String str) {
        if (this.mExtraParamMap.get(str) instanceof com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam) {
            return (com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam) this.mExtraParamMap.get(str);
        }
        return null;
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public java.lang.String getExtraString(java.lang.String str) {
        return this.mExtraParamMap.containsKey(str) ? (java.lang.String) this.mExtraParamMap.get(str) : "";
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public void setExtraInt(java.lang.String str, int i17) {
        this.mExtraParamMap.put(str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public void setExtraObject(java.lang.String str, com.tencent.thumbplayer.api.composition.ITPMediaAssetObjectParam iTPMediaAssetObjectParam) {
        this.mExtraParamMap.put(str, iTPMediaAssetObjectParam);
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetExtraParam
    public void setExtraString(java.lang.String str, java.lang.String str2) {
        this.mExtraParamMap.put(str, str2);
    }
}
