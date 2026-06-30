package com.tencent.tav.asset;

/* loaded from: classes16.dex */
public final class URLAsset extends com.tencent.tav.asset.Asset {
    public java.lang.String audiovisualMIMETypes;
    public java.lang.String audiovisualTypes;

    public URLAsset(java.lang.String str) {
        super(str);
    }

    public java.lang.String getAudiovisualMIMETypes() {
        return this.audiovisualMIMETypes;
    }

    public java.lang.String getAudiovisualTypes() {
        return this.audiovisualTypes;
    }

    @Override // com.tencent.tav.asset.AsynchronousKeyValueLoading
    public void loadValuesAsynchronouslyForKeys(java.util.List<java.lang.String> list, com.tencent.tav.asset.AsynchronousKeyValueLoading.loadCallback loadcallback) {
    }

    @Override // com.tencent.tav.asset.AsynchronousKeyValueLoading
    public int statusOfValueForKey(java.lang.String str) {
        return 1;
    }

    public URLAsset(java.net.URL url) {
        super(url);
    }
}
