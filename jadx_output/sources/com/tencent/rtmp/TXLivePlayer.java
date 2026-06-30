package com.tencent.rtmp;

/* loaded from: classes16.dex */
public class TXLivePlayer {
    public static final int PLAY_TYPE_LIVE_FLV = 1;
    public static final int PLAY_TYPE_LIVE_HLS = 7;
    public static final int PLAY_TYPE_LIVE_RTMP = 0;
    public static final int PLAY_TYPE_LIVE_RTMP_ACC = 5;
    public static final java.lang.String TAG = "TXLivePlayer";
    private com.tencent.rtmp.a mImpl;

    /* loaded from: classes14.dex */
    public interface ITXAudioRawDataListener {
        void onAudioInfoChanged(int i17, int i18, int i19);

        void onPcmDataAvailable(byte[] bArr, long j17);
    }

    /* loaded from: classes14.dex */
    public interface ITXAudioVolumeEvaluationListener {
        void onAudioVolumeEvaluationNotify(int i17);
    }

    /* loaded from: classes14.dex */
    public interface ITXLivePlayVideoRenderListener {
        void onRenderVideoFrame(com.tencent.rtmp.TXLivePlayer.TXLiteAVTexture tXLiteAVTexture);
    }

    /* loaded from: classes14.dex */
    public interface ITXSnapshotListener {
        void onSnapshot(android.graphics.Bitmap bitmap);
    }

    /* loaded from: classes14.dex */
    public interface ITXVideoRawDataListener {
        void onVideoRawDataAvailable(byte[] bArr, int i17, int i18, int i19);
    }

    /* loaded from: classes14.dex */
    public static class TXLiteAVTexture {
        public java.lang.Object eglContext;
        public int height;
        public int textureId;
        public int width;
    }

    static {
        com.tencent.liteav.base.util.q.a();
    }

    public TXLivePlayer(android.content.Context context) {
        this.mImpl = new com.tencent.liteav.live.TXLivePlayerJni(context);
    }

    public void callExperimentalAPI(java.lang.String str) {
        this.mImpl.callExperimentalAPI(str);
    }

    public void enableAudioVolumeEvaluation(int i17) {
        this.mImpl.enableAudioVolumeEvaluation(i17);
    }

    public boolean enableHardwareDecode(boolean z17) {
        return this.mImpl.enableHardwareDecode(z17);
    }

    public long getCurrentRenderPts() {
        return this.mImpl.getCurrentRenderPts();
    }

    public boolean isPlaying() {
        return this.mImpl.isPlaying();
    }

    public void pause() {
        this.mImpl.pause();
    }

    public void resume() {
        this.mImpl.resume();
    }

    public void setAudioRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener) {
        this.mImpl.setAudioRawDataListener(iTXAudioRawDataListener);
    }

    public void setAudioRoute(int i17) {
        this.mImpl.setAudioRoute(i17);
    }

    public void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        this.mImpl.setAudioVolumeEvaluationListener(iTXAudioVolumeEvaluationListener);
    }

    public void setConfig(com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig) {
        this.mImpl.setConfig(tXLivePlayConfig);
    }

    public void setMute(boolean z17) {
        this.mImpl.setMute(z17);
    }

    public void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener) {
        this.mImpl.setPlayListener(iTXLivePlayListener);
    }

    public void setPlayerView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView) {
        this.mImpl.setPlayerView(tXCloudVideoView);
    }

    public void setRenderMode(int i17) {
        this.mImpl.setRenderMode(i17);
    }

    public void setRenderRotation(int i17) {
        this.mImpl.setRenderRotation(i17);
    }

    public void setSurface(android.view.Surface surface) {
        this.mImpl.setSurface(surface);
    }

    public void setSurfaceSize(int i17, int i18) {
        this.mImpl.setSurfaceSize(i17, i18);
    }

    public void setVideoRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener) {
        this.mImpl.setVideoRawDataListener(iTXVideoRawDataListener);
    }

    public void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener) {
        this.mImpl.setVideoRecordListener(iTXVideoRecordListener);
    }

    public int setVideoRenderListener(com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, java.lang.Object obj) {
        return this.mImpl.setVideoRenderListener(iTXLivePlayVideoRenderListener, obj);
    }

    public void setVolume(int i17) {
        this.mImpl.setVolume(i17);
    }

    public void showDebugView(boolean z17) {
        this.mImpl.showDebugView(z17);
    }

    public void snapshot(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener) {
        this.mImpl.snapshot(iTXSnapshotListener);
    }

    public int startLivePlay(java.lang.String str, int i17) {
        return this.mImpl.startLivePlay(str, i17);
    }

    public int startRecord(int i17) {
        return this.mImpl.startRecord(i17);
    }

    public int stopPlay(boolean z17) {
        return this.mImpl.stopPlay(z17);
    }

    public int stopRecord() {
        return this.mImpl.stopRecord();
    }

    public int switchStream(java.lang.String str) {
        return this.mImpl.switchStream(str);
    }
}
