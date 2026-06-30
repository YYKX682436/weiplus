package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface IDecoderTrack {

    /* loaded from: classes16.dex */
    public interface SurfaceCreator {
        android.view.Surface createOutputSurface(int i17, int i18, int i19);

        void free(android.view.Surface surface);

        void release();

        com.tencent.tav.decoder.VideoTexture videoTextureForSurface(android.view.Surface surface);
    }

    void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime);

    void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange);

    com.tencent.tav.coremedia.CMTime getCurrentSampleTime();

    com.tencent.tav.report.AverageTimeReporter getDecodePerformance();

    com.tencent.tav.coremedia.CMTime getDuration();

    com.tencent.tav.coremedia.CMTime getFrameDuration();

    int getFrameRate();

    long getLaggingTime();

    int getTrackId();

    com.tencent.tav.coremedia.CMSampleBuffer readSample();

    com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime);

    void release();

    com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18);

    void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType);

    void setFrameRate(int i17);

    void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger);

    void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list);

    void setVolume(float f17);

    void start();

    void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator);

    void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange);
}
