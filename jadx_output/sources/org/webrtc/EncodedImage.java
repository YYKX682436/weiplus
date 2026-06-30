package org.webrtc;

/* loaded from: classes16.dex */
public class EncodedImage implements org.webrtc.RefCounted {
    public final java.nio.ByteBuffer buffer;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final int encodedHeight;
    public final int encodedWidth;
    public final org.webrtc.EncodedImage.FrameType frameType;

    /* renamed from: qp, reason: collision with root package name */
    public final java.lang.Integer f347911qp;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    public final int rotation;

    /* loaded from: classes16.dex */
    public static class Builder {
        private java.nio.ByteBuffer buffer;
        private long captureTimeNs;
        private int encodedHeight;
        private int encodedWidth;
        private org.webrtc.EncodedImage.FrameType frameType;

        /* renamed from: qp, reason: collision with root package name */
        private java.lang.Integer f347912qp;
        private java.lang.Runnable releaseCallback;
        private int rotation;

        private Builder() {
        }

        public org.webrtc.EncodedImage createEncodedImage() {
            return new org.webrtc.EncodedImage(this.buffer, this.releaseCallback, this.encodedWidth, this.encodedHeight, this.captureTimeNs, this.frameType, this.rotation, this.f347912qp);
        }

        public org.webrtc.EncodedImage.Builder setBuffer(java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable) {
            this.buffer = byteBuffer;
            this.releaseCallback = runnable;
            return this;
        }

        @java.lang.Deprecated
        public org.webrtc.EncodedImage.Builder setCaptureTimeMs(long j17) {
            this.captureTimeNs = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j17);
            return this;
        }

        public org.webrtc.EncodedImage.Builder setCaptureTimeNs(long j17) {
            this.captureTimeNs = j17;
            return this;
        }

        public org.webrtc.EncodedImage.Builder setEncodedHeight(int i17) {
            this.encodedHeight = i17;
            return this;
        }

        public org.webrtc.EncodedImage.Builder setEncodedWidth(int i17) {
            this.encodedWidth = i17;
            return this;
        }

        public org.webrtc.EncodedImage.Builder setFrameType(org.webrtc.EncodedImage.FrameType frameType) {
            this.frameType = frameType;
            return this;
        }

        public org.webrtc.EncodedImage.Builder setQp(java.lang.Integer num) {
            this.f347912qp = num;
            return this;
        }

        public org.webrtc.EncodedImage.Builder setRotation(int i17) {
            this.rotation = i17;
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public enum FrameType {
        EmptyFrame(0),
        VideoFrameKey(3),
        VideoFrameDelta(4);

        private final int nativeIndex;

        FrameType(int i17) {
            this.nativeIndex = i17;
        }

        public static org.webrtc.EncodedImage.FrameType fromNativeIndex(int i17) {
            for (org.webrtc.EncodedImage.FrameType frameType : values()) {
                if (frameType.getNative() == i17) {
                    return frameType;
                }
            }
            throw new java.lang.IllegalArgumentException("Unknown native frame type: " + i17);
        }

        public int getNative() {
            return this.nativeIndex;
        }
    }

    public static org.webrtc.EncodedImage.Builder builder() {
        return new org.webrtc.EncodedImage.Builder();
    }

    private java.nio.ByteBuffer getBuffer() {
        return this.buffer;
    }

    private long getCaptureTimeNs() {
        return this.captureTimeNs;
    }

    private int getEncodedHeight() {
        return this.encodedHeight;
    }

    private int getEncodedWidth() {
        return this.encodedWidth;
    }

    private int getFrameType() {
        return this.frameType.getNative();
    }

    private java.lang.Integer getQp() {
        return this.f347911qp;
    }

    private int getRotation() {
        return this.rotation;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    private EncodedImage(java.nio.ByteBuffer byteBuffer, java.lang.Runnable runnable, int i17, int i18, long j17, org.webrtc.EncodedImage.FrameType frameType, int i19, java.lang.Integer num) {
        this.buffer = byteBuffer;
        this.encodedWidth = i17;
        this.encodedHeight = i18;
        this.captureTimeMs = java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(j17);
        this.captureTimeNs = j17;
        this.frameType = frameType;
        this.rotation = i19;
        this.f347911qp = num;
        this.refCountDelegate = new org.webrtc.RefCountDelegate(runnable);
    }
}
