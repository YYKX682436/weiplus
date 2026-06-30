package org.webrtc;

/* loaded from: classes16.dex */
class NativeCapturerObserver implements org.webrtc.CapturerObserver {
    private final org.webrtc.NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    public NativeCapturerObserver(long j17) {
        this.nativeAndroidVideoTrackSource = new org.webrtc.NativeAndroidVideoTrackSource(j17);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z17) {
        this.nativeAndroidVideoTrackSource.setState(z17);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(org.webrtc.VideoFrame videoFrame) {
        org.webrtc.VideoProcessor.FrameAdaptationParameters adaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (adaptFrame == null) {
            return;
        }
        org.webrtc.VideoFrame.Buffer cropAndScale = videoFrame.getBuffer().cropAndScale(adaptFrame.cropX, adaptFrame.cropY, adaptFrame.cropWidth, adaptFrame.cropHeight, adaptFrame.scaleWidth, adaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new org.webrtc.VideoFrame(cropAndScale, videoFrame.getRotation(), adaptFrame.timestampNs));
        cropAndScale.release();
    }
}
