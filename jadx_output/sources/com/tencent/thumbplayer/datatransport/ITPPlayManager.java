package com.tencent.thumbplayer.datatransport;

/* loaded from: classes16.dex */
public interface ITPPlayManager extends com.tencent.thumbplayer.api.proxy.ITPPlayerProxy {
    java.lang.String getPlayErrorCodeStr();

    com.tencent.thumbplayer.api.proxy.ITPPlayerProxyListener getTPPlayerProxyListener();

    boolean hasWaitDefTask();

    boolean isEnable();

    boolean isUseResourceLoader();

    void pauseDownload();

    void playerSwitchDefComplete(long j17);

    void release();

    void resumeDownload();

    void setIsUseResourceLoader(boolean z17);

    void setLogListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPDLProxyLogListener iTPDLProxyLogListener);

    void setPlayListener(com.tencent.thumbplayer.core.downloadproxy.api.ITPPlayListener iTPPlayListener);

    void setPlaySpeedRatio(float f17);

    void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam);

    void setProxyPlayState(int i17);

    void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    java.lang.String startDownLoadTrackUrl(int i17, java.lang.String str, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData);

    com.tencent.thumbplayer.adapter.player.TPUrlDataSource startDownloadPlay(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    com.tencent.thumbplayer.api.composition.ITPMediaAsset startDownloadPlayByAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset);

    void startRemuxer(java.lang.String str, java.lang.String str2);

    com.tencent.thumbplayer.adapter.player.TPUrlDataSource startSwitchDefTask(long j17, java.lang.String str, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map);

    com.tencent.thumbplayer.api.composition.ITPMediaAsset startSwitchDefTaskByAsset(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    void stopDownLoadTrackUrl(java.lang.String str);

    void stopDownload();

    void stopRemuxer();
}
