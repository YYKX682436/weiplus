package org.webrtc;

/* loaded from: classes16.dex */
class WrappedNativeI420Buffer implements org.webrtc.VideoFrame.I420Buffer {
    private final java.nio.ByteBuffer dataU;
    private final java.nio.ByteBuffer dataV;
    private final java.nio.ByteBuffer dataY;
    private final int height;
    private final long nativeBuffer;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    public WrappedNativeI420Buffer(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, long j17) {
        this.width = i17;
        this.height = i18;
        this.dataY = byteBuffer;
        this.strideY = i19;
        this.dataU = byteBuffer2;
        this.strideU = i27;
        this.dataV = byteBuffer3;
        this.strideV = i28;
        this.nativeBuffer = j17;
        retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29) {
        return org.webrtc.JavaI420Buffer.cropAndScaleI420(this, i17, i18, i19, i27, i28, i29);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        org.webrtc.JniCommon.nativeReleaseRef(this.nativeBuffer);
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        org.webrtc.JniCommon.nativeAddRef(this.nativeBuffer);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
