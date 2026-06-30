package org.webrtc;

/* loaded from: classes6.dex */
public abstract class WrappedNativeVideoEncoder implements org.webrtc.VideoEncoder {
    @Override // org.webrtc.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame videoFrame, org.webrtc.VideoEncoder.EncodeInfo encodeInfo) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final java.lang.String getImplementationName() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoEncoder.ScalingSettings getScalingSettings() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings settings, org.webrtc.VideoEncoder.Callback callback) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus release() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation bitrateAllocation, int i17) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }
}
