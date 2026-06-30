package org.webrtc;

/* loaded from: classes16.dex */
public class DefaultVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    private final org.webrtc.VideoEncoderFactory hardwareVideoEncoderFactory;
    private final org.webrtc.VideoEncoderFactory softwareVideoEncoderFactory = new org.webrtc.SoftwareVideoEncoderFactory();

    public DefaultVideoEncoderFactory(org.webrtc.EglBase.Context context, boolean z17, boolean z18) {
        this.hardwareVideoEncoderFactory = new org.webrtc.HardwareVideoEncoderFactory(context, z17, z18);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        org.webrtc.VideoEncoder createEncoder = this.softwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        org.webrtc.VideoEncoder createEncoder2 = this.hardwareVideoEncoderFactory.createEncoder(videoCodecInfo);
        return (createEncoder2 == null || createEncoder == null) ? createEncoder2 != null ? createEncoder2 : createEncoder : new org.webrtc.VideoEncoderFallback(createEncoder, createEncoder2);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(java.util.Arrays.asList(this.softwareVideoEncoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(java.util.Arrays.asList(this.hardwareVideoEncoderFactory.getSupportedCodecs()));
        return (org.webrtc.VideoCodecInfo[]) linkedHashSet.toArray(new org.webrtc.VideoCodecInfo[linkedHashSet.size()]);
    }

    public DefaultVideoEncoderFactory(org.webrtc.VideoEncoderFactory videoEncoderFactory) {
        this.hardwareVideoEncoderFactory = videoEncoderFactory;
    }
}
