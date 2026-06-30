package com.tencent.trtc;

/* loaded from: classes16.dex */
public abstract class TRTCCloudListener {

    /* loaded from: classes10.dex */
    public interface TRTCAudioFrameListener {
        void onCapturedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onLocalProcessedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onMixedAllAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onMixedPlayAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);

        void onRemoteUserAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame, java.lang.String str);

        void onVoiceEarMonitorAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame);
    }

    /* loaded from: classes4.dex */
    public static abstract class TRTCLogListener {
        public abstract void onLog(java.lang.String str, int i17, java.lang.String str2);
    }

    /* loaded from: classes4.dex */
    public interface TRTCSnapshotListener {
        void onSnapshotComplete(android.graphics.Bitmap bitmap);
    }

    /* loaded from: classes16.dex */
    public interface TRTCVideoFrameListener {
        void onGLContextCreated();

        void onGLContextDestory();

        int onProcessVideoFrame(com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame2);
    }

    /* loaded from: classes14.dex */
    public interface TRTCVideoRenderListener {
        void onRenderVideoFrame(java.lang.String str, int i17, com.tencent.trtc.TRTCCloudDef.TRTCVideoFrame tRTCVideoFrame);
    }

    @java.lang.Deprecated
    public void onAudioEffectFinished(int i17, int i18) {
    }

    public void onAudioRouteChanged(int i17, int i18) {
    }

    public void onCameraDidReady() {
    }

    public void onCdnStreamStateChanged(java.lang.String str, int i17, int i18, java.lang.String str2, android.os.Bundle bundle) {
    }

    public void onConnectOtherRoom(java.lang.String str, int i17, java.lang.String str2) {
    }

    public void onConnectionLost() {
    }

    public void onConnectionRecovery() {
    }

    public void onDisConnectOtherRoom(int i17, java.lang.String str) {
    }

    public void onEnterRoom(long j17) {
    }

    public void onError(int i17, java.lang.String str, android.os.Bundle bundle) {
    }

    public void onExitRoom(int i17) {
    }

    public void onFirstAudioFrame(java.lang.String str) {
    }

    public void onFirstVideoFrame(java.lang.String str, int i17, int i18, int i19) {
    }

    public void onLocalRecordBegin(int i17, java.lang.String str) {
    }

    public void onLocalRecordComplete(int i17, java.lang.String str) {
    }

    public void onLocalRecordFragment(java.lang.String str) {
    }

    public void onLocalRecording(long j17, java.lang.String str) {
    }

    public void onMicDidReady() {
    }

    public void onMissCustomCmdMsg(java.lang.String str, int i17, int i18, int i19) {
    }

    public void onNetworkQuality(com.tencent.trtc.TRTCCloudDef.TRTCQuality tRTCQuality, java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCQuality> arrayList) {
    }

    public void onRecvCustomCmdMsg(java.lang.String str, int i17, int i18, byte[] bArr) {
    }

    public void onRecvSEIMsg(java.lang.String str, byte[] bArr) {
    }

    public void onRemoteAudioStatusUpdated(java.lang.String str, int i17, int i18, android.os.Bundle bundle) {
    }

    public void onRemoteUserEnterRoom(java.lang.String str) {
    }

    public void onRemoteUserLeaveRoom(java.lang.String str, int i17) {
    }

    public void onRemoteVideoStatusUpdated(java.lang.String str, int i17, int i18, int i19, android.os.Bundle bundle) {
    }

    public void onScreenCapturePaused() {
    }

    public void onScreenCaptureResumed() {
    }

    public void onScreenCaptureStarted() {
    }

    public void onScreenCaptureStopped(int i17) {
    }

    public void onSendFirstLocalAudioFrame() {
    }

    public void onSendFirstLocalVideoFrame(int i17) {
    }

    public void onSetMixTranscodingConfig(int i17, java.lang.String str) {
    }

    public void onSpeedTest(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult, int i17, int i18) {
    }

    public void onSpeedTestResult(com.tencent.trtc.TRTCCloudDef.TRTCSpeedTestResult tRTCSpeedTestResult) {
    }

    public void onStartPublishCDNStream(int i17, java.lang.String str) {
    }

    public void onStartPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    public void onStartPublishing(int i17, java.lang.String str) {
    }

    public void onStatistics(com.tencent.trtc.TRTCStatistics tRTCStatistics) {
    }

    public void onStopPublishCDNStream(int i17, java.lang.String str) {
    }

    public void onStopPublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    public void onStopPublishing(int i17, java.lang.String str) {
    }

    public void onSwitchRole(int i17, java.lang.String str) {
    }

    public void onSwitchRoom(int i17, java.lang.String str) {
    }

    public void onTryToReconnect() {
    }

    public void onUpdateOtherRoomForwardMode(int i17, java.lang.String str) {
    }

    public void onUpdatePublishMediaStream(java.lang.String str, int i17, java.lang.String str2, android.os.Bundle bundle) {
    }

    public void onUserAudioAvailable(java.lang.String str, boolean z17) {
    }

    @java.lang.Deprecated
    public void onUserEnter(java.lang.String str) {
    }

    @java.lang.Deprecated
    public void onUserExit(java.lang.String str, int i17) {
    }

    public void onUserSubStreamAvailable(java.lang.String str, boolean z17) {
    }

    public void onUserVideoAvailable(java.lang.String str, boolean z17) {
    }

    public void onUserVideoSizeChanged(java.lang.String str, int i17, int i18, int i19) {
    }

    public void onUserVoiceVolume(java.util.ArrayList<com.tencent.trtc.TRTCCloudDef.TRTCVolumeInfo> arrayList, int i17) {
    }

    public void onWarning(int i17, java.lang.String str, android.os.Bundle bundle) {
    }
}
