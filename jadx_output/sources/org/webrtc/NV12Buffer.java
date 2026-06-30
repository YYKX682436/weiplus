package org.webrtc;

/* loaded from: classes16.dex */
public class NV12Buffer implements org.webrtc.VideoFrame.Buffer {
    private final java.nio.ByteBuffer buffer;
    private final int height;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i17, int i18, int i19, int i27, java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable) {
        this.width = i17;
        this.height = i18;
        this.stride = i19;
        this.sliceHeight = i27;
        this.buffer = byteBuffer;
        this.refCountDelegate = new org.webrtc.RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i17, int i18, int i19, int i27, int i28, int i29, java.nio.ByteBuffer byteBuffer, int i37, int i38, int i39, int i47, java.nio.ByteBuffer byteBuffer2, int i48, java.nio.ByteBuffer byteBuffer3, int i49, java.nio.ByteBuffer byteBuffer4, int i57);

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29) {
        org.webrtc.JavaI420Buffer allocate = org.webrtc.JavaI420Buffer.allocate(i28, i29);
        nativeCropAndScale(i17, i18, i19, i27, i28, i29, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
        int i17 = this.width;
        int i18 = this.height;
        return (org.webrtc.VideoFrame.I420Buffer) cropAndScale(0, 0, i17, i18, i17, i18);
    }
}
