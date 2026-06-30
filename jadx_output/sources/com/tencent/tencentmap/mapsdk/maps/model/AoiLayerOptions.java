package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class AoiLayerOptions {
    private int mMinLevel = -1;
    private int mMaxLevel = -1;

    public int getMaxLevel() {
        return this.mMaxLevel;
    }

    public int getMinLevel() {
        return this.mMinLevel;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.AoiLayerOptions setDisplayLevel(int i17, int i18) {
        if (i17 >= 0 && i18 >= 0 && i17 <= i18) {
            if (i17 < 3) {
                i17 = 3;
            }
            if (i18 > 20) {
                i18 = 20;
            }
            this.mMinLevel = i17;
            this.mMaxLevel = i18;
        }
        return this;
    }
}
