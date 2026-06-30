package org.webrtc;

/* loaded from: classes15.dex */
class H264Utils {
    public static org.webrtc.VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC = new org.webrtc.VideoCodecInfo("H264", getDefaultH264Params(false));
    public static org.webrtc.VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC = new org.webrtc.VideoCodecInfo("H264", getDefaultH264Params(true));
    public static final java.lang.String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final java.lang.String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final java.lang.String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final java.lang.String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final java.lang.String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final java.lang.String H264_LEVEL_3_1 = "1f";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_HIGH = "640c";

    public static java.util.Map<java.lang.String, java.lang.String> getDefaultH264Params(boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("level-asymmetry-allowed", "1");
        hashMap.put("packetization-mode", "1");
        hashMap.put("profile-level-id", z17 ? "640c1f" : "42e01f");
        return hashMap;
    }

    public static boolean isSameH264Profile(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2) {
        return nativeIsSameH264Profile(map, map2);
    }

    private static native boolean nativeIsSameH264Profile(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2);
}
