package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public abstract class OverSeaTileProvider extends com.tencent.tencentmap.mapsdk.maps.model.UrlTileProvider {
    private java.lang.String mProviderName;
    private int mProviderVersion;

    public OverSeaTileProvider(java.lang.String str, int i17) {
        this.mProviderName = str;
        this.mProviderVersion = i17;
        if (android.text.TextUtils.isEmpty(str)) {
            throw new java.lang.IllegalArgumentException("图源名不能为空");
        }
    }

    public abstract android.graphics.Bitmap getLogo(boolean z17);

    public final java.lang.String getProviderName() {
        return this.mProviderName;
    }

    public final int getProviderVersion() {
        return this.mProviderVersion;
    }

    public boolean onDayNightChange(boolean z17) {
        return false;
    }

    public boolean onLanguageChange(com.tencent.tencentmap.mapsdk.maps.model.Language language) {
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OverSeaProvider{mProviderName='");
        stringBuffer.append(this.mProviderName);
        stringBuffer.append("', mProviderVersion=");
        stringBuffer.append(this.mProviderVersion);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
