package com.tencent.tencentmap.mapsdk.maps.model;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class AnimationSet extends com.tencent.tencentmap.mapsdk.maps.model.BaseAnimation {
    public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Animation> mAnimations = new java.util.ArrayList();
    public boolean mShareInterpolator;

    public AnimationSet(boolean z17) {
        this.mShareInterpolator = z17;
    }

    public boolean addAnimation(com.tencent.tencentmap.mapsdk.maps.model.Animation animation) {
        this.mAnimations.add(animation);
        return true;
    }

    public void cleanAnimation() {
        this.mAnimations.clear();
    }
}
