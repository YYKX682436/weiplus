package com.tencent.rtmp;

/* loaded from: classes16.dex */
public interface a {
    void callExperimentalAPI(java.lang.String str);

    void enableAudioVolumeEvaluation(int i17);

    boolean enableHardwareDecode(boolean z17);

    long getCurrentRenderPts();

    boolean isPlaying();

    void pause();

    void resume();

    void setAudioRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXAudioRawDataListener iTXAudioRawDataListener);

    void setAudioRoute(int i17);

    void setAudioVolumeEvaluationListener(com.tencent.rtmp.TXLivePlayer.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener);

    void setConfig(com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig);

    void setMute(boolean z17);

    void setPlayListener(com.tencent.rtmp.ITXLivePlayListener iTXLivePlayListener);

    void setPlayerView(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView);

    void setRenderMode(int i17);

    void setRenderRotation(int i17);

    void setSurface(android.view.Surface surface);

    void setSurfaceSize(int i17, int i18);

    void setVideoRawDataListener(com.tencent.rtmp.TXLivePlayer.ITXVideoRawDataListener iTXVideoRawDataListener);

    void setVideoRecordListener(com.tencent.ugc.TXRecordCommon.ITXVideoRecordListener iTXVideoRecordListener);

    int setVideoRenderListener(com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener iTXLivePlayVideoRenderListener, java.lang.Object obj);

    void setVolume(int i17);

    void showDebugView(boolean z17);

    void snapshot(com.tencent.rtmp.TXLivePlayer.ITXSnapshotListener iTXSnapshotListener);

    int startLivePlay(java.lang.String str, int i17);

    int startRecord(int i17);

    int stopPlay(boolean z17);

    int stopRecord();

    int switchStream(java.lang.String str);
}
