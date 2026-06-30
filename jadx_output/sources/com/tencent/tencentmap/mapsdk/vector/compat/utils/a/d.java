package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f215389a;

    public d(com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f215389a = markerTranslateAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator, boolean z17) {
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener;
        int i17;
        double[] dArr;
        com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener markerTranslateStatusListener2;
        float f17;
        markerTranslateStatusListener = this.f215389a.f215422r;
        if (markerTranslateStatusListener != null) {
            i17 = this.f215389a.f215413i;
            dArr = this.f215389a.f215409e;
            if (i17 == dArr.length - 1) {
                markerTranslateStatusListener2 = this.f215389a.f215422r;
                f17 = this.f215389a.f215418n;
                markerTranslateStatusListener2.onInterpolateRotation(f17, com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator.MarkerTranslateStatusListener.AnimationStatus.AnimationComplete);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator, boolean z17) {
    }
}
