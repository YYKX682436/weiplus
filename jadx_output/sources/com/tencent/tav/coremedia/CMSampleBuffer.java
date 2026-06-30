package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public class CMSampleBuffer {
    private java.nio.ByteBuffer sampleByteBuffer;
    private com.tencent.tav.coremedia.CMSampleState state;
    private com.tencent.tav.coremedia.TextureInfo texture;

    public CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(false);
        this.texture = null;
        this.sampleByteBuffer = null;
    }

    public java.nio.ByteBuffer getSampleByteBuffer() {
        return this.sampleByteBuffer;
    }

    public com.tencent.tav.coremedia.CMSampleState getState() {
        return this.state;
    }

    public com.tencent.tav.coremedia.TextureInfo getTextureInfo() {
        return this.texture;
    }

    public com.tencent.tav.coremedia.CMTime getTime() {
        return this.state.getTime();
    }

    public boolean isNewFrame() {
        return this.state.isNewFrame();
    }

    public void setNewFrame(boolean z17) {
        this.state.setNewFrame(z17);
    }

    public void setSampleByteBuffer(java.nio.ByteBuffer byteBuffer) {
        this.sampleByteBuffer = byteBuffer;
    }

    public java.lang.String toString() {
        return "CMSampleBuffer{, state=" + this.state + ", texture=" + this.texture + ", sampleByteBuffer=" + this.sampleByteBuffer + '}';
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        this.state = cMSampleState;
        this.texture = textureInfo;
        this.sampleByteBuffer = null;
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, com.tencent.tav.coremedia.TextureInfo textureInfo, boolean z17) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(z17);
        this.texture = textureInfo;
        this.sampleByteBuffer = null;
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, java.nio.ByteBuffer byteBuffer) {
        this.state = cMSampleState;
        this.sampleByteBuffer = byteBuffer;
        this.texture = null;
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMSampleState cMSampleState, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this.state = cMSampleState;
        cMSampleState.setNewFrame(z17);
        this.sampleByteBuffer = byteBuffer;
        this.texture = null;
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime) {
        this(new com.tencent.tav.coremedia.CMSampleState(cMTime));
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.TextureInfo textureInfo) {
        this(new com.tencent.tav.coremedia.CMSampleState(cMTime), textureInfo);
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, com.tencent.tav.coremedia.TextureInfo textureInfo, boolean z17) {
        this(new com.tencent.tav.coremedia.CMSampleState(cMTime), textureInfo, z17);
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer) {
        this(new com.tencent.tav.coremedia.CMSampleState(cMTime), byteBuffer);
    }

    public CMSampleBuffer(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer, boolean z17) {
        this(new com.tencent.tav.coremedia.CMSampleState(cMTime), byteBuffer, z17);
    }
}
