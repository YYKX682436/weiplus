package com.tencent.thumbplayer.api.capability;

/* loaded from: classes13.dex */
public class TPACodecCapabilityForGet {
    private int maxBitrate;
    private int maxChannels;
    private int maxLevel;
    private int maxProfile;
    private int maxSamplerate;

    public TPACodecCapabilityForGet(int i17, int i18, int i19, int i27, int i28) {
        this.maxSamplerate = i17;
        this.maxChannels = i18;
        this.maxBitrate = i19;
        this.maxProfile = i27;
        this.maxLevel = i28;
    }

    public int getMaxBitrate() {
        return this.maxBitrate;
    }

    public int getMaxChannels() {
        return this.maxChannels;
    }

    public int getMaxLevel() {
        return this.maxLevel;
    }

    public int getMaxProfile() {
        return this.maxProfile;
    }

    public int getMaxSamplerate() {
        return this.maxSamplerate;
    }
}
