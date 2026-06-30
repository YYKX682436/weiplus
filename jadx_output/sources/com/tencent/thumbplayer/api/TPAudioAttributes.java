package com.tencent.thumbplayer.api;

/* loaded from: classes15.dex */
public class TPAudioAttributes {

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeContentType(3)
    public static final int TP_CONTENT_MOVIE = 3;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeContentType(2)
    public static final int TP_CONTENT_MUSIC = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeContentType(4)
    public static final int TP_CONTENT_SONIFICATION = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeContentType(1)
    public static final int TP_CONTENT_SPEECH = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeContentType(0)
    public static final int TP_CONTENT_UNKNOWN = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeFlag(1)
    public static final int TP_FLAG_AUDIBILITY_ENFORCED = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeFlag(16)
    public static final int TP_FLAG_HW_AV_SYNC = 16;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeFlag(256)
    public static final int TP_FLAG_LOW_LATENCY = 256;
    private static final int TP_FLAG_PUBLIC = 273;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeFlag(0)
    public static final int TP_FLAG_UNKNOWN = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(4)
    public static final int TP_STREAM_ALARM = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(8)
    public static final int TP_STREAM_DTMF = 8;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(3)
    public static final int TP_STREAM_MUSIC = 3;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(5)
    public static final int TP_STREAM_NOTIFICATION = 5;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(2)
    public static final int TP_STREAM_RING = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(1)
    public static final int TP_STREAM_SYSTEM = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(-1)
    public static final int TP_STREAM_UNKNOWN = -1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeStreamType(0)
    public static final int TP_STREAM_VOICE_CALL = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(4)
    public static final int TP_USAGE_ALARM = 4;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(11)
    public static final int TP_USAGE_ASSISTANCE_ACCESSIBILITY = 11;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(12)
    public static final int TP_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(13)
    public static final int TP_USAGE_ASSISTANCE_SONIFICATION = 13;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(16)
    public static final int TP_USAGE_ASSISTANT = 16;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(14)
    public static final int TP_USAGE_GAME = 14;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(1)
    public static final int TP_USAGE_MEDIA = 1;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(5)
    public static final int TP_USAGE_NOTIFICATION = 5;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(9)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(8)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(7)
    public static final int TP_USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(10)
    public static final int TP_USAGE_NOTIFICATION_EVENT = 10;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(6)
    public static final int TP_USAGE_NOTIFICATION_RINGTONE = 6;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(0)
    public static final int TP_USAGE_UNKNOWN = 0;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(2)
    public static final int TP_USAGE_VOICE_COMMUNICATION = 2;

    @com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMap.MapTPAudioAttributeUsage(3)
    public static final int TP_USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mMapContentTypeToAndroidMediaContentType;
    private static final java.util.HashMap<java.lang.Integer, java.lang.String> mMapContentTypeToString;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mMapUsageToAndroidMediaStreamType;
    private static final java.util.HashMap<java.lang.Integer, java.lang.Integer> mMapUsageToAndroidMediaUsage;
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

        public com.tencent.thumbplayer.api.TPAudioAttributes.Builder addFlags(int i17) {
            this.mFlags = (i17 & 273) | this.mFlags;
            return this;
        }

        public com.tencent.thumbplayer.api.TPAudioAttributes build() {
            com.tencent.thumbplayer.api.TPAudioAttributes tPAudioAttributes = new com.tencent.thumbplayer.api.TPAudioAttributes();
            tPAudioAttributes.mContentType = this.mContentType;
            tPAudioAttributes.mUsage = this.mUsage;
            tPAudioAttributes.mFlags = this.mFlags;
            return tPAudioAttributes;
        }

        public com.tencent.thumbplayer.api.TPAudioAttributes.Builder setContentType(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeContentType int i17) {
            if (com.tencent.thumbplayer.api.TPAudioAttributes.mMapContentTypeToString.containsKey(java.lang.Integer.valueOf(i17))) {
                this.mContentType = i17;
            } else {
                this.mContentType = 0;
            }
            return this;
        }

        public com.tencent.thumbplayer.api.TPAudioAttributes.Builder setFlag(int i17) {
            this.mFlags = i17 & 273;
            return this;
        }

