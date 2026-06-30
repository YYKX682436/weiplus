package org.webrtc;

/* loaded from: classes6.dex */
public abstract class WrappedNativeVideoDecoder implements org.webrtc.VideoDecoder {
    @Override // org.webrtc.VideoDecoder
    public abstract long createNativeVideoDecoder();

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage encodedImage, org.webrtc.VideoDecoder.DecodeInfo decodeInfo) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final java.lang.String getImplementationName() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings settings, org.webrtc.VideoDecoder.Callback callback) {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus release() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }
}
