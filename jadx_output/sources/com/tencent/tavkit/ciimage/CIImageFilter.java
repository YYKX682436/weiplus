package com.tencent.tavkit.ciimage;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public class CIImageFilter extends com.tencent.tavkit.ciimage.TextureFilter {
    private final java.lang.String TAG = "CIImageFilter@" + java.lang.Integer.toHexString(hashCode());
    private int clearColor;
    private com.tencent.tav.coremedia.TextureInfo destTextureInfo;
    private com.tencent.tavkit.ciimage.TextureFilter oesFilter;
    private com.tencent.tavkit.ciimage.TextureFilter rgbFilter;

    public CIImageFilter() {
        if (this.rgbFilter == null) {
            this.rgbFilter = new com.tencent.tavkit.ciimage.TextureFilter();
        }
        if (this.oesFilter == null) {
            this.oesFilter = new com.tencent.tavkit.ciimage.TextureFilter();
        }
    }

    private com.tencent.tav.coremedia.TextureInfo tryApplyOESFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.tencent.tav.coremedia.CGRect cGRect) {
        return this.oesFilter.applyFilter(textureInfo, matrix, matrix2, f17, cGRect);
    }

    private com.tencent.tav.coremedia.TextureInfo tryApplyRGBFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.tencent.tav.coremedia.CGRect cGRect) {
        return this.rgbFilter.applyFilter(textureInfo, matrix, matrix2, f17, cGRect);
    }

    @Override // com.tencent.tavkit.ciimage.TextureFilter
    public com.tencent.tav.coremedia.TextureInfo applyFilter(com.tencent.tav.coremedia.TextureInfo textureInfo, android.graphics.Matrix matrix, android.graphics.Matrix matrix2, float f17, com.tencent.tav.coremedia.CGRect cGRect) {
        if (textureInfo != null) {
            return textureInfo.textureType == 36197 ? tryApplyOESFilter(textureInfo, matrix, matrix2, f17, cGRect) : tryApplyRGBFilter(textureInfo, matrix, matrix2, f17, cGRect);
        }
        return null;
    }

    @Override // com.tencent.tavkit.ciimage.TextureFilter
    public void clearBufferBuffer(int i17) {
        this.clearColor = i17;
        com.tencent.tavkit.ciimage.TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.clearBufferBuffer(i17);
        }
        com.tencent.tavkit.ciimage.TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.clearBufferBuffer(i17);
        }
    }

    @Override // com.tencent.tavkit.ciimage.TextureFilter
    public void release() {
        com.tencent.tavkit.ciimage.TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.release();
        }
        com.tencent.tavkit.ciimage.TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.release();
        }
    }

    @Override // com.tencent.tavkit.ciimage.TextureFilter
    public void setOutputTextureInfo(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        this.destTextureInfo = textureInfo;
        com.tencent.tavkit.ciimage.TextureFilter textureFilter = this.oesFilter;
        if (textureFilter != null) {
            textureFilter.setOutputTextureInfo(textureInfo);
        }
        com.tencent.tavkit.ciimage.TextureFilter textureFilter2 = this.rgbFilter;
        if (textureFilter2 != null) {
            textureFilter2.setOutputTextureInfo(textureInfo);
        }
    }

    @Override // com.tencent.tavkit.ciimage.TextureFilter
    public java.lang.String toString() {
        return "CIImageFilter{program=" + this.program + ", clearColor=" + this.clearColor + ", destTextureInfo=" + this.destTextureInfo + '}';
    }
}