        public com.tencent.thumbplayer.api.TPAudioAttributes.Builder setLegacyStreamType(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeStreamType int i17) {
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

        public com.tencent.thumbplayer.api.TPAudioAttributes.Builder setUsage(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeUsage int i17) {
            if (com.tencent.thumbplayer.api.TPAudioAttributes.mMapUsageToString.containsKey(java.lang.Integer.valueOf(i17))) {
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
    public @interface TPAudioAttributeContentType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPAudioAttributeFlag {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPAudioAttributeStreamType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    /* loaded from: classes6.dex */
    public @interface TPAudioAttributeUsage {
    }

    static {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = new java.util.HashMap<>();
        mMapContentTypeToString = hashMap;
        hashMap.put(0, "TP_CONTENT_UNKNOWN");
        hashMap.put(1, "TP_CONTENT_SPEECH");
        hashMap.put(2, "TP_CONTENT_MUSIC");
        hashMap.put(3, "TP_CONTENT_MOVIE");
        hashMap.put(4, "TP_CONTENT_SONIFICATION");
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap2 = new java.util.HashMap<>();
        mMapContentTypeToAndroidMediaContentType = hashMap2;
        hashMap2.put(0, 0);
        hashMap2.put(1, 1);
        hashMap2.put(2, 2);
        hashMap2.put(3, 3);
        hashMap2.put(4, 4);
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap3 = new java.util.HashMap<>();
        mMapUsageToString = hashMap3;
        hashMap3.put(0, "TP_USAGE_UNKNOWN");
        hashMap3.put(1, "TP_USAGE_MEDIA");
        hashMap3.put(2, "TP_USAGE_VOICE_COMMUNICATION");
        hashMap3.put(3, "TP_USAGE_VOICE_COMMUNICATION_SIGNALLING");
        hashMap3.put(4, "TP_USAGE_ALARM");
        hashMap3.put(5, "TP_USAGE_NOTIFICATION");
        hashMap3.put(6, "TP_USAGE_NOTIFICATION_RINGTONE");
        hashMap3.put(7, "TP_USAGE_NOTIFICATION_COMMUNICATION_REQUEST");
        hashMap3.put(8, "TP_USAGE_NOTIFICATION_COMMUNICATION_INSTANT");
        hashMap3.put(9, "TP_USAGE_NOTIFICATION_COMMUNICATION_DELAYED");
        hashMap3.put(10, "TP_USAGE_NOTIFICATION_EVENT");
        hashMap3.put(11, "TP_USAGE_ASSISTANCE_ACCESSIBILITY");
        hashMap3.put(12, "TP_USAGE_ASSISTANCE_NAVIGATION_GUIDANCE");
        hashMap3.put(13, "TP_USAGE_ASSISTANCE_SONIFICATION");
        hashMap3.put(14, "TP_USAGE_GAME");
        hashMap3.put(16, "TP_USAGE_ASSISTANT");
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap4 = new java.util.HashMap<>();
        mMapUsageToAndroidMediaUsage = hashMap4;
        hashMap4.put(0, 0);
        hashMap4.put(1, 1);
        hashMap4.put(2, 2);
        hashMap4.put(3, 3);
        hashMap4.put(4, 4);
        hashMap4.put(5, 5);
        hashMap4.put(6, 6);
        hashMap4.put(7, 7);
        hashMap4.put(8, 8);
        hashMap4.put(9, 9);
        hashMap4.put(10, 10);
        hashMap4.put(11, 11);
        hashMap4.put(12, 12);
        hashMap4.put(13, 13);
        hashMap4.put(14, 14);
        hashMap4.put(16, 16);
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap5 = new java.util.HashMap<>();
        mMapUsageToAndroidMediaStreamType = hashMap5;
        hashMap5.put(0, 3);
        hashMap5.put(1, 3);
        hashMap5.put(2, 0);
        hashMap5.put(3, 8);
        hashMap5.put(4, 4);
        hashMap5.put(5, 5);
        hashMap5.put(6, 2);
        hashMap5.put(7, 5);
        hashMap5.put(8, 5);
        hashMap5.put(9, 5);
        hashMap5.put(10, 5);
        hashMap5.put(12, 3);
        hashMap5.put(13, 1);
        hashMap5.put(14, 3);
        hashMap5.put(16, 3);
    }

    private static int contentTypeToAndroidMediaContentType(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeContentType int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = mMapContentTypeToAndroidMediaContentType;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        return 0;
    }

    public static java.lang.String contentTypeToString(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeContentType int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = mMapContentTypeToString;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown content type" + i17;
    }

    private static int flagsToAndroidMediaFlags(int i17) {
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        return (i17 & 256) != 0 ? i18 | 256 : i18;
    }

    public static int usageToAndroidMediaStreamType(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeUsage int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = mMapUsageToAndroidMediaStreamType;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        return 3;
    }

    private static int usageToAndroidMediaUsage(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeUsage int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.Integer> hashMap = mMapUsageToAndroidMediaUsage;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17)).intValue();
        }
        return 0;
    }

    public static java.lang.String usageToString(@com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeUsage int i17) {
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = mMapUsageToString;
        if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            return hashMap.get(java.lang.Integer.valueOf(i17));
        }
        return "unknown usage " + i17;
    }

    @com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeContentType
    public int getContentType() {
        return this.mContentType;
    }

    public int getFlags() {
        return this.mFlags & 273;
    }

    @com.tencent.thumbplayer.api.TPAudioAttributes.TPAudioAttributeUsage
    public int getUsage() {
        return this.mUsage;
    }

    public android.media.AudioAttributes toAndroidMediaAudioAttributes() {
        int usageToAndroidMediaUsage = usageToAndroidMediaUsage(this.mUsage);
        int contentTypeToAndroidMediaContentType = contentTypeToAndroidMediaContentType(this.mContentType);
        return new android.media.AudioAttributes.Builder().setContentType(contentTypeToAndroidMediaContentType).setUsage(usageToAndroidMediaUsage).setFlags(flagsToAndroidMediaFlags(this.mFlags)).build();
    }

    public java.lang.String toString() {
        return "AudioAttributes: usage=" + usageToString(this.mUsage) + " content=" + contentTypeToString(this.mContentType) + " flags=0x" + java.lang.Integer.toHexString(this.mFlags).toUpperCase();
    }

    private TPAudioAttributes() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
    }
}
