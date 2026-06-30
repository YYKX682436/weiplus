package org.webrtc;

/* loaded from: classes16.dex */
public class VideoFrame implements org.webrtc.RefCounted {
    private final org.webrtc.VideoFrame.Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* loaded from: classes16.dex */
    public interface Buffer extends org.webrtc.RefCounted {
        org.webrtc.VideoFrame.Buffer cropAndScale(int i17, int i18, int i19, int i27, int i28, int i29);

        default int getBufferType() {
            return 0;
        }

        int getHeight();

        int getWidth();

        @Override // org.webrtc.RefCounted
        void release();

        @Override // org.webrtc.RefCounted
        void retain();

        org.webrtc.VideoFrame.I420Buffer toI420();
    }

    /* loaded from: classes16.dex */
    public interface I420Buffer extends org.webrtc.VideoFrame.Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
            return 1;
        }

        java.nio.ByteBuffer getDataU();

        java.nio.ByteBuffer getDataV();

        java.nio.ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    /* loaded from: classes16.dex */
    public interface TextureBuffer extends org.webrtc.VideoFrame.Buffer {

        /* loaded from: classes16.dex */
        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i17) {
                this.glTarget = i17;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        android.graphics.Matrix getTransformMatrix();

        org.webrtc.VideoFrame.TextureBuffer.Type getType();
    }

    public VideoFrame(org.webrtc.VideoFrame.Buffer buffer, int i17, long j17) {
        if (buffer == null) {
            throw new java.lang.IllegalArgumentException("buffer not allowed to be null");
        }
        if (i17 % 90 != 0) {
            throw new java.lang.IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i17;
        this.timestampNs = j17;
    }

    public org.webrtc.VideoFrame.Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        return this.rotation % 180 == 0 ? this.buffer.getHeight() : this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        return this.rotation % 180 == 0 ? this.buffer.getWidth() : this.buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}
