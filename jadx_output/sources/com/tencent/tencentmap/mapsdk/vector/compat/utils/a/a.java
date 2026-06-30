package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f215381a;

    public a(com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f215381a = markerTranslateAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator, boolean z17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener;
        int i17;
        double[] dArr;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener2;
        com.tencent.mapsdk.raster.model.LatLng latLng;
        int i18;
        markerTranslateStatusListener = this.f215381a.f215422r;
        if (markerTranslateStatusListener != null) {
            i17 = this.f215381a.f215413i;
            dArr = this.f215381a.f215409e;
            if (i17 == dArr.length - 1) {
                markerTranslateStatusListener2 = this.f215381a.f215422r;
                latLng = this.f215381a.f215412h;
                i18 = this.f215381a.f215413i;
                markerTranslateStatusListener2.onInterpolatePoint(latLng, i18, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus.AnimationComplete);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
    }
}
