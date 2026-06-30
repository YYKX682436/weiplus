package org.webrtc;

/* loaded from: classes16.dex */
public class HardwareVideoDecoderFactory extends org.webrtc.MediaCodecVideoDecoderFactory {
    private static final org.webrtc.Predicate<android.media.MediaCodecInfo> defaultAllowedPredicate = new org.webrtc.Predicate<android.media.MediaCodecInfo>() { // from class: org.webrtc.HardwareVideoDecoderFactory.1
        @Override // org.webrtc.Predicate
        public boolean test(android.media.MediaCodecInfo mediaCodecInfo) {
            return org.webrtc.MediaCodecUtils.isHardwareAccelerated(mediaCodecInfo);
        }
    };

    @java.lang.Deprecated
    public HardwareVideoDecoderFactory() {
        this(null);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        return super.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        return super.getSupportedCodecs();
    }

    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context context) {
        this(context, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HardwareVideoDecoderFactory(org.webrtc.EglBase.Context r2, org.webrtc.Predicate<android.media.MediaCodecInfo> r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            org.webrtc.Predicate<android.media.MediaCodecInfo> r3 = org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            goto Lb
        L5:
            org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            org.webrtc.Predicate r3 = r3.and(r0)
        Lb:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoDecoderFactory.<init>(org.webrtc.EglBase$Context, org.webrtc.Predicate):void");
    }
}
