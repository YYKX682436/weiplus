package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface IDecoder {
    public static final long SAMPLE_STATE_ERROR = -3;
    public static final long SAMPLE_STATE_FAILED = -2;
    public static final long SAMPLE_STATE_FINISH = -1;
    public static final long SAMPLE_STATE_TIMEOUT = -4;
    public static final long SAMPLE_STATE_UN_START = -100;

    /* loaded from: classes16.dex */
    public enum DecodeType {
        Video,
        Audio
    }

    com.tencent.tav.report.AverageTimeReporter getDecodePerformance();

    java.lang.String getSourcePath();

    boolean hasTrack();

    java.nio.ByteBuffer outputBuffer();

    com.tencent.tav.coremedia.CMSampleState readSample();

    com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime cMTime);

    void release();

    void seekTo(com.tencent.tav.coremedia.CMTime cMTime);

    void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger);

    void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime);
}
