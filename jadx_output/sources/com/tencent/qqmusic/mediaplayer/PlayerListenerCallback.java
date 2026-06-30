package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public interface PlayerListenerCallback {
    void onBufferingUpdate(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17);

    void onCompletion(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer);

    void onError(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17, int i18, int i19);

    void onPrepared(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer);

    void onSeekComplete(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17);

    void onStarted(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer);

    void onStateChanged(com.tencent.qqmusic.mediaplayer.BaseMediaPlayer baseMediaPlayer, int i17);
}
