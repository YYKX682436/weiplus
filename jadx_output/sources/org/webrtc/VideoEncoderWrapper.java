package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class VideoEncoderWrapper {
    public static org.webrtc.VideoEncoder.Callback createEncoderCallback(final long j17) {
        return new org.webrtc.VideoEncoder.Callback() { // from class: org.webrtc.VideoEncoderWrapper$$a
            @Override // org.webrtc.VideoEncoder.Callback
            public final void onEncodedFrame(org.webrtc.EncodedImage encodedImage, org.webrtc.VideoEncoder.CodecSpecificInfo codecSpecificInfo) {
                org.webrtc.VideoEncoderWrapper.nativeOnEncodedFrame(j17, encodedImage);
            }
        };
    }

    public static java.lang.Integer getScalingSettingsHigh(org.webrtc.VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.high;
    }

    public static java.lang.Integer getScalingSettingsLow(org.webrtc.VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.low;
    }

    public static boolean getScalingSettingsOn(org.webrtc.VideoEncoder.ScalingSettings scalingSettings) {
        return scalingSettings.f347950on;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnEncodedFrame(long j17, org.webrtc.EncodedImage encodedImage);
}
