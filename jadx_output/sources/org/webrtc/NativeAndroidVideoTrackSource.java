package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long j17) {
        this.nativeAndroidVideoTrackSource = j17;
    }

    public static org.webrtc.VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int i17, int i18, int i19, int i27, int i28, int i29, long j17, boolean z17) {
        return new org.webrtc.VideoProcessor.FrameAdaptationParameters(i17, i18, i19, i27, i28, i29, j17, z17);
    }

    private static native org.webrtc.VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long j17, int i17, int i18, int i19, long j18);

    private static native void nativeAdaptOutputFormat(long j17, int i17, int i18, java.lang.Integer num, int i19, int i27, java.lang.Integer num2, java.lang.Integer num3);

    private static native void nativeOnFrameCaptured(long j17, int i17, long j18, org.webrtc.VideoFrame.Buffer buffer);

    private static native void nativeSetIsScreencast(long j17, boolean z17);

    private static native void nativeSetState(long j17, boolean z17);

    public org.webrtc.VideoProcessor.FrameAdaptationParameters adaptFrame(org.webrtc.VideoFrame videoFrame) {
        return nativeAdaptFrame(this.nativeAndroidVideoTrackSource, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
    }

    public void adaptOutputFormat(org.webrtc.VideoSource.AspectRatio aspectRatio, java.lang.Integer num, org.webrtc.VideoSource.AspectRatio aspectRatio2, java.lang.Integer num2, java.lang.Integer num3) {
        nativeAdaptOutputFormat(this.nativeAndroidVideoTrackSource, aspectRatio.width, aspectRatio.height, num, aspectRatio2.width, aspectRatio2.height, num2, num3);
    }

    public void onFrameCaptured(org.webrtc.VideoFrame videoFrame) {
        nativeOnFrameCaptured(this.nativeAndroidVideoTrackSource, videoFrame.getRotation(), videoFrame.getTimestampNs(), videoFrame.getBuffer());
    }

    public void setIsScreencast(boolean z17) {
        nativeSetIsScreencast(this.nativeAndroidVideoTrackSource, z17);
    }

    public void setState(boolean z17) {
        nativeSetState(this.nativeAndroidVideoTrackSource, z17);
    }
}
