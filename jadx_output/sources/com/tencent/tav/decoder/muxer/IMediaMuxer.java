package com.tencent.tav.decoder.muxer;

/* loaded from: classes16.dex */
public interface IMediaMuxer {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface Format {
    }

    /* loaded from: classes6.dex */
    public static final class OutputFormat {
        public static final int MUXER_OUTPUT_3GPP = 2;
        public static final int MUXER_OUTPUT_FIRST = 0;
        public static final int MUXER_OUTPUT_HEIF = 3;
        public static final int MUXER_OUTPUT_LAST = 3;
        public static final int MUXER_OUTPUT_MPEG_4 = 0;
        public static final int MUXER_OUTPUT_WEBM = 1;

        private OutputFormat() {
        }
    }

    int addTrack(android.media.MediaFormat mediaFormat);

    int audioTrackIndex();

    void clearResource();

    com.tencent.tav.core.ExportConfig getExportConfig();

    boolean ignoreHeader();

    boolean isMuxerStarted();

    void prepareParallelSegmentInfo(int i17, com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTimeRange cMTimeRange2);

    void release();

    void setExportConfig(com.tencent.tav.core.ExportConfig exportConfig);

    void start();

    boolean stop(boolean z17);

    int videoTrackIndex();

    void writeSampleData(int i17, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo);

    void writeSampleDataTime(boolean z17, com.tencent.tav.coremedia.CMTime cMTime);
}
