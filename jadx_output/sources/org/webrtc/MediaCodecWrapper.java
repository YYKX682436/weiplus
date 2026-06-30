package org.webrtc;

/* loaded from: classes16.dex */
interface MediaCodecWrapper {
    void configure(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17);

    android.view.Surface createInputSurface();

    int dequeueInputBuffer(long j17);

    int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo bufferInfo, long j17);

    void flush();

    java.nio.ByteBuffer[] getInputBuffers();

    java.nio.ByteBuffer[] getOutputBuffers();

    android.media.MediaFormat getOutputFormat();

    void queueInputBuffer(int i17, int i18, int i19, long j17, int i27);

    void release();

    void releaseOutputBuffer(int i17, boolean z17);

    void setParameters(android.os.Bundle bundle);

    void start();

    void stop();
}
