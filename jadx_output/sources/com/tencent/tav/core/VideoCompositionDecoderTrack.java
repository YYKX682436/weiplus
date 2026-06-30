package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class VideoCompositionDecoderTrack implements com.tencent.tav.decoder.IDecoderTrack {
    private static final java.lang.String TAG = "VideoComDecoderTrack";
    private static final int WAIT_TIME = 200;
    private com.tencent.tav.core.AssetExtension assetExtension;
    private java.util.List<com.tencent.tav.asset.AssetTrack> assetTrackList;
    private boolean asynced;
    private final com.tencent.tav.report.AverageTimeReporter decodeReporter;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private java.util.List<com.tencent.tav.decoder.IDecoderTrack> decoderTrackList;
    private com.tencent.tav.coremedia.CMTime frameDuration;
    private int frameRate;
    private final boolean isEnableOptimizedFrameSampling;
    private com.tencent.tav.coremedia.CMSampleState lastSampleState;
    private com.tencent.tav.decoder.logger.WXLogger logger;
    private com.tencent.tav.core.compositing.VideoCompositionRenderContext renderContext;
    private int trackId;
    private com.tencent.tav.core.compositing.VideoCompositing videoCompositing;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;

    public VideoCompositionDecoderTrack(com.tencent.tav.core.AssetExtension assetExtension, int i17) {
        this(assetExtension, i17, null, false);
    }

    private com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest createVideoCompositionRequest(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest = new com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest(this, this.assetExtension);
        asynchronousVideoCompositionRequest.setRenderContext(this.renderContext);
        asynchronousVideoCompositionRequest.setCompositionTime(cMTime);
        com.tencent.tav.core.composition.VideoComposition videoComposition = this.videoComposition;
        if (videoComposition != null) {
            asynchronousVideoCompositionRequest.setVideoCompositionInstruction(com.tencent.tav.core.composition.VideoComposition.findInstruction(videoComposition, cMTime));
        }
        return asynchronousVideoCompositionRequest;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer getSampleFromRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        synchronized (this) {
            if (asynchronousVideoCompositionRequest.getStatus() == Integer.MIN_VALUE) {
                waitForRequestFinish(200);
            }
        }
        if (asynchronousVideoCompositionRequest.getStatus() == 0) {
            this.lastSampleState = asynchronousVideoCompositionRequest.getComposedSampleBuffer().getState();
            return asynchronousVideoCompositionRequest.getComposedSampleBuffer();
        }
        this.lastSampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
        com.tencent.tav.decoder.logger.Logger.e(TAG, "readSample: failed 1 " + this.lastSampleState);
        return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L));
    }

    private boolean isAnySegmentHasSpeedChanging() {
        java.util.Iterator<com.tencent.tav.asset.AssetTrack> it = this.assetTrackList.iterator();
        while (it.hasNext()) {
            for (com.tencent.tav.asset.AssetTrackSegment assetTrackSegment : it.next().getSegments()) {
                if (java.lang.Math.abs((assetTrackSegment.getTimeMapping().getTarget().getDuration().getTimeSeconds() / assetTrackSegment.getTimeMapping().getSource().getDuration().getTimeSeconds()) - 1.0d) > 0.01d) {
                    return true;
                }
            }
        }
        return false;
    }

    private com.tencent.tav.coremedia.CMSampleBuffer readSampleToRequest(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        for (com.tencent.tav.decoder.IDecoderTrack iDecoderTrack : this.decoderTrackList) {
            com.tencent.tav.coremedia.CMSampleBuffer readSample = iDecoderTrack.readSample(cMTime);
            if (readSample.getState().stateMatchingTo(-3, -2, -100)) {
                this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(readSample.getTime());
                com.tencent.tav.decoder.logger.Logger.e(TAG, "readSample: failed 0 " + readSample.getTime());
                return new com.tencent.tav.coremedia.CMSampleBuffer(readSample.getState(), (com.tencent.tav.coremedia.TextureInfo) null);
            }
            if (!readSample.getState().stateMatchingTo(-1)) {
                asynchronousVideoCompositionRequest.appendCMSampleBuffer(readSample, iDecoderTrack.getTrackId());
            } else if (this.decoderTrackList.size() <= 1) {
                com.tencent.tav.decoder.logger.Logger.d(TAG, "readSample: finish 1");
                return readSample;
            }
        }
        return null;
    }

    private void waitForRequestFinish(int i17) {
        synchronized (this) {
            try {
                wait(i17);
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public synchronized void addTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.assetTrackList.add(assetTrack);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void asyncReadNextSample(com.tencent.tav.coremedia.CMTime cMTime) {
        if (this.asynced) {
            java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
            while (it.hasNext()) {
                it.next().asyncReadNextSample(cMTime);
            }
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void clipRangeAndClearRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().clipRangeAndClearRange(cMTimeRange);
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getCurrentSampleTime() {
        return this.lastSampleState.getTime();
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getDuration() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            com.tencent.tav.coremedia.CMTime duration = it.next().getDuration();
            if (duration.bigThan(cMTime)) {
                cMTime = duration;
            }
        }
        return cMTime;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMTime getFrameDuration() {
        return this.frameDuration;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getFrameRate() {
        return this.frameRate;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public long getLaggingTime() {
        java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            j17 += it.next().getLaggingTime();
        }
        return j17;
    }

    public com.tencent.tav.core.compositing.VideoCompositionRenderContext getRenderContext() {
        return this.renderContext;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public int getTrackId() {
        return this.trackId;
    }

    public com.tencent.tav.core.compositing.VideoCompositing getVideoCompositing() {
        return this.videoCompositing;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample() {
        if (!this.lastSampleState.stateMatchingTo(-100) && !this.lastSampleState.isInvalid()) {
            return readSample(this.lastSampleState.getTime().add(this.frameDuration));
        }
        return readSample(com.tencent.tav.coremedia.CMTime.CMTimeZero);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void release() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release:start " + this);
        for (com.tencent.tav.decoder.IDecoderTrack iDecoderTrack : this.decoderTrackList) {
            iDecoderTrack.release();
            this.decodeReporter.add(iDecoderTrack.getDecodePerformance());
        }
        this.decoderTrackList.clear();
        this.assetTrackList.clear();
        this.videoComposition = null;
        this.videoCompositing = null;
        this.renderContext = null;
        com.tencent.tav.decoder.logger.Logger.d(TAG, "release:finish " + this);
    }

    public synchronized void removeTrack(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.assetTrackList.remove(assetTrack);
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, boolean z18) {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "seekTo:[timeUs " + cMTime + "] [needRead " + z17 + "] [quickSeek " + z18 + "]");
        if (!cMTime.equals(this.lastSampleState.getTime())) {
            java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
            while (it.hasNext()) {
                it.next().seekTo(cMTime, false, z18);
            }
        }
        if (cMTime.bigThan(this.frameDuration)) {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime.sub(this.frameDuration));
        } else {
            this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState(cMTime);
        }
        if (z17) {
            return readSample();
        }
        return null;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setDecodeType(com.tencent.tav.decoder.IDecoder.DecodeType decodeType) {
    }

    public void setFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        this.frameDuration = cMTime;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setFrameRate(int i17) {
        this.frameRate = i17;
        java.util.Iterator<com.tencent.tav.decoder.IDecoderTrack> it = this.decoderTrackList.iterator();
        while (it.hasNext()) {
            it.next().setFrameRate(i17);
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
        this.logger = wXLogger;
    }

    public void setRenderContext(com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext) {
        this.renderContext = videoCompositionRenderContext;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setTrackSegments(java.util.List<com.tencent.tav.decoder.DecoderTrackSegment> list) {
    }

    public void setVideoCompositing(com.tencent.tav.core.compositing.VideoCompositing videoCompositing) {
        this.videoCompositing = videoCompositing;
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void setVolume(float f17) {
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start() {
        start(null);
    }

    public VideoCompositionDecoderTrack(com.tencent.tav.core.AssetExtension assetExtension, int i17, com.tencent.tav.codec.IDecoderFactory iDecoderFactory, boolean z17) {
        this.decoderTrackList = new java.util.ArrayList();
        this.assetTrackList = new java.util.ArrayList();
        this.asynced = true;
        this.frameRate = 30;
        this.frameDuration = new com.tencent.tav.coremedia.CMTime(1L, 30);
        this.lastSampleState = new com.tencent.tav.coremedia.CMSampleState();
        this.decodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this.logger = new com.tencent.tav.decoder.logger.WXLogger();
        this.assetExtension = assetExtension;
        this.trackId = i17;
        this.decoderFactory = iDecoderFactory;
        this.isEnableOptimizedFrameSampling = z17;
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
        start(surfaceCreator, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.tav.decoder.IDecoderTrack
    public void start(com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.decoder.VideoDecoderTrack videoDecoderTrack;
        com.tencent.tav.decoder.logger.Logger.d(TAG, "start:[start] " + cMTimeRange + " size - " + this.assetTrackList.size());
        com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext = new com.tencent.tav.core.compositing.VideoCompositionRenderContext((com.tencent.tav.decoder.RenderContext) surfaceCreator);
        this.renderContext = videoCompositionRenderContext;
        videoCompositionRenderContext.setVideoComposition(this.videoComposition);
        boolean isAnySegmentHasSpeedChanging = isAnySegmentHasSpeedChanging();
        boolean z17 = this.isEnableOptimizedFrameSampling && !isAnySegmentHasSpeedChanging;
        com.tencent.tav.decoder.logger.Logger.i(TAG, "useOFSVideoDecoderTrack: " + z17 + " enableOptimizedFrameSampling:" + this.isEnableOptimizedFrameSampling + " hasSpeedChanging:" + isAnySegmentHasSpeedChanging);
        for (com.tencent.tav.asset.AssetTrack assetTrack : this.assetTrackList) {
            if (assetTrack.getMediaType() == 1) {
                if (z17) {
                    com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack optimizedFrameSamplingVideoDecoderTrack = new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoderTrack(assetTrack, this.decoderFactory);
                    optimizedFrameSamplingVideoDecoderTrack.setVideoComposition(this.videoComposition);
                    optimizedFrameSamplingVideoDecoderTrack.setFrameRate(this.frameRate);
                    videoDecoderTrack = optimizedFrameSamplingVideoDecoderTrack;
                } else {
                    com.tencent.tav.decoder.VideoDecoderTrack videoDecoderTrack2 = new com.tencent.tav.decoder.VideoDecoderTrack(assetTrack, this.decoderFactory);
                    videoDecoderTrack2.setVideoComposition(this.videoComposition);
                    videoDecoderTrack = videoDecoderTrack2;
                }
                videoDecoderTrack.setLogger(this.logger);
                this.decoderTrackList.add(videoDecoderTrack);
                if (cMTimeRange != null) {
                    videoDecoderTrack.start(surfaceCreator, cMTimeRange);
                } else {
                    com.tencent.tav.coremedia.CMTimeRange timeRange = assetTrack.getTimeRange();
                    videoDecoderTrack.start(surfaceCreator, timeRange == null ? null : new com.tencent.tav.coremedia.CMTimeRange(timeRange.getStart(), timeRange.getDuration()));
                }
            }
        }
    }

    @Override // com.tencent.tav.decoder.IDecoderTrack
    public com.tencent.tav.coremedia.CMSampleBuffer readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample:[targetTime " + cMTime + "]" + this.videoCompositing);
        if (this.videoCompositing == null) {
            this.lastSampleState = com.tencent.tav.coremedia.CMSampleState.fromError(-3L);
            com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: failed 2 " + this.lastSampleState);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L));
        }
        if (cMTime.getValue() < 0) {
            cMTime = this.lastSampleState.getTime().add(this.frameDuration);
        }
        com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest createVideoCompositionRequest = createVideoCompositionRequest(cMTime);
        com.tencent.tav.coremedia.CMSampleBuffer readSampleToRequest = readSampleToRequest(cMTime, createVideoCompositionRequest);
        if (readSampleToRequest != null) {
            return readSampleToRequest;
        }
        if (createVideoCompositionRequest.getSourceTrackIDs().size() == 0) {
            com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: finish 2");
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: startVideoCompositionRequest ");
        com.tencent.tav.coremedia.CMPerformance cMPerformance = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.RENDER);
        cMPerformance.markStart();
        this.videoCompositing.startVideoCompositionRequest(createVideoCompositionRequest);
        com.tencent.tav.decoder.logger.Logger.v(TAG, "readSample: startVideoCompositionRequest finish ");
        android.opengl.GLES20.glFlush();
        cMPerformance.markEnd();
        com.tencent.tav.coremedia.CMSampleBuffer sampleFromRequest = getSampleFromRequest(createVideoCompositionRequest);
        java.util.Iterator<java.lang.Integer> it = createVideoCompositionRequest.getSourceTrackIDs().iterator();
        while (it.hasNext()) {
            cMPerformance.preNodes.add(createVideoCompositionRequest.sourceFrameByTrackID(it.next().intValue()).getState().performance);
        }
        sampleFromRequest.getState().performance = cMPerformance;
        return sampleFromRequest;
    }
}
