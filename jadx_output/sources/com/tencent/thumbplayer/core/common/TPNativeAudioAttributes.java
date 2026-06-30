package com.tencent.thumbplayer.core.common;

/* loaded from: classes15.dex */
public class TPNativeAudioAttributes {
    public static final int TP_NATIVE_CONTENT_MOVIE = 3;
    public static final int TP_NATIVE_CONTENT_MUSIC = 2;
    public static final int TP_NATIVE_CONTENT_SONIFICATION = 4;
    public static final int TP_NATIVE_CONTENT_SPEECH = 1;
    public static final int TP_NATIVE_CONTENT_UNKNOWN = 0;
    public static final int TP_NATIVE_FLAG_AUDIBILITY_ENFORCED = 1;
    public static final int TP_NATIVE_FLAG_HW_AV_SYNC = 16;
    public static final int TP_NATIVE_FLAG_LOW_LATENCY = 256;
    private static final int TP_NATIVE_FLAG_PUBLIC = 273;
    public static final int TP_NATIVE_FLAG_UNKNOWN = 0;
    public static final int TP_NATIVE_STREAM_ALARM = 4;
    public static final int TP_NATIVE_STREAM_DTMF = 8;
    public static final int TP_NATIVE_STREAM_MUSIC = 3;
    public static final int TP_NATIVE_STREAM_NOTIFICATION = 5;
    public static final int TP_NATIVE_STREAM_RING = 2;
    public static final int TP_NATIVE_STREAM_SYSTEM = 1;
    public static final int TP_NATIVE_STREAM_UNKNOWN = -1;
    public static final int TP_NATIVE_STREAM_VOICE_CALL = 0;
    public static final int TP_NATIVE_USAGE_ALARM = 4;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY = 11;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
    public static final int TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION = 13;
    public static final int TP_NATIVE_USAGE_ASSISTANT = 16;
    public static final int TP_NATIVE_USAGE_GAME = 14;
    public static final int TP_NATIVE_USAGE_MEDIA = 1;
    public static final int TP_NATIVE_USAGE_NOTIFICATION = 5;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_EVENT = 10;
    public static final int TP_NATIVE_USAGE_NOTIFICATION_RINGTONE = 6;
    public static final int TP_NATIVE_USAGE_UNKNOWN = 0;
    public static final int TP_NATIVE_USAGE_VOICE_COMMUNICATION = 2;
    public static final int TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> mMapContentTypeToString;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> mMapUsageToString;
    private int mContentType;
    private int mFlags;
    private int mUsage;

    /* loaded from: classes15.dex */
    public static class Builder {
        private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mMapStreamTypeToContentType;
        private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mMapStreamTypeToUsage;
        private int mUsage = 0;
        private int mContentType = 0;
        private int mFlags = 0;

