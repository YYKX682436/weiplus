package org.webrtc;

/* loaded from: classes15.dex */
public class VideoCodecInfo {
    public static final java.lang.String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final java.lang.String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final java.lang.String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final java.lang.String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final java.lang.String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final java.lang.String H264_LEVEL_3_1 = "1f";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public final java.lang.String name;
    public final java.util.Map<java.lang.String, java.lang.String> params;

    @java.lang.Deprecated
    public final int payload;

    public VideoCodecInfo(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.payload = 0;
        this.name = str;
        this.params = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.webrtc.VideoCodecInfo)) {
            return false;
        }
        org.webrtc.VideoCodecInfo videoCodecInfo = (org.webrtc.VideoCodecInfo) obj;
        return this.name.equalsIgnoreCase(videoCodecInfo.name) && this.params.equals(videoCodecInfo.params);
    }

    public java.lang.String getName() {
        return this.name;
    }

    public java.util.Map getParams() {
        return this.params;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.name.toUpperCase(java.util.Locale.ROOT), this.params});
    }

    public java.lang.String toString() {
        return "VideoCodec{" + this.name + " " + this.params + "}";
    }

    @java.lang.Deprecated
    public VideoCodecInfo(int i17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.payload = i17;
        this.name = str;
        this.params = map;
    }
}
