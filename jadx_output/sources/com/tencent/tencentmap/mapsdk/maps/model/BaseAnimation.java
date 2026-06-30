package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public abstract class BaseAnimation implements com.tencent.tencentmap.mapsdk.maps.model.Animation {
    private com.tencent.tencentmap.mapsdk.maps.model.AnimationListener mAnimationListener;
    private long mDuration;
    private android.view.animation.Interpolator mInterpolator;

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public com.tencent.tencentmap.mapsdk.maps.model.AnimationListener getAnimationListener() {
        return this.mAnimationListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public long getDuration() {
        return this.mDuration;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public android.view.animation.Interpolator getInterpolator() {
        return this.mInterpolator;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setAnimationListener(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener) {
        this.mAnimationListener = animationListener;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setDuration(long j17) {
        this.mDuration = j17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.Animation
    public void setInterpolator(android.view.animation.Interpolator interpolator) {
        this.mInterpolator = interpolator;
    }
}
