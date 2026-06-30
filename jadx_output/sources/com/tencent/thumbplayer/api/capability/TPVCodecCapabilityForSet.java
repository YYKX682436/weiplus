package com.tencent.thumbplayer.api.capability;

/* loaded from: classes14.dex */
public class TPVCodecCapabilityForSet {
    private int level;
    private int lowerboundHeight;
    private int lowerboundWidth;
    private int profile;
    private int upperboundHeight;
    private int upperboundWidth;

    public TPVCodecCapabilityForSet(int i17, int i18, int i19, int i27, int i28, int i29) {
        this.upperboundWidth = i17;
        this.upperboundHeight = i18;
        this.lowerboundWidth = i19;
        this.lowerboundHeight = i27;
        this.profile = i28;
        this.level = i29;
    }

    public int getLevel() {
        return this.level;
    }

    public int getLowerboundHeight() {
        return this.lowerboundHeight;
    }

    public int getLowerboundWidth() {
        return this.lowerboundWidth;
    }

    public int getProfile() {
        return this.profile;
    }

    public int getUpperboundHeight() {
        return this.upperboundHeight;
    }

    public int getUpperboundWidth() {
        return this.upperboundWidth;
    }

    public TPVCodecCapabilityForSet(int i17, int i18) {
        this.upperboundWidth = i17;
        this.upperboundHeight = i18;
        this.lowerboundWidth = 0;
        this.lowerboundHeight = 0;
        this.profile = -1;
        this.level = -1;
    }

    public TPVCodecCapabilityForSet(int i17, int i18, int i19) {
        this.upperboundWidth = i17;
        this.upperboundHeight = i18;
        this.profile = i19;
        this.lowerboundWidth = 0;
        this.lowerboundHeight = 0;
        this.level = -1;
    }
}
