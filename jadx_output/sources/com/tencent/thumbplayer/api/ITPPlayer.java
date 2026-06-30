package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public interface ITPPlayer {
    public static final java.lang.String TP_MIMETYPE_TEXT_SUBRIP = "text/x-subrip";
    public static final java.lang.String TP_MIMETYPE_TEXT_VTT = "text/vtt";
    public static final int TP_PLAYER_LOOPBACK_ENDPOSITION_DEFAULT = -1;
    public static final int TP_PLAYER_LOOPBACK_STARTPOSITION_DEFAULT = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSeekMode(3)
    public static final int TP_PLAYER_SEEK_MODE_ACCURATE_POSITION = 3;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSeekMode(1)
    public static final int TP_PLAYER_SEEK_MODE_FREVIOUS_KFRAME = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSeekMode(4)
    public static final int TP_PLAYER_SEEK_MODE_NEXT_CLIP = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSeekMode(2)
    public static final int TP_PLAYER_SEEK_MODE_NEXT_KFRAME = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode(3)
    public static final int TP_PLAYER_SWITCH_DEF_AFTER_ALL_RESOURCE_CONSUME = 3;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode(0)
    public static final int TP_PLAYER_SWITCH_DEF_DEFAULT = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode(2)
    public static final int TP_PLAYER_SWITCH_DEF_FAST_WITH_KEEP_NO_BUFFERING = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSwitchDefMode(1)
    public static final int TP_PLAYER_SWITCH_DEF_IMMEDIATELY = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType(2)
    public static final int TP_PLAYER_VIDEO_SURFACE_FROM_SURFACEVIEW = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType(1)
    public static final int TP_PLAYER_VIDEO_SURFACE_FROM_TEXTUREVIEW = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapSurfaceType(0)
    public static final int TP_PLAYER_VIDEO_SURFACE_UNSPECIFIED = 0;

    void addAudioTrackSource(java.lang.String str, java.lang.String str2);

    void addAudioTrackSource(java.lang.String str, java.lang.String str2, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData);

    void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.thumbplayer.api.proxy.TPDownloadParamData tPDownloadParamData);

    void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack);

    int configBufferDurationAsync(int i17, long j17, long j18, long j19);

    void deselectTrack(int i17, long j17);

    void enableTPAssetResourceLoader(com.tencent.thumbplayer.api.resourceloader.ITPAssetResourceLoaderListener iTPAssetResourceLoaderListener, android.os.Looper looper);

    void enableTPAssetResourceLoader(com.tencent.thumbplayer.datatransport.resourceloader.ITPAssetResourceLoader iTPAssetResourceLoader);

    int getAutoExpendBufferCount();

    long getBufferIOMaxReadDurationPosMs();

    long getBufferIOMaxReadFileOffset();

    long getBufferIOMaxWriteDurationPosMs();

    long getBufferIOMaxWriteFileOffset();

    int getBufferPercent();

    long getBufferedDurationMs();

    long getBufferedSize();

    long getCurrentPositionMs();

    int getCurrentState();

    long getDurationMs();

    com.tencent.thumbplayer.api.reportv2.ITPExtendReportController getExtendReportController();

    long getPlayableDurationMs();

    long getPlayerBufferedDurationMs();

    com.tencent.thumbplayer.api.proxy.ITPPlayerProxy getPlayerProxy();

    int getPlayerType();

    com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo();

    long getPropertyLong(int i17);

    java.lang.String getPropertyString(int i17);

    com.tencent.thumbplayer.api.report.ITPBusinessReportManager getReportManager();

    com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoWidth();

    void pause();

    void pauseDownload();

    void prepareAsync();

    void release();

    void reset();

    void resumeDownload();

    void seekTo(int i17);

    void seekTo(int i17, int i18);

    void selectProgram(int i17, long j17);

    void selectTrack(int i17, long j17);

    void setAudioGainRatio(float f17);

    void setAudioNormalizeVolumeParams(java.lang.String str);

    void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor);

    void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor);

    void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset);

    void setDataSource(java.lang.String str);

    void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

    void setLoopback(boolean z17);

    void setLoopback(boolean z17, long j17, long j18);

    void setOnAudioFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioFrameOutputListener iOnAudioFrameOutputListener);

    void setOnAudioProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnAudioProcessFrameOutputListener iOnAudioProcessFrameOutputListener);

    void setOnCompletionListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener iOnCompletionListener);

    void setOnDemuxerListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDemuxerListener iOnDemuxerListener);

    void setOnDetailInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnDetailInfoListener iOnDetailInfoListener);

    void setOnErrorListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener iOnErrorListener);

    void setOnInfoListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener);

    void setOnPlayerStateChangeListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener iOnStateChangeListener);

    void setOnPreparedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener iOnPreparedListener);

    void setOnSeekCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener);

    void setOnStopAsyncCompleteListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnStopAsyncCompleteListener iOnStopAsyncCompleteListener);

    void setOnSubtitleDataListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleDataListener iOnSubtitleDataListener);

    void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener);

    void setOnVideoFrameOutListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoFrameOutListener iOnVideoFrameOutListener);

    void setOnVideoProcessFrameOutputListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoProcessFrameOutputListener iOnVideoProcessFrameOutputListener);

    void setOnVideoSizeChangedListener(com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener);

    void setOutputMute(boolean z17);

    void setPlaySharpenSwitch();

    void setPlaySpeedRatio(float f17);

    void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam);

    void setRichMediaSynchronizer(com.tencent.thumbplayer.api.richmedia.ITPRichMediaSynchronizer iTPRichMediaSynchronizer);

    void setSurface(android.view.Surface surface);

    void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17);

    void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void setTPSurface(com.tencent.thumbplayer.api.TPSurface tPSurface);

    void setVideoInfo(com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    void start();

    void stop();

    void stopAsync();

    void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17);

    void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo);

    void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, int i17);

    void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map);

    void switchDefinition(java.lang.String str, long j17, com.tencent.thumbplayer.api.TPVideoInfo tPVideoInfo, java.util.Map<java.lang.String, java.lang.String> map, int i17);

    void switchHdrModeWithSurface(android.view.Surface surface, int i17);

    void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext);
}
