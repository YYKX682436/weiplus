package com.tencent.thumbplayer.composition;

/* loaded from: classes13.dex */
public class TPMediaAssetOrderedMap implements com.tencent.thumbplayer.api.composition.ITPMediaAssetOrderedMap {
    private static final java.lang.String TAG = "TPMediaAssetOrderedMap";
    private java.lang.StringBuilder mOrderedStrings = new java.lang.StringBuilder();

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetOrderedMap
    public void addKeyValue(java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "addKeyValue key:" + str + "=" + str2);
        java.lang.StringBuilder sb6 = this.mOrderedStrings;
        sb6.append(str);
        sb6.append("=");
        sb6.append(str2);
        sb6.append(";");
    }

    @Override // com.tencent.thumbplayer.api.composition.ITPMediaAssetOrderedMap
    public java.lang.String getKeyValueStr() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "getKeyValueStr " + this.mOrderedStrings.toString());
        return this.mOrderedStrings.toString();
    }
}
