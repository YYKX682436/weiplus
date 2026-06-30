package org.webrtc;

/* loaded from: classes16.dex */
public interface VideoDecoderFactory {
    org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo);

    default org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        return new org.webrtc.VideoCodecInfo[0];
    }
}
