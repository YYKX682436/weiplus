package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f215390a;

    public e(com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f215390a = markerTranslateAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float f17;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener2;
        float f18;
        this.f215390a.f215418n = java.lang.Float.parseFloat(java.lang.String.valueOf(valueAnimator.getAnimatedValue()));
        if (this.f215390a.getObject() == null) {
            return;
        }
        com.tencent.mapsdk.raster.model.Marker marker = (com.tencent.mapsdk.raster.model.Marker) this.f215390a.getObject();
        f17 = this.f215390a.f215418n;
        marker.setRotation(f17);
        markerTranslateStatusListener = this.f215390a.f215422r;
        if (markerTranslateStatusListener != null) {
            markerTranslateStatusListener2 = this.f215390a.f215422r;
            f18 = this.f215390a.f215418n;
            markerTranslateStatusListener2.onInterpolateRotation(f18, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus.AnimationInterpolating);
        }
    }
}