        static {
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = new java.util.HashMap<>();
            mMapStreamTypeToContentType = hashMap;
            hashMap.put(-1, 0);
            hashMap.put(0, 1);
            hashMap.put(1, 4);
            hashMap.put(2, 4);
            hashMap.put(3, 2);
            hashMap.put(4, 4);
            hashMap.put(5, 4);
            hashMap.put(8, 4);
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap2 = new java.util.HashMap<>();
            mMapStreamTypeToUsage = hashMap2;
            hashMap2.put(-1, 0);
            hashMap2.put(0, 2);
            hashMap2.put(1, 13);
            hashMap2.put(2, 6);
            hashMap2.put(3, 1);
            hashMap2.put(4, 4);
            hashMap2.put(5, 5);
            hashMap2.put(8, 3);
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder addFlags(int i17) {
            this.mFlags = (i17 & 273) | this.mFlags;
            return this;
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes build() {
            com.tencent.thumbplayer.core.common.TPNativeAudioAttributes tPNativeAudioAttributes = new com.tencent.thumbplayer.core.common.TPNativeAudioAttributes();
            tPNativeAudioAttributes.mContentType = this.mContentType;
            tPNativeAudioAttributes.mUsage = this.mUsage;
            tPNativeAudioAttributes.mFlags = this.mFlags;
            return tPNativeAudioAttributes;
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder setContentType(@com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeContentType int i17) {
            if (com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.mMapContentTypeToString.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mContentType = i17;
            } else {
                this.mContentType = 0;
            }
            return this;
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder setFlags(int i17) {
            this.mFlags = i17 & 273;
            return this;
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder setLegacyStreamType(@com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeStreamType int i17) {
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = mMapStreamTypeToContentType;
            if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mContentType = hashMap.get(java.lang.Integer.valueOf(i17)).intValue();
            } else {
                this.mContentType = 0;
            }
            java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap2 = mMapStreamTypeToUsage;
            if (hashMap2.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mUsage = hashMap2.get(java.lang.Integer.valueOf(i17)).intValue();
            } else {
                this.mUsage = 0;
            }
            return this;
        }

        public com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.Builder setUsage(@com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeUsage int i17) {
            if (com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.mMapUsageToString.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mUsage = i17;
            } else {
                this.mUsage = 0;
            }
            return this;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeContentType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeFlag {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeStreamType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPNativeAudioAttributeUsage {
    }

    static {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        mMapContentTypeToString = hashMap;
        hashMap.put(0, "TP_NATIVE_CONTENT_UNKNOWN");
        hashMap.put(1, "TP_NATIVE_CONTENT_SPEECH");
        hashMap.put(2, "TP_NATIVE_CONTENT_MUSIC");
        hashMap.put(3, "TP_NATIVE_CONTENT_MOVIE");
        hashMap.put(4, "TP_NATIVE_CONTENT_SONIFICATION");
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap2 = new java.util.HashMap<>();
        mMapUsageToString = hashMap2;
        hashMap2.put(0, "TP_NATIVE_USAGE_UNKNOWN");
        hashMap2.put(1, "TP_NATIVE_USAGE_MEDIA");
        hashMap2.put(2, "TP_NATIVE_USAGE_VOICE_COMMUNICATION");
        hashMap2.put(3, "TP_NATIVE_USAGE_VOICE_COMMUNICATION_SIGNALLING");
        hashMap2.put(4, "TP_NATIVE_USAGE_ALARM");
        hashMap2.put(5, "TP_NATIVE_USAGE_NOTIFICATION");
        hashMap2.put(6, "TP_NATIVE_USAGE_NOTIFICATION_RINGTONE");
        hashMap2.put(7, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
        hashMap2.put(8, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
        hashMap2.put(9, "TP_NATIVE_USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
        hashMap2.put(10, "TP_NATIVE_USAGE_NOTIFICATION_EVENT");
        hashMap2.put(11, "TP_NATIVE_USAGE_ASSISTANCE_ACCESSIBILITY");
        hashMap2.put(12, "TP_NATIVE_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
        hashMap2.put(13, "TP_NATIVE_USAGE_ASSISTANCE_SONIFICATION");
        hashMap2.put(14, "TP_NATIVE_USAGE_GAME");
        hashMap2.put(16, "TP_NATIVE_USAGE_ASSISTANT");
    }

    public static java.lang.String contentTypeToString(@com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeContentType int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = mMapContentTypeToString;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown content type" + i17;
    }

    public static java.lang.String usageToString(@com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeUsage int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = mMapUsageToString;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown usage " + i17;
    }

    @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeContentType
    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        return this.mFlags & 273;
    }

    @com.tencent.thumbplayer.core.common.TPNativeAudioAttributes.TPNativeAudioAttributeUsage
    public int getUsage() {
        return this.mUsage;
    }

    public java.lang.String toString() {
        return "AudioAttributes: usage=" + usageToString(this.mUsage) + " content=" + contentTypeToString(this.mContentType) + " flags=0x" + java.lang.Integer.toHexString(this.mFlags).toUpperCase();
    }

    private TPNativeAudioAttributes() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
    }
}
