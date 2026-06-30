package com.tencent.thumbplayer.datatransport.resourceloader;

/* loaded from: classes15.dex */
public abstract class AbsTPAssetResourceLoader implements com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader {
    private static final java.lang.String TAG = "AbsTPAssetResourceLoader";

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void fillInContentInformation() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "fillInContentInformation, Not yet implemented");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "getM3U8Content, Not yet implemented");
        return "";
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void release() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "release, Not yet implemented");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void reset() {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "reset, Not yet implemented");
    }

    @Override // com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader
    public void setTPAssetResourceLoaderListener(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener) {
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "onStartReadData, Not yet implemented");
    }
}
