package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public interface ITexturePool {
    com.tencent.tav.coremedia.TextureInfo popTexture(int i17, int i18, int i19);

    void pushTexture(com.tencent.tav.coremedia.TextureInfo textureInfo);

    void release();

    void setMaxCacheLength(int i17);

    void setMaxCacheSize(long j17);
}
