package com.tencent.tav.decoder.ofs;

/* loaded from: classes16.dex */
public class OptimizedFrameSamplingVideoDecoder implements com.tencent.tav.decoder.IVideoDecoder, android.os.Handler.Callback {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_PRE_DECODE_BUFFER_FRAME_COUNT = 8;
    private static final int MSG_DECODE_MORE_FRAME = 4;
    private static final int MSG_PREPARE = 1;
    private static final int MSG_RELEASE = 5;
    private static final int MSG_SEEK_TO = 3;
    private static final int MSG_SEND_REQUEST = 6;
    private static final int MSG_START = 2;
    private static final int REQUEST_TIMEOUT_MS = 5000;
    public final java.lang.String TAG;
    private int allocTextureCount;
    private com.tencent.tav.decoder.RenderContext blitRenderContext;
    private final android.media.MediaCodec.BufferInfo bufferInfo;
    private java.lang.Exception causedError;
    private com.tencent.tav.coremedia.CMTimeRange clipTimeRange;
    private final com.tencent.tav.report.AverageTimeReporter decodeReporter;
    private com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest;
    private final com.tencent.tav.codec.IDecoderFactory decoderFactory;
    private com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.DecodingStateContext decodingStateContext;
    private com.tencent.tav.coremedia.CMTime duration;
    private com.tencent.tav.extractor.AssetExtractor extractor;
    private final android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;
    private com.tencent.tav.codec.IMediaCodec mediaCodecWrapper;
    private android.media.MediaFormat mediaFormat;
    private com.tencent.tav.extractor.AssetExtractor mirrorExtractor;
    private com.tencent.tav.decoder.ofs.OESTextureBlitter oesTextureBlitter;
    private com.tencent.tav.coremedia.CMTime originVideoFrameDuration;
    private final com.tencent.tav.coremedia.CMTime outputFrameDuration;
    private android.view.Surface outputSurface;
    private android.util.Size outputTextureSize;
    private long preReadCost;
    private com.tencent.tav.decoder.RenderContext sharedRenderContext;
    private volatile com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State state;
    private final java.util.ArrayList<com.tencent.tav.coremedia.TextureInfo> texturePool;
    private int trackIndex;
    private com.tencent.tav.decoder.VideoTexture videoTexture;

    /* renamed from: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder$5, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State;

        static {
            int[] iArr = new int[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.values().length];
            $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State = iArr;
            try {
                iArr[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Decoding.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Uninitialized.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Releasing.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Released.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Error.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes16.dex */
    public class DecodingStateContext {
        private final com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder optimizedFrameSamplingVideoDecoder;
        public com.tencent.tav.coremedia.CMTime originStartGopPts;
        public final com.tencent.tav.coremedia.CMTime seekTargetTimeInMedia;
        final java.util.LinkedList<com.tencent.tav.decoder.ofs.DecodingFrameSequence> decodingEntitiesByPTS = new java.util.LinkedList<>();
        final java.util.LinkedList<com.tencent.tav.decoder.ofs.DecodedFrame> outputQueue = new java.util.LinkedList<>();
        public com.tencent.tav.coremedia.CMSampleState lastDecodeState = new com.tencent.tav.coremedia.CMSampleState(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
        boolean isInputEOS = false;
        boolean isOutputEOS = false;

        public DecodingStateContext(com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder optimizedFrameSamplingVideoDecoder, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.CMTime cMTime2) {
            this.optimizedFrameSamplingVideoDecoder = optimizedFrameSamplingVideoDecoder;
            this.seekTargetTimeInMedia = cMTime;
            this.originStartGopPts = cMTime2;
        }

        public boolean hasReachToPreDecodePosition() {
            return this.isOutputEOS || this.outputQueue.size() > 8;
        }

        public void release() {
            java.util.Iterator<com.tencent.tav.decoder.ofs.DecodedFrame> it = this.outputQueue.iterator();
            while (it.hasNext()) {
                this.optimizedFrameSamplingVideoDecoder.texturePool.add(it.next().textureInfo);
            }
            this.outputQueue.clear();
        }
    }

    /* loaded from: classes16.dex */
    public enum State {
        Uninitialized,
        Decoding,
        Releasing,
        Released,
        Error
    }

    public OptimizedFrameSamplingVideoDecoder(java.lang.String str, com.tencent.tav.decoder.RenderContext renderContext, android.view.Surface surface, com.tencent.tav.decoder.VideoTexture videoTexture, com.tencent.tav.codec.IDecoderFactory iDecoderFactory, com.tencent.tav.core.composition.VideoComposition videoComposition, com.tencent.tav.coremedia.CMTime cMTime) {
        java.lang.String str2 = "OFSVideoDecoder@" + java.lang.Integer.toHexString(hashCode());
        this.TAG = str2;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("OFSDecodeProcessor");
        this.handlerThread = handlerThread;
        this.state = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Uninitialized;
        this.originVideoFrameDuration = new com.tencent.tav.coremedia.CMTime(20L, 600);
        this.duration = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        this.trackIndex = -1;
        this.bufferInfo = new android.media.MediaCodec.BufferInfo();
        this.preReadCost = 0L;
        this.decodeReporter = new com.tencent.tav.report.AverageTimeReporter();
        this.texturePool = new java.util.ArrayList<>();
        this.allocTextureCount = 0;
        com.tencent.tav.decoder.logger.Logger.d(str2, "create VideoDecoder start");
        this.sharedRenderContext = renderContext;
        if (iDecoderFactory != null) {
            this.decoderFactory = iDecoderFactory;
        } else {
            this.decoderFactory = new com.tencent.tav.codec.DefaultDecoderFactory();
        }
        if (surface != null) {
            this.outputSurface = surface;
        }
        if (videoTexture != null) {
            this.videoTexture = videoTexture;
        }
        this.outputFrameDuration = cMTime;
        handlerThread.start();
        this.handler = new android.os.Handler(handlerThread.getLooper(), this);
        prepareDecoderSync(str, videoComposition);
    }

