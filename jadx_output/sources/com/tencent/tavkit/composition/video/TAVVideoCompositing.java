package com.tencent.tavkit.composition.video;

/* loaded from: classes16.dex */
public class TAVVideoCompositing implements com.tencent.tav.core.compositing.VideoCompositing {
    private com.tencent.tavkit.ciimage.CIContext ciContext;
    private java.lang.Thread renderThread;
    private com.tencent.tavkit.report.CompositingReportSession reportSession;
    private final java.lang.String TAG = "TAVVideoCompositing@" + java.lang.Integer.toHexString(hashCode());
    private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoTransition.Filter> transitionFilterMap = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> sourceFilterMap = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter> mixFilterMap = new java.util.HashMap<>();
    private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> globalFilterMap = new java.util.HashMap<>();
    private final com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter defaultVideoMixFilter = new com.tencent.tavkit.composition.video.DefaultVideoMixFilter();
    private boolean tryPostReleaseDone = false;

    private com.tencent.tavkit.ciimage.CIImage applyClipSourceEffect(com.tencent.tavkit.composition.video.RenderInfo renderInfo, com.tencent.tavkit.ciimage.CIImage cIImage, java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> list) {
        if (list != null && !list.isEmpty()) {
            for (com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect : list) {
                com.tencent.tavkit.composition.video.TAVVideoEffect.Filter sourceFilter = getSourceFilter(tAVVideoEffect);
                if (sourceFilter != null) {
                    cIImage = sourceFilter.apply(tAVVideoEffect, cIImage, renderInfo);
                }
            }
        }
        return cIImage;
    }

    private com.tencent.tavkit.ciimage.CIImage applyCompositionSourceEffect(com.tencent.tavkit.composition.video.RenderInfo renderInfo, com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        com.tencent.tavkit.composition.video.TAVVideoEffect.Filter sourceFilter = getSourceFilter(tAVVideoEffect);
        return sourceFilter == null ? cIImage : sourceFilter.apply(tAVVideoEffect, cIImage, renderInfo);
    }

