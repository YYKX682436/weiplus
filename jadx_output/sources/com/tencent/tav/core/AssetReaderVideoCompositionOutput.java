package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetReaderVideoCompositionOutput extends com.tencent.tav.core.AssetReaderOutput {
    public static final java.lang.String TAG = "AssetReaderVideoCompositionOutput";
    private com.tencent.tav.core.AssetExtension assetExtension;
    private com.tencent.tav.core.IContextCreate contextCreate;
    private com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private boolean enableOptimizedVideoFrameSampling;
    private int frameRate;
    private com.tencent.tav.core.compositing.VideoCompositing videoCompositing;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;
    private com.tencent.tav.decoder.IDecoderTrack videoDecoderTrack;
    private java.util.Map<java.lang.String, java.lang.Object> videoSettings;
    private java.util.List<com.tencent.tav.asset.AssetTrack> videoTracks;
    private com.tencent.tav.core.compositing.VideoCompositing customVideoCompositor = new com.tencent.tav.core.VideoCompositor();
    private boolean decoderStarted = false;
    private boolean readFirstFrame = false;
    private boolean revertMode = false;

    public AssetReaderVideoCompositionOutput(java.util.List<com.tencent.tav.asset.AssetTrack> list, java.util.Map<java.lang.String, java.lang.Object> map, com.tencent.tav.core.AssetExtension assetExtension, com.tencent.tav.codec.IDecoderFactory iDecoderFactory) {
        this.frameRate = -1;
        this.videoTracks = list;
        this.videoSettings = map;
        this.assetExtension = assetExtension;
        this.mediaType = 1;
        if (map != null && map.containsKey("frame-rate")) {
            this.frameRate = ((java.lang.Integer) map.get("frame-rate")).intValue();
        }
        this.decoderFactory = iDecoderFactory;
    }

    private void tryStartDecoder() {
        if (this.decoderStarted) {
            return;
        }
        this.decoderStarted = true;
        this.videoDecoderTrack.setFrameRate(this.frameRate);
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        com.tencent.tav.core.IContextCreate iContextCreate = this.contextCreate;
        iDecoderTrack.start(iContextCreate == null ? null : iContextCreate.renderContext());
        this.videoDecoderTrack.seekTo(this.timeRange.getStart(), false, true);
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        if (iDecoderTrack != null) {
            return iDecoderTrack.getDecodePerformance();
        }
        return null;
    }

    public com.tencent.tav.core.compositing.VideoCompositing getVideoCompositing() {
        return this.videoCompositing;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getVideoSettings() {
        return this.videoSettings;
    }

    public java.util.List<com.tencent.tav.asset.AssetTrack> getVideoTracks() {
        return this.videoTracks;
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void markConfigurationAsFinal() {
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public synchronized com.tencent.tav.coremedia.CMSampleBuffer nextSampleBuffer(boolean z17) {
        com.tencent.tav.coremedia.CMSampleBuffer readSample;
        if (this.videoDecoderTrack == null) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L));
        }
        tryStartDecoder();
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        if (iDecoderTrack == null) {
            readSample = new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-100L));
        } else if (this.readFirstFrame) {
            readSample = iDecoderTrack.readSample();
        } else {
            readSample = iDecoderTrack.readSample(this.timeRange.getStart());
            this.readFirstFrame = true;
        }
        if (readSample.getTime().smallThan(this.timeRange.getStart())) {
            return readSample;
        }
        if (!readSample.getTime().smallThan(this.timeRange.getEnd())) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L));
        }
        if (z17) {
            this.videoDecoderTrack.asyncReadNextSample(readSample.getTime());
        }
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(readSample.getTime().sub(this.timeRange.getStart()), readSample.getTextureInfo(), readSample.isNewFrame());
        cMSampleBuffer.getState().performance = readSample.getState().performance;
        return cMSampleBuffer;
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public synchronized void release() {
        com.tencent.tav.decoder.IDecoderTrack iDecoderTrack = this.videoDecoderTrack;
        if (iDecoderTrack != null) {
            iDecoderTrack.release();
        }
        com.tencent.tav.core.compositing.VideoCompositing videoCompositing = this.videoCompositing;
        if (videoCompositing != null) {
            videoCompositing.release();
            this.videoCompositing = null;
        }
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void reset(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.decoder.logger.Logger.i(TAG, "reset %s", cMTimeRange);
        this.timeRange = cMTimeRange;
        this.videoDecoderTrack.seekTo(cMTimeRange.getStart(), false, true);
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void resetForReadingTimeRanges(java.util.List<com.tencent.tav.coremedia.CMTimeRange> list) {
    }

    public void setEnableOptimizedVideoFrameSampling(boolean z17) {
        this.enableOptimizedVideoFrameSampling = z17;
    }

    public void setVideoCompositing(com.tencent.tav.core.compositing.VideoCompositing videoCompositing) {
        this.videoCompositing = videoCompositing;
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    public void setVideoRevertMode(boolean z17) {
        this.revertMode = z17;
    }

    @Override // com.tencent.tav.core.AssetReaderOutput
    public void start(com.tencent.tav.core.IContextCreate iContextCreate, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        super.start(iContextCreate, cMTimeRange);
        com.tencent.tav.core.VideoCompositionDecoderTrack videoCompositionDecoderTrack = new com.tencent.tav.core.VideoCompositionDecoderTrack(this.assetExtension, 1, this.decoderFactory, this.enableOptimizedVideoFrameSampling);
        int i17 = this.frameRate;
        for (com.tencent.tav.asset.AssetTrack assetTrack : this.videoTracks) {
            if (assetTrack != null && assetTrack.isEnabled()) {
                videoCompositionDecoderTrack.addTrack(assetTrack);
                if (assetTrack.getNominalFrameRate() > 0.0f && this.frameRate < 0) {
                    i17 = (int) java.lang.Math.min(assetTrack.getNominalFrameRate(), i17);
                }
            }
        }
        if (i17 <= 0) {
            i17 = 30;
        }
        videoCompositionDecoderTrack.setVideoComposition(this.videoComposition);
        videoCompositionDecoderTrack.setVideoCompositing(this.videoCompositing);
        videoCompositionDecoderTrack.setFrameRate(i17);
        videoCompositionDecoderTrack.setFrameDuration(new com.tencent.tav.coremedia.CMTime(1L, i17));
        this.contextCreate = iContextCreate;
        if (this.revertMode) {
            this.videoDecoderTrack = new com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack(videoCompositionDecoderTrack, true);
        } else {
            this.videoDecoderTrack = videoCompositionDecoderTrack;
        }
        this.videoDecoderTrack.setLogger(this.logger);
    }
}
