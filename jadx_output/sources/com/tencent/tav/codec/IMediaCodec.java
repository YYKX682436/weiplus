package com.tencent.tav.codec;

/* loaded from: classes16.dex */
public interface IMediaCodec {
    void bindSurfaceTexture(android.graphics.SurfaceTexture surfaceTexture);

    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    android.view.Surface createInputSurface();

    int dequeueInputBuffer(long j17);

    int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    void flush();

    java.nio.ByteBuffer getInputBuffer(int i17);

    android.media.MediaFormat getInputFormat();

    java.nio.ByteBuffer getOutputBuffer(int i17);

    android.media.MediaFormat getOutputFormat();

    boolean isSoft();

    void queueInputBuffer(int i17, int i18, int i19, long j17, int i27);

    void release();

    void releaseOutputBuffer(int i17, boolean z17);

    void reset();

    void setDataSource(java.lang.String str);

    void signalEndOfInputStream();

    void start();

    void stop();
}
