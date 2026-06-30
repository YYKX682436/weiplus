package org.webrtc;

/* loaded from: classes16.dex */
public class HardwareVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    private static final java.util.List<java.lang.String> H264_HW_EXCEPTION_MODELS = java.util.Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final java.lang.String TAG = "HardwareVideoEncoderFactory";
    private final org.webrtc.Predicate<android.media.MediaCodecInfo> codecAllowedPredicate;
    private final boolean enableH264HighProfile;
    private final boolean enableIntelVp8Encoder;
    private final org.webrtc.EglBase14.Context sharedContext;

    /* renamed from: org.webrtc.HardwareVideoEncoderFactory$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType;

        static {
            int[] iArr = new int[org.webrtc.VideoCodecMimeType.values().length];
            $SwitchMap$org$webrtc$VideoCodecMimeType = iArr;
            try {
                iArr[org.webrtc.VideoCodecMimeType.VP8.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[org.webrtc.VideoCodecMimeType.VP9.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[org.webrtc.VideoCodecMimeType.H264.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[org.webrtc.VideoCodecMimeType.AV1.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public HardwareVideoEncoderFactory(org.webrtc.EglBase.Context context, boolean z17, boolean z18) {
        this(context, z17, z18, null);
    }

    private org.webrtc.BitrateAdjuster createBitrateAdjuster(org.webrtc.VideoCodecMimeType videoCodecMimeType, java.lang.String str) {
        return str.startsWith("OMX.Exynos.") ? videoCodecMimeType == org.webrtc.VideoCodecMimeType.VP8 ? new org.webrtc.DynamicBitrateAdjuster() : new org.webrtc.FramerateBitrateAdjuster() : new org.webrtc.BaseBitrateAdjuster();
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
                org.webrtc.Logging.e(TAG, "Cannot retrieve encoder codec info", e17);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecMimeType)) {
                return mediaCodecInfo;
            }
            i17++;
        }
    }

    private int getForcedKeyFrameIntervalMs(org.webrtc.VideoCodecMimeType videoCodecMimeType, java.lang.String str) {
        return (videoCodecMimeType == org.webrtc.VideoCodecMimeType.VP8 && str.startsWith("OMX.qcom.")) ? 15000 : 0;
    }

    private int getKeyFrameIntervalSec(org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        int i17 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i17 == 1 || i17 == 2) {
            return 100;
        }
        if (i17 == 3) {
            return 20;
        }
        if (i17 == 4) {
            return 100;
        }
        throw new java.lang.IllegalArgumentException("Unsupported VideoCodecMimeType " + videoCodecMimeType);
    }

    private boolean isH264HighProfileSupported(android.media.MediaCodecInfo mediaCodecInfo) {
        return this.enableH264HighProfile && mediaCodecInfo.getName().startsWith("OMX.Exynos.");
    }

    private boolean isHardwareSupportedInCurrentSdk(android.media.MediaCodecInfo mediaCodecInfo, org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        int i17 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i17 == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i17 == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i17 != 3) {
            return false;
        }
        return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
    }

    private boolean isHardwareSupportedInCurrentSdkH264(android.media.MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(android.os.Build.MODEL)) {
            return false;
        }
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") || (name.startsWith("OMX.Intel.") && this.enableIntelVp8Encoder);
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(android.media.MediaCodecInfo mediaCodecInfo) {
        java.lang.String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    private boolean isMediaCodecAllowed(android.media.MediaCodecInfo mediaCodecInfo) {
        org.webrtc.Predicate<android.media.MediaCodecInfo> predicate = this.codecAllowedPredicate;
        if (predicate == null) {
            return true;
        }
        return predicate.test(mediaCodecInfo);
    }

    private boolean isSupportedCodec(android.media.MediaCodecInfo mediaCodecInfo, org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        return org.webrtc.MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecMimeType) && org.webrtc.MediaCodecUtils.selectColorFormat(org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecMimeType.mimeType())) != null && isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecMimeType) && isMediaCodecAllowed(mediaCodecInfo);
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo videoCodecInfo) {
        org.webrtc.VideoCodecMimeType fromSdpCodecName = org.webrtc.VideoCodecMimeType.fromSdpCodecName(videoCodecInfo.getName());
        android.media.MediaCodecInfo findCodecForType = findCodecForType(fromSdpCodecName);
        if (findCodecForType == null) {
            return null;
        }
        java.lang.String name = findCodecForType.getName();
        java.lang.String mimeType = fromSdpCodecName.mimeType();
        java.lang.Integer selectColorFormat = org.webrtc.MediaCodecUtils.selectColorFormat(org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        java.lang.Integer selectColorFormat2 = org.webrtc.MediaCodecUtils.selectColorFormat(org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS, findCodecForType.getCapabilitiesForType(mimeType));
        if (fromSdpCodecName == org.webrtc.VideoCodecMimeType.H264) {
            boolean isSameH264Profile = org.webrtc.H264Utils.isSameH264Profile(videoCodecInfo.params, org.webrtc.MediaCodecUtils.getCodecProperties(fromSdpCodecName, true));
            boolean isSameH264Profile2 = org.webrtc.H264Utils.isSameH264Profile(videoCodecInfo.params, org.webrtc.MediaCodecUtils.getCodecProperties(fromSdpCodecName, false));
            if (!isSameH264Profile && !isSameH264Profile2) {
                return null;
            }
            if (isSameH264Profile && !isH264HighProfileSupported(findCodecForType)) {
                return null;
            }
        }
        return new org.webrtc.HardwareVideoEncoder(new org.webrtc.MediaCodecWrapperFactoryImpl(), name, fromSdpCodecName, selectColorFormat, selectColorFormat2, videoCodecInfo.params, getKeyFrameIntervalSec(fromSdpCodecName), getForcedKeyFrameIntervalMs(fromSdpCodecName, name), createBitrateAdjuster(fromSdpCodecName, name), this.sharedContext);
    }

    @Override // org.webrtc.VideoEncoderFactory
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

    public HardwareVideoEncoderFactory(org.webrtc.EglBase.Context context, boolean z17, boolean z18, org.webrtc.Predicate<android.media.MediaCodecInfo> predicate) {
        if (context instanceof org.webrtc.EglBase14.Context) {
            this.sharedContext = (org.webrtc.EglBase14.Context) context;
        } else {
            org.webrtc.Logging.w(TAG, "No shared EglBase.Context.  Encoders will not use texture mode.");
            this.sharedContext = null;
        }
        this.enableIntelVp8Encoder = z17;
        this.enableH264HighProfile = z18;
        this.codecAllowedPredicate = predicate;
    }

    @java.lang.Deprecated
    public HardwareVideoEncoderFactory(boolean z17, boolean z18) {
        this(null, z17, z18);
    }
}
