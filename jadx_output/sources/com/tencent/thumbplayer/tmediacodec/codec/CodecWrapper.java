package com.tencent.thumbplayer.tmediacodec.codec;

/* loaded from: classes14.dex */
public interface CodecWrapper {
    void attachThread();

    com.tencent.thumbplayer.tmediacodec.reuse.ReuseHelper.ReuseType canReuseType(com.tencent.thumbplayer.tmediacodec.codec.FormatWrapper formatWrapper);

    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, int i17, android.media.MediaDescrambler mediaDescrambler);

    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    int dequeueInputBuffer(long j17);

    int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    void flush();

    android.media.MediaCodec getMediaCodec();

    void prepareToReUse();

    void queueInputBuffer(int i17, int i18, int i19, long j17, int i27);

    void release();

    void releaseOutputBuffer(int i17, long j17);

    void releaseOutputBuffer(int i17, boolean z17);

    void reset();

    void setCodecCallback(com.tencent.thumbplayer.tmediacodec.callback.CodecCallback codecCallback);

    void setOutputSurface(android.view.Surface surface);

    void start();

    void stop();
}
