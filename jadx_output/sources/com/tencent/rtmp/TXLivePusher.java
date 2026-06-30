package com.tencent.rtmp;

/* loaded from: classes16.dex */
public class TXLivePusher implements com.tencent.rtmp.b {
    public static final int RGB_BGRA = 4;
    public static final int RGB_RGBA = 5;
    private static final java.lang.String TAG = "TXLivePusher";
    public static final int YUV_420P = 3;
    public static final int YUV_420SP = 1;
    public static final int YUV_420YpCbCr = 2;
    private com.tencent.rtmp.b mImpl;

    /* loaded from: classes16.dex */
    public interface AudioCustomProcessListener {
        void onRecordPcmData(byte[] bArr, long j17, int i17, int i18, int i19);

        void onRecordRawPcmData(byte[] bArr, long j17, int i17, int i18, int i19, boolean z17);
    }

    /* loaded from: classes15.dex */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i17);
    }

    /* loaded from: classes15.dex */
    public interface ITXSnapshotListener {
        void onSnapshot(android.graphics.Bitmap bitmap);
    }

    @java.lang.Deprecated
    /* loaded from: classes16.dex */
    public interface OnBGMNotify {
        void onBGMComplete(int i17);

        void onBGMProgress(long j17, long j18);

        void onBGMStart();
    }

    /* loaded from: classes15.dex */
    public interface VideoCustomProcessListener {
        void onDetectFacePoints(float[] fArr);

        int onTextureCustomProcess(int i17, int i18, int i19);

        void onTextureDestoryed();
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public TXLivePusher(android.content.Context context) {
        this.mImpl = new com.tencent.liteav.live.TXLivePusherJni(context);
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Create instance:" + this.mImpl.toString());
    }

    @Override // com.tencent.rtmp.b
    public synchronized void callExperimentalAPI(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.callExperimentalAPI(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void enableAudioVolumeEvaluation(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.enableAudioVolumeEvaluation(i17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized com.tencent.liteav.audio.TXAudioEffectManager getAudioEffectManager() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getAudioEffectManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized com.tencent.liteav.beauty.TXBeautyManager getBeautyManager() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return null;
        }
        return bVar.getBeautyManager();
    }

    @Override // com.tencent.rtmp.b
    public synchronized com.tencent.rtmp.TXLivePushConfig getConfig() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return new com.tencent.rtmp.TXLivePushConfig();
        }
        return bVar.getConfig();
    }

    @Override // com.tencent.rtmp.b
    public synchronized int getMaxZoom() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMaxZoom();
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized int getMusicDuration(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return 0;
        }
        return bVar.getMusicDuration(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean isPushing() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.isPushing();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void onLogRecord(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.onLogRecord(str);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean pauseBGM() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.pauseBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void pausePusher() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.pausePusher();
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean playBGM(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.playBGM(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void release() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.release();
        com.tencent.liteav.base.util.LiteavLog.i(TAG, "Release instance:" + this.mImpl.toString());
        this.mImpl = null;
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean resumeBGM() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.resumeBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void resumePusher() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.resumePusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void sendCustomPCMData(byte[] bArr) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendCustomPCMData(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoData(byte[] bArr, int i17, int i18, int i19) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoData(bArr, i17, i18, i19);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int sendCustomVideoTexture(int i17, int i18, int i19) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.sendCustomVideoTexture(i17, i18, i19);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void sendMessage(byte[] bArr) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.sendMessage(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean sendMessageEx(byte[] bArr) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.sendMessageEx(bArr);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioProcessListener(com.tencent.rtmp.TXLivePusher.AudioCustomProcessListener audioCustomProcessListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioProcessListener(audioCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setBGMNofify(com.tencent.rtmp.TXLivePusher.OnBGMNotify onBGMNotify) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMNofify(onBGMNotify);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setBGMPitch(float f17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setBGMPitch(f17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean setBGMPosition(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMPosition(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean setBGMVolume(float f17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBGMVolume(f17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setBeautyFilter(int i17, int i18, int i19, int i27) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setBeautyFilter(i17, i18, i19, i27);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setChinLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setChinLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setConfig(com.tencent.rtmp.TXLivePushConfig tXLivePushConfig) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setConfig(tXLivePushConfig);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setExposureCompensation(float f17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setExposureCompensation(f17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setEyeScaleLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setEyeScaleLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setFaceShortLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceShortLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setFaceSlimLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceSlimLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setFaceVLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFaceVLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setFilter(android.graphics.Bitmap bitmap) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFilter(bitmap);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setFocusPosition(float f17, float f18) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setFocusPosition(f17, f18);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean setGreenScreenFile(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setGreenScreenFile(str);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean setMicVolume(float f17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMicVolume(f17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setMirror(boolean z17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setMirror(z17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setMotionMute(boolean z17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionMute(z17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setMotionTmpl(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMotionTmpl(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setMute(boolean z17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setMute(z17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setNoseSlimLevel(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setNoseSlimLevel(i17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setPushListener(com.tencent.rtmp.ITXLivePushListener iTXLivePushListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setPushListener(iTXLivePushListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setRenderRotation(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setRenderRotation(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setReverb(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setReverb(i17);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setSpecialRatio(float f17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSpecialRatio(f17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setSurface(android.view.Surface surface) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurface(surface);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setSurfaceSize(int i17, int i18) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setSurfaceSize(i17, i18);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoProcessListener(com.tencent.rtmp.TXLivePusher.VideoCustomProcessListener videoCustomProcessListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoProcessListener(videoCustomProcessListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoQuality(int i17, boolean z17, boolean z18) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoQuality(i17, z17, z18);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVideoRecordListener(iTXVideoRecordListener);
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized void setVoiceChangerType(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.setVoiceChangerType(i17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean setZoom(int i17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.setZoom(i17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void snapshot(com.tencent.rtmp.TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.snapshot(iTXSnapshotListener);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startCameraPreview(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startCameraPreview(tXCloudVideoView);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startPusher(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return -1;
        }
        return bVar.startPusher(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized int startRecord(java.lang.String str) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return -3;
        }
        return bVar.startRecord(str);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void startScreenCapture() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.startScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    @java.lang.Deprecated
    public synchronized boolean stopBGM() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.stopBGM();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopCameraPreview(boolean z17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopCameraPreview(z17);
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopPusher() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopPusher();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopRecord() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopRecord();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void stopScreenCapture() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.stopScreenCapture();
    }

    @Override // com.tencent.rtmp.b
    public synchronized void switchCamera() {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return;
        }
        bVar.switchCamera();
    }

    @Override // com.tencent.rtmp.b
    public synchronized boolean turnOnFlashLight(boolean z17) {
        com.tencent.rtmp.b bVar = this.mImpl;
        if (bVar == null) {
            return false;
        }
        return bVar.turnOnFlashLight(z17);
    }
}
