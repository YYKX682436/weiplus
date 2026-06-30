package com.tencent.thumbplayer.datatransport.resourceloader;

/* loaded from: classes16.dex */
public interface ITPAssetResourceLoader {
    void fillInContentInformation();

    java.lang.String getContentType(int i17, java.lang.String str, java.lang.String str2);

    java.lang.String getDataFilePath(int i17, java.lang.String str, java.lang.String str2);

    long getDataTotalSize(int i17, java.lang.String str, java.lang.String str2);

    java.lang.String getM3U8Content(int i17, java.lang.String str, java.lang.String str2);

    int onReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStartReadData(int i17, java.lang.String str, java.lang.String str2, long j17, long j18);

    int onStopReadData(int i17, java.lang.String str, java.lang.String str2, int i18);

    void release();

    void reset();

    void setTPAssetResourceLoaderListener(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener);
}
