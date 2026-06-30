package tm5;

/* loaded from: classes16.dex */
public final class a implements com.tencent.tav.core.compositing.VideoCompositing {
    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void cancelAllPendingVideoCompositionRequests() {
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void release() {
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void renderContextChanged(com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext) {
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public java.util.HashMap requiredPixelBufferAttributesForRenderContext() {
        return null;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public java.util.HashMap sourcePixelBufferAttributes() {
        return null;
    }

    @Override // com.tencent.tav.core.compositing.VideoCompositing
    public void startVideoCompositionRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest) {
        java.util.List<java.lang.Integer> sourceTrackIDs;
        if (asynchronousVideoCompositionRequest == null || (sourceTrackIDs = asynchronousVideoCompositionRequest.getSourceTrackIDs()) == null) {
            return;
        }
        for (java.lang.Integer num : sourceTrackIDs) {
            kotlin.jvm.internal.o.d(num);
            asynchronousVideoCompositionRequest.finishWithComposedVideoFrame(asynchronousVideoCompositionRequest.sourceFrameByTrackID(num.intValue()));
        }
    }
}
