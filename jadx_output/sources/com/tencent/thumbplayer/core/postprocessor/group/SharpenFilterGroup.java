package com.tencent.thumbplayer.core.postprocessor.group;

/* loaded from: classes14.dex */
public class SharpenFilterGroup implements com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup {
    public boolean ifsharpen = true;
    private com.tencent.thumbplayer.core.postprocessor.filter.BlurFilter mBlurFilter;
    private com.tencent.thumbplayer.core.postprocessor.filter.OES2TextureFilter mOES2TextureFilter;
    private com.tencent.thumbplayer.core.postprocessor.filter.Texture2OESFIlter mTexture2OESFilter;
    private com.tencent.thumbplayer.core.postprocessor.filter.USM3FusionFilter mUSM3FusionFilter;

    public SharpenFilterGroup(java.lang.String str) {
        this.mOES2TextureFilter = new com.tencent.thumbplayer.core.postprocessor.filter.OES2TextureFilter(str);
        this.mUSM3FusionFilter = new com.tencent.thumbplayer.core.postprocessor.filter.USM3FusionFilter(str);
        this.mBlurFilter = new com.tencent.thumbplayer.core.postprocessor.filter.BlurFilter(str);
        this.mTexture2OESFilter = new com.tencent.thumbplayer.core.postprocessor.filter.Texture2OESFIlter(str);
    }

    @Override // com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup
    public void destroyBuffers() {
        this.mOES2TextureFilter.destroyBuffers();
        this.mUSM3FusionFilter.destroyBuffers();
        this.mBlurFilter.destroyBuffers();
        this.mTexture2OESFilter.destroyBuffers();
    }

    @Override // com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup
    public void genOESTexture() {
        com.tencent.thumbplayer.core.postprocessor.filter.OES2TextureFilter oES2TextureFilter = this.mOES2TextureFilter;
        if (oES2TextureFilter == null) {
            throw new java.lang.RuntimeException("sifeng: OES2TextureFilter(null) generate texture failed");
        }
        oES2TextureFilter.genOESTexture();
    }

    @Override // com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup
    public int getOESTextureid() {
        return this.mOES2TextureFilter.getOESTextureid();
    }

    @Override // com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup
    public void process(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18, int i19, int i27, boolean z17, int i28) {
        if (z17) {
            int process = this.mOES2TextureFilter.process(surfaceTexture, i17, i18, true, false);
            this.mBlurFilter.process(process, i17, i18);
            this.mTexture2OESFilter.process(this.mUSM3FusionFilter.process(process, this.mBlurFilter.getTexid(0), this.mBlurFilter.getTexid(1), this.mBlurFilter.getTexid(2), i17, i18, z17, i28), i19, i27, true);
        } else {
            this.mTexture2OESFilter.process(this.mOES2TextureFilter.process(surfaceTexture, i17, i18, false, false), i19, i27, false);
        }
        android.opengl.GLES20.glFlush();
    }
}
