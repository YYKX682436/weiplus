package org.webrtc;

/* loaded from: classes16.dex */
enum VideoCodecMimeType {
    VP8("video/x-vnd.on2.vp8"),
    VP9("video/x-vnd.on2.vp9"),
    H264("video/avc"),
    AV1("video/av01");

    private final java.lang.String mimeType;

    VideoCodecMimeType(java.lang.String str) {
        this.mimeType = str;
    }

    public static org.webrtc.VideoCodecMimeType fromSdpCodecName(java.lang.String str) {
        return str.equals("AV1X") ? AV1 : valueOf(str);
    }

    public java.lang.String mimeType() {
        return this.mimeType;
    }

    public java.lang.String toSdpCodecName() {
        return this == AV1 ? "AV1X" : name();
    }
}
