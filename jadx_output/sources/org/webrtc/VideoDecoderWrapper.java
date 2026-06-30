package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class VideoDecoderWrapper {
    public static org.webrtc.VideoDecoder.Callback createDecoderCallback(final long j17) {
        return new org.webrtc.VideoDecoder.Callback() { // from class: org.webrtc.VideoDecoderWrapper$$a
            @Override // org.webrtc.VideoDecoder.Callback
            public final void onDecodedFrame(org.webrtc.VideoFrame videoFrame, java.lang.Integer num, java.lang.Integer num2) {
                org.webrtc.VideoDecoderWrapper.nativeOnDecodedFrame(j17, videoFrame, num, num2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnDecodedFrame(long j17, org.webrtc.VideoFrame videoFrame, java.lang.Integer num, java.lang.Integer num2);
}
