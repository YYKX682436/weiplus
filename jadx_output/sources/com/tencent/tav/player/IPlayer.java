package com.tencent.tav.player;

/* loaded from: classes10.dex */
public interface IPlayer {

    /* loaded from: classes10.dex */
    public interface PlayerListener {
        void onPositionChanged(com.tencent.tav.coremedia.CMTime cMTime);

        void onStatusChanged(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus);
    }

    /* loaded from: classes10.dex */
    public enum PlayerStatus {
        IDLE,
        READY,
        PLAYING,
        STOPPED,
        PAUSED,
        FINISHED,
        ERROR,
        REPLAY
    }

    com.tencent.tav.player.IPlayer.PlayerStatus currentStatus();

    com.tencent.tav.coremedia.CMTime duration();

    boolean isPlaying();

    void pause();

    void play();

    com.tencent.tav.coremedia.CMTime position();

    void release();

    void release(java.lang.Runnable runnable);

    void seekToTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.player.Callback callback);

    void setLoop(boolean z17);

    void setOnCompositionUpdateListener(com.tencent.tav.player.OnCompositionUpdateListener onCompositionUpdateListener);

    void setPlayRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    void setPlayerListener(com.tencent.tav.player.IPlayer.PlayerListener playerListener);

    void setVolume(float f17);

    void stop();

    void update(com.tencent.tav.player.PlayerItem playerItem, com.tencent.tav.coremedia.CMTime cMTime);

    void updateAudioClipsProperties();

    void updateAudioVolumeProperties();

    int videoHeight();

    int videoWidth();

    void waitForRelease(long j17);
}
