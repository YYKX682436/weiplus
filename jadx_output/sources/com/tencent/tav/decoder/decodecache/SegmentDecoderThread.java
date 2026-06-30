package com.tencent.tav.decoder.decodecache;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class SegmentDecoderThread implements android.os.Handler.Callback {
    private static final int MSG_DECODER_FRAME = 3;
    private static final int MSG_DECODER_SEGMENT = 2;
    private static final int MSG_QUIT = 1000;
    private static final int MSG_START = 1;
    private static final java.lang.String TAG = "SegmentDecoderThread";
    private com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack cachedVideoDecoderTrack;
    com.tencent.tav.decoder.RenderContext context;
    private android.os.Handler decoderHandler;
    private android.os.HandlerThread decoderThread;
    com.tencent.tav.decoder.IDecoderTrack decoderTrack;
    private com.tencent.tav.decoder.decodecache.CopyFilter filter;
    com.tencent.tav.coremedia.CMSampleBuffer seekSampleBuffer;
    boolean cancel = false;
    private volatile boolean started = false;
    com.tencent.tav.decoder.ITexturePool texturePool = new com.tencent.tav.decoder.TexturePool();

    public SegmentDecoderThread(com.tencent.tav.decoder.decodecache.CachedVideoDecoderTrack cachedVideoDecoderTrack, com.tencent.tav.decoder.IDecoderTrack iDecoderTrack) {
        this.cachedVideoDecoderTrack = cachedVideoDecoderTrack;
        this.decoderTrack = iDecoderTrack;
    }

    private void decoder(com.tencent.tav.decoder.decodecache.DecoderSegmentMsg decoderSegmentMsg) {
        com.tencent.tav.decoder.RenderContext renderContext;
        synchronized (this.cachedVideoDecoderTrack.nextFrameDecoderLock) {
            this.cancel = false;
            com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment = decoderSegmentMsg.segment;
            com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder:------------------- " + decoderSegmentMsg.segment.segmentTimeRange.getStart() + "  -  " + decoderSegmentMsg.segment.segmentTimeRange.getEnd());
            com.tencent.tav.coremedia.CMTime start = cacheSegment.segmentTimeRange.getStart();
            com.tencent.tav.coremedia.CMTime end = cacheSegment.segmentTimeRange.getEnd();
            com.tencent.tav.coremedia.CMTime duration = cacheSegment.segmentTimeRange.getDuration();
            if (end.bigThan(this.decoderTrack.getDuration())) {
                end = this.decoderTrack.getDuration();
                duration = end.sub(start);
            }
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(start, cacheSegment.segmentTimeRange.getDuration());
            if (this.cachedVideoDecoderTrack.revert) {
                com.tencent.tav.coremedia.CMTime sub = this.decoderTrack.getDuration().sub(end);
                com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeZero;
                if (sub.smallThan(cMTime)) {
                    sub = cMTime;
                }
                cMTimeRange = new com.tencent.tav.coremedia.CMTimeRange(sub, duration);
            }
            com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder2:------------------- " + cMTimeRange.getStart() + "  -  " + cMTimeRange.getEnd());
            if (cMTimeRange.getStart() != com.tencent.tav.coremedia.CMTime.CMTimeInvalid && this.cachedVideoDecoderTrack != null && (renderContext = this.context) != null) {
                renderContext.makeCurrent();
                this.decoderTrack.seekTo(cMTimeRange.getStart(), false, false);
                com.tencent.tav.coremedia.CMSampleBuffer readSample = this.decoderTrack.readSample(cMTimeRange.getStart());
                com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder: readFirst " + readSample.getTime() + " cancel = " + this.cancel + "  - " + cMTimeRange.getEnd());
                while (!readSample.getTime().smallThan(com.tencent.tav.coremedia.CMTime.CMTimeZero) && !this.cancel && readSample.getTime().smallThan(cMTimeRange.getEnd())) {
                    com.tencent.tav.decoder.decodecache.CacheFrame cacheFrame = new com.tencent.tav.decoder.decodecache.CacheFrame();
                    cacheFrame.texturePool = this.texturePool;
                    cacheFrame.frameTime = readSample.getTime();
                    com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder:==================== frame.frameTime = " + cacheFrame.frameTime + "  " + readSample.getTextureInfo());
                    if (this.cachedVideoDecoderTrack.revert) {
                        cacheFrame.frameTime = this.decoderTrack.getDuration().sub(readSample.getTime());
                    }
                    cacheFrame.realFrameTime = readSample.getTime();
                    if (readSample.getTextureInfo() != null) {
                        com.tencent.tav.decoder.RenderContext renderContext2 = this.context;
                        this.filter.setRenderForScreen(false);
                        this.filter.setRendererWidth(renderContext2.width());
                        this.filter.setRendererHeight(renderContext2.height());
                        renderContext2.makeCurrent();
                        com.tencent.tav.coremedia.TextureInfo popTexture = this.texturePool.popTexture(3553, renderContext2.width(), renderContext2.height());
                        this.filter.setDesTextureInfo(popTexture);
                        com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder:==================== " + readSample.getTime() + "  " + readSample.isNewFrame() + "  " + cacheFrame.frameTime);
                        this.filter.clearBufferBuffer(-16777216);
                        this.filter.applyFilter(readSample.getTextureInfo(), readSample.getTextureInfo().getTextureMatrix());
                        cacheFrame.sampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(cacheFrame.frameTime, popTexture, readSample.isNewFrame());
                        cacheSegment.pushFrame(cacheFrame);
                    }
                    if (!cacheFrame.realFrameTime.add(this.cachedVideoDecoderTrack.getFrameDuration()).smallThan(cMTimeRange.getEnd())) {
                        break;
                    } else {
                        readSample = this.decoderTrack.readSample();
                    }
                }
            }
        }
        com.tencent.tav.decoder.decodecache.RequestStatus requestStatus = decoderSegmentMsg.callbackObject;
        if (requestStatus != null) {
            synchronized (requestStatus) {
                decoderSegmentMsg.callbackObject.setFinish(true);
                decoderSegmentMsg.callbackObject.notifyAll();
            }
        }
    }

    private void quit() {
        com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.seekSampleBuffer;
        if (cMSampleBuffer != null && cMSampleBuffer.getTextureInfo() != null) {
            this.seekSampleBuffer.getTextureInfo().release();
        }
        this.filter.release();
        this.decoderTrack.release();
        this.texturePool.release();
        this.context.release();
        this.decoderHandler.removeCallbacksAndMessages(null);
        this.decoderThread.quit();
    }

    private void start() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("SegmentDecoder");
        this.decoderThread = handlerThread;
        handlerThread.start();
        this.decoderHandler = new android.os.Handler(this.decoderThread.getLooper(), this);
    }

    private void startDecoder() {
        com.tencent.tav.decoder.RenderContext renderContext = new com.tencent.tav.decoder.RenderContext(this.cachedVideoDecoderTrack.renderContext.width(), this.cachedVideoDecoderTrack.renderContext.height(), null, this.cachedVideoDecoderTrack.renderContext.eglContext());
        this.context = renderContext;
        this.decoderTrack.start(renderContext, this.cachedVideoDecoderTrack.validTimeRange);
        this.started = true;
        this.context.makeCurrent();
        this.filter = new com.tencent.tav.decoder.decodecache.CopyFilter();
    }

    public void decoderSegment(com.tencent.tav.decoder.decodecache.CacheSegment cacheSegment, com.tencent.tav.decoder.decodecache.RequestStatus requestStatus) {
        this.cancel = true;
        this.decoderHandler.removeCallbacksAndMessages(null);
        this.decoderHandler.obtainMessage(2, new com.tencent.tav.decoder.decodecache.DecoderSegmentMsg(cacheSegment, requestStatus)).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 1) {
            startDecoder();
            return false;
        }
        if (i17 == 2) {
            decoder((com.tencent.tav.decoder.decodecache.DecoderSegmentMsg) message.obj);
            return false;
        }
        if (i17 == 3) {
            decoder((com.tencent.tav.decoder.decodecache.DecoderFrameMsg) message.obj);
            return false;
        }
        if (i17 != 1000) {
            return false;
        }
        quit();
        return false;
    }

    public void release() {
        this.cancel = true;
        if (this.decoderThread != null) {
            this.decoderHandler.removeCallbacksAndMessages(null);
            this.decoderHandler.sendEmptyMessage(1000);
        }
    }

    public void startForReady() {
        start();
        this.decoderHandler.sendEmptyMessage(1);
        while (!this.started) {
            try {
                java.lang.Thread.sleep(1L);
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    public void decoderSegment(com.tencent.tav.coremedia.CMTime cMTime, java.util.concurrent.CountDownLatch countDownLatch) {
        this.cancel = true;
        this.decoderHandler.removeCallbacksAndMessages(null);
        this.decoderHandler.obtainMessage(3, new com.tencent.tav.decoder.decodecache.DecoderFrameMsg(cMTime, countDownLatch)).sendToTarget();
    }

    private void decoder(com.tencent.tav.decoder.decodecache.DecoderFrameMsg decoderFrameMsg) {
        com.tencent.tav.coremedia.TextureInfo popTexture;
        com.tencent.tav.coremedia.CMTime cMTime = decoderFrameMsg.time;
        if (this.cachedVideoDecoderTrack.revert) {
            cMTime = this.decoderTrack.getDuration().sub(decoderFrameMsg.time);
        }
        com.tencent.tav.decoder.RenderContext renderContext = this.context;
        if (renderContext != null) {
            renderContext.makeCurrent();
        }
        com.tencent.tav.coremedia.CMSampleBuffer seekTo = this.decoderTrack.seekTo(cMTime, true, false);
        if (seekTo.getTextureInfo() != null) {
            com.tencent.tav.decoder.RenderContext renderContext2 = this.context;
            this.filter.setRenderForScreen(false);
            this.filter.setRendererWidth(renderContext2.width());
            this.filter.setRendererHeight(renderContext2.height());
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = this.seekSampleBuffer;
            if (cMSampleBuffer != null) {
                popTexture = cMSampleBuffer.getTextureInfo();
            } else {
                popTexture = this.texturePool.popTexture(3553, renderContext2.width(), renderContext2.height());
            }
            this.filter.setDesTextureInfo(popTexture);
            com.tencent.tav.decoder.logger.Logger.d(TAG, "decoder:==========|=|========= " + seekTo.getTime() + "  " + seekTo.isNewFrame() + "  ");
            this.filter.clearBufferBuffer(-16777216);
            this.filter.applyFilter(seekTo.getTextureInfo(), seekTo.getTextureInfo().getTextureMatrix());
            com.tencent.tav.coremedia.CMTime time = seekTo.getTime();
            if (this.cachedVideoDecoderTrack.revert) {
                time = this.decoderTrack.getDuration().sub(time);
            }
            this.seekSampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(time, popTexture, seekTo.isNewFrame());
        }
        java.util.concurrent.CountDownLatch countDownLatch = decoderFrameMsg.finishWait;
        if (countDownLatch != null) {
            synchronized (countDownLatch) {
                decoderFrameMsg.finishWait.countDown();
            }
        }
    }
}
