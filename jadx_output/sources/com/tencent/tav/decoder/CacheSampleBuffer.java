package com.tencent.tav.decoder;

/* loaded from: classes16.dex */
public class CacheSampleBuffer extends com.tencent.tav.coremedia.CMSampleBuffer {
    private com.tencent.tav.decoder.VideoTexture texture;

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        super(cMSampleState);
    }

    public com.tencent.tav.decoder.VideoTexture getTexture() {
        return this.texture;
    }

    public void setTexture(com.tencent.tav.decoder.VideoTexture videoTexture) {
        this.texture = videoTexture;
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        super(cMSampleState, textureInfo);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.coremedia.TextureInfo textureInfo, boolean z17) {
        super(cMSampleState, textureInfo, z17);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, java.nio.ByteBuffer byteBuffer) {
        super(cMSampleState, byteBuffer);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, java.nio.ByteBuffer byteBuffer, boolean z17) {
        super(cMSampleState, byteBuffer, z17);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        super(cMTime);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        super(cMTime, textureInfo);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.TextureInfo textureInfo, boolean z17) {
        super(cMTime, textureInfo, z17);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer) {
        super(cMTime, byteBuffer);
    }

    public CacheSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer, boolean z17) {
        super(cMTime, byteBuffer, z17);
    }
}
