package org.webrtc;

/* loaded from: classes16.dex */
public class NV21Buffer implements org.webrtc.VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i17, int i18, java.lang.Runnable runnable) {
        this.data = bArr;
        this.width = i17;
        this.height = i18;
        this.refCountDelegate = new org.webrtc.RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i17, int i18, int i19, int i27, int i28, int i29, byte[] bArr, int i37, int i38, java.nio.ByteBuffer byteBuffer, int i39, java.nio.ByteBuffer byteBuffer2, int i47, java.nio.ByteBuffer byteBuffer3, int i48);

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29) {
        org.webrtc.JavaI420Buffer allocate = org.webrtc.JavaI420Buffer.allocate(i28, i29);
        nativeCropAndScale(i17, i18, i19, i27, i28, i29, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
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
