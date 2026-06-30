package com.tencent.tav.core.compositing;

/* loaded from: classes14.dex */
public class VideoCompositionRenderContext {
    android.graphics.RectF edgeWidths;
    private com.tencent.tav.decoder.RenderContext renderContext;
    private float renderScale;
    private android.graphics.Matrix renderTransform;
    private com.tencent.tav.coremedia.CGSize size;
    private com.tencent.tav.core.composition.VideoComposition videoComposition;
    private com.tencent.tav.coremedia.TextureInfo videoTexture;

    public VideoCompositionRenderContext(com.tencent.tav.decoder.RenderContext renderContext) {
        this.renderContext = renderContext;
        this.size = new com.tencent.tav.coremedia.CGSize(renderContext.width(), renderContext.height());
    }

    public android.graphics.RectF getEdgeWidths() {
        return this.edgeWidths;
    }

    public com.tencent.tav.decoder.RenderContext getRenderContext() {
        return this.renderContext;
    }

    public float getRenderScale() {
        return this.renderScale;
    }

    public android.graphics.Matrix getRenderTransform() {
        return this.renderTransform;
    }

    public com.tencent.tav.coremedia.CGSize getSize() {
        return this.size;
    }

    public com.tencent.tav.core.composition.VideoComposition getVideoComposition() {
        return this.videoComposition;
    }

    public com.tencent.tav.coremedia.TextureInfo newTextureInfo() {
        if (this.videoTexture == null) {
            com.tencent.tav.decoder.RenderContext.checkEglError("newSampleBuffer");
            int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(3553);
            com.tencent.tav.coremedia.CGSize cGSize = this.size;
            this.videoTexture = new com.tencent.tav.coremedia.TextureInfo(createTexture, 3553, (int) cGSize.width, (int) cGSize.height, 0);
        }
        return this.videoTexture;
    }

    public void setVideoComposition(com.tencent.tav.core.composition.VideoComposition videoComposition) {
        this.videoComposition = videoComposition;
    }

    public java.lang.String toString() {
        return "VideoCompositionRenderContext{size=" + this.size + ", renderContext=" + this.renderContext + '}';
    }
}
