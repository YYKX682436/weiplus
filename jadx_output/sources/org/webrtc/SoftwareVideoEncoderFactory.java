package org.webrtc;

/* loaded from: classes16.dex */
public class SoftwareVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    public static org.webrtc.VideoCodecInfo[] supportedCodecs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.VP8.toSdpCodecName(), new java.util.HashMap()));
        if (org.webrtc.LibvpxVp9Encoder.nativeIsSupported()) {
            arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.VP9.toSdpCodecName(), new java.util.HashMap()));
        }
        if (org.webrtc.LibaomAv1Encoder.nativeIsSupported()) {
            arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.AV1.toSdpCodecName(), new java.util.HashMap()));
        }
        return (org.webrtc.VideoCodecInfo[]) arrayList.toArray(new org.webrtc.VideoCodecInfo[arrayList.size()]);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        java.lang.String name = videoCodecInfo.getName();
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.VP8.toSdpCodecName())) {
            return new org.webrtc.LibvpxVp8Encoder();
        }
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.VP9.toSdpCodecName()) && org.webrtc.LibvpxVp9Encoder.nativeIsSupported()) {
            return new org.webrtc.LibvpxVp9Encoder();
        }
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.AV1.toSdpCodecName()) && org.webrtc.LibaomAv1Encoder.nativeIsSupported()) {
            return new org.webrtc.LibaomAv1Encoder();
        }
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}
