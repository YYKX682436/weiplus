package com.tencent.qqmusic.mediaplayer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public interface PlayerCallback {
    void playThreadStart(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);

    void playerEnded(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);

    void playerException(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, int i17, int i18, int i19);

    void playerPaused(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);

    void playerPrepared(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);

    void playerSeekCompletion(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer, int i17);

    void playerStarted(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);

    void playerStopped(com.tencent.qqmusic.mediaplayer.CorePlayer corePlayer);
}
