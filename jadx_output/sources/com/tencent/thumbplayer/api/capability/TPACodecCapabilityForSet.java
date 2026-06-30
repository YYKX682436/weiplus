package com.tencent.thumbplayer.api.capability;

/* loaded from: classes14.dex */
public class TPACodecCapabilityForSet {
    private int level;
    private int lowerboundBitrate;
    private int lowerboundChannels;
    private int lowerboundSamplerate;
    private int profile;
    private int upperboundBitrate;
    private int upperboundChannels;
    private int upperboundSamplerate;

    public TPACodecCapabilityForSet(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        this.upperboundSamplerate = i17;
        this.upperboundChannels = i18;
        this.upperboundBitrate = i19;
        this.lowerboundSamplerate = i27;
        this.lowerboundChannels = i28;
        this.lowerboundBitrate = i29;
        this.profile = i37;
        this.level = i38;
    }

    public int getLevelForSet() {
        return this.level;
    }

    public int getLowerboundBitrate() {
        return this.lowerboundBitrate;
    }

    public int getLowerboundChannels() {
        return this.lowerboundChannels;
    }

    public int getLowerboundSamplerate() {
        return this.lowerboundSamplerate;
    }

    public int getProfileForSet() {
        return this.profile;
    }

    public int getUpperboundBitrate() {
        return this.upperboundBitrate;
    }

    public int getUpperboundChannels() {
        return this.upperboundChannels;
    }

    public int getUpperboundSamplerate() {
        return this.upperboundSamplerate;
    }

    public TPACodecCapabilityForSet(int i17, int i18, int i19) {
        this.upperboundSamplerate = i17;
        this.upperboundChannels = i18;
        this.upperboundBitrate = i19;
        this.lowerboundSamplerate = 0;
        this.lowerboundChannels = 0;
        this.lowerboundBitrate = 0;
        this.profile = 0;
        this.level = 0;
    }
}
