package com.tencent.thumbplayer.api.capability;

/* loaded from: classes14.dex */
public class TPVCodecCapabilityForGet {
    private static final int MAX_FRAME_RATE_FOR_LUMA_SAMPLES_DEFAULT = -1;
    private static final int MAX_LEVEL_DEFAULT = -1;
    private static final int MAX_LUMA_SAMPLES_DEFAULT = -1;
    private static final int MAX_PROFILE_DEFAULT = -1;
    public static final com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet mDefaultVCodecCapability = new com.tencent.thumbplayer.api.capability.TPVCodecCapabilityForGet(-1, -1, -1, -1);
    private int maxFramerateFormaxLumaSamples;
    private int maxLevel;
    private int maxLumaSamples;
    private int maxProfile;

    public TPVCodecCapabilityForGet(int i17, int i18, int i19, int i27) {
        this.maxLumaSamples = i17;
        this.maxProfile = i18;
        this.maxLevel = i19;
        this.maxFramerateFormaxLumaSamples = i27;
    }

    public int getMaxFramerateFormaxLumaSamples() {
        return this.maxFramerateFormaxLumaSamples;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public int getMaxLumaSamples() {
        return this.maxLumaSamples;
    }

    public int getMaxProfile() {
        return this.maxProfile;
    }
}
