package com.tencent.tencentmap.mapsdk.vector.compat.utils.a;

/* loaded from: classes13.dex */
public class c implements android.animation.Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator f215388a;

    public c(com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.MarkerTranslateAnimator markerTranslateAnimator) {
        this.f215388a = markerTranslateAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f215388a.f215421q = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f215388a.f215421q = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
