package org.webrtc;

/* loaded from: classes16.dex */
public interface VideoProcessor extends org.webrtc.CapturerObserver {

    /* loaded from: classes16.dex */
    public static class FrameAdaptationParameters {
        public final int cropHeight;
        public final int cropWidth;
        public final int cropX;
        public final int cropY;
        public final boolean drop;
        public final int scaleHeight;
        public final int scaleWidth;
        public final long timestampNs;

        public FrameAdaptationParameters(int i17, int i18, int i19, int i27, int i28, int i29, long j17, boolean z17) {
            this.cropX = i17;
            this.cropY = i18;
            this.cropWidth = i19;
            this.cropHeight = i27;
            this.scaleWidth = i28;
            this.scaleHeight = i29;
            this.timestampNs = j17;
            this.drop = z17;
        }
    }

    static org.webrtc.VideoFrame applyFrameAdaptationParameters(org.webrtc.VideoFrame videoFrame, org.webrtc.VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        if (frameAdaptationParameters.drop) {
            return null;
        }
        return new org.webrtc.VideoFrame(videoFrame.getBuffer().cropAndScale(frameAdaptationParameters.cropX, frameAdaptationParameters.cropY, frameAdaptationParameters.cropWidth, frameAdaptationParameters.cropHeight, frameAdaptationParameters.scaleWidth, frameAdaptationParameters.scaleHeight), videoFrame.getRotation(), frameAdaptationParameters.timestampNs);
    }

    default void onFrameCaptured(org.webrtc.VideoFrame videoFrame, org.webrtc.VideoProcessor.FrameAdaptationParameters frameAdaptationParameters) {
        org.webrtc.VideoFrame applyFrameAdaptationParameters = applyFrameAdaptationParameters(videoFrame, frameAdaptationParameters);
        if (applyFrameAdaptationParameters != null) {
            onFrameCaptured(applyFrameAdaptationParameters);
            applyFrameAdaptationParameters.release();
        }
    }

    void setSink(org.webrtc.VideoSink videoSink);
}
