package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class VideoCompositor implements com.tencent.tav.core.compositing.VideoCompositing {
    private com.tencent.tav.core.MultiTextureFilter filter;

    private boolean checkRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        return (asynchronousVideoCompositionRequest.getRenderContext() == null || asynchronousVideoCompositionRequest.getSourceTrackIDs() == null || asynchronousVideoCompositionRequest.getSourceTrackIDs().isEmpty()) ? false : true;
    }

    private void drawInstructionBuffer(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest, com.tencent.tav.core.compositing.IVideoCompositionInstruction iVideoCompositionInstruction) {
        this.filter.clearBufferBuffer(iVideoCompositionInstruction.getBackgroundColor());
        for (com.tencent.tav.core.composition.VideoCompositionLayerInstruction videoCompositionLayerInstruction : iVideoCompositionInstruction.getLayerInstructions()) {
            com.tencent.tav.coremedia.CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(videoCompositionLayerInstruction.getTrackID());
            if (sourceFrameByTrackID != null && sourceFrameByTrackID.getTextureInfo() != null) {
                com.tencent.tav.coremedia.CMTime compositionTime = asynchronousVideoCompositionRequest.getCompositionTime();
                com.tencent.tav.coremedia.Transform transformForTime = getTransformForTime(compositionTime, videoCompositionLayerInstruction.getTransformRampForTime(compositionTime));
                this.filter.applyFilter(sourceFrameByTrackID.getTextureInfo(), transformForTime == null ? null : transformForTime.toMatrix(), null, getOpacityForTime(compositionTime, videoCompositionLayerInstruction.getOpacityRampForTime(compositionTime)), getCropRectangleForTime(compositionTime, videoCompositionLayerInstruction.getCropRectangleRampForTime(compositionTime)));
            }
        }
    }

    private void drawSrcBuffer(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        this.filter.clearBufferBuffer(-16777216);
        java.util.Iterator<java.lang.Integer> it = asynchronousVideoCompositionRequest.getSourceTrackIDs().iterator();
        while (it.hasNext()) {
            com.tencent.tav.coremedia.CMSampleBuffer sourceFrameByTrackID = asynchronousVideoCompositionRequest.sourceFrameByTrackID(it.next().intValue());
            if (sourceFrameByTrackID != null && sourceFrameByTrackID.getTextureInfo() != null) {
                com.tencent.tav.coremedia.TextureInfo textureInfo = sourceFrameByTrackID.getTextureInfo();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                com.tencent.tav.decoder.DecoderUtils.getRotationMatrix(matrix, textureInfo.preferRotation, textureInfo.width, textureInfo.height);
                this.filter.applyFilter(sourceFrameByTrackID.getTextureInfo(), matrix, textureInfo.getTextureMatrix(), 1.0f, null);
            }
        }
    }

    private static com.tencent.tav.coremedia.CGRect getCropRectangleForTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp) {
        if (cropRectangleRamp.startCropRectangle == null || cropRectangleRamp.endCropRectangle == null || !cropRectangleRamp.timeRange.containsTime(cMTime)) {
            return null;
        }
        float timeUs = (((float) (cMTime.getTimeUs() - cropRectangleRamp.timeRange.getStartUs())) * 1.0f) / ((float) cropRectangleRamp.timeRange.getDurationUs());
        return new com.tencent.tav.coremedia.CGRect(interpolation(timeUs, cropRectangleRamp.startCropRectangle.origin.x, cropRectangleRamp.endCropRectangle.origin.x), interpolation(timeUs, cropRectangleRamp.startCropRectangle.origin.y, cropRectangleRamp.endCropRectangle.origin.y), interpolation(timeUs, cropRectangleRamp.startCropRectangle.size.width, cropRectangleRamp.endCropRectangle.size.width), interpolation(timeUs, cropRectangleRamp.startCropRectangle.size.height, cropRectangleRamp.endCropRectangle.size.height));
    }

    private static float getOpacityForTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp opacityRamp) {
        if (!opacityRamp.timeRange.containsTime(cMTime)) {
            return 1.0f;
        }
        return interpolation((((float) (cMTime.getTimeUs() - opacityRamp.timeRange.getStartUs())) * 1.0f) / ((float) opacityRamp.timeRange.getDurationUs()), opacityRamp.startOpacity, opacityRamp.endOpacity);
    }

    private static com.tencent.tav.coremedia.Transform getTransformForTime(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp transformRamp) {
        if (!transformRamp.timeRange.containsTime(cMTime) || transformRamp.startTransform == null || transformRamp.endTransform == null) {
            return null;
        }
        float timeUs = (((float) (cMTime.getTimeUs() - transformRamp.timeRange.getStartUs())) * 1.0f) / ((float) transformRamp.timeRange.getDurationUs());
        return new com.tencent.tav.coremedia.Transform(interpolation(timeUs, transformRamp.startTransform.scaleX, transformRamp.endTransform.scaleX), interpolation(timeUs, transformRamp.startTransform.scaleY, transformRamp.endTransform.scaleY), interpolation(timeUs, transformRamp.startTransform.translateX, transformRamp.endTransform.translateX), interpolation(timeUs, transformRamp.startTransform.translateY, transformRamp.endTransform.translateY), interpolation(timeUs, transformRamp.startTransform.degrees, transformRamp.endTransform.degrees));
    }

    private void initFilter(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        if (this.filter == null) {
            com.tencent.tav.coremedia.CGSize size = asynchronousVideoCompositionRequest.getRenderContext().getSize();
            int i17 = (int) size.width;
            int i18 = (int) size.height;
            com.tencent.tav.core.MultiTextureFilter multiTextureFilter = new com.tencent.tav.core.MultiTextureFilter();
            this.filter = multiTextureFilter;
            multiTextureFilter.setRendererWidth(i17);
            this.filter.setRendererHeight(i18);
            this.filter.setRenderForScreen(false);
        }
    }

    private static float interpolation(float f17, float f18, float f19) {
        return f18 == f19 ? f18 : ((f19 - f18) * f17) + f18;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void cancelAllPendingVideoCompositionRequests() {
    }

    public com.tencent.tav.coremedia.CMSampleBuffer finishComposedVideoFrame(com.tencent.tav.decoder.RenderContext renderContext, com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer) {
        return cMSampleBuffer;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void release() {
        com.tencent.tav.core.MultiTextureFilter multiTextureFilter = this.filter;
        if (multiTextureFilter != null) {
            multiTextureFilter.release();
            this.filter = null;
        }
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
        if (checkRequest(asynchronousVideoCompositionRequest)) {
            initFilter(asynchronousVideoCompositionRequest);
            com.tencent.tav.coremedia.CMSampleBuffer cMSampleBuffer = new com.tencent.tav.coremedia.CMSampleBuffer(asynchronousVideoCompositionRequest.getCompositionTime(), asynchronousVideoCompositionRequest.getRenderContext().newTextureInfo(), false);
            if (cMSampleBuffer.getTextureInfo() == null) {
                return;
            }
            this.filter.setDesTextureInfo(cMSampleBuffer.getTextureInfo());
            com.tencent.tav.core.compositing.IVideoCompositionInstruction videoCompositionInstruction = asynchronousVideoCompositionRequest.getVideoCompositionInstruction();
            if (videoCompositionInstruction == null || videoCompositionInstruction.getLayerInstructions() == null || videoCompositionInstruction.getLayerInstructions().size() == 0) {
                drawSrcBuffer(asynchronousVideoCompositionRequest);
            } else {
                drawInstructionBuffer(asynchronousVideoCompositionRequest, videoCompositionInstruction);
            }
            asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(finishComposedVideoFrame(asynchronousVideoCompositionRequest.getRenderContext().getRenderContext(), cMSampleBuffer));
        }
    }
}
