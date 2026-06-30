package org.webrtc;

/* loaded from: classes16.dex */
public class SoftwareVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    public static org.webrtc.VideoCodecInfo[] supportedCodecs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.VP8.toSdpCodecName(), new java.util.HashMap()));
        if (org.webrtc.LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.VP9.toSdpCodecName(), new java.util.HashMap()));
        }
        if (org.webrtc.LibaomAv1Decoder.nativeIsSupported()) {
            arrayList.add(new org.webrtc.VideoCodecInfo(org.webrtc.VideoCodecMimeType.AV1.toSdpCodecName(), new java.util.HashMap()));
        }
        return (org.webrtc.VideoCodecInfo[]) arrayList.toArray(new org.webrtc.VideoCodecInfo[arrayList.size()]);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        java.lang.String name = videoCodecInfo.getName();
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.VP8.toSdpCodecName())) {
            return new org.webrtc.LibvpxVp8Decoder();
        }
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.VP9.toSdpCodecName()) && org.webrtc.LibvpxVp9Decoder.nativeIsSupported()) {
            return new org.webrtc.LibvpxVp9Decoder();
        }
        if (name.equalsIgnoreCase(org.webrtc.VideoCodecMimeType.AV1.toSdpCodecName()) && org.webrtc.LibaomAv1Decoder.nativeIsSupported()) {
            return new org.webrtc.LibaomAv1Decoder();
        }
        return null;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        return supportedCodecs();
    }
}
