package com.tencent.trtc;

/* loaded from: classes4.dex */
public abstract class TRTCCloud extends com.tencent.trtc.DeprecatedTRTCCloud {
    private static com.tencent.trtc.TRTCCloud.a mTXLogListener;
    static java.lang.ref.WeakReference<com.tencent.trtc.TRTCCloud> sInstance;

    @java.lang.Deprecated
    /* loaded from: classes16.dex */
    public interface BGMNotify {
        void onBGMComplete(int i17);

        void onBGMProgress(long j17, long j18);

        void onBGMStart(int i17);
    }

    /* loaded from: classes4.dex */
    public static class TRTCViewMargin {
        public float bottomMargin;
        public float leftMargin;
        public float rightMargin;
        public float topMargin;

        public TRTCViewMargin(float f17, float f18, float f19, float f27) {
            this.leftMargin = f17;
            this.topMargin = f19;
            this.rightMargin = f18;
            this.bottomMargin = f27;
        }
    }

    /* loaded from: classes4.dex */
    public static class a implements com.tencent.liteav.base.util.LiteavLog.a {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.trtc.TRTCCloudListener.TRTCLogListener f215698a = null;

        @Override // com.tencent.liteav.base.util.LiteavLog.a
        public final void a(int i17, java.lang.String str, java.lang.String str2) {
            com.tencent.trtc.TRTCCloudListener.TRTCLogListener tRTCLogListener = this.f215698a;
            if (tRTCLogListener != null) {
                tRTCLogListener.onLog(str2, i17, str);
            }
        }
    }

    public static void destroySharedInstance() {
        com.tencent.liteav.trtc.TRTCCloudImpl.a();
    }

    public static java.lang.String getSDKVersion() {
        return com.tencent.liteav.base.util.CommonUtil.getSDKVersionStr();
    }

    public static void setConsoleEnabled(boolean z17) {
        com.tencent.liteav.trtc.TRTCCloudImpl.a(z17);
    }

    public static void setLogCompressEnabled(boolean z17) {
        com.tencent.liteav.trtc.TRTCCloudImpl.b(z17);
    }

    public static void setLogDirPath(java.lang.String str) {
        com.tencent.liteav.trtc.TRTCCloudImpl.a(str);
    }

    public static void setLogLevel(int i17) {
        com.tencent.liteav.trtc.TRTCCloudImpl.a(i17);
    }

    public static void setLogListener(com.tencent.trtc.TRTCCloudListener.TRTCLogListener tRTCLogListener) {
        com.tencent.trtc.TRTCCloud.a aVar = mTXLogListener;
        if (aVar != null) {
            aVar.f215698a = null;
        }
        if (tRTCLogListener != null) {
            com.tencent.trtc.TRTCCloud.a aVar2 = new com.tencent.trtc.TRTCCloud.a();
            mTXLogListener = aVar2;
            aVar2.f215698a = tRTCLogListener;
        } else {
            mTXLogListener = null;
        }
        com.tencent.liteav.base.util.LiteavLog.setCallback(mTXLogListener);
        com.tencent.liteav.base.util.LiteavLog.nativeSetLogCallbackEnabled(mTXLogListener != null);
    }

    public static com.tencent.trtc.TRTCCloud sharedInstance(android.content.Context context) {
        return com.tencent.liteav.trtc.TRTCCloudImpl.a(context);
    }

    public abstract void ConnectOtherRoom(java.lang.String str);

    public abstract void DisconnectOtherRoom();

