package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public class TPUnitendCodecUtils {
    private static int DolbyVisionProfileDvavPen = 1;
    private static int DolbyVisionProfileDvavPer = 0;
    private static int DolbyVisionProfileDvavSe = 9;
    private static int DolbyVisionProfileDvheDen = 3;
    private static int DolbyVisionProfileDvheDer = 2;
    private static int DolbyVisionProfileDvheDtb = 7;
    private static int DolbyVisionProfileDvheDth = 6;
    private static int DolbyVisionProfileDvheDtr = 4;
    private static int DolbyVisionProfileDvheSt = 8;
    private static int DolbyVisionProfileDvheStn = 5;
    private static java.util.HashMap<java.lang.String, java.lang.String> mSecureDecoderNameMaps;

    public static int convertOmxProfileToDolbyVision(int i17) {
        int i18 = i17 != 1 ? i17 != 2 ? i17 != 4 ? i17 != 8 ? i17 != 16 ? i17 != 32 ? i17 != 64 ? i17 != 128 ? i17 != 256 ? i17 != 512 ? 0 : DolbyVisionProfileDvavSe : DolbyVisionProfileDvheSt : DolbyVisionProfileDvheDtb : DolbyVisionProfileDvheDth : DolbyVisionProfileDvheStn : DolbyVisionProfileDvheDtr : DolbyVisionProfileDvheDen : DolbyVisionProfileDvheDer : DolbyVisionProfileDvavPen : DolbyVisionProfileDvavPer;
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "TPUnitendCodecUtils", "convertOmxProfileToDolbyVision omxProfile:" + i17 + " dolbyVisionProfile:" + i18);
        return i18;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bd, code lost:
    
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(2, "TPUnitendCodecUtils", "getDolbyVisionDecoderName name:" + r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.String getDolbyVisionDecoderName(java.lang.String r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPUnitendCodecUtils.getDolbyVisionDecoderName(java.lang.String, int, int, boolean):java.lang.String");
    }

    public static synchronized java.lang.String getSecureDecoderName(java.lang.String str) {
        android.media.MediaCodecInfo.CodecCapabilities codecCapabilities;
        synchronized (com.tencent.thumbplayer.core.common.TPUnitendCodecUtils.class) {
            java.lang.String str2 = null;
            if (!android.text.TextUtils.equals("video/avc", str) && !android.text.TextUtils.equals("video/hevc", str) && !android.text.TextUtils.equals("video/vvc", str) && !android.text.TextUtils.equals("video/dolby-vision", str)) {
                return null;
            }
            if (mSecureDecoderNameMaps == null) {
                mSecureDecoderNameMaps = new java.util.HashMap<>();
            }
            if (mSecureDecoderNameMaps.containsKey(str)) {
                return mSecureDecoderNameMaps.get(str);
            }
            android.media.MediaCodecInfo[] codecInfos = new android.media.MediaCodecList(1).getCodecInfos();
            if (codecInfos == null) {
                return null;
            }
            int length = codecInfos.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                android.media.MediaCodecInfo mediaCodecInfo = codecInfos[i17];
                if (!mediaCodecInfo.isEncoder()) {
                    try {
                        codecCapabilities = mediaCodecInfo.getCapabilitiesForType(str);
                    } catch (java.lang.Exception unused) {
                        codecCapabilities = null;
                    }
                    if (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback")) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    }
                }
                i17++;
            }
            mSecureDecoderNameMaps.put(str, str2);
            return str2;
        }
    }
}
