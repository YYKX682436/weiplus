package com.tencent.qqmusic.mediaplayer.audiofx;

/* loaded from: classes13.dex */
public interface IAudioListener {
    long getActualTime(long j17);

    boolean isEnabled();

    boolean isTerminal();

    boolean onPcm(com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo, com.tencent.qqmusic.mediaplayer.BufferInfo bufferInfo2, long j17);

    boolean onPcm(com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo, com.tencent.qqmusic.mediaplayer.FloatBufferInfo floatBufferInfo2, long j17);

    long onPlayerReady(int i17, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation, long j17);

    void onPlayerSeekComplete(long j17);

    void onPlayerStopped();
}