    public abstract void addListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener);

    public abstract java.lang.String callExperimentalAPI(java.lang.String str);

    public abstract com.tencent.trtc.TRTCCloud createSubCloud();

    public abstract void destroySubCloud(com.tencent.trtc.TRTCCloud tRTCCloud);

    public abstract void enable3DSpatialAudioEffect(boolean z17);

    public abstract void enableAudioVolumeEvaluation(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCAudioVolumeEvaluateParams tRTCAudioVolumeEvaluateParams);

    public abstract void enableCustomAudioCapture(boolean z17);

    public abstract void enableCustomAudioRendering(boolean z17);

    public abstract void enableCustomVideoCapture(int i17, boolean z17);

    public abstract int enableEncSmallVideoStream(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void enableMixExternalAudioFrame(boolean z17, boolean z18);

    public abstract int enablePayloadPrivateEncryption(boolean z17, com.tencent.trtc.TRTCCloudDef.TRTCPayloadPrivateEncryptionConfig tRTCPayloadPrivateEncryptionConfig);

    public abstract void enterRoom(com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams, int i17);

    public abstract void exitRoom();

    public abstract long generateCustomPTS();

    public abstract int getAudioCaptureVolume();

    public abstract com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager();

    public abstract int getAudioPlayoutVolume();

    public abstract com.tencent.liteav.beauty.TXBeautyManager getBeautyManager();

    public abstract void getCustomAudioRenderingFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract com.tencent.liteav.device.TXDeviceManager getDeviceManager();

    public abstract int mixExternalAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract void muteAllRemoteAudio(boolean z17);

    public abstract void muteAllRemoteVideoStreams(boolean z17);

    public abstract void muteLocalAudio(boolean z17);

    public abstract void muteLocalVideo(int i17, boolean z17);

    public abstract void muteRemoteAudio(java.lang.String str, boolean z17);

    public abstract void muteRemoteVideoStream(java.lang.String str, int i17, boolean z17);

    public abstract void pauseScreenCapture();

    public abstract void removeListener(com.tencent.trtc.TRTCCloudListener tRTCCloudListener);

    public abstract void resumeScreenCapture();

    public abstract void sendCustomAudioData(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

    public abstract boolean sendCustomCmdMsg(int i17, byte[] bArr, boolean z17, boolean z18);

    public abstract void sendCustomVideoData(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);

    public abstract boolean sendSEIMsg(byte[] bArr, int i17);

    public abstract void set3DSpatialReceivingRange(java.lang.String str, int i17);

    public abstract void setAudioCaptureVolume(int i17);

    public abstract void setAudioFrameListener(com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener tRTCAudioFrameListener);

    public abstract void setAudioPlayoutVolume(int i17);

    public abstract void setAudioRoute(int i17);

    public abstract int setCapturedAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setDebugViewMargin(java.lang.String str, com.tencent.trtc.TRTCCloud.TRTCViewMargin tRTCViewMargin);

    public abstract void setDefaultStreamRecvMode(boolean z17, boolean z18);

    public abstract void setGravitySensorAdaptiveMode(int i17);

    public abstract void setListenerHandler(android.os.Handler handler);

    public abstract int setLocalProcessedAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setLocalRenderParams(com.tencent.trtc.TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    public abstract int setLocalVideoProcessListener(int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoFrameListener tRTCVideoFrameListener);

    public abstract int setLocalVideoRenderListener(int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract void setMixExternalAudioVolume(int i17, int i18);

    public abstract int setMixedPlayAudioFrameCallbackFormat(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrameCallbackFormat tRTCAudioFrameCallbackFormat);

    public abstract void setNetworkQosParam(com.tencent.trtc.TRTCCloudDef.TRTCNetworkQosParam tRTCNetworkQosParam);

    public abstract void setPerspectiveCorrectionPoints(java.lang.String str, android.graphics.PointF[] pointFArr, android.graphics.PointF[] pointFArr2);

    public abstract void setRemoteAudioParallelParams(com.tencent.trtc.TRTCCloudDef.TRTCAudioParallelParams tRTCAudioParallelParams);

    public abstract void setRemoteAudioVolume(java.lang.String str, int i17);

    public abstract void setRemoteRenderParams(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudDef.TRTCRenderParams tRTCRenderParams);

    public abstract int setRemoteVideoRenderListener(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCVideoRenderListener tRTCVideoRenderListener);

    public abstract int setRemoteVideoStreamType(java.lang.String str, int i17);

    public abstract void setSubStreamEncoderParam(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoEncoderParam(com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam);

    public abstract void setVideoMuteImage(android.graphics.Bitmap bitmap, int i17);

    public abstract void setWatermark(android.graphics.Bitmap bitmap, int i17, float f17, float f18, float f19);

    public abstract void showDebugView(int i17);

    public abstract void snapshotVideo(java.lang.String str, int i17, int i18, com.tencent.trtc.TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener);

    public abstract int startAudioRecording(com.tencent.trtc.TRTCCloudDef.TRTCAudioRecordingParams tRTCAudioRecordingParams);

    public abstract void startLocalAudio(int i17);

    public abstract void startLocalPreview(boolean z17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract void startLocalRecording(com.tencent.trtc.TRTCCloudDef.TRTCLocalRecordingParams tRTCLocalRecordingParams);

    public abstract void startPublishMediaStream(com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    public abstract void startRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract void startScreenCapture(int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoEncParam tRTCVideoEncParam, com.tencent.trtc.TRTCCloudDef.TRTCScreenShareParams tRTCScreenShareParams);

    public abstract int startSpeedTest(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestParams tRTCSpeedTestParams);

    public abstract void startSystemAudioLoopback();

    public abstract void stopAllRemoteView();

    public abstract void stopAudioRecording();

    public abstract void stopLocalAudio();

    public abstract void stopLocalPreview();

    public abstract void stopLocalRecording();

    public abstract void stopPublishMediaStream(java.lang.String str);

    public abstract void stopRemoteView(java.lang.String str, int i17);

    public abstract void stopScreenCapture();

    public abstract void stopSpeedTest();

    public abstract void stopSystemAudioLoopback();

    public abstract void switchRole(int i17);

    public abstract void switchRole(int i17, java.lang.String str);

    public abstract void switchRoom(com.tencent.trtc.TRTCCloudDef.TRTCSwitchRoomConfig tRTCSwitchRoomConfig);

    public abstract void updateLocalView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract void updateOtherRoomForwardMode(java.lang.String str);

    public abstract void updatePublishMediaStream(java.lang.String str, com.tencent.trtc.TRTCCloudDef.TRTCPublishTarget tRTCPublishTarget, com.tencent.trtc.TRTCCloudDef.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.tencent.trtc.TRTCCloudDef.TRTCStreamMixingConfig tRTCStreamMixingConfig);

    public abstract void updateRemote3DSpatialPosition(java.lang.String str, int[] iArr);

    public abstract void updateRemoteView(java.lang.String str, int i17, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    public abstract void updateSelf3DSpatialPosition(int[] iArr, float[] fArr, float[] fArr2, float[] fArr3);
}
