package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public interface Animation {
    com.tencent.tencentmap.mapsdk.maps.model.AnimationListener getAnimationListener();

    long getDuration();

    android.view.animation.Interpolator getInterpolator();

    void setAnimationListener(com.tencent.tencentmap.mapsdk.maps.model.AnimationListener animationListener);

    void setDuration(long j17);

    void setInterpolator(android.view.animation.Interpolator interpolator);
}
