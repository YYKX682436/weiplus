package com.tencent.thumbplayer.tmediacodec;

/* loaded from: classes14.dex */
public interface IMediaCodec {
    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler);

    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    void release();

    void releaseOutputBuffer(int i17, long j17);

    void releaseOutputBuffer(int i17, boolean z17);

    void reset();

    void setParameters(android.os.Bundle bundle);

    void start();

    void stop();
}
