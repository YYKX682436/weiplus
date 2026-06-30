package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ff implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f132105d;

    public ff(com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView) {
        this.f132105d = finderMileStoneView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        hc2.f1.d(this.f132105d);
    }
}
