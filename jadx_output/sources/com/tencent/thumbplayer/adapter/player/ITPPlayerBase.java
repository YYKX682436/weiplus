package com.tencent.thumbplayer.adapter.player;

/* loaded from: classes16.dex */
public interface ITPPlayerBase {
    void addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list);

    void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list);

    void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3);

    void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack);

    int configBufferDurationAsync(int i17, long j17, long j18, long j19);

    void deselectTrack(int i17, long j17);

    int getAutoExpendBufferCount();

    long getBufferIOMaxReadDurationPosMs();

    long getBufferIOMaxReadFileOffset();

    long getBufferIOMaxWriteDurationPosMs();

    long getBufferIOMaxWriteFileOffset();

    long getBufferedDurationMs();

    long getBufferedSize();

    long getCurrentPositionMs();

    long getDemuxerOffsetInFile();

    long getDurationMs();

    com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17);

    com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams();

    long getPlayableDurationMs();

    com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo();

    long getPropertyLong(int i17);

    java.lang.String getPropertyString(int i17);

    com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo();

    int getVideoHeight();

    int getVideoWidth();

    void pause();

    void prepare();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i17);

    void seekTo(int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18);

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

    void setOnAudioPcmOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener);

    void setOnAudioProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener);

    void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener);

    void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener);

    void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener);

    void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener);

    void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener);

    void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener);

    void setOnPreparedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener);

    void setOnSeekCompleteListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener);

    void setOnSubtitleDataListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener);

    void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener);

    void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener);

    void setOnVideoProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener);

    void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener);

    void setOutputMute(boolean z17);

    void setPlaySharpenSwitch();

    void setPlaySpeedRatio(float f17);

    void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam);

    void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17);

    void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder);

    void start();

    void stop();

    void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17);

    void switchDefinition(java.lang.String str, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17);

    void switchDefinition(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17);

    void switchHdrModeWithSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17, int i18);

    void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext);
}
