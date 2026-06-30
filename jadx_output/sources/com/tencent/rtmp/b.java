package com.tencent.rtmp;

/* loaded from: classes16.dex */
public interface b {
    void callExperimentalAPI(java.lang.String str);

    void enableAudioVolumeEvaluation(int i17);

    com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager();

    com.tencent.liteav.beauty.TXBeautyManager getBeautyManager();

    com.tencent.rtmp.TXLivePushConfig getConfig();

    int getMaxZoom();

    @java.lang.Deprecated
    int getMusicDuration(java.lang.String str);

    boolean isPushing();

    void onLogRecord(java.lang.String str);

    @java.lang.Deprecated
    boolean pauseBGM();

    void pausePusher();

    @java.lang.Deprecated
    boolean playBGM(java.lang.String str);

    void release();

    @java.lang.Deprecated
    boolean resumeBGM();

    void resumePusher();

    void sendCustomPCMData(byte[] bArr);

    int sendCustomVideoData(byte[] bArr, int i17, int i18, int i19);

    int sendCustomVideoTexture(int i17, int i18, int i19);

    @java.lang.Deprecated
    void sendMessage(byte[] bArr);

    boolean sendMessageEx(byte[] bArr);

    void setAudioProcessListener(com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener audioCustomProcessListener);

    void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    @java.lang.Deprecated
    void setBGMNofify(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify);

    @java.lang.Deprecated
    void setBGMPitch(float f17);

    @java.lang.Deprecated
    boolean setBGMPosition(int i17);

    @java.lang.Deprecated
    boolean setBGMVolume(float f17);

    boolean setBeautyFilter(int i17, int i18, int i19, int i27);

    @java.lang.Deprecated
    void setChinLevel(int i17);

    void setConfig(com.tencent.rtmp.TXLivePushConfig tXLivePushConfig);

    void setExposureCompensation(float f17);

    @java.lang.Deprecated
    void setEyeScaleLevel(int i17);

    @java.lang.Deprecated
    void setFaceShortLevel(int i17);

    @java.lang.Deprecated
    void setFaceSlimLevel(int i17);

    @java.lang.Deprecated
    void setFaceVLevel(int i17);

    @java.lang.Deprecated
    void setFilter(android.graphics.Bitmap bitmap);

    void setFocusPosition(float f17, float f18);

    @java.lang.Deprecated
    boolean setGreenScreenFile(java.lang.String str);

    @java.lang.Deprecated
    boolean setMicVolume(float f17);

    boolean setMirror(boolean z17);

    @java.lang.Deprecated
    void setMotionMute(boolean z17);

    @java.lang.Deprecated
    void setMotionTmpl(java.lang.String str);

    void setMute(boolean z17);

    @java.lang.Deprecated
    void setNoseSlimLevel(int i17);

    void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener);

    void setRenderRotation(int i17);

    @java.lang.Deprecated
    void setReverb(int i17);

    @java.lang.Deprecated
    void setSpecialRatio(float f17);

    void setSurface(android.view.Surface surface);

    @java.lang.Deprecated
    void setSurfaceSize(int i17, int i18);

    void setVideoProcessListener(com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener);

    void setVideoQuality(int i17, boolean z17, boolean z18);

    void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    @java.lang.Deprecated
    void setVoiceChangerType(int i17);

    boolean setZoom(int i17);

    void snapshot(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener);

    void startCameraPreview(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    int startPusher(java.lang.String str);

    int startRecord(java.lang.String str);

    void startScreenCapture();

    @java.lang.Deprecated
    boolean stopBGM();

    void stopCameraPreview(boolean z17);

    void stopPusher();

    void stopRecord();

    void stopScreenCapture();

    void switchCamera();

    boolean turnOnFlashLight(boolean z17);
}
