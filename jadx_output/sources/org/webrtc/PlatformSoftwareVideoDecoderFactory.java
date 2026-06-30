package org.webrtc;

/* loaded from: classes16.dex */
public class PlatformSoftwareVideoDecoderFactory extends org.webrtc.MediaCodecVideoDecoderFactory {
    private static final org.webrtc.Predicate<android.media.MediaCodecInfo> defaultAllowedPredicate = new org.webrtc.Predicate<android.media.MediaCodecInfo>() { // from class: org.webrtc.PlatformSoftwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public boolean test(android.media.MediaCodecInfo mediaCodecInfo) {
            return org.webrtc.MediaCodecUtils.isSoftwareOnly(mediaCodecInfo);
        }
    };

    public PlatformSoftwareVideoDecoderFactory(org.webrtc.EglBase.Context context) {
        super(context, defaultAllowedPredicate);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }
}
