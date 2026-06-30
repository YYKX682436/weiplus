package org.webrtc;

/* loaded from: classes16.dex */
class MediaCodecVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    private static final java.lang.String TAG = "MediaCodecVideoDecoderFactory";
    private final org.webrtc.Predicate<android.media.MediaCodecInfo> codecAllowedPredicate;
    private final org.webrtc.EglBase.Context sharedContext;

    public MediaCodecVideoDecoderFactory(org.webrtc.EglBase.Context context, org.webrtc.Predicate<android.media.MediaCodecInfo> predicate) {
        this.sharedContext = context;
        this.codecAllowedPredicate = predicate;
    }

    private android.media.MediaCodecInfo findCodecForType(org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        int i17 = 0;
        while (true) {
            android.media.MediaCodecInfo mediaCodecInfo = null;
            if (i17 >= android.media.MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = android.media.MediaCodecList.getCodecInfoAt(i17);
            } catch (java.lang.IllegalArgumentException e17) {
                org.webrtc.Logging.e(TAG, "Cannot retrieve decoder codec info", e17);
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
            i17++;
        }
    }

    private boolean isCodecAllowed(android.media.MediaCodecInfo mediaCodecInfo) {
        org.webrtc.Predicate<android.media.MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isH264HighProfileSupported(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isSupportedCodec(android.media.MediaCodecInfo mediaCodecInfo, org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        mediaCodecInfo.getName();
        if (org.webrtc.MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) && org.webrtc.MediaCodecUtils.selectColorFormat(org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) != null) {
            return isCodecAllowed(mediaCodecInfo);
        }
        return false;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        org.webrtc.VideoCodecMimeType fromSdpCodecName = org.webrtc.VideoCodecMimeType.fromSdpCodecName(videoCodecInfo.getName());
        android.media.MediaCodecInfo findCodecForType = findCodecForType(fromSdpCodecName);
        if (findCodecForType == null) {
            return null;
        }
        return new org.webrtc.AndroidVideoDecoder(new org.webrtc.MediaCodecWrapperFactoryImpl(), findCodecForType.getName(), fromSdpCodecName, org.webrtc.MediaCodecUtils.selectColorFormat(org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(fromSdpCodecName.mimeType())).intValue(), this.sharedContext);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.webrtc.VideoCodecMimeType[] videoCodecMimeTypeArr = {org.webrtc.VideoCodecMimeType.VP8, org.webrtc.VideoCodecMimeType.VP9, org.webrtc.VideoCodecMimeType.H264, org.webrtc.VideoCodecMimeType.AV1};
        for (int i17 = 0; i17 < 4; i17++) {
            org.webrtc.VideoCodecMimeType videoCodecMimeType = videoCodecMimeTypeArr[i17];
            android.media.MediaCodecInfo findCodecForType = findCodecForType(videoCodecMimeType);
            if (findCodecForType != null) {
                java.lang.String sdpCodecName = videoCodecMimeType.toSdpCodecName();
                if (videoCodecMimeType == org.webrtc.VideoCodecMimeType.H264 && isH264HighProfileSupported(findCodecForType)) {
                    arrayList.add(new org.webrtc.VideoCodecInfo(sdpCodecName, org.webrtc.MediaCodecUtils.getCodecProperties(videoCodecMimeType, true)));
                }
                arrayList.add(new org.webrtc.VideoCodecInfo(sdpCodecName, org.webrtc.MediaCodecUtils.getCodecProperties(videoCodecMimeType, false)));
            }
        }
        return (org.webrtc.VideoCodecInfo[]) arrayList.toArray(new org.webrtc.VideoCodecInfo[arrayList.size()]);
    }
}
