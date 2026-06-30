package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface AssetWriterVideoEncoder {
    public static final java.lang.String OUTPUT_VIDEO_MIME_TYPE = "video/avc";
    public static final long WRITER_FINISH = -1;

    android.view.Surface createInputSurface();

    void flush();

    android.media.MediaFormat getEncodeFormat();

    long getEncodePresentationTimeUs();

    com.tencent.tav.coremedia.CGSize getEncodeSize();

    boolean isEncodeToEndOfStream();

    boolean isNeedVideoOutputTexture();

    boolean prepare(com.tencent.tav.core.ExportConfig exportConfig, android.media.MediaFormat mediaFormat);

    void processVideoTexture(com.tencent.tav.coremedia.TextureInfo textureInfo, com.tencent.tav.coremedia.CMTime cMTime);

    void release();

    void reset();

    void setMediaMuxer(com.tencent.tav.decoder.muxer.IMediaMuxer iMediaMuxer);

    void setVideoSampleRenderContext(com.tencent.tav.decoder.RenderContext renderContext);

    void signalEndOfInputStream();

    boolean start();

    void stop();

    boolean writeVideoSample(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17);
}