    private void applySourceTransform(com.tencent.tavkit.composition.model.TAVVideoConfiguration tAVVideoConfiguration, com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.video.RenderInfo renderInfo) {
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "applySourceTransform() called with: config = [" + tAVVideoConfiguration + "]");
        if (tAVVideoConfiguration.frameEnable()) {
            cIImage.applyFillInFrame(tAVVideoConfiguration.getFrame(), tAVVideoConfiguration.getContentMode());
        } else if (tAVVideoConfiguration.getFrame() == com.tencent.tavkit.composition.model.TAVVideoConfiguration.FIX_RENDER_SIZE) {
            cIImage.applyFixInSize(renderInfo.getRenderSize(), tAVVideoConfiguration.getContentMode());
        }
        cIImage.safeApplyTransform(tAVVideoConfiguration.getTransform());
    }

    private com.tencent.tavkit.ciimage.CIImage compositingImages(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction tAVVideoCompositionInstruction) {
        if (this.ciContext == null) {
            return null;
        }
        for (com.tencent.tavkit.composition.video.TAVVideoEffect.Filter filter : this.sourceFilterMap.values()) {
            if (filter instanceof com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect.TimeAttachFilter) {
                ((com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect.TimeAttachFilter) filter).attachPositionTime(asynchronousVideoCompositionRequest.getCompositionTime());
            }
        }
        com.tencent.tavkit.composition.video.RenderInfo renderInfo = new com.tencent.tavkit.composition.video.RenderInfo(asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().getSize(), this.ciContext);
        com.tencent.tavkit.composition.video.ImageCollection convertToImageCollection = convertToImageCollection(asynchronousVideoCompositionRequest, renderInfo, tAVVideoCompositionInstruction);
        com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter videoMixFilter = getVideoMixFilter(tAVVideoCompositionInstruction, tAVVideoCompositionInstruction.getVideoMixEffect());
        com.tencent.tavkit.ciimage.CIImage apply = videoMixFilter != null ? videoMixFilter.apply(tAVVideoCompositionInstruction.getVideoMixEffect(), convertToImageCollection, renderInfo) : null;
        if (apply == null) {
            apply = this.defaultVideoMixFilter.apply(null, convertToImageCollection, renderInfo);
        }
        com.tencent.tavkit.composition.video.TAVVideoEffect.Filter globalFilter = getGlobalFilter(tAVVideoCompositionInstruction.getGlobalVideoEffect());
        return globalFilter != null ? globalFilter.apply(tAVVideoCompositionInstruction.getGlobalVideoEffect(), apply, renderInfo) : apply;
    }

    private com.tencent.tavkit.ciimage.CIImage convertLayerToImage(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, com.tencent.tavkit.composition.video.RenderInfo renderInfo, com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction, com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        if (!tAVVideoCompositionLayerInstruction.getTimeRange().containsTime(renderInfo.getTime())) {
            return null;
        }
        com.tencent.tavkit.ciimage.CIImage sourceImageAtTime = tAVVideoCompositionLayerInstruction.getImageSource().sourceImageAtTime(renderInfo.getTime().sub(tAVVideoCompositionLayerInstruction.getTimeRange().getStart()), renderInfo.getRenderSize());
        if (sourceImageAtTime == null) {
            sourceImageAtTime = getImageWithRequest(asynchronousVideoCompositionRequest, tAVVideoCompositionLayerInstruction);
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "convertLayerToImage: begin sourceImage by request, sourceImage = " + sourceImageAtTime);
        }
        if (sourceImageAtTime == null) {
            com.tencent.tav.decoder.logger.Logger.w(this.TAG, "convertLayerToImage: begin sourceImage by request, sourceImage is null ");
            return null;
        }
        renderInfo.addTrack(tAVVideoCompositionLayerInstruction.getImageSource());
        sourceImageAtTime.applyPreferRotation(tAVVideoCompositionLayerInstruction.getVideoConfiguration().getPreferRotation());
        applySourceTransform(tAVVideoCompositionLayerInstruction.getVideoConfiguration(), sourceImageAtTime, renderInfo);
        com.tencent.tavkit.ciimage.CIImage applyCompositionSourceEffect = applyCompositionSourceEffect(renderInfo, applyClipSourceEffect(renderInfo, sourceImageAtTime, tAVVideoCompositionLayerInstruction.getVideoConfiguration().getEffects()), tAVVideoEffect);
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "convertLayerToImage: end, returned: " + applyCompositionSourceEffect);
        return applyCompositionSourceEffect;
    }

    private com.tencent.tavkit.composition.video.ImageCollection convertToImageCollection(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, com.tencent.tavkit.composition.video.RenderInfo renderInfo, com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction tAVVideoCompositionInstruction) {
        com.tencent.tavkit.composition.video.ImageCollection imageCollection = new com.tencent.tavkit.composition.video.ImageCollection();
        java.util.Iterator<java.util.List<com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction>> it = tAVVideoCompositionInstruction.getChannelLayers().iterator();
        while (it.hasNext()) {
            for (com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction : it.next()) {
                com.tencent.tavkit.ciimage.CIImage convertLayerToImage = convertLayerToImage(asynchronousVideoCompositionRequest, renderInfo, tAVVideoCompositionLayerInstruction, tAVVideoCompositionInstruction.getSourceVideoEffect());
                if (convertLayerToImage != null && !convertLayerToImage.isCanvasImage()) {
                    imageCollection.addChannelImage(convertLayerToImage, tAVVideoCompositionLayerInstruction.getImageSource());
                }
            }
        }
        for (com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction2 : tAVVideoCompositionInstruction.getOverlayLayers()) {
            com.tencent.tavkit.ciimage.CIImage convertLayerToImage2 = convertLayerToImage(asynchronousVideoCompositionRequest, renderInfo, tAVVideoCompositionLayerInstruction2, tAVVideoCompositionInstruction.getSourceVideoEffect());
            if (convertLayerToImage2 != null && !convertLayerToImage2.isCanvasImage()) {
                imageCollection.addOverlayImage(convertLayerToImage2, tAVVideoCompositionLayerInstruction2.getImageSource());
            }
        }
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "convertToImageCollection: result imageCollection = " + imageCollection);
        return imageCollection;
    }

    private com.tencent.tavkit.composition.video.TAVVideoEffect.Filter getGlobalFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        if (tAVVideoEffect == null || android.text.TextUtils.isEmpty(tAVVideoEffect.effectId())) {
            return null;
        }
        java.lang.String effectId = tAVVideoEffect.effectId();
        if (this.globalFilterMap.containsKey(effectId)) {
            return this.globalFilterMap.get(effectId);
        }
        com.tencent.tavkit.composition.video.TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
        this.globalFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private com.tencent.tavkit.ciimage.CIImage getImageWithRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, com.tencent.tavkit.composition.video.TAVVideoCompositionLayerInstruction tAVVideoCompositionLayerInstruction) {
        com.tencent.tav.coremedia.CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(tAVVideoCompositionLayerInstruction.getTrackID());
        if (sourceFrameByTrackID == null || sourceFrameByTrackID.getTextureInfo() == null) {
            return null;
        }
        return new com.tencent.tavkit.ciimage.CIImage(sourceFrameByTrackID.getTextureInfo());
    }

    private com.tencent.tavkit.composition.video.TAVVideoEffect.Filter getSourceFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
        if (tAVVideoEffect == null || android.text.TextUtils.isEmpty(tAVVideoEffect.effectId())) {
            return null;
        }
        java.lang.String effectId = tAVVideoEffect.effectId();
        if (this.sourceFilterMap.containsKey(effectId)) {
            return this.sourceFilterMap.get(effectId);
        }
        com.tencent.tavkit.composition.video.TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
        this.sourceFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter getVideoMixFilter(com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction tAVVideoCompositionInstruction, com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
        if (tAVVideoMixEffect == null || android.text.TextUtils.isEmpty(tAVVideoMixEffect.effectId())) {
            return null;
        }
        java.lang.String effectId = tAVVideoMixEffect.effectId();
        if (this.mixFilterMap.containsKey(effectId)) {
            return this.mixFilterMap.get(effectId);
        }
        com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter createFilter = tAVVideoCompositionInstruction.getVideoMixEffect().createFilter();
        this.mixFilterMap.put(effectId, createFilter);
        return createFilter;
    }

    private void reportMemory() {
        if (com.tencent.tavkit.report.MemoryReportHelper.isInIntervalTime()) {
            return;
        }
        com.tencent.tavkit.report.MemoryReportHelper.getInstance().tick("sourceFilter:[" + com.tencent.tavkit.report.MemoryReportHelper.appendReportKey(this.sourceFilterMap.values()) + "], mixFilter:[" + com.tencent.tavkit.report.MemoryReportHelper.appendReportKey(this.mixFilterMap.values()) + "], globalFilter:[" + com.tencent.tavkit.report.MemoryReportHelper.appendReportKey(this.globalFilterMap.values()) + "]");
    }

    private void tryPostReleaseToRenderThread() {
        if (this.tryPostReleaseDone) {
            return;
        }
        this.tryPostReleaseDone = true;
        java.lang.Thread thread = this.renderThread;
        if (thread instanceof android.os.HandlerThread) {
            if (((android.os.HandlerThread) thread).getLooper() == null) {
                com.tencent.tav.decoder.logger.Logger.d(this.TAG, "tryPostReleaseToRenderThread error, renderThread looper null");
            } else {
                new android.os.Handler(((android.os.HandlerThread) this.renderThread).getLooper()).post(new java.lang.Runnable() { // from class: com.tencent.tavkit.composition.video.TAVVideoCompositing.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.tencent.tavkit.composition.video.TAVVideoCompositing.this.release();
                    }
                });
            }
        }
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void cancelAllPendingVideoCompositionRequests() {
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void release() {
        if (this.renderThread != null && !java.lang.Thread.currentThread().equals(this.renderThread)) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "release: 当前线程非渲染线程！currentThread = " + java.lang.Thread.currentThread().getName() + ", renderThread = " + this.renderThread.getName());
            tryPostReleaseToRenderThread();
            return;
        }
        this.tryPostReleaseDone = false;
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: begin, currentThread = " + java.lang.Thread.currentThread().getName());
        com.tencent.tavkit.ciimage.CIContext cIContext = this.ciContext;
        if (cIContext != null) {
            cIContext.release();
        }
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoTransition.Filter> it = this.transitionFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> it6 = this.sourceFilterMap.values().iterator();
        while (it6.hasNext()) {
            it6.next().release();
        }
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter> it7 = this.mixFilterMap.values().iterator();
        while (it7.hasNext()) {
            it7.next().release();
        }
        java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> it8 = this.globalFilterMap.values().iterator();
        while (it8.hasNext()) {
            it8.next().release();
        }
        this.transitionFilterMap.clear();
        this.sourceFilterMap.clear();
        this.mixFilterMap.clear();
        this.globalFilterMap.clear();
        com.tencent.tavkit.ciimage.ThreadLocalTextureCache.getInstance().release();
        com.tencent.tavkit.report.CompositingReportSession compositingReportSession = this.reportSession;
        if (compositingReportSession != null) {
            compositingReportSession.flush();
            this.reportSession = null;
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: end, currentThread = " + java.lang.Thread.currentThread().getName());
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void renderContextChanged(com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext) {
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public java.util.HashMap<java.lang.String, java.lang.Object> requiredPixelBufferAttributesForRenderContext() {
        return null;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public java.util.HashMap<java.lang.String, java.lang.Object> sourcePixelBufferAttributes() {
        return null;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void startVideoCompositionRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        if (this.reportSession == null) {
            this.reportSession = new com.tencent.tavkit.report.CompositingReportSession(asynchronousVideoCompositionRequest.getRenderContext().getSize().width, asynchronousVideoCompositionRequest.getRenderContext().getSize().height);
        }
        long nanoTime = java.lang.System.nanoTime();
        com.tencent.tav.decoder.logger.Logger.v(this.TAG, "startVideoCompositionRequest: begin, currentThread = " + java.lang.Thread.currentThread().getName() + ", request = [" + asynchronousVideoCompositionRequest + "]");
        if (this.ciContext == null) {
            this.ciContext = new com.tencent.tavkit.ciimage.CIContext(asynchronousVideoCompositionRequest.getRenderContext().getRenderContext());
        }
        if (this.renderThread == null) {
            this.renderThread = java.lang.Thread.currentThread();
        }
        com.tencent.tav.core.compositing.IVideoCompositionInstruction videoCompositionInstruction = asynchronousVideoCompositionRequest.getVideoCompositionInstruction();
        if (!(videoCompositionInstruction instanceof com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction)) {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "startVideoCompositionRequest: end, instruction not instanceof TAVVideoCompositionInstruction");
            this.reportSession.tickFailed();
            asynchronousVideoCompositionRequest.finishWithError(new com.tencent.tav.coremedia.ErrorMsg(10086, "instruction not instanceof TAVVideoCompositionInstruction"));
            return;
        }
        com.tencent.tavkit.utils.BenchUtil.benchStart("compositingImages");
        com.tencent.tavkit.ciimage.CIImage compositingImages = compositingImages(asynchronousVideoCompositionRequest, (com.tencent.tavkit.composition.video.TAVVideoCompositionInstruction) videoCompositionInstruction);
        com.tencent.tavkit.utils.BenchUtil.benchEnd("compositingImages");
        com.tencent.tavkit.utils.BenchUtil.benchStart("renderToSampleBuffer");
        reportMemory();
        if (compositingImages != null) {
            com.tencent.tav.coremedia.CMSampleBuffer renderToSampleBuffer = this.ciContext.renderToSampleBuffer(compositingImages, asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().getRenderContext());
            com.tencent.tav.decoder.logger.Logger.v(this.TAG, "startVideoCompositionRequest: end, resultPixels = [" + renderToSampleBuffer + "]");
            this.reportSession.tickSuccess(java.lang.System.nanoTime() - nanoTime);
            asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(renderToSampleBuffer);
        } else {
            com.tencent.tav.decoder.logger.Logger.e(this.TAG, "startVideoCompositionRequest: end, destImage is null ");
            this.reportSession.tickFailed();
            asynchronousVideoCompositionRequest.finishWithError(new com.tencent.tav.coremedia.ErrorMsg(10086, "destImage is null "));
        }
        com.tencent.tavkit.utils.BenchUtil.benchEnd("renderToSampleBuffer");
    }
}
