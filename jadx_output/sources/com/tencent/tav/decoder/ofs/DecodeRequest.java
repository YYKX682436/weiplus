package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
class DecodeRequest {
    public final com.tencent.tav.coremedia.CMTime alignedTimeInClip;
    public final com.tencent.tav.decoder.ofs.DecodeCallback callback;
    public boolean isCompleted = false;
    private final com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder optimizedFrameSamplingVideoDecoder;
    public final long requestStartTimeMs;
    public final com.tencent.tav.coremedia.CMTimeRange samplingTimeRangeInMedia;

    public DecodeRequest(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder optimizedFrameSamplingVideoDecoder, long j17, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2, com.tencent.tav.coremedia.CMTime cMTime3, com.tencent.tav.decoder.ofs.DecodeCallback decodeCallback) {
        this.optimizedFrameSamplingVideoDecoder = optimizedFrameSamplingVideoDecoder;
        this.requestStartTimeMs = j17;
        this.alignedTimeInClip = cMTime;
        this.samplingTimeRangeInMedia = new com.tencent.tav.coremedia.CMTimeRange(cMTime2, cMTime3);
        this.callback = decodeCallback;
    }

    private void completeInternal(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        if (this.isCompleted) {
            com.tencent.tav.decoder.logger.Logger.w("OFSVideoDecoder", "Try complete request twice.");
            return;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.optimizedFrameSamplingVideoDecoder.TAG, "Request completed with state:" + cMSampleBuffer.getState().getStateCode() + " time:" + cMSampleBuffer.getTime().getTimeSeconds());
        this.isCompleted = true;
        com.tencent.tav.decoder.ofs.DecodeCallback decodeCallback = this.callback;
        if (decodeCallback != null) {
            decodeCallback.onDecodeFrame(cMSampleBuffer);
        }
    }

    public void completeWithEOS() {
        completeInternal(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L)));
    }

    public void completeWithError(long j17, java.lang.String str, java.lang.Throwable th6) {
        completeInternal(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(j17, str, th6)));
    }

    public void completeWithFrame(com.tencent.tav.decoder.ofs.DecodedFrame decodedFrame) {
        completeInternal(new com.tencent.tav.coremedia.CMSampleBuffer(new com.tencent.tav.coremedia.CMSampleState(this.alignedTimeInClip), decodedFrame.textureInfo));
    }

    public void completeWithTimeout() {
        completeInternal(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-4L)));
    }
}
