package com.tencent.tav.core.compositing;

/* loaded from: classes16.dex */
public interface VideoCompositing {
    void cancelAllPendingVideoCompositionRequests();

    void release();

    void renderContextChanged(com.tencent.tav.core.compositing.VideoCompositionRenderContext videoCompositionRenderContext);

    java.util.HashMap<java.lang.String, java.lang.Object> requiredPixelBufferAttributesForRenderContext();

    java.util.HashMap<java.lang.String, java.lang.Object> sourcePixelBufferAttributes();

    void startVideoCompositionRequest(com.tencent.tav.core.compositing.AsynchronousVideoCompositionRequest asynchronousVideoCompositionRequest);
}
