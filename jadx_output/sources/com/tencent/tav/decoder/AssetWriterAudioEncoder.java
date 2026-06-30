package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface AssetWriterAudioEncoder {
    boolean endWriteAudioSample();

    android.media.MediaFormat getEncodeFormat();

    long getEncodePresentationTimeUs();

    boolean isEncodeToEndOfStream();

    boolean prepare(com.tencent.tav.core.ExportConfig exportConfig, android.media.MediaFormat mediaFormat);

    void release();

    void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer);

    boolean start();

    void stop();

    boolean writeAudioFrame(boolean z17);

    long writeAudioSample(long j17, java.nio.ByteBuffer byteBuffer);
}
