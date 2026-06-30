package com.tencent.tav.decoder;

/* loaded from: classes14.dex */
public class TexturePool implements com.tencent.tav.decoder.ITexturePool {
    private static final java.lang.String TAG = "TexturePool";
    private java.util.List<com.tencent.tav.coremedia.TextureInfo> textureInfoList = new java.util.ArrayList();
    private long MaxCacheSize = 207360000;
    private int MaxCacheLength = 60;

    public TexturePool() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, "TexturePool: create " + java.lang.Thread.currentThread().getId());
    }

    private synchronized void adaptCacheSize() {
        while (this.textureInfoList.size() > 0 && this.textureInfoList.size() - this.MaxCacheLength > 0) {
            this.textureInfoList.get(0).release();
            this.textureInfoList.remove(0);
        }
    }

    private synchronized void adapterCacheMemorySize() {
        long j17 = 0;
        int i17 = 0;
        while (i17 < this.textureInfoList.size()) {
            com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfoList.get(i17);
            j17 += textureInfo.width * textureInfo.height;
            if (j17 > this.MaxCacheSize) {
                com.tencent.tav.decoder.logger.Logger.v(TAG, "texture: release " + textureInfo + " - " + java.lang.Thread.currentThread());
                textureInfo.release();
                this.textureInfoList.remove(i17);
                i17--;
            }
            i17++;
        }
    }

    @Override // com.tencent.tav.decoder.ITexturePool
    public synchronized com.tencent.tav.coremedia.TextureInfo popTexture(int i17, int i18, int i19) {
        for (int i27 = 0; i27 < this.textureInfoList.size(); i27++) {
            com.tencent.tav.coremedia.TextureInfo textureInfo = this.textureInfoList.get(i27);
            if (textureInfo.textureType == i17 && textureInfo.width == i18 && textureInfo.height == i19) {
                com.tencent.tav.decoder.logger.Logger.v(TAG, "popTexture: hint pool " + textureInfo.textureID);
                return this.textureInfoList.remove(i27);
            }
        }
        int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(i17);
        adaptCacheSize();
        adapterCacheMemorySize();
        return new com.tencent.tav.coremedia.TextureInfo(createTexture, 3553, i18, i19, null, 0);
    }

    @Override // com.tencent.tav.decoder.ITexturePool
    public synchronized void pushTexture(com.tencent.tav.coremedia.TextureInfo textureInfo) {
        for (int i17 = 0; i17 < this.textureInfoList.size(); i17++) {
            com.tencent.tav.coremedia.TextureInfo textureInfo2 = this.textureInfoList.get(i17);
            if (textureInfo2.textureType == textureInfo.textureType && textureInfo2.textureID == textureInfo.textureID) {
                com.tencent.tav.decoder.logger.Logger.v(TAG, "pushTexture: hint pool  " + textureInfo2.textureID);
                textureInfo.release();
                return;
            }
        }
        com.tencent.tav.decoder.logger.Logger.v(TAG, "pushTexture: push in " + textureInfo.textureID + " - " + java.lang.Thread.currentThread());
        this.textureInfoList.add(textureInfo);
    }

    @Override // com.tencent.tav.decoder.ITexturePool
    public synchronized void release() {
        com.tencent.tav.decoder.logger.Logger.d(TAG, " release all " + java.lang.Thread.currentThread().getId());
        for (int i17 = 0; i17 < this.textureInfoList.size(); i17++) {
            this.textureInfoList.get(i17).release();
        }
    }

    @Override // com.tencent.tav.decoder.ITexturePool
    public void setMaxCacheLength(int i17) {
        this.MaxCacheLength = i17;
        adapterCacheMemorySize();
    }

    @Override // com.tencent.tav.decoder.ITexturePool
    public void setMaxCacheSize(long j17) {
        this.MaxCacheSize = j17;
        adaptCacheSize();
    }
}
