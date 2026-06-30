package org.webrtc;

/* loaded from: classes16.dex */
public class DefaultVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    private final org.webrtc.VideoDecoderFactory hardwareVideoDecoderFactory;
    private final org.webrtc.VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final org.webrtc.VideoDecoderFactory softwareVideoDecoderFactory;

    public DefaultVideoDecoderFactory(org.webrtc.EglBase.Context context) {
        this.softwareVideoDecoderFactory = new org.webrtc.SoftwareVideoDecoderFactory();
        this.hardwareVideoDecoderFactory = new org.webrtc.HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new org.webrtc.PlatformSoftwareVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        org.webrtc.VideoDecoderFactory videoDecoderFactory;
        org.webrtc.VideoDecoder createDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        org.webrtc.VideoDecoder createDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (createDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            createDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        return (createDecoder2 == null || createDecoder == null) ? createDecoder2 != null ? createDecoder2 : createDecoder : new org.webrtc.VideoDecoderFallback(createDecoder, createDecoder2);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(java.util.Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(java.util.Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        org.webrtc.VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            linkedHashSet.addAll(java.util.Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return (org.webrtc.VideoCodecInfo[]) linkedHashSet.toArray(new org.webrtc.VideoCodecInfo[linkedHashSet.size()]);
    }

    public DefaultVideoDecoderFactory(org.webrtc.VideoDecoderFactory videoDecoderFactory) {
        this.softwareVideoDecoderFactory = new org.webrtc.SoftwareVideoDecoderFactory();
        this.hardwareVideoDecoderFactory = videoDecoderFactory;
        this.platformSoftwareVideoDecoderFactory = null;
    }
}
