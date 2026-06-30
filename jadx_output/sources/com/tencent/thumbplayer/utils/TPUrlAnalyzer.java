package com.tencent.thumbplayer.utils;

/* loaded from: classes4.dex */
public class TPUrlAnalyzer {
    public static final int TP_URL_PROTOCOL_TYPE_FILE = 4;
    public static final int TP_URL_PROTOCOL_TYPE_HTTP = 0;
    public static final int TP_URL_PROTOCOL_TYPE_HTTPS = 1;
    public static final int TP_URL_PROTOCOL_TYPE_RESOURCELOADER = 5;
    public static final int TP_URL_PROTOCOL_TYPE_RTMP = 2;
    public static final int TP_URL_PROTOCOL_TYPE_UNKNOWN = -1;
    public static final int TP_URL_PROTOCOL_TYPE_WEBRTC = 3;
    private static java.util.Map<java.lang.String, java.lang.Integer> mPrefixToTypeMap;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface TPUrlType {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        mPrefixToTypeMap = hashMap;
        hashMap.put("http://", 0);
        mPrefixToTypeMap.put("https://", 1);
        mPrefixToTypeMap.put("rtmp://", 2);
        mPrefixToTypeMap.put("webrtc://", 3);
        mPrefixToTypeMap.put("file://", 4);
        mPrefixToTypeMap.put("/", 4);
    }

    public static int getUrlProtocolType(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        java.lang.String lowerCase = str.toLowerCase();
        for (java.util.Map.Entry<java.lang.String, java.lang.Integer> entry : mPrefixToTypeMap.entrySet()) {
            if (lowerCase.startsWith(entry.getKey())) {
                return entry.getValue().intValue();
            }
        }
        return new java.io.File(str).exists() ? 4 : -1;
    }
}
