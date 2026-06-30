package org.webrtc;

/* loaded from: classes6.dex */
public class VideoEncoderFallback extends org.webrtc.WrappedNativeVideoEncoder {
    private final org.webrtc.VideoEncoder fallback;
    private final org.webrtc.VideoEncoder primary;

    public VideoEncoderFallback(org.webrtc.VideoEncoder videoEncoder, org.webrtc.VideoEncoder videoEncoder2) {
        this.fallback = videoEncoder;
        this.primary = videoEncoder2;
    }

    private static native long nativeCreateEncoder(org.webrtc.VideoEncoder videoEncoder, org.webrtc.VideoEncoder videoEncoder2);

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNativeVideoEncoder() {
        return nativeCreateEncoder(this.fallback, this.primary);
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
        return this.primary.isHardwareEncoder();
    }
}
