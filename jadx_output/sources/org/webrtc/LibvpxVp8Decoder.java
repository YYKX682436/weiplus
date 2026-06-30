package org.webrtc;

/* loaded from: classes6.dex */
public class LibvpxVp8Decoder extends org.webrtc.WrappedNativeVideoDecoder {
    public static native long nativeCreateDecoder();

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
