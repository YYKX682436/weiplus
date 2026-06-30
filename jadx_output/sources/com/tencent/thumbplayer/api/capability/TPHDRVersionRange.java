package com.tencent.thumbplayer.api.capability;

/* loaded from: classes14.dex */
public class TPHDRVersionRange {
    public int lowerboundAndroidAPILevel;
    public int lowerboundPatchVersion;
    public int lowerboundSystemVersion;
    public int upperboundAndroidAPILevel;
    public int upperboundPatchVersion;
    public int upperboundSystemVersion;

    public TPHDRVersionRange(int i17, int i18, int i19, int i27) {
        this.upperboundSystemVersion = i17;
        this.lowerboundSystemVersion = i18;
        this.upperboundPatchVersion = i19;
        this.lowerboundPatchVersion = i27;
    }

    public TPHDRVersionRange(int i17, int i18) {
        this.upperboundAndroidAPILevel = i17;
        this.lowerboundAndroidAPILevel = i18;
    }
}
