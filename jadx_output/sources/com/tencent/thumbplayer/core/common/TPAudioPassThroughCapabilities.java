package com.tencent.thumbplayer.core.common;

/* loaded from: classes13.dex */
public final class TPAudioPassThroughCapabilities {
    private static final int DEFAULT_MAX_CHANNEL_COUNT = 8;
    private static final java.lang.String EXTERNAL_SURROUND_SOUND_KEY = "external_surround_sound_enabled";
    private final int maxChannelCount;
    private final int[] supportedEncodings;
    public static final com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities DEFAULT_AUDIO_CAPABILITIES = new com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities(new int[]{2}, 8);
    private static final com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities EXTERNAL_SURROUND_SOUND_CAPABILITIES = new com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities(new int[]{2, 5, 6}, 8);

    public TPAudioPassThroughCapabilities(int[] iArr, int i17) {
        if (iArr != null) {
            int[] copyOf = java.util.Arrays.copyOf(iArr, iArr.length);
            this.supportedEncodings = copyOf;
            java.util.Arrays.sort(copyOf);
        } else {
            this.supportedEncodings = new int[0];
        }
        this.maxChannelCount = i17;
    }

    public static com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities getCapabilities(android.content.Context context) {
        return getCapabilities(context, context.registerReceiver(null, new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities)) {
            return false;
        }
        com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities tPAudioPassThroughCapabilities = (com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities) obj;
        return java.util.Arrays.equals(this.supportedEncodings, tPAudioPassThroughCapabilities.supportedEncodings) && this.maxChannelCount == tPAudioPassThroughCapabilities.maxChannelCount;
    }

    public int getMaxChannelCount() {
        return this.maxChannelCount;
    }

    public int hashCode() {
        return this.maxChannelCount + (java.util.Arrays.hashCode(this.supportedEncodings) * 31);
    }

    public boolean supportsEncoding(int i17) {
        return java.util.Arrays.binarySearch(this.supportedEncodings, i17) >= 0;
    }

    public java.lang.String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.maxChannelCount + ", supportedEncodings=" + java.util.Arrays.toString(this.supportedEncodings) + "]";
    }

    public static com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities getCapabilities(android.content.Context context, android.content.Intent intent) {
        if (intent != null && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 0) {
            return new com.tencent.thumbplayer.core.common.TPAudioPassThroughCapabilities(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        }
        return DEFAULT_AUDIO_CAPABILITIES;
    }
}
