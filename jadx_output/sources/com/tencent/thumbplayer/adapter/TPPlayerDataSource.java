package com.tencent.thumbplayer.adapter;

/* loaded from: classes16.dex */
public class TPPlayerDataSource {
    public static final int TYPE_ASSET_FD = 4;
    public static final int TYPE_CLIP_INFO = 2;
    public static final int TYPE_DATA_SOURCE = 3;
    public static final int TYPE_PARCEL_FD = 1;
    public static final int TYPE_URL = 0;
    private android.content.res.AssetFileDescriptor mAssetFileDescriptor;
    private java.util.Map<java.lang.String, java.lang.String> mHttpHeaders;
    private android.os.ParcelFileDescriptor mParcelFileDescriptor;
    private com.tencent.thumbplayer.api.composition.ITPMediaAsset mTPMediaAsset;
    private int mType;
    private java.lang.String mUrl;
    private com.tencent.thumbplayer.adapter.player.TPUrlDataSource tpUrlDataSource;

    public TPPlayerDataSource() {
        this.mHttpHeaders = new java.util.HashMap();
    }

    public android.content.res.AssetFileDescriptor assetFileDescriptor() {
        return this.mAssetFileDescriptor;
    }

    public com.tencent.thumbplayer.adapter.player.TPUrlDataSource getTpUrlDataSource() {
        return this.tpUrlDataSource;
    }

    public int getType() {
        return this.mType;
    }

    public java.util.Map<java.lang.String, java.lang.String> httpHeaders() {
        return this.mHttpHeaders;
    }

    public boolean isValid() {
        return (android.text.TextUtils.isEmpty(this.mUrl) && this.mParcelFileDescriptor == null && this.mAssetFileDescriptor == null && this.mTPMediaAsset == null && this.tpUrlDataSource == null) ? false : true;
    }

    public com.tencent.thumbplayer.api.composition.ITPMediaAsset mediaAsset() {
        return this.mTPMediaAsset;
    }

    public android.os.ParcelFileDescriptor parcelFileDescriptor() {
        return this.mParcelFileDescriptor;
    }

    public void setAssetFileDescriptor(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mType = 4;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
    }

    public void setHttpHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        this.mHttpHeaders.clear();
        java.util.Map<java.lang.String, java.lang.String> map2 = this.mHttpHeaders;
        if (map == null) {
            map = new java.util.HashMap<>(0);
        }
        map2.putAll(map);
    }

    public void setMediaClipInfo(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        this.mUrl = null;
        this.mType = 2;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mTPMediaAsset = iTPMediaAsset;
    }

    public void setParcelFileDescriptor(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.mUrl = null;
        this.mType = 1;
        this.mHttpHeaders.clear();
        this.mParcelFileDescriptor = parcelFileDescriptor;
        this.mAssetFileDescriptor = null;
    }

    public void setTpUrlDataSource(com.tencent.thumbplayer.adapter.player.TPUrlDataSource tPUrlDataSource) {
        this.mUrl = null;
        this.mType = 3;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.tpUrlDataSource = tPUrlDataSource;
    }

    public void setUrl(java.lang.String str) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
    }

    public java.lang.String url() {
        return this.mUrl;
    }

    public TPPlayerDataSource(java.lang.String str) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new java.util.HashMap(0);
    }

    public TPPlayerDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mUrl = str;
        this.mType = 0;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.mHttpHeaders = hashMap;
        hashMap.putAll(map);
    }

    public TPPlayerDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.mUrl = null;
        this.mType = 1;
        this.mParcelFileDescriptor = parcelFileDescriptor;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new java.util.HashMap(0);
    }

    public TPPlayerDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mUrl = null;
        this.mType = 4;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = assetFileDescriptor;
        this.mHttpHeaders = new java.util.HashMap(0);
    }

    public TPPlayerDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        this.mUrl = null;
        this.mType = 2;
        this.mParcelFileDescriptor = null;
        this.mAssetFileDescriptor = null;
        this.mHttpHeaders = new java.util.HashMap(0);
        this.mTPMediaAsset = iTPMediaAsset;
    }
}
