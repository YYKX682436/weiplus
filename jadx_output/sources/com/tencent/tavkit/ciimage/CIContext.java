package com.tencent.tavkit.ciimage;

/* loaded from: classes14.dex */
public class CIContext {
    private final java.lang.String TAG = "CIContext@" + java.lang.Integer.toHexString(hashCode());
    private com.tencent.tavkit.ciimage.CIImageFilter copyFilter;
    private com.tencent.tavkit.ciimage.CIImageFilter filter;
    private final com.tencent.tav.decoder.RenderContext renderContext;
    private com.tencent.tav.coremedia.TextureInfo textureInfo;

    public CIContext(com.tencent.tav.decoder.RenderContext renderContext) {
        this.renderContext = renderContext;
    }

    public static com.tencent.tav.coremedia.TextureInfo newTextureInfo(com.tencent.tav.coremedia.CGSize cGSize) {
        return newTextureInfo(cGSize.width, cGSize.height);
    }

    private void setDestImage(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (this.filter == null) {
            this.filter = new com.tencent.tavkit.ciimage.CIImageFilter();
        }
        this.filter.setOutputTextureInfo(textureInfo);
    }

    public void clear(int i17) {
        this.filter.clearBufferBuffer(i17);
    }

    public com.tencent.tav.coremedia.TextureInfo convertImageToTexture(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        if (textureInfo == null) {
            return null;
        }
        if (this.copyFilter == null) {
            this.copyFilter = new com.tencent.tavkit.ciimage.CIImageFilter();
        }
        this.copyFilter.setOutputTextureInfo(textureInfo);
        this.copyFilter.clearBufferBuffer(-16777216);
        cIImage.draw(this.copyFilter);
        return textureInfo;
    }

    public com.tencent.tav.decoder.RenderContext getRenderContext() {
        return this.renderContext;
    }

    public void release() {
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: begin, currentThread = " + java.lang.Thread.currentThread().getName());
        com.tencent.tavkit.ciimage.CIImageFilter cIImageFilter = this.filter;
        if (cIImageFilter != null) {
            cIImageFilter.release();
        }
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null) {
            textureInfo.release();
        }
        com.tencent.tavkit.ciimage.CIImageFilter cIImageFilter2 = this.copyFilter;
        if (cIImageFilter2 != null) {
            cIImageFilter2.release();
        }
        com.tencent.tav.decoder.logger.Logger.d(this.TAG, "release: end, currentThread = " + java.lang.Thread.currentThread().getName());
    }

    public com.tencent.tav.coremedia.CMSampleBuffer renderToSampleBuffer(com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.decoder.RenderContext renderContext) {
        renderContext.makeCurrent();
        com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfo;
        if (textureInfo != null && (textureInfo.width != renderContext.width() || this.textureInfo.height != renderContext.height())) {
            this.textureInfo.release();
            this.textureInfo = null;
        }
        if (this.textureInfo == null) {
            this.textureInfo = newTextureInfo(renderContext.width(), renderContext.height());
        }
        setDestImage(this.textureInfo);
        clear(-16777216);
        cIImage.draw(this.filter);
        return new com.tencent.tav.coremedia.CMSampleBuffer(cMTime, this.textureInfo, false);
    }

    public static com.tencent.tav.coremedia.TextureInfo newTextureInfo(float f17, float f18) {
        return newTextureInfo((int) f17, (int) f18);
    }

    public static com.tencent.tav.coremedia.TextureInfo newTextureInfo(int i17, int i18) {
        com.tencent.tav.coremedia.TextureInfo textureInfo = new com.tencent.tav.coremedia.TextureInfo(com.tencent.tav.decoder.RenderContext.createTexture(3553), 3553, i17, i18, null, 0);
        textureInfo.setFormat(com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA);
        return textureInfo;
    }
}
