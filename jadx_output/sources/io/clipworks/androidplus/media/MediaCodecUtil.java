package io.clipworks.androidplus.media;

/* loaded from: classes10.dex */
public class MediaCodecUtil {
    private static final int SDK_INT;
    private static final java.lang.String TAG = "MediaCodecUtil";

    static {
        java.lang.String str = android.os.Build.VERSION.CODENAME;
        SDK_INT = androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH.equals(str) ? 31 : "R".equals(str) ? 30 : android.os.Build.VERSION.SDK_INT;
    }

    private MediaCodecUtil() {
    }

    private static synchronized java.util.List<android.media.MediaCodecInfo> getCodecInfos(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.util.ArrayList arrayList;
        synchronized (io.clipworks.androidplus.media.MediaCodecUtil.class) {
            android.media.MediaCodecList mediaCodecList = new android.media.MediaCodecList(1);
            arrayList = new java.util.ArrayList();
            for (android.media.MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
                if (mediaCodecInfo.isEncoder() == z17) {
                    try {
                        mediaCodecInfo.getCapabilitiesForType(str);
                        if (isHardwareAccelerated(mediaCodecInfo) == z18 && isSecureCodec(mediaCodecInfo) == z19) {
                            arrayList.add(mediaCodecInfo);
                            mediaCodecInfo.getName();
                        }
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
            }
        }
        return arrayList;
    }

    public static android.media.MediaCodecInfo getDecoderInfo(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> decoderInfos = getDecoderInfos(str, z17, z18);
        if (decoderInfos.isEmpty()) {
            return null;
        }
        return decoderInfos.get(0);
    }

    public static synchronized java.util.List<android.media.MediaCodecInfo> getDecoderInfos(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> codecInfos;
        synchronized (io.clipworks.androidplus.media.MediaCodecUtil.class) {
            codecInfos = getCodecInfos(str, false, z17, z18);
        }
        return codecInfos;
    }

    public static synchronized java.util.List<android.media.MediaCodecInfo> getEncoderInfos(java.lang.String str, boolean z17, boolean z18) {
        java.util.List<android.media.MediaCodecInfo> codecInfos;
        synchronized (io.clipworks.androidplus.media.MediaCodecUtil.class) {
            codecInfos = getCodecInfos(str, true, z17, z18);
        }
        return codecInfos;
    }

    private static boolean isHardwareAccelerated(android.media.MediaCodecInfo mediaCodecInfo) {
        return SDK_INT >= 29 ? isHardwareAcceleratedV29(mediaCodecInfo) : !isSoftwareOnly(mediaCodecInfo);
    }

    private static boolean isHardwareAcceleratedV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean isSecureCodec(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.getName().endsWith(".secure");
    }

    private static boolean isSoftwareOnly(android.media.MediaCodecInfo mediaCodecInfo) {
        if (SDK_INT >= 29) {
            return isSoftwareOnlyV29(mediaCodecInfo);
        }
        java.lang.String lowerCase = mediaCodecInfo.getName().toLowerCase();
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean isSoftwareOnlyV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean isVendor(android.media.MediaCodecInfo mediaCodecInfo) {
        if (SDK_INT >= 29) {
            return isVendorV29(mediaCodecInfo);
        }
        java.lang.String lowerCase = mediaCodecInfo.getName().toLowerCase();
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean isVendorV29(android.media.MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static void selectProfileAndLevel(android.media.MediaFormat mediaFormat, boolean z17) {
        android.media.MediaCodecInfo mediaCodecInfo;
        int i17;
        int i18;
        int i19 = 0;
        java.util.List<android.media.MediaCodecInfo> encoderInfos = getEncoderInfos("video/avc", true, false);
        if (encoderInfos.isEmpty() || (mediaCodecInfo = encoderInfos.get(0)) == null) {
            return;
        }
        android.media.MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/avc");
        int i27 = -1;
        if (capabilitiesForType.profileLevels != null) {
            i17 = -1;
            while (true) {
                android.media.MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                if (i19 >= codecProfileLevelArr.length) {
                    break;
                }
                android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i19];
                int i28 = codecProfileLevel.profile;
                if (i28 <= 8) {
                    if (i28 > i27) {
                        i17 = codecProfileLevel.level;
                        i27 = i28;
                    } else if (i28 == i27 && (i18 = codecProfileLevel.level) > i17) {
                        i17 = i18;
                    }
                }
                i19++;
            }
        } else {
            i17 = -1;
        }
        if (i27 == 8) {
            if (z17 && i17 >= 65536) {
                i17 = 65536;
            }
            mediaFormat.setInteger(com.google.android.gms.common.Scopes.PROFILE, i27);
            mediaFormat.setInteger(ya.b.LEVEL, i17);
            java.lang.String.format("selectProfileAndLevel: 0x%x, 0x%x", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i17));
        }
    }
}
