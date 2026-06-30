package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes6.dex */
public class MaskLayerOptions {
    private int mColor = 0;
    private long mAnimationDuration = 0;
    private int mZIndex = 0;

    public com.tencent.tencentmap.mapsdk.maps.model.MaskLayerOptions animationDuration(long j17) {
        this.mAnimationDuration = j17;
        return this;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MaskLayerOptions color(int i17) {
        this.mColor = i17;
        return this;
    }

    public long getAnimationDuration() {
        return this.mAnimationDuration;
    }

    public int getColor() {
        return this.mColor;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.MaskLayerOptions zIndex(int i17) {
        this.mZIndex = i17;
        return this;
    }
}
