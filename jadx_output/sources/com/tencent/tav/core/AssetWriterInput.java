package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AssetWriterInput {
    private com.tencent.tav.core.IAssetWriter assetWriter;
    private android.os.Handler handler;
    private android.os.HandlerThread handlerThread;
    public com.tencent.tav.core.parallel.info.PipelineIndicatorInfo indicatorInfo;
    private boolean isEnableNewTextureBlitting;
    private android.graphics.Bitmap lutBitmap;
    public com.tencent.tav.decoder.Filter matrixFilter;
    private int mediaType;
    private java.util.List<com.tencent.tav.asset.MetadataItem> metadata;
    public com.tencent.tav.coremedia.TextureInfo oesTextureBlitTexture;
    public com.tencent.tav.decoder.ofs.OESTextureBlitter oesTextureBlitter;
    private com.tencent.tav.core.AssetWriterInput.WriterProgressListener progressListener;
    private boolean readyForMoreMediaData;
    private com.tencent.tav.core.AssetWriterInput.StatusListener statusListener;
    private android.graphics.Matrix transform;
    private com.tencent.tav.decoder.EncoderWriter writer;
    private android.os.Handler writerHandler;
    private android.os.HandlerThread writerThread;
    private final java.lang.String TAG = "AssetWriterInput" + hashCode();
    private final float[] surfaceTextureRotateBackTransform = new float[16];
    private boolean started = false;
    private boolean stop = false;
    private final com.tencent.tav.decoder.logger.WXLogger logger = new com.tencent.tav.decoder.logger.WXLogger();
    private long renderCost = 0;

    /* loaded from: classes16.dex */
    public interface StatusListener {
        void statusChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, com.tencent.tav.core.AssetWriterStatus assetWriterStatus);
    }

    /* loaded from: classes16.dex */
    public class WriterAudioRunnable implements java.lang.Runnable {
        private final boolean isEndBuffer;
        private final com.tencent.tav.coremedia.CMSampleBuffer sampleBuffer;

        @Override // java.lang.Runnable
        public void run() {
            if (com.tencent.tav.core.AssetWriterInput.this.handler == null || com.tencent.tav.core.AssetWriterInput.this.writer.isReleased()) {
                return;
            }
            long j17 = -1;
            try {
                if (this.isEndBuffer) {
                    com.tencent.tav.core.AssetWriterInput.this.writer.endWriteAudioSample();
                } else {
                    com.tencent.tav.core.AssetWriterInput.this.writer.writeAudioSample(this.sampleBuffer.getTime().getTimeUs(), this.sampleBuffer.getSampleByteBuffer());
                    j17 = com.tencent.tav.core.AssetWriterInput.this.writer.getAudioPresentationTimeUs();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.tav.core.ExportErrorStatus errorStatus = th6 instanceof com.tencent.tav.core.ExportRuntimeException ? th6.getErrorStatus() : new com.tencent.tav.core.ExportErrorStatus(-122, th6);
                if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                    com.tencent.tav.core.AssetWriterInput assetWriterInput = com.tencent.tav.core.AssetWriterInput.this;
                    errorStatus.indicatorInfo = assetWriterInput.indicatorInfo;
                    assetWriterInput.progressListener.onError(errorStatus);
                    return;
                }
            }
            if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                com.tencent.tav.core.AssetWriterInput.this.progressListener.onProgressChanged(com.tencent.tav.core.AssetWriterInput.this, j17);
            }
        }

        private WriterAudioRunnable(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17) {
            this.sampleBuffer = cMSampleBuffer;
            this.isEndBuffer = z17;
        }
    }

    /* loaded from: classes16.dex */
    public interface WriterProgressListener {
        void onError(com.tencent.tav.core.ExportErrorStatus exportErrorStatus);

        void onProgressChanged(com.tencent.tav.core.AssetWriterInput assetWriterInput, long j17);
    }

    /* loaded from: classes16.dex */
    public class WriterVideoRunnable implements java.lang.Runnable {
        private final com.tencent.tav.coremedia.CMSampleBuffer sampleBuffer;

        @Override // java.lang.Runnable
        public void run() {
            if (com.tencent.tav.core.AssetWriterInput.this.handler != null) {
                try {
                    com.tencent.tav.core.AssetWriterInput.this.writer.writeVideoSample(this.sampleBuffer);
                    com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.sampleBuffer;
                    if (cMSampleBuffer != null && cMSampleBuffer.getState().stateMatchingTo(-1)) {
                        com.tencent.tav.core.AssetWriterInput.this.writer.endWriteVideoSample(this.sampleBuffer);
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.tav.core.ExportErrorStatus errorStatus = th6 instanceof com.tencent.tav.core.ExportRuntimeException ? th6.getErrorStatus() : new com.tencent.tav.core.ExportErrorStatus(-121, th6);
                    if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                        com.tencent.tav.core.AssetWriterInput assetWriterInput = com.tencent.tav.core.AssetWriterInput.this;
                        errorStatus.indicatorInfo = assetWriterInput.indicatorInfo;
                        assetWriterInput.progressListener.onError(errorStatus);
                        return;
                    }
                }
                if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                    com.tencent.tav.core.AssetWriterInput.WriterProgressListener writerProgressListener = com.tencent.tav.core.AssetWriterInput.this.progressListener;
                    com.tencent.tav.core.AssetWriterInput assetWriterInput2 = com.tencent.tav.core.AssetWriterInput.this;
                    writerProgressListener.onProgressChanged(assetWriterInput2, assetWriterInput2.writer.getVideoPresentationTimeUs());
                }
            }
        }

        private WriterVideoRunnable(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
            this.sampleBuffer = cMSampleBuffer;
        }
    }

    public AssetWriterInput(int i17, boolean z17) {
        this.isEnableNewTextureBlitting = false;
        this.mediaType = i17;
        this.isEnableNewTextureBlitting = z17;
    }

    private com.tencent.tav.core.ExportErrorStatus appendAudioSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        android.os.HandlerThread handlerThread;
        if (this.stop || this.writerHandler == null) {
            this.logger.w(this.TAG, "appendAudioSampleBuffer: writer is stopped or handler is null");
            return new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.core.ExportErrorStatus.RELEASE_ERROR);
        }
        boolean smallThan = cMSampleBuffer.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero);
        if (!smallThan) {
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(cMSampleBuffer.getSampleByteBuffer().limit());
            allocate.order(cMSampleBuffer.getSampleByteBuffer().order());
            allocate.put(cMSampleBuffer.getSampleByteBuffer());
            allocate.flip();
            cMSampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(cMSampleBuffer.getTime(), allocate);
        }
        if (this.writerHandler == null || (handlerThread = this.writerThread) == null || !handlerThread.isAlive()) {
            this.logger.w(this.TAG, "appendAudioSampleBuffer: writer thread not available");
            return new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.core.ExportErrorStatus.RELEASE_ERROR);
        }
        this.writerHandler.post(new com.tencent.tav.core.AssetWriterInput.WriterAudioRunnable(cMSampleBuffer, smallThan));
        return null;
    }

    private com.tencent.tav.core.ExportErrorStatus appendVideoSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        return appendVideoSampleBuffer(cMSampleBuffer, false);
    }

    private static float[] calculateFillingMVP(com.tencent.tav.coremedia.TextureInfo textureInfo, int i17, int i18) {
        int i19;
        int i27;
        float f17;
        float f18;
        if (textureInfo.getTextureRect() != null) {
            i19 = textureInfo.getTextureRect().width();
            i27 = textureInfo.getTextureRect().height();
        } else {
            i19 = textureInfo.width;
            i27 = textureInfo.height;
        }
        if (textureInfo.getSurfaceTextureRotation() % 180 != 0) {
            int i28 = i27;
            i27 = i19;
            i19 = i28;
        }
        float f19 = i17 / i18;
        float f27 = i19 / i27;
        if (f19 > f27) {
            f18 = f19 / f27;
            f17 = 1.0f;
        } else {
            f17 = f27 / f19;
            f18 = 1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f17, f18, 1.0f);
        return fArr;
    }

    private com.tencent.tav.coremedia.TextureInfo createBlitTexture(int i17, int i18) {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i19 = iArr[0];
        android.opengl.GLES20.glBindTexture(3553, i19);
        com.tencent.tav.decoder.RenderContext.checkEglError("glBindTexture mTextureID");
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        com.tencent.tav.decoder.RenderContext.checkEglError("glTexParameter");
        android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, i17, i18, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGB, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
        return new com.tencent.tav.coremedia.TextureInfo(i19, 3553, i17, i18, null, 0);
    }

    private void onStartError(java.lang.Exception exc, int i17) {
        com.tencent.tav.core.ExportErrorStatus exportErrorStatus;
        if (exc instanceof com.tencent.tav.core.ExportRuntimeException) {
            exportErrorStatus = ((com.tencent.tav.core.ExportRuntimeException) exc).getErrorStatus();
        } else {
            exportErrorStatus = new com.tencent.tav.core.ExportErrorStatus(i17 == 1 ? -101 : -102, exc);
        }
        com.tencent.tav.core.AssetWriterInput.WriterProgressListener writerProgressListener = this.progressListener;
        if (writerProgressListener != null) {
            exportErrorStatus.indicatorInfo = this.indicatorInfo;
            writerProgressListener.onError(exportErrorStatus);
        }
    }

    private com.tencent.tav.coremedia.TextureInfo renderSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        com.tencent.tav.coremedia.TextureInfo textureInfo = cMSampleBuffer.getTextureInfo();
        if (textureInfo == null) {
            return null;
        }
        boolean z17 = !this.writer.isVideoEncodeNeedVideoRenderOutputTexture();
        if (!this.isEnableNewTextureBlitting || textureInfo.getSurfaceTextureTransform() == null) {
            if (this.matrixFilter == null) {
                android.graphics.Bitmap bitmap = this.lutBitmap;
                if (bitmap == null || bitmap.isRecycled()) {
                    this.matrixFilter = new com.tencent.tav.decoder.Filter();
                } else {
                    this.matrixFilter = new com.tencent.tav.decoder.LookUpFilter(this.lutBitmap);
                }
                this.matrixFilter.setRendererWidth(this.assetWriter.renderContext().width());
                this.matrixFilter.setRendererHeight(this.assetWriter.renderContext().height());
                this.matrixFilter.setRenderForScreen(z17);
            }
            return this.matrixFilter.applyFilter(textureInfo, this.transform, textureInfo.getTextureMatrix());
        }
        if (this.oesTextureBlitter == null) {
            com.tencent.tav.decoder.ofs.OESTextureBlitter oESTextureBlitter = new com.tencent.tav.decoder.ofs.OESTextureBlitter();
            this.oesTextureBlitter = oESTextureBlitter;
            oESTextureBlitter.setLut(this.lutBitmap);
            int width = this.assetWriter.renderContext().width();
            int height = this.assetWriter.renderContext().height();
            this.oesTextureBlitter.setMVPMatrix(calculateFillingMVP(textureInfo, width, height));
            this.oesTextureBlitTexture = createBlitTexture(width, height);
        }
        com.tencent.tav.decoder.ofs.OESTextureBlitter oESTextureBlitter2 = this.oesTextureBlitter;
        float[] surfaceTextureTransform = textureInfo.getSurfaceTextureTransform();
        int i17 = z17 ? -1 : this.oesTextureBlitTexture.textureID;
        com.tencent.tav.coremedia.TextureInfo textureInfo2 = this.oesTextureBlitTexture;
        oESTextureBlitter2.blitTo(textureInfo, surfaceTextureTransform, i17, textureInfo2.width, textureInfo2.height);
        if (z17) {
            return null;
        }
        return this.oesTextureBlitTexture;
    }

    public void addStatusListener(com.tencent.tav.core.AssetWriterInput.StatusListener statusListener) {
        this.statusListener = statusListener;
    }

    public com.tencent.tav.core.ExportErrorStatus appendSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        return appendSampleBuffer(cMSampleBuffer, false);
    }

    public synchronized void close() {
        this.logger.i(this.TAG, "close");
        this.stop = true;
        this.readyForMoreMediaData = false;
        android.os.HandlerThread handlerThread = this.handlerThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.handlerThread = null;
            this.handler = null;
            this.logger.i(this.TAG, "quit handlerThread");
        }
        if (this.writerThread != null) {
            this.writerHandler.removeCallbacksAndMessages(null);
            this.writerThread.quit();
            this.logger.i(this.TAG, "quit writerThread");
            this.writerThread = null;
            this.writerHandler = null;
        }
    }

    public java.lang.String getLogStatus() {
        return "readyForMoreMediaData: " + this.readyForMoreMediaData + " videoTrackWritable: " + this.writer.videoTrackWritable() + " audioTrackWritable: " + this.writer.audioTrackWritable();
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public java.util.List<com.tencent.tav.asset.MetadataItem> getMetadata() {
        return this.metadata;
    }

    public void initConfig(com.tencent.tav.core.IAssetWriter iAssetWriter) {
        this.assetWriter = iAssetWriter;
        this.writer = iAssetWriter.encoderWriter();
    }

    public boolean isReadyForMoreMediaData() {
        if (this.readyForMoreMediaData) {
            if (this.mediaType == 1) {
                if (this.writer.videoTrackWritable()) {
                    return true;
                }
            } else if (this.writer.audioTrackWritable()) {
                return true;
            }
        }
        return false;
    }

    public void markAsFinished() {
        this.writerHandler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.tav.core.AssetWriterInput.this.mediaType == 1) {
                    try {
                        com.tencent.tav.core.AssetWriterInput.this.writer.endWriteVideoSample(null);
                    } catch (java.lang.Throwable th6) {
                        if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                            com.tencent.tav.core.AssetWriterInput.this.progressListener.onError(new com.tencent.tav.core.ExportErrorStatus(-123, th6, "", com.tencent.tav.core.AssetWriterInput.this.indicatorInfo));
                            return;
                        }
                    }
                    if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                        com.tencent.tav.core.AssetWriterInput.this.progressListener.onProgressChanged(com.tencent.tav.core.AssetWriterInput.this, -1L);
                        return;
                    }
                    return;
                }
                try {
                    com.tencent.tav.core.AssetWriterInput.this.writer.endWriteAudioSample();
                } catch (java.lang.Throwable th7) {
                    if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                        com.tencent.tav.core.AssetWriterInput.this.progressListener.onError(new com.tencent.tav.core.ExportErrorStatus(-124, th7, "", com.tencent.tav.core.AssetWriterInput.this.indicatorInfo));
                        return;
                    }
                }
                if (com.tencent.tav.core.AssetWriterInput.this.progressListener != null) {
                    com.tencent.tav.core.AssetWriterInput.this.progressListener.onProgressChanged(com.tencent.tav.core.AssetWriterInput.this, -1L);
                }
            }
        });
    }

    public void postRunnable(java.lang.Runnable runnable) {
        if (this.handler == null || !this.handlerThread.isAlive()) {
            return;
        }
        this.handler.post(runnable);
    }

    public synchronized void requestMediaDataWhenReadyOnQueue(android.os.HandlerThread handlerThread, final java.lang.Runnable runnable) {
        if (this.handler != null) {
            this.logger.e(this.TAG, "正在处理上一次的request请求，无法重复发起");
            return;
        }
        if (this.assetWriter == null) {
            this.logger.e(this.TAG, "还没有与AssetWriter关联，无法发起request请求");
            return;
        }
        this.handlerThread = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.handler = handler;
        handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.tav.core.AssetWriterInput.this.start()) {
                    runnable.run();
                }
            }
        });
        android.os.HandlerThread handlerThread2 = new android.os.HandlerThread("writerThread");
        this.writerThread = handlerThread2;
        handlerThread2.start();
        this.writerHandler = new android.os.Handler(this.writerThread.getLooper());
    }

    public void reset(final java.lang.Runnable runnable) {
        this.handler.post(new java.lang.Runnable() { // from class: com.tencent.tav.core.AssetWriterInput.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.tencent.tav.core.AssetWriterInput.this.start()) {
                    runnable.run();
                }
            }
        });
    }

    public void setEnableLut(android.graphics.Bitmap bitmap) {
        this.lutBitmap = bitmap;
    }

    public void setLoggerConfig(com.tencent.tav.decoder.logger.WXLoggerConfig wXLoggerConfig) {
        this.logger.setConfig(wXLoggerConfig);
    }

    public void setMetadata(java.util.List<com.tencent.tav.asset.MetadataItem> list) {
        this.metadata = list;
    }

    public void setTransform(android.graphics.Matrix matrix) {
        this.transform = matrix;
    }

    public void setWriterProgressListener(com.tencent.tav.core.AssetWriterInput.WriterProgressListener writerProgressListener) {
        this.progressListener = writerProgressListener;
    }

    public boolean start() {
        this.logger.i(this.TAG, "start");
        if (this.started) {
            return true;
        }
        try {
            if (this.mediaType == 1) {
                this.writer.startVideoEncoder();
                this.writer.setVideoSampleRenderContext(this.assetWriter.renderContext());
            } else {
                this.writer.startAudioEncoder();
            }
            this.readyForMoreMediaData = true;
            this.started = true;
        } catch (java.lang.Exception e17) {
            this.logger.e(this.TAG, "start: ", e17);
            onStartError(e17, this.mediaType);
        }
        return this.started;
    }

    public void stop() {
        this.stop = true;
        this.readyForMoreMediaData = false;
    }

    private com.tencent.tav.core.ExportErrorStatus appendVideoSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17) {
        com.tencent.tav.core.ExportErrorStatus exportErrorStatus;
        android.os.Handler handler;
        android.os.HandlerThread handlerThread;
        com.tencent.tav.coremedia.CMPerformance cMPerformance = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.ENCODE_RENDER_CLEAR);
        cMPerformance.markStart();
        try {
            this.assetWriter.renderContext().makeCurrent(z17);
            android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            android.opengl.GLES20.glClear(16640);
            cMPerformance.markEnd();
            if (cMSampleBuffer == null || cMSampleBuffer.getTime().getTimeUs() < 0) {
                exportErrorStatus = null;
            } else {
                this.logger.frame(this.TAG, "appendSampleBuffer: start " + cMSampleBuffer.getTime());
                com.tencent.tav.coremedia.CMPerformance cMPerformance2 = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.ENCODE_RENDER);
                cMPerformance2.addPreNode(cMPerformance);
                cMPerformance2.markStart();
                try {
                    com.tencent.tav.coremedia.TextureInfo renderSampleBuffer = renderSampleBuffer(cMSampleBuffer);
                    if (this.writer.isVideoEncodeNeedVideoRenderOutputTexture()) {
                        android.opengl.GLES20.glFinish();
                    }
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    this.writer.processVideoTexture(renderSampleBuffer, cMSampleBuffer.getTime());
                    this.renderCost += java.lang.System.currentTimeMillis() - currentTimeMillis;
                    exportErrorStatus = null;
                } catch (java.lang.Exception e17) {
                    exportErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-112, e17);
                }
                cMPerformance2.markEnd();
                com.tencent.tav.coremedia.CMPerformance cMPerformance3 = new com.tencent.tav.coremedia.CMPerformance(com.tencent.tav.coremedia.CMPerformance.CMPerformanceStage.ENCODE_SWAP_BUFFER);
                cMPerformance3.addPreNode(cMPerformance2);
                cMPerformance3.markStart();
                try {
                    this.assetWriter.renderContext().setPresentationTime(cMSampleBuffer.getTime().getTimeUs());
                    this.assetWriter.renderContext().swapBuffers();
                } catch (java.lang.Exception e18) {
                    exportErrorStatus = new com.tencent.tav.core.ExportErrorStatus(-113, e18);
                }
                cMPerformance3.markEnd();
                cMSampleBuffer.getState().performance = cMPerformance3;
                this.logger.v(this.TAG, "appendSampleBuffer: end " + cMSampleBuffer.getTime());
            }
            if (this.stop || (handler = this.writerHandler) == null) {
                this.logger.w(this.TAG, "appendVideoSampleBuffer: writer is stopped or handler is null");
                return new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.core.ExportErrorStatus.RELEASE_ERROR);
            }
            if (handler != null && (handlerThread = this.writerThread) != null && handlerThread.isAlive()) {
                this.writerHandler.post(new com.tencent.tav.core.AssetWriterInput.WriterVideoRunnable(cMSampleBuffer));
                return exportErrorStatus;
            }
            this.logger.w(this.TAG, "appendVideoSampleBuffer: writer thread not available");
            return new com.tencent.tav.core.ExportErrorStatus(com.tencent.tav.core.ExportErrorStatus.RELEASE_ERROR);
        } catch (java.lang.Exception e19) {
            return new com.tencent.tav.core.ExportErrorStatus(-111, e19);
        }
    }

    public com.tencent.tav.core.ExportErrorStatus appendSampleBuffer(com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer, boolean z17) {
        if (!this.stop) {
            try {
                this.logger.frame(this.TAG, "appendSampleBuffer: start " + cMSampleBuffer.getTime() + " type: " + this.mediaType);
                if (this.mediaType == 1 && this.assetWriter.renderContext() != null) {
                    return appendVideoSampleBuffer(cMSampleBuffer, z17);
                }
                if (this.mediaType == 2) {
                    return appendAudioSampleBuffer(cMSampleBuffer);
                }
            } catch (java.lang.Throwable th6) {
                this.logger.e(this.TAG, "appendSampleBuffer: error", th6);
                com.tencent.tav.core.AssetWriterInput.StatusListener statusListener = this.statusListener;
                if (statusListener != null) {
                    statusListener.statusChanged(this, com.tencent.tav.core.AssetWriterStatus.AssetWriterStatusFailed);
                }
                return new com.tencent.tav.core.ExportErrorStatus(-110, th6);
            }
        }
        this.logger.e(this.TAG, "appendSampleBuffer abort, thread already stop");
        return new com.tencent.tav.core.ExportErrorStatus(-11);
    }
}
