package org.webrtc;

/* loaded from: classes16.dex */
public interface VideoEncoderFactory {

    /* loaded from: classes15.dex */
    public interface VideoEncoderSelector {
        org.webrtc.VideoCodecInfo onAvailableBitrate(int i17);

        void onCurrentEncoder(org.webrtc.VideoCodecInfo videoCodecInfo);

        org.webrtc.VideoCodecInfo onEncoderBroken();
    }

    org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo videoCodecInfo);

    default org.webrtc.VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    default org.webrtc.VideoCodecInfo[] getImplementations() {
        return getSupportedCodecs();
    }

    org.webrtc.VideoCodecInfo[] getSupportedCodecs();
}