    private com.tencent.tav.coremedia.CMTime ceilAlignToOutputFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        return this.outputFrameDuration.multi((int) java.lang.Math.ceil(cMTime.getTimeSeconds() / this.outputFrameDuration.getTimeSeconds()));
    }

    private boolean checkNoNeedSeek(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor;
        if (this.decodingStateContext == null || (assetExtractor = this.mirrorExtractor) == null) {
            return false;
        }
        assetExtractor.seekTo(cMTime.getTimeUs(), 2);
        if (this.mirrorExtractor.getSampleTime() > cMTime.getTimeUs()) {
            this.mirrorExtractor.seekTo(cMTime.getTimeUs(), 0);
        }
        long sampleTime = this.mirrorExtractor.getSampleTime();
        if (sampleTime < this.decodingStateContext.originStartGopPts.getTimeUs()) {
            return false;
        }
        if (sampleTime == this.decodingStateContext.originStartGopPts.getTimeUs()) {
            if (this.decodingStateContext.outputQueue.isEmpty()) {
                return true;
            }
            return !this.decodingStateContext.outputQueue.getFirst().ptsInMedia.bigThan(cMTime);
        }
        if (this.decodingStateContext.outputQueue.isEmpty() && this.decodingStateContext.decodingEntitiesByPTS.isEmpty()) {
            return false;
        }
        return ((this.decodingStateContext.outputQueue.isEmpty() ? this.decodingStateContext.decodingEntitiesByPTS.getFirst().ptsInMedia : this.decodingStateContext.outputQueue.getFirst().ptsInMedia).bigThan(cMTime) || cMTime.bigThan(this.decodingStateContext.decodingEntitiesByPTS.isEmpty() ? this.decodingStateContext.outputQueue.getLast().ptsInMedia : this.decodingStateContext.decodingEntitiesByPTS.getLast().ptsInMedia)) ? false : true;
    }

    private boolean checkRequestTimeout() {
        com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest = this.decodeRequest;
        if (decodeRequest == null || decodeRequest.isCompleted || java.lang.System.currentTimeMillis() - this.decodeRequest.requestStartTimeMs < 5000) {
            return false;
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "Decode request is timeout. time: " + this.decodeRequest.samplingTimeRangeInMedia.getStart().getTimeSeconds());
        this.decodeRequest.completeWithTimeout();
        this.decodeRequest = null;
        return true;
    }

    private void clearDecodingStateContext() {
        com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.DecodingStateContext decodingStateContext = this.decodingStateContext;
        if (decodingStateContext != null) {
            decodingStateContext.release();
            this.decodingStateContext = null;
        }
    }

