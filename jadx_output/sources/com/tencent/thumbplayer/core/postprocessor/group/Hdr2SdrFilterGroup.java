package com.tencent.thumbplayer.core.postprocessor.group;

/* loaded from: classes14.dex */
public class Hdr2SdrFilterGroup implements com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup {
    public boolean isTransform = true;
    private com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter mHdr2SdrFilter = new com.tencent.thumbplayer.core.postprocessor.filter.Hdr2SdrFilter();
    private com.tencent.thumbplayer.core.postprocessor.filter.OES2TextureFilter mOES2TextureFilter;
    private com.tencent.thumbplayer.core.postprocessor.filter.Texture2OESFIlter mTexture2OESFilter;

    public Hdr2SdrFilterGroup(java.lang.String str) {
        this.mOES2TextureFilter = new com.tencent.thumbplayer.core.postprocessor.filter.OES2TextureFilter(str);
        this.mTexture2OESFilter = new com.tencent.thumbplayer.core.postprocessor.filter.Texture2OESFIlter(str);
    }

    @Override // com.tencent.thumbplayer.core.postprocessor.group.IFilterGroup
    public void destroyBuffers() {
        this.mOES2TextureFilter.destroyBuffers();
        this.mHdr2SdrFilter.destroyBuffers();
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
            this.mTexture2OESFilter.process(this.mHdr2SdrFilter.process(i28, this.mOES2TextureFilter.process(surfaceTexture, i19, i27, false, false), i17, i18), i19, i27, false);
        } else {
            this.mOES2TextureFilter.process(surfaceTexture, i19, i27, false, true);
        }
        android.opengl.GLES20.glFlush();
    }
}
