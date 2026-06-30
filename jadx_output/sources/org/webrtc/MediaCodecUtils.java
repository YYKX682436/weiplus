package org.webrtc;

/* loaded from: classes16.dex */
class MediaCodecUtils {
    static final java.lang.String EXYNOS_PREFIX = "OMX.Exynos.";
    static final java.lang.String INTEL_PREFIX = "OMX.Intel.";
    static final java.lang.String NVIDIA_PREFIX = "OMX.Nvidia.";
    static final java.lang.String QCOM_PREFIX = "OMX.qcom.";
    private static final java.lang.String TAG = "MediaCodecUtils";
    static final java.lang.String[] SOFTWARE_IMPLEMENTATION_PREFIXES = {"OMX.google.", "OMX.SEC.", "c2.android"};
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    static final int[] DECODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka, COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    static final int[] ENCODER_COLOR_FORMATS = {19, 21, 2141391872, COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m};
    static final int[] TEXTURE_COLOR_FORMATS = getTextureColorFormats();

    /* renamed from: org.webrtc.MediaCodecUtils$1, reason: invalid class name */
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
                $SwitchMap$org$webrtc$VideoCodecMimeType[org.webrtc.VideoCodecMimeType.AV1.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$webrtc$VideoCodecMimeType[org.webrtc.VideoCodecMimeType.H264.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    private MediaCodecUtils() {
    }

    public static boolean codecSupportsType(android.media.MediaCodecInfo mediaCodecInfo, org.webrtc.VideoCodecMimeType videoCodecMimeType) {
        for (java.lang.String str : mediaCodecInfo.getSupportedTypes()) {
            if (videoCodecMimeType.mimeType().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static java.util.Map<java.lang.String, java.lang.String> getCodecProperties(org.webrtc.VideoCodecMimeType videoCodecMimeType, boolean z17) {
        int i17 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType[videoCodecMimeType.ordinal()];
        if (i17 == 1 || i17 == 2 || i17 == 3) {
            return new java.util.HashMap();
        }
        if (i17 == 4) {
            return org.webrtc.H264Utils.getDefaultH264Params(z17);
        }
        throw new java.lang.IllegalArgumentException("Unsupported codec: " + videoCodecMimeType);
    }

    private static int[] getTextureColorFormats() {
        return new int[]{com.tencent.tav.decoder.EncoderWriter.OUTPUT_VIDEO_COLOR_FORMAT};
    }

    public static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo) {
        return android.os.Build.VERSION.SDK_INT >= 29 ? isHardwareAcceleratedQOrHigher(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo);
    }

    private static boolean isHardwareAcceleratedQOrHigher(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return isSoftwareOnlyQOrHigher(mediaCodecInfo);
        }
        java.lang.String name = mediaCodecInfo.getName();
        for (java.lang.String str : SOFTWARE_IMPLEMENTATION_PREFIXES) {
            if (name.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSoftwareOnlyQOrHigher(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    public static java.lang.Integer selectColorFormat(int[] iArr, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        for (int i17 : iArr) {
            for (int i18 : codecCapabilities.colorFormats) {
                if (i18 == i17) {
                    return java.lang.Integer.valueOf(i18);
                }
            }
        }
        return null;
    }
}