    private void doDecodeMoreFrame() {
        if (checkRequestTimeout()) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doDecodeOneFrame: start. inputEOS:" + this.decodingStateContext.isInputEOS + " outputEOS:" + this.decodingStateContext.isInputEOS);
        java.lang.String str = this.TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doDecodeOneFrame: pendingDecodingFrames: ");
        sb6.append(this.decodingStateContext.decodingEntitiesByPTS.isEmpty() ? "NaN" : java.lang.String.valueOf(this.decodingStateContext.decodingEntitiesByPTS.getFirst().ptsInMedia.getTimeSeconds()));
        sb6.append(" -> ");
        sb6.append(this.decodingStateContext.decodingEntitiesByPTS.isEmpty() ? "NaN" : java.lang.String.valueOf(this.decodingStateContext.decodingEntitiesByPTS.getLast().ptsInMedia.getTimeSeconds()));
        com.tencent.tav.decoder.logger.Logger.v(str, sb6.toString());
        java.lang.String str2 = this.TAG;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("doDecodeOneFrame: outputQueue: ");
        sb7.append(this.decodingStateContext.outputQueue.isEmpty() ? "NaN" : java.lang.String.valueOf(this.decodingStateContext.outputQueue.getFirst().ptsInMedia.getTimeSeconds()));
        sb7.append(" -> ");
        sb7.append(this.decodingStateContext.outputQueue.isEmpty() ? "NaN" : java.lang.String.valueOf(this.decodingStateContext.outputQueue.getLast().ptsInMedia.getTimeSeconds()));
        com.tencent.tav.decoder.logger.Logger.v(str2, sb7.toString());
        java.lang.String str3 = this.TAG;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("doDecodeOneFrame: targetTime: ");
        com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest = this.decodeRequest;
        sb8.append(decodeRequest != null ? java.lang.Float.valueOf(decodeRequest.samplingTimeRangeInMedia.getStart().getTimeSeconds()) : "preload");
        com.tencent.tav.decoder.logger.Logger.v(str3, sb8.toString());
        try {
            if (this.decodeRequest == null && this.decodingStateContext.hasReachToPreDecodePosition()) {
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doDecodeOneFrame: hasReachToMaxDecodePosition.");
                return;
            }
            feedDecoder();
            boolean drainDecoder = drainDecoder();
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "doDecodeOneFrame - hasNewFrame " + drainDecoder);
            if (drainDecoder || this.decodingStateContext.isOutputEOS) {
                boolean trySamplingTargetFrame = trySamplingTargetFrame(this.decodingStateContext.isOutputEOS);
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "trySamplingTargetFrame: ok=" + trySamplingTargetFrame);
            }
            scheduleDecodeMoreFrame();
        } catch (java.lang.Exception e17) {
            handleDecodeException(e17);
        }
    }

    private void doSeekTo(com.tencent.tav.coremedia.CMTime cMTime) {
        long timeUs = cMTime.getTimeUs();
        this.extractor.seekTo(timeUs, 2);
        if (this.extractor.getSampleTime() > timeUs) {
            this.extractor.seekTo(timeUs, 0);
        }
        com.tencent.tav.coremedia.CMTime fromUs = com.tencent.tav.coremedia.CMTime.fromUs(this.extractor.getSampleTime());
        clearDecodingStateContext();
        this.decodingStateContext = new com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.DecodingStateContext(this, cMTime, fromUs);
        this.mediaCodecWrapper.flush();
    }

    private boolean drainDecoder() {
        if (this.decodingStateContext.isOutputEOS) {
            return false;
        }
        this.bufferInfo.set(0, 0, 0L, 0);
        int dequeueOutputBuffer = this.mediaCodecWrapper.dequeueOutputBuffer(this.bufferInfo, 0L);
        if (dequeueOutputBuffer < 0) {
            if (dequeueOutputBuffer == -2) {
                android.media.MediaFormat outputFormat = this.mediaCodecWrapper.getOutputFormat();
                if (outputFormat == null) {
                    com.tencent.tav.decoder.logger.Logger.e(this.TAG, "drainDecoder: newFormat is null.");
                    return false;
                }
                onOutputFormatChange(outputFormat);
                com.tencent.tav.decoder.logger.Logger.i(this.TAG, "drainDecoder:newFormat %s", outputFormat);
            } else if (dequeueOutputBuffer == -1) {
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "drainDecoder: try again later.");
            } else {
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "drainDecoder: not ready. outputBufferIndex: " + dequeueOutputBuffer);
            }
            return false;
        }
        android.media.MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
        if ((bufferInfo.flags & 4) != 0) {
            com.tencent.tav.decoder.logger.Logger.i(this.TAG, "drainDecoder: output end of stream.");
            this.decodingStateContext.isOutputEOS = true;
            this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
            return false;
        }
        if (bufferInfo.size <= 0) {
            this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, false);
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "drainDecoder: bufferInfo.size: " + this.bufferInfo.size);
            return false;
        }
        com.tencent.tav.coremedia.CMTime fromUs = com.tencent.tav.coremedia.CMTime.fromUs(bufferInfo.presentationTimeUs);
        java.util.LinkedList<com.tencent.tav.decoder.ofs.DecodingFrameSequence> linkedList = this.decodingStateContext.decodingEntitiesByPTS;
        if (!linkedList.isEmpty()) {
            while (!linkedList.isEmpty()) {
                java.util.Iterator<com.tencent.tav.decoder.ofs.DecodingFrameSequence> it = linkedList.iterator();
                com.tencent.tav.decoder.ofs.DecodingFrameSequence next = it.next();
                if (next.ptsInMedia.equals(fromUs) && !next.isFirstFrameDecoded()) {
                    com.tencent.tav.decoder.logger.Logger.i(this.TAG, "drainDecoder: frame decoded. pts:" + fromUs.getTimeSeconds());
                    next.markFirstFrameDecoded();
                }
                if (next.ptsInMedia.bigThan(fromUs) || !it.hasNext() || it.next().ptsInMedia.bigThan(fromUs)) {
                    break;
                }
                linkedList.poll();
            }
        } else {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "drainDecoder: frame decoded, but decodingFrameSequenceGroupsByPTS is empty. pts:" + fromUs.getTimeSeconds());
        }
        com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest = this.decodeRequest;
        boolean z17 = ((double) fromUs.getTimeUs()) + (((double) this.originVideoFrameDuration.getTimeUs()) * 1.5d) > ((double) (decodeRequest == null ? new com.tencent.tav.coremedia.CMTimeRange(this.decodingStateContext.seekTargetTimeInMedia, this.outputFrameDuration) : decodeRequest.samplingTimeRangeInMedia).getStartUs());
        this.mediaCodecWrapper.releaseOutputBuffer(dequeueOutputBuffer, z17);
        if (!z17) {
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "drainDecoder: discard frame pts:" + fromUs.getTimeSeconds());
            return false;
        }
        try {
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "drainDecoder: awaitNewImage");
            this.videoTexture.awaitNewImage();
            com.tencent.tav.coremedia.TextureInfo obtainTexture = obtainTexture(this.outputTextureSize);
            this.oesTextureBlitter.blitTo(this.videoTexture.getTextureInfo(), this.videoTexture.getSurfaceTextureTransform(), obtainTexture.textureID);
            android.opengl.GLES20.glFinish();
            this.decodingStateContext.outputQueue.add(new com.tencent.tav.decoder.ofs.DecodedFrame(this.clipTimeRange, fromUs, obtainTexture));
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "drainDecoder: videoTexture.awaitNewImage() error", th6);
            return false;
        }
    }

    private void feedDecoder() {
        int i17 = 3;
        while (!this.decodingStateContext.isInputEOS) {
            int i18 = i17 - 1;
            if (i17 <= 0) {
                return;
            }
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "feedDecoder: start. maxFeedTimes:" + i18);
            int dequeueInputBuffer = this.mediaCodecWrapper.dequeueInputBuffer(0L);
            if (dequeueInputBuffer < 0) {
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "feedDecoder: input buffer not read.");
            } else {
                com.tencent.tav.coremedia.CMTime fromUs = com.tencent.tav.coremedia.CMTime.fromUs(this.extractor.getSampleTime());
                int readSampleData = this.extractor.readSampleData(this.mediaCodecWrapper.getInputBuffer(dequeueInputBuffer), 0);
                if (readSampleData < 0) {
                    signalInputEOS(dequeueInputBuffer);
                    return;
                }
                com.tencent.tav.decoder.logger.Logger.v(this.TAG, "feedDecoder: samplePts:" + fromUs.getTimeSeconds() + " size:" + readSampleData);
                this.decodingStateContext.isInputEOS = this.extractor.advance() ^ true;
                this.mediaCodecWrapper.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, fromUs.getTimeUs(), this.decodingStateContext.isInputEOS ? 4 : 0);
                this.decodingStateContext.decodingEntitiesByPTS.add(new com.tencent.tav.decoder.ofs.DecodingFrameSequence(fromUs));
                java.util.Collections.sort(this.decodingStateContext.decodingEntitiesByPTS);
            }
            i17 = i18;
        }
    }

    private com.tencent.tav.coremedia.CMTime floorAlignToOutputFrameDuration(com.tencent.tav.coremedia.CMTime cMTime) {
        return this.outputFrameDuration.multi((int) java.lang.Math.floor(cMTime.getTimeSeconds() / this.outputFrameDuration.getTimeSeconds()));
    }

    private void handleDecodeException(java.lang.Exception exc) {
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleDecodeException: ", exc);
        if (exc instanceof android.media.MediaCodec.CodecException) {
            android.media.MediaCodec.CodecException codecException = (android.media.MediaCodec.CodecException) exc;
            if (codecException.isRecoverable()) {
                this.mediaCodecWrapper.reset();
                doSeekTo(this.decodingStateContext.seekTargetTimeInMedia);
                scheduleDecodeMoreFrame();
                return;
            } else if (codecException.isTransient()) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "doDecodeMoreFrame:[error] isTransient() is true");
            }
        }
        switchToErrorState(exc);
    }

    private void handleDecodeMoreFrame() {
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleDecodeOneFrame: DecodeOneFrame in invalid state:" + this.state.name());
            return;
        }
        if (this.decodingStateContext == null) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleDecodeOneFrame: decodingState is null");
        } else {
            doDecodeMoreFrame();
        }
    }

    private void handlePrepare(com.tencent.tav.decoder.ofs.PrepareMsgArgs prepareMsgArgs) {
        java.lang.String str = prepareMsgArgs.sourcePath;
        com.tencent.tav.core.composition.VideoComposition videoComposition = prepareMsgArgs.videoComposition;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            try {
            } catch (java.lang.Exception e17) {
                switchToErrorState(new java.lang.RuntimeException("Failed to init decoder", e17));
            }
            if (!initExtractor(str)) {
                switchToErrorState(new java.lang.RuntimeException("Failed to init extractor from " + str));
                return;
            }
            this.mediaFormat = this.extractor.getTrackFormat(this.trackIndex);
            this.duration = new com.tencent.tav.coremedia.CMTime((((float) this.extractor.getDuration()) * 1.0f) / ((float) java.util.concurrent.TimeUnit.SECONDS.toMicros(1L)));
            if (this.mediaFormat.containsKey("frame-rate")) {
                this.originVideoFrameDuration = new com.tencent.tav.coremedia.CMTime(600 / this.mediaFormat.getInteger("frame-rate"), 600);
            }
            boolean z17 = false;
            boolean z18 = android.os.Build.VERSION.SDK_INT >= 31;
            if (videoComposition != null && z18) {
                z18 = videoComposition.getUseSystemHdrTranscode();
                if (videoComposition.getLutBitmap() != null && z18) {
                    this.mediaFormat.setInteger("color-transfer-request", 3);
                }
            }
            com.tencent.tav.codec.IMediaCodec createVideoDecoder = this.decoderFactory.createVideoDecoder(this.mediaFormat.getString("mime"));
            this.mediaCodecWrapper = createVideoDecoder;
            this.extractor.setIsSoft(createVideoDecoder.isSoft());
            this.mediaCodecWrapper.setDataSource(str);
            this.mediaCodecWrapper.configure(this.mediaFormat, this.outputSurface, null, 0);
            android.media.MediaFormat inputFormat = this.mediaCodecWrapper.getInputFormat();
            if (z18 && inputFormat != null && inputFormat.getInteger("color-transfer-request", 0) == 3) {
                z17 = true;
            }
            if (videoComposition == null || !z17 || videoComposition.getLutBitmap().isRecycled()) {
                com.tencent.tav.decoder.logger.Logger.i(this.TAG, "system hdr transcode not supported");
            } else {
                com.tencent.tav.decoder.logger.Logger.i(this.TAG, "system hdr transcode supported, disable lut");
                videoComposition.getLutBitmap().recycle();
            }
            this.mediaCodecWrapper.bindSurfaceTexture(this.videoTexture.surfaceTexture());
            this.mediaCodecWrapper.start();
            com.tencent.tav.decoder.RenderContext renderContext = new com.tencent.tav.decoder.RenderContext(1, 1, null, this.sharedRenderContext.eglContext());
            this.blitRenderContext = renderContext;
            renderContext.makeCurrent();
            this.oesTextureBlitter = new com.tencent.tav.decoder.ofs.OESTextureBlitter();
            com.tencent.tav.decoder.logger.Logger.d(this.TAG, "create VideoDecoder end " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } finally {
            prepareMsgArgs.callback.onCompletion();
        }
    }

    private void handleRelease(boolean z17) {
        com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest = this.decodeRequest;
        if (decodeRequest != null) {
            decodeRequest.completeWithError(-2L, "Decoder has released.", new java.lang.RuntimeException("Decoder has released."));
            this.decodeRequest = null;
        }
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor != null && z17) {
            assetExtractor.dispose();
            this.extractor = null;
        }
        com.tencent.tav.extractor.AssetExtractor assetExtractor2 = this.mirrorExtractor;
        if (assetExtractor2 != null) {
            assetExtractor2.dispose();
            this.mirrorExtractor = null;
        }
        com.tencent.tav.codec.IMediaCodec iMediaCodec = this.mediaCodecWrapper;
        if (iMediaCodec != null) {
            iMediaCodec.release();
        }
        clearDecodingStateContext();
        java.util.Iterator<com.tencent.tav.coremedia.TextureInfo> it = this.texturePool.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.texturePool.clear();
        com.tencent.tav.decoder.ofs.OESTextureBlitter oESTextureBlitter = this.oesTextureBlitter;
        if (oESTextureBlitter != null) {
            oESTextureBlitter.release();
            this.oesTextureBlitter = null;
        }
        com.tencent.tav.decoder.RenderContext renderContext = this.blitRenderContext;
        if (renderContext != null) {
            renderContext.release();
            this.blitRenderContext = null;
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "release:end " + z17);
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "decode performance:" + this.decodeReporter);
    }

    private void handleRequest(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.ofs.DecodeCallback decodeCallback) {
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            if (decodeCallback != null) {
                decodeCallback.onDecodeFrame(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L)));
                return;
            }
            return;
        }
        if (i17 == 5) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleSeekTo in valid state." + this.state.name());
            if (decodeCallback != null) {
                decodeCallback.onDecodeFrame(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L, "Decode error", this.causedError)));
                return;
            }
            return;
        }
        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
        if (cMTime.smallThan(cMTime2)) {
            cMTime = cMTime2;
        }
        com.tencent.tav.coremedia.CMTime multi = this.outputFrameDuration.multi(cMTime.getTimeSeconds() / this.outputFrameDuration.getTimeSeconds());
        if (!multi.smallThan(this.clipTimeRange.getDuration()) && decodeCallback != null) {
            decodeCallback.onDecodeFrame(new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-1L)));
            return;
        }
        com.tencent.tav.coremedia.CMTime add = this.clipTimeRange.getStart().add(multi);
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "handleRequest: targetTimeInMedia:" + add.getTimeSeconds());
        this.decodeRequest = new com.tencent.tav.decoder.ofs.DecodeRequest(this, java.lang.System.currentTimeMillis(), multi, add, this.outputFrameDuration, decodeCallback);
        if (trySamplingTargetFrame(this.decodingStateContext.isOutputEOS)) {
            return;
        }
        if (this.decodingStateContext.isOutputEOS) {
            this.decodeRequest.completeWithTimeout();
        }
        if (!checkNoNeedSeek(add)) {
            doSeekTo(cMTime);
        }
        doDecodeMoreFrame();
    }

    private void handleSeekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17, com.tencent.tav.decoder.ofs.MessageCompletionCallback messageCompletionCallback) {
        com.tencent.tav.coremedia.CMTime add;
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4) {
            try {
                if (i17 != 5) {
                    try {
                        com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
                        if (cMTime.smallThan(cMTime2)) {
                            cMTime = cMTime2;
                        }
                        add = this.clipTimeRange.getStart().add(floorAlignToOutputFrameDuration(cMTime));
                    } catch (java.lang.Exception e17) {
                        switchToErrorState(new java.lang.RuntimeException("Failed to seek", e17));
                        if (messageCompletionCallback == null) {
                            return;
                        }
                    }
                    if (checkNoNeedSeek(add)) {
                        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "seekTo: no need to re-seek");
                        if (messageCompletionCallback != null) {
                            messageCompletionCallback.onCompletion();
                            return;
                        }
                        return;
                    }
                    this.decodeRequest = null;
                    doSeekTo(add);
                    doDecodeMoreFrame();
                    com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: finish - " + this.decodingStateContext + "  " + this.extractor.getSampleTime());
                    if (messageCompletionCallback == null) {
                        return;
                    }
                    messageCompletionCallback.onCompletion();
                    return;
                }
            } catch (java.lang.Throwable th6) {
                if (messageCompletionCallback != null) {
                    messageCompletionCallback.onCompletion();
                }
                throw th6;
            }
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleSeekTo in valid state." + this.state.name());
        if (messageCompletionCallback != null) {
            messageCompletionCallback.onCompletion();
        }
    }

    private void handleStart(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.ofs.MessageCompletionCallback messageCompletionCallback) {
        com.tencent.tav.coremedia.CMTime sub;
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "handleStart in valid state." + this.state.name());
        }
        try {
            try {
                if (cMTimeRange == null) {
                    this.clipTimeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, ceilAlignToOutputFrameDuration(this.duration));
                } else {
                    this.clipTimeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getStart(), ceilAlignToOutputFrameDuration(cMTimeRange.getDuration()));
                }
                if (cMTime == null) {
                    sub = this.clipTimeRange.getStart();
                } else {
                    if (cMTime.smallThan(this.clipTimeRange.getStart())) {
                        cMTime = this.clipTimeRange.getStart();
                    }
                    sub = this.clipTimeRange.getEnd().smallThan(cMTime) ? this.clipTimeRange.getEnd().sub(this.outputFrameDuration) : cMTime;
                }
                com.tencent.tav.coremedia.CMTime cMTime2 = com.tencent.tav.coremedia.CMTime.CMTimeZero;
                if (sub.smallThan(cMTime2)) {
                    sub = cMTime2;
                }
                doSeekTo(sub);
                scheduleDecodeMoreFrame();
                if (messageCompletionCallback == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                switchToErrorState(e17);
                if (messageCompletionCallback == null) {
                    return;
                }
            }
            messageCompletionCallback.onCompletion();
        } catch (java.lang.Throwable th6) {
            if (messageCompletionCallback != null) {
                messageCompletionCallback.onCompletion();
            }
            throw th6;
        }
    }

    private boolean initExtractor(java.lang.String str) {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = new com.tencent.tav.extractor.AssetExtractor();
        this.extractor = assetExtractor;
        assetExtractor.setDataSource(str);
        while (this.extractor.getSampleTrackIndex() != -1) {
            com.tencent.tav.extractor.AssetExtractor assetExtractor2 = this.extractor;
            assetExtractor2.unselectTrack(assetExtractor2.getSampleTrackIndex());
        }
        int firstTrackIndex = com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(this.extractor, "video/");
        this.trackIndex = firstTrackIndex;
        if (firstTrackIndex == -1) {
            this.outputSurface = null;
            return false;
        }
        this.extractor.selectTrack(firstTrackIndex);
        com.tencent.tav.extractor.AssetExtractor assetExtractor3 = new com.tencent.tav.extractor.AssetExtractor();
        assetExtractor3.setDataSource(this.extractor.getSourcePath());
        while (assetExtractor3.getSampleTrackIndex() != -1) {
            assetExtractor3.unselectTrack(assetExtractor3.getSampleTrackIndex());
        }
        assetExtractor3.selectTrack(com.tencent.tav.decoder.DecoderUtils.getFirstTrackIndex(assetExtractor3, "video/"));
        this.mirrorExtractor = assetExtractor3;
        return true;
    }

    private com.tencent.tav.coremedia.TextureInfo obtainTexture(android.util.Size size) {
        if (!this.texturePool.isEmpty()) {
            java.util.ArrayList<com.tencent.tav.coremedia.TextureInfo> arrayList = this.texturePool;
            return arrayList.remove(arrayList.size() - 1);
        }
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i17 = iArr[0];
        android.opengl.GLES20.glBindTexture(3553, i17);
        com.tencent.tav.decoder.RenderContext.checkEglError("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.tencent.tav.decoder.RenderContext.checkEglError("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, size.getWidth(), size.getHeight(), 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        this.allocTextureCount++;
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "Alloc new texture. count: " + this.allocTextureCount);
        return new com.tencent.tav.coremedia.TextureInfo(i17, 3553, size.getWidth(), size.getHeight(), null, 0);
    }

    private void onOutputFormatChange(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
            this.outputTextureSize = new android.util.Size(mediaFormat.getInteger("width"), mediaFormat.getInteger("height"));
        }
        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
            int integer = mediaFormat.getInteger("crop-left");
            int integer2 = mediaFormat.getInteger("crop-top");
            this.outputTextureSize = new android.util.Size((mediaFormat.getInteger("crop-right") + 1) - integer, (mediaFormat.getInteger("crop-bottom") + 1) - integer2);
        }
        if (this.outputTextureSize != null && mediaFormat.containsKey("rotation-degrees")) {
            this.oesTextureBlitter.setRotationDegrees(-mediaFormat.getInteger("rotation-degrees"));
        }
        if (this.outputTextureSize == null) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "drainDecoder: No output size.");
            this.outputTextureSize = new android.util.Size(1, 1);
        }
    }

    private void prepareDecoderSync(java.lang.String str, com.tencent.tav.core.composition.VideoComposition videoComposition) {
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.os.Handler handler = this.handler;
        handler.sendMessage(android.os.Message.obtain(handler, 1, new com.tencent.tav.decoder.ofs.PrepareMsgArgs(str, videoComposition, new com.tencent.tav.decoder.ofs.MessageCompletionCallback() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.1
            @Override // com.tencent.tav.decoder.ofs.MessageCompletionCallback
            public void onCompletion() {
                countDownLatch.countDown();
            }
        })));
        try {
            countDownLatch.await();
            if (this.state == com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Uninitialized) {
                this.state = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Decoding;
            }
        } catch (java.lang.InterruptedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    private void samplingTargetFrame(com.tencent.tav.decoder.ofs.DecodedFrame decodedFrame, int i17) {
        for (int i18 = 0; i18 < i17 - 1; i18++) {
            this.texturePool.add(this.decodingStateContext.outputQueue.removeFirst().textureInfo);
        }
        this.decodeRequest.completeWithFrame(decodedFrame);
        this.decodeRequest = null;
    }

    private void scheduleDecodeMoreFrame() {
        if (this.handler.hasMessages(4)) {
            return;
        }
        android.os.Handler handler = this.handler;
        handler.sendMessageDelayed(android.os.Message.obtain(handler, 4), 1L);
    }

    private void signalInputEOS(int i17) {
        com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.DecodingStateContext decodingStateContext = this.decodingStateContext;
        if (decodingStateContext == null || decodingStateContext.isInputEOS) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "signalInputEOS");
        this.decodingStateContext.isInputEOS = true;
        this.mediaCodecWrapper.queueInputBuffer(i17, 0, 0, 0L, 4);
    }

    private synchronized void switchToErrorState(java.lang.Exception exc) {
        if (this.state != com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Released && this.state != com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Releasing) {
            this.causedError = exc;
            this.state = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.State.Error;
            return;
        }
        com.tencent.tav.decoder.logger.Logger.w(this.TAG, "switchToErrorState: Has released. exception:" + exc);
    }

    private boolean trySamplingTargetFrame(boolean z17) {
        com.tencent.tav.decoder.ofs.DecodeRequest decodeRequest;
        boolean trySamplingTargetFrameInternal = trySamplingTargetFrameInternal(z17);
        if (trySamplingTargetFrameInternal || (decodeRequest = this.decodeRequest) == null || !z17) {
            return trySamplingTargetFrameInternal;
        }
        decodeRequest.completeWithEOS();
        this.decodeRequest = null;
        return true;
    }

    private boolean trySamplingTargetFrameInternal(boolean z17) {
        com.tencent.tav.coremedia.CMTime sub;
        java.util.LinkedList<com.tencent.tav.decoder.ofs.DecodedFrame> linkedList = this.decodingStateContext.outputQueue;
        if (this.decodeRequest != null && !linkedList.isEmpty()) {
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.decodeRequest.samplingTimeRangeInMedia;
            while (linkedList.size() >= 2 && !linkedList.get(1).ptsInMedia.bigThan(cMTimeRange.getStart())) {
                this.texturePool.add(linkedList.removeFirst().textureInfo);
            }
            int i17 = 0;
            while (i17 < linkedList.size()) {
                com.tencent.tav.decoder.ofs.DecodedFrame decodedFrame = linkedList.get(i17);
                if (decodedFrame.ptsInMedia.bigThan(cMTimeRange.getEnd())) {
                    samplingTargetFrame(decodedFrame, i17);
                    return true;
                }
                int i18 = i17 + 1;
                if (i18 != linkedList.size()) {
                    sub = linkedList.get(i18).ptsInMedia.sub(decodedFrame.ptsInMedia);
                } else {
                    if (!z17) {
                        break;
                    }
                    sub = this.outputFrameDuration;
                }
                com.tencent.tav.coremedia.CMTimeRange cMTimeRange2 = new com.tencent.tav.coremedia.CMTimeRange(decodedFrame.ptsInMedia, sub);
                com.tencent.tav.coremedia.CMTimeRange intersection = com.tencent.tav.coremedia.CMTimeRange.getIntersection(cMTimeRange, cMTimeRange2);
                if (intersection == com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid) {
                    com.tencent.tav.decoder.logger.Logger.e(this.TAG, "trySamplingDecodeTarget: no intersection why?");
                } else if (intersection.getDuration().getTimeUs() >= cMTimeRange.getDuration().getTimeUs() / 2 || intersection.getDuration().equals(cMTimeRange2.getDuration()) || !cMTimeRange2.getEnd().smallThan(cMTimeRange.getEnd())) {
                    com.tencent.tav.decoder.logger.Logger.v(this.TAG, "trySamplingDecodeTarget: choose frame pts:" + decodedFrame.ptsInMedia.getTimeSeconds() + " duration:" + sub.getTimeSeconds() + " sampleTimeRange:" + cMTimeRange.getStart().getTimeSeconds() + " - " + cMTimeRange.getDuration().getTimeSeconds());
                    samplingTargetFrame(decodedFrame, i17);
                    return true;
                }
                i17 = i18;
            }
            if (this.decodeRequest != null && z17 && !linkedList.isEmpty()) {
                samplingTargetFrame(linkedList.getLast(), linkedList.size() - 1);
                return true;
            }
        }
        return false;
    }

    public void finalize() {
        super.finalize();
        release(false);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public com.tencent.tav.report.AverageTimeReporter getDecodePerformance() {
        return this.decodeReporter;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public long getPreReadCost() {
        return this.preReadCost;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public java.lang.String getSourcePath() {
        com.tencent.tav.extractor.AssetExtractor assetExtractor = this.extractor;
        if (assetExtractor == null) {
            return null;
        }
        return assetExtractor.getSourcePath();
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.TextureInfo getTextureInfo() {
        return null;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "handleMessage - " + message);
        switch (message.what) {
            case 1:
                handlePrepare((com.tencent.tav.decoder.ofs.PrepareMsgArgs) message.obj);
                return true;
            case 2:
                com.tencent.tav.decoder.ofs.StartMsgArgs startMsgArgs = (com.tencent.tav.decoder.ofs.StartMsgArgs) message.obj;
                handleStart(startMsgArgs.timeRange, startMsgArgs.start, startMsgArgs.callback);
                return true;
            case 3:
                com.tencent.tav.decoder.ofs.SeekToMsgArgs seekToMsgArgs = (com.tencent.tav.decoder.ofs.SeekToMsgArgs) message.obj;
                handleSeekTo(seekToMsgArgs.targetTimeInClip, seekToMsgArgs.quickSeek, seekToMsgArgs.callback);
                return true;
            case 4:
                handleDecodeMoreFrame();
                return true;
            case 5:
                handleRelease(((java.lang.Boolean) message.obj).booleanValue());
                return true;
            case 6:
                com.tencent.tav.decoder.ofs.SendRequestMsgArgs sendRequestMsgArgs = (com.tencent.tav.decoder.ofs.SendRequestMsgArgs) message.obj;
                handleRequest(sendRequestMsgArgs.targetTimeInClip, sendRequestMsgArgs.callback);
                return true;
            default:
                return false;
        }
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized boolean hasTrack() {
        return this.trackIndex != -1;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void init(java.lang.String str, com.tencent.tav.coremedia.CGSize cGSize, com.tencent.tav.decoder.IDecoderTrack.SurfaceCreator surfaceCreator) {
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public boolean isLastFrameValid() {
        return true;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMTime nextFrameTime(com.tencent.tav.coremedia.CMTime cMTime) {
        return cMTime.add(this.outputFrameDuration);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized java.nio.ByteBuffer outputBuffer() {
        return null;
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized android.view.Surface outputSurface() {
        return this.outputSurface;
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample() {
        return readSample(com.tencent.tav.coremedia.CMTime.CMTimeInvalid);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public com.tencent.tav.coremedia.CMSampleBuffer readVideoSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "readVideoSampleBuffer: targetTime" + cMTime);
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-2L));
        }
        if (i17 == 5) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo: in invalid state: " + this.state);
            return new com.tencent.tav.coremedia.CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState.fromError(-3L));
        }
        final com.tencent.tav.coremedia.CMSampleBuffer[] cMSampleBufferArr = new com.tencent.tav.coremedia.CMSampleBuffer[1];
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        android.os.Handler handler = this.handler;
        handler.sendMessage(android.os.Message.obtain(handler, 6, new com.tencent.tav.decoder.ofs.SendRequestMsgArgs(cMTime, new com.tencent.tav.decoder.ofs.DecodeCallback() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.4
            @Override // com.tencent.tav.decoder.ofs.DecodeCallback
            public void onDecodeFrame(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
                cMSampleBufferArr[0] = cMSampleBuffer;
                countDownLatch.countDown();
            }
        })));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo: interrupted.");
        }
        return cMSampleBufferArr[0];
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public void release() {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime cMTime) {
        seekTo(cMTime, true);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder, com.tencent.tav.decoder.IDecoder
    public void setLogger(com.tencent.tav.decoder.logger.WXLogger wXLogger) {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        start(cMTimeRange, com.tencent.tav.coremedia.CMTime.CMTimeZero);
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public void switchFrame() {
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized com.tencent.tav.coremedia.CMSampleState readSample(com.tencent.tav.coremedia.CMTime cMTime) {
        return readVideoSampleBuffer(cMTime).getState();
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized void release(boolean z17) {
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 == 2 || i17 == 3 || i17 == 4) {
            return;
        }
        com.tencent.tav.decoder.logger.Logger.i(this.TAG, "release:start " + z17);
        android.os.Handler handler = this.handler;
        if (handler == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
        android.os.Handler handler2 = this.handler;
        handler2.sendMessage(android.os.Message.obtain(handler2, 5, java.lang.Boolean.valueOf(z17)));
        this.handlerThread.quitSafely();
    }

    @Override // com.tencent.tav.decoder.IVideoDecoder
    public synchronized void seekTo(com.tencent.tav.coremedia.CMTime cMTime, boolean z17) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "seekTo: " + cMTime + "  - " + this + " " + this.decodingStateContext);
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = this.handler;
            handler.sendMessage(android.os.Message.obtain(handler, 3, new com.tencent.tav.decoder.ofs.SeekToMsgArgs(cMTime, z17, new com.tencent.tav.decoder.ofs.MessageCompletionCallback() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.3
                @Override // com.tencent.tav.decoder.ofs.MessageCompletionCallback
                public void onCompletion() {
                    countDownLatch.countDown();
                }
            })));
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo: interrupted.");
            }
            return;
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "seekTo: in invalid state: " + this.state);
    }

    @Override // com.tencent.tav.decoder.IDecoder
    public synchronized void start(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "start:" + getSourcePath() + " [timeRange " + cMTimeRange + "] [start " + cMTime + "] [state " + this.state + "]");
        int i17 = com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.AnonymousClass5.$SwitchMap$com$tencent$tav$decoder$ofs$OptimizedFrameSamplingVideoDecoder$State[this.state.ordinal()];
        if (i17 != 2 && i17 != 3 && i17 != 4 && i17 != 5) {
            final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
            android.os.Handler handler = this.handler;
            handler.sendMessage(android.os.Message.obtain(handler, 2, new com.tencent.tav.decoder.ofs.StartMsgArgs(cMTimeRange, cMTime, new com.tencent.tav.decoder.ofs.MessageCompletionCallback() { // from class: com.tencent.tav.decoder.ofs.OptimizedFrameSamplingVideoDecoder.2
                @Override // com.tencent.tav.decoder.ofs.MessageCompletionCallback
                public void onCompletion() {
                    countDownLatch.countDown();
                }
            })));
            try {
                countDownLatch.await();
                readSample(cMTime);
                return;
            } catch (java.lang.InterruptedException unused) {
                com.tencent.tav.decoder.logger.Logger.e(this.TAG, "start: interrupted.");
                return;
            }
        }
        com.tencent.tav.decoder.logger.Logger.e(this.TAG, "start: in invalid state: " + this.state);
    }
}
