package org.webrtc;

/* loaded from: classes16.dex */
public class JavaI420Buffer implements org.webrtc.VideoFrame.I420Buffer {
    private final java.nio.ByteBuffer dataU;
    private final java.nio.ByteBuffer dataV;
    private final java.nio.ByteBuffer dataY;
    private final int height;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, java.lang.Runnable runnable) {
        this.width = i17;
        this.height = i18;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i19;
        this.strideU = i27;
        this.strideV = i28;
        this.refCountDelegate = new org.webrtc.RefCountDelegate(runnable);
    }

    public static org.webrtc.JavaI420Buffer allocate(int i17, int i18) {
        int i19 = (i18 + 1) / 2;
        int i27 = (i17 + 1) / 2;
        int i28 = i17 * i18;
        int i29 = i28 + 0;
        int i37 = i27 * i19;
        int i38 = i29 + i37;
        final java.nio.ByteBuffer nativeAllocateByteBuffer = org.webrtc.JniCommon.nativeAllocateByteBuffer(i28 + (i27 * 2 * i19));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i29);
        java.nio.ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i29);
        nativeAllocateByteBuffer.limit(i38);
        java.nio.ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i38);
        nativeAllocateByteBuffer.limit(i38 + i37);
        return new org.webrtc.JavaI420Buffer(i17, i18, slice, i17, slice2, i27, nativeAllocateByteBuffer.slice(), i27, new java.lang.Runnable() { // from class: org.webrtc.JavaI420Buffer$$b
            @Override // java.lang.Runnable
            public final void run() {
                org.webrtc.JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19) {
        int i27 = (i19 * (i18 - 1)) + i17;
        if (byteBuffer.capacity() >= i27) {
            return;
        }
        throw new java.lang.IllegalArgumentException("Buffer must be at least " + i27 + " bytes, but was " + byteBuffer.capacity());
    }

    public static org.webrtc.VideoFrame.Buffer cropAndScaleI420(final org.webrtc.VideoFrame.I420Buffer i420Buffer, int i17, int i18, int i19, int i27, int i28, int i29) {
        if (i19 == i28 && i27 == i29) {
            java.nio.ByteBuffer dataY = i420Buffer.getDataY();
            java.nio.ByteBuffer dataU = i420Buffer.getDataU();
            java.nio.ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position(i17 + (i420Buffer.getStrideY() * i18));
            int i37 = i17 / 2;
            int i38 = i18 / 2;
            dataU.position((i420Buffer.getStrideU() * i38) + i37);
            dataV.position(i37 + (i38 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            return wrap(i28, i29, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new java.lang.Runnable() { // from class: org.webrtc.JavaI420Buffer$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.webrtc.VideoFrame.I420Buffer.this.release();
                }
            });
        }
        org.webrtc.JavaI420Buffer allocate = allocate(i28, i29);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i17, i18, i19, i27, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i28, i29);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(java.nio.ByteBuffer byteBuffer, int i17, java.nio.ByteBuffer byteBuffer2, int i18, java.nio.ByteBuffer byteBuffer3, int i19, int i27, int i28, int i29, int i37, java.nio.ByteBuffer byteBuffer4, int i38, java.nio.ByteBuffer byteBuffer5, int i39, java.nio.ByteBuffer byteBuffer6, int i47, int i48, int i49);

    public static org.webrtc.JavaI420Buffer wrap(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19, java.nio.ByteBuffer byteBuffer2, int i27, java.nio.ByteBuffer byteBuffer3, int i28, java.lang.Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new java.lang.IllegalArgumentException("Data buffers cannot be null.");
        }
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new java.lang.IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        java.nio.ByteBuffer slice = byteBuffer.slice();
        java.nio.ByteBuffer slice2 = byteBuffer2.slice();
        java.nio.ByteBuffer slice3 = byteBuffer3.slice();
        int i29 = (i17 + 1) / 2;
        int i37 = (i18 + 1) / 2;
        checkCapacity(slice, i17, i18, i19);
        checkCapacity(slice2, i29, i37, i27);
        checkCapacity(slice3, i29, i37, i28);
        return new org.webrtc.JavaI420Buffer(i17, i18, slice, i19, slice2, i27, slice3, i28, runnable);
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29) {
        return cropAndScaleI420(this, i17, i18, i19, i27, i28, i29);
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
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
        retain();
        return this;
    }
}
