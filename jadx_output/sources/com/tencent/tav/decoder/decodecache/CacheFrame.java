package com.tencent.tav.decoder.decodecache;

/* loaded from: classes16.dex */
class CacheFrame {
    public com.tencent.tav.coremedia.CMTime frameTime;
    public com.tencent.tav.coremedia.CMTime realFrameTime;
    public com.tencent.tav.coremedia.CMSampleBuffer sampleBuffer;
    public com.tencent.tav.decoder.ITexturePool texturePool;

    public CacheFrame() {
        com.tencent.tav.coremedia.CMTime cMTime = com.tencent.tav.coremedia.CMTime.CMTimeInvalid;
        this.realFrameTime = cMTime;
        this.frameTime = cMTime;
        this.sampleBuffer = null;
    }
}
