package com.tencent.trtc;

/* loaded from: classes3.dex */
public abstract class DeprecatedTRTCCloud {
    @java.lang.Deprecated
    public abstract int checkAudioCapabilitySupport(int i17);

    public abstract void enableAudioEarMonitoring(boolean z17);

    @java.lang.Deprecated
    public abstract void enableAudioVolumeEvaluation(int i17);

    @java.lang.Deprecated
    public abstract void enableAudioVolumeEvaluation(int i17, boolean z17);

    @java.lang.Deprecated
    public abstract void enableCustomVideoCapture(boolean z17);

    @java.lang.Deprecated
    public abstract boolean enableTorch(boolean z17);

    @java.lang.Deprecated
    public abstract int getBGMDuration(java.lang.String str);

    @java.lang.Deprecated
    public abstract boolean isCameraAutoFocusFaceModeSupported();

    @java.lang.Deprecated
    public abstract boolean isCameraFocusPositionInPreviewSupported();

    @java.lang.Deprecated
    public abstract boolean isCameraTorchSupported();

    @java.lang.Deprecated
    public abstract boolean isCameraZoomSupported();

    @java.lang.Deprecated
    public abstract void muteLocalVideo(boolean z17);

    @java.lang.Deprecated
    public abstract void muteRemoteVideoStream(java.lang.String str, boolean z17);

    @java.lang.Deprecated
    public abstract void pauseAudioEffect(int i17);

    @java.lang.Deprecated
    public abstract void pauseBGM();

    @java.lang.Deprecated
    public abstract void playAudioEffect(com.tencent.trtc.TRTCCloudDef.TRTCAudioEffectParam tRTCAudioEffectParam);

    @java.lang.Deprecated
    public abstract void playBGM(java.lang.String str, com.tencent.trtc.TRTCCloud.BGMNotify bGMNotify);

    @java.lang.Deprecated
    public abstract void resumeAudioEffect(int i17);

    @java.lang.Deprecated
    public abstract void resumeBGM();

    @java.lang.Deprecated
    public abstract void selectMotionTmpl(java.lang.String str);

    @java.lang.Deprecated
    public abstract void sendCustomVideoData(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    @java.lang.Deprecated
    public abstract void setAllAudioEffectsVolume(int i17);

    @java.lang.Deprecated
    public abstract void setAudioEffectVolume(int i17, int i18);

    @java.lang.Deprecated
    public abstract void setAudioQuality(int i17);

    @java.lang.Deprecated
    public abstract void setBGMPlayoutVolume(int i17);

    @java.lang.Deprecated
    public abstract int setBGMPosition(int i17);

    @java.lang.Deprecated
    public abstract void setBGMPublishVolume(int i17);

    @java.lang.Deprecated
    public abstract void setBGMVolume(int i17);

    @java.lang.Deprecated
    public abstract void setBeautyStyle(int i17, int i18, int i19, int i27);

    @java.lang.Deprecated
    public abstract void setChinLevel(int i17);

    @java.lang.Deprecated
    public abstract void setEyeScaleLevel(int i17);

    @java.lang.Deprecated
    public abstract void setFaceShortLevel(int i17);

    @java.lang.Deprecated
    public abstract void setFaceSlimLevel(int i17);

    @java.lang.Deprecated
    public abstract void setFaceVLevel(int i17);

    @java.lang.Deprecated
    public abstract void setFilter(android.graphics.Bitmap bitmap);

    @java.lang.Deprecated
    public abstract void setFilterConcentration(float f17);

    @java.lang.Deprecated
    public abstract void setFocusPosition(int i17, int i18);

    @java.lang.Deprecated
    public abstract void setGSensorMode(int i17);

    @java.lang.Deprecated
    public abstract boolean setGreenScreenFile(java.lang.String str);

    @java.lang.Deprecated
    public abstract void setListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener);

    @java.lang.Deprecated
    public abstract void setLocalViewFillMode(int i17);

    @java.lang.Deprecated
    public abstract void setLocalViewMirror(int i17);

    @java.lang.Deprecated
    public abstract void setLocalViewRotation(int i17);

    @java.lang.Deprecated
    public abstract void setMicVolumeOnMixing(int i17);

    @java.lang.Deprecated
    public abstract void setMixTranscodingConfig(com.tencent.trtc.TRTCCloudDef.TRTCTranscodingConfig tRTCTranscodingConfig);

    @java.lang.Deprecated
    public abstract void setMotionMute(boolean z17);

    @java.lang.Deprecated
    public abstract void setNoseSlimLevel(int i17);

    @java.lang.Deprecated
    public abstract int setPriorRemoteVideoStreamType(int i17);

    @java.lang.Deprecated
    public abstract void setRemoteSubStreamViewFillMode(java.lang.String str, int i17);

    @java.lang.Deprecated
    public abstract void setRemoteSubStreamViewRotation(java.lang.String str, int i17);

    @java.lang.Deprecated
    public abstract void setRemoteViewFillMode(java.lang.String str, int i17);

    @java.lang.Deprecated
    public abstract void setRemoteViewRotation(java.lang.String str, int i17);

    @java.lang.Deprecated
    public abstract void setReverbType(int i17);

    public abstract void setSystemVolumeType(int i17);

    @java.lang.Deprecated
    public abstract void setVideoEncoderMirror(boolean z17);

    @java.lang.Deprecated
    public abstract void setVideoEncoderRotation(int i17);

    @java.lang.Deprecated
    public abstract boolean setVoiceChangerType(int i17);

    @java.lang.Deprecated
    public abstract void setZoom(int i17);

    @java.lang.Deprecated
    public abstract void snapshotVideo(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    @java.lang.Deprecated
    public abstract void startLocalAudio();

    @java.lang.Deprecated
    public abstract void startPublishCDNStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishCDNParam tRTCPublishCDNParam);

    @java.lang.Deprecated
    public abstract void startPublishing(java.lang.String str, int i17);

    @java.lang.Deprecated
    public abstract void startRemoteSubStreamView(java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    @java.lang.Deprecated
    public abstract void startRemoteView(java.lang.String str, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    @java.lang.Deprecated
    public abstract void startScreenCapture(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    @java.lang.Deprecated
    public abstract void startSpeedTest(int i17, java.lang.String str, java.lang.String str2);

    @java.lang.Deprecated
    public abstract void stopAllAudioEffects();

    @java.lang.Deprecated
    public abstract void stopAudioEffect(int i17);

    @java.lang.Deprecated
    public abstract void stopBGM();

    @java.lang.Deprecated
    public abstract void stopPublishCDNStream();

    @java.lang.Deprecated
    public abstract void stopPublishing();

    @java.lang.Deprecated
    public abstract void stopRemoteSubStreamView(java.lang.String str);

    @java.lang.Deprecated
    public abstract void stopRemoteView(java.lang.String str);

    @java.lang.Deprecated
    public abstract void switchCamera();
}
