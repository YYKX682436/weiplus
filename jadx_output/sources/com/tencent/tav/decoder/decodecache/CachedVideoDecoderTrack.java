package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
public class CachedVideoDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    private static final java.lang.String TAG = "CachedVideoTrack";
    private com.tencent.tav.decoder.decodecache.CacheSegment currentFrameSegment;
    private com.tencent.tav.decoder.decodecache.CacheSegment nextFrameSegment;
    com.tencent.tav.decoder.RenderContext renderContext;
    boolean revert;
    private com.tencent.tav.decoder.decodecache.SegmentDecoderThread segmentDecoder;
    com.tencent.tav.coremedia.CMTimeRange validTimeRange;
    private int segmentSize = 60;
    final java.lang.Object nextFrameDecoderLock = new java.lang.Object();
    private com.tencent.tav.coremedia.CMSampleState lastSampleState = new com.tencent.tav.coremedia.CMSampleState();

    public CachedVideoDecoderTrack(com.tencent.tav.decoder.IDecoderTrack iDecoderTrack, boolean z17) {
        this.revert = z17;
        this.segmentDecoder = new com.tencent.tav.decoder.decodecache.SegmentDecoderThread(this, iDecoderTrack);
    }

    private void clearCurrentFrameSegment() {
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
            this.currentFrameSegment = null;
        }
    }

    private com.tencent.tav.coremedia.CMSampleBuffer decoderFrame(com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        this.segmentDecoder.decoderSegment(cMTime, countDownLatch);
        try {
            countDownLatch.await(5L, java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.lang.InterruptedException unused) {
        }
        return this.segmentDecoder.seekSampleBuffer;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer decoderSegment(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.decodecache.RequestStatus requestStatus = new com.tencent.tav.decoder.decodecache.RequestStatus();
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = this.nextFrameSegment;
        boolean z17 = false;
        if (cacheSegment == null || cacheSegment.segmentTimeRange == null || !this.nextFrameSegment.segmentTimeRange.containsTime(cMTime)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("readSample: hint nextFrameSegment --- ");
            com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment2 = this.nextFrameSegment;
            sb6.append(cacheSegment2 == null ? "" : cacheSegment2.segmentTimeRange);
            sb6.append("  ");
            sb6.append(cMTime);
            com.tencent.tav.decoder.logger.Logger.w(TAG, sb6.toString());
        } else {
            synchronized (this.nextFrameDecoderLock) {
                clearCurrentFrameSegment();
                this.currentFrameSegment = new com.tencent.tav.decoder.decodecache.CacheSegment(this.nextFrameSegment.segmentTimeRange);
                java.util.Iterator<com.tencent.tav.decoder.decodecache.CacheFrame> it = this.nextFrameSegment.cacheFrameList.iterator();
                while (it.hasNext()) {
                    this.currentFrameSegment.pushFrame(it.next());
                }
                com.tencent.tav.decoder.decodecache.CacheFrame popFrame = this.currentFrameSegment.popFrame(cMTime);
                if (popFrame != null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    sb7.append("readSample: hint nextFrameSegment ");
                    com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = popFrame.sampleBuffer;
                    if (cMSampleBuffer != null && cMSampleBuffer.getTextureInfo() != null) {
                        z17 = true;
                    }
                    sb7.append(z17);
                    sb7.append("  ");
                    com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2 = popFrame.sampleBuffer;
                    sb7.append(cMSampleBuffer2 != null ? java.lang.Boolean.valueOf(cMSampleBuffer2.isNewFrame()) : "null");
                    sb7.append(" time = ");
                    sb7.append(popFrame.realFrameTime);
                    sb7.append("  ");
                    sb7.append(popFrame.frameTime);
                    com.tencent.tav.decoder.logger.Logger.v(TAG, sb7.toString());
                    com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment3 = new com.tencent.tav.decoder.decodecache.CacheSegment(new com.tencent.tav.coremedia.CMTimeRange(this.currentFrameSegment.getLastFrameTime(), getFrameDuration().multi(this.segmentSize)));
                    this.nextFrameSegment = cacheSegment3;
                    this.segmentDecoder.decoderSegment(cacheSegment3, (com.tencent.tav.decoder.decodecache.RequestStatus) null);
                    this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(popFrame.frameTime);
                    return popFrame.sampleBuffer;
                }
                com.tencent.tav.decoder.logger.Logger.w(TAG, "readSample: hint nextFrameSegment frame == null " + this.nextFrameSegment.cacheFrameList.size() + "  " + this.currentFrameSegment.cacheFrameList.size());
                this.segmentDecoder.cancel = true;
            }
        }
        synchronized (this.nextFrameDecoderLock) {
            com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment4 = this.nextFrameSegment;
            if (cacheSegment4 != null) {
                cacheSegment4.clear();
            }
            com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment5 = new com.tencent.tav.decoder.decodecache.CacheSegment(new com.tencent.tav.coremedia.CMTimeRange(cMTime, getFrameDuration().multi(this.segmentSize)));
            this.nextFrameSegment = cacheSegment5;
            this.segmentDecoder.decoderSegment(cacheSegment5, requestStatus);
        }
        synchronized (requestStatus) {
            try {
                if (!requestStatus.getFinish()) {
                    requestStatus.wait(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
                }
            } catch (java.lang.InterruptedException unused) {
            }
        }
        if (this.nextFrameSegment.cacheFrameList.size() == 0) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        clearCurrentFrameSegment();
        this.currentFrameSegment = new com.tencent.tav.decoder.decodecache.CacheSegment(this.nextFrameSegment.segmentTimeRange);
        java.util.Iterator<com.tencent.tav.decoder.decodecache.CacheFrame> it6 = this.nextFrameSegment.cacheFrameList.iterator();
        while (it6.hasNext()) {
            this.currentFrameSegment.pushFrame(it6.next());
        }
        synchronized (this.nextFrameDecoderLock) {
            com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment6 = new com.tencent.tav.decoder.decodecache.CacheSegment(new com.tencent.tav.coremedia.CMTimeRange(this.currentFrameSegment.getLastFrameTime(), getFrameDuration().multi(this.segmentSize)));
            this.nextFrameSegment = cacheSegment6;
            this.segmentDecoder.decoderSegment(cacheSegment6, (com.tencent.tav.decoder.decodecache.RequestStatus) null);
        }
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment7 = this.currentFrameSegment;
        if (cacheSegment7 == null || cacheSegment7.cacheFrameList.size() <= 0) {
            return null;
        }
        com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame = this.currentFrameSegment.cacheFrameList.get(0);
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cacheFrame.frameTime);
        return cacheFrame.sampleBuffer;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.segmentDecoder.decoderTrack.clipRangeAndClearRange(cMTimeRange);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.segmentDecoder.decoderTrack.getDuration();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.segmentDecoder.decoderTrack.getFrameDuration();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return this.segmentDecoder.decoderTrack.getFrameRate();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public long getLaggingTime() {
        return 0L;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getTrackId() {
        return this.segmentDecoder.decoderTrack.getTrackId();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        if (this.lastSampleState.isInvalid()) {
            return readSample(com.tencent.tav.coremedia.CMTime.CMTimeZero);
        }
        if (this.lastSampleState.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(this.lastSampleState);
        }
        return readSample(this.lastSampleState.getTime().add(getFrameDuration()));
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void release() {
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
        }
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment2 = this.nextFrameSegment;
        if (cacheSegment2 != null) {
            cacheSegment2.clear();
        }
        synchronized (this.nextFrameDecoderLock) {
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread segmentDecoderThread = this.segmentDecoder;
            if (segmentDecoderThread != null) {
                segmentDecoderThread.release();
                this.segmentDecoder = null;
            }
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "seekTo: PlayerThreadMain " + cMTime);
        if (cMTime.bigThan(getFrameDuration())) {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime.sub(getFrameDuration()));
        } else {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        }
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null) {
            cacheSegment.clear();
            this.currentFrameSegment = null;
        }
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment2 = this.nextFrameSegment;
        if (cacheSegment2 != null) {
            cacheSegment2.clear();
            this.nextFrameSegment = null;
        }
        if (!z17) {
            return null;
        }
        com.tencent.tav.coremedia.CMSampleBuffer decoderFrame = decoderFrame(new com.tencent.tav.coremedia.CMTime(((float) (((cMTime.getTimeUs() / getFrameDuration().getTimeUs()) + (cMTime.getTimeUs() % getFrameDuration().getTimeUs() > 0 ? 1 : 0)) * getFrameDuration().getTimeUs())) / 1000000.0f));
        this.lastSampleState = decoderFrame == null ? com.tencent.tav.coremedia.CMSampleState.fromError(-1L) : decoderFrame.getState();
        return decoderFrame;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
        this.segmentDecoder.decoderTrack.setDecodeType(decodeType);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        this.segmentDecoder.decoderTrack.setFrameRate(i17);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    public void setMaxFrameCacheSize(int i17) {
        if (i17 > 0) {
            this.segmentSize = i17;
            com.tencent.tav.decoder.decodecache.SegmentDecoderThread segmentDecoderThread = this.segmentDecoder;
            if (segmentDecoderThread != null) {
                segmentDecoderThread.texturePool.setMaxCacheLength(i17);
            }
        }
    }

    public void setRevert(boolean z17) {
        this.revert = z17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list) {
        this.segmentDecoder.decoderTrack.setTrackSegments(list);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setVolume(float f17) {
        this.segmentDecoder.decoderTrack.setVolume(f17);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start() {
        start(null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.validTimeRange = cMTimeRange;
        this.renderContext = (com.tencent.tav.decoder.RenderContext) surfaceCreator;
        this.segmentDecoder.startForReady();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.decodecache.CacheFrame popFrame;
        if (cMTime.smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero)) {
            return readSample();
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: targetTime = " + cMTime);
        com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = this.currentFrameSegment;
        if (cacheSegment != null && (popFrame = cacheSegment.popFrame(cMTime)) != null) {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(popFrame.frameTime);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("readSample: hint currentSegment ");
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = popFrame.sampleBuffer;
            sb6.append((cMSampleBuffer == null || cMSampleBuffer.getTextureInfo() == null) ? false : true);
            sb6.append("  ");
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer2 = popFrame.sampleBuffer;
            sb6.append(cMSampleBuffer2 != null ? java.lang.Boolean.valueOf(cMSampleBuffer2.isNewFrame()) : "null");
            sb6.append(" time = ");
            sb6.append(popFrame.realFrameTime);
            sb6.append("  ");
            sb6.append(popFrame.frameTime);
            com.tencent.tav.decoder.logger.Logger.v(TAG, sb6.toString());
            return popFrame.sampleBuffer;
        }
        if (!cMTime.smallThan(getDuration())) {
            this.lastSampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        com.tencent.tav.coremedia.CMSampleBuffer decoderSegment = decoderSegment(cMTime);
        if (decoderSegment != null) {
            com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: hint currentSegment - " + decoderSegment.getTime());
            return decoderSegment;
        }
        if (cMTime.bigThan(getDuration())) {
            this.lastSampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-1L);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        this.lastSampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
        return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L));
    }
}
