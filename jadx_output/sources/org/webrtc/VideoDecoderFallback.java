package org.webrtc;

/* loaded from: classes6.dex */
public class VideoDecoderFallback extends org.webrtc.WrappedNativeVideoDecoder {
    private final org.webrtc.VideoDecoder fallback;
    private final org.webrtc.VideoDecoder primary;

    public VideoDecoderFallback(org.webrtc.VideoDecoder videoDecoder, org.webrtc.VideoDecoder videoDecoder2) {
        this.fallback = videoDecoder;
        this.primary = videoDecoder2;
    }

    private static native long nativeCreateDecoder(org.webrtc.VideoDecoder videoDecoder, org.webrtc.VideoDecoder videoDecoder2);

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder(this.fallback, this.primary);
    }
}
