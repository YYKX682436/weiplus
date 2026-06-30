package com.tencent.thumbplayer.core.downloadproxy.api;

/* loaded from: classes16.dex */
public interface ITPDownloadProxy {
    int checkResourceStatus(java.lang.String str, java.lang.String str2, int i17);

    int clearCache(java.lang.String str, java.lang.String str2, int i17);

    int deinit();

    java.lang.String getClipPlayUrl(int i17, int i18, int i19);

    java.lang.String getNativeInfo(int i17);

    java.lang.String getPlayErrorCodeStr(int i17);

    java.lang.String getPlayUrl(int i17, int i18);

    long getResourceSize(java.lang.String str, java.lang.String str2);

    int init(android.content.Context context, com.tencent.thumbplayer.core.downloadproxy.api.TPDLProxyInitParam tPDLProxyInitParam);

    int pauseDownload(int i17);

    void pushEvent(int i17);

    int removeStorageCache(java.lang.String str);

    int resumeDownload(int i17);

    boolean setClipInfo(int i17, int i18, java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam);

    void setLogListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener);

    void setMaxStorageSizeMB(long j17);

    void setPlayState(int i17, int i18);

    void setUserData(java.lang.String str, java.lang.Object obj);

    int startClipOfflineDownload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener);

    int startClipPlay(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener);

    int startClipPreload(java.lang.String str, int i17, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener);

    int startOfflineDownload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPOfflineDownloadListener iTPOfflineDownloadListener);

    int startPlay(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener);

    int startPreload(java.lang.String str, com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam tPDownloadParam, com.tencent.thumbplayer.core.downloadproxy.api.ITPPreLoadListener iTPPreLoadListener);

    void startTask(int i17);

    void stopOfflineDownload(int i17);

    void stopPlay(int i17);

    void stopPreload(int i17);

    void updateStoragePath(java.lang.String str);

    void updateTaskInfo(int i17, java.lang.String str, java.lang.Object obj);
}
