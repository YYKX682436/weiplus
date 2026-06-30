package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class lf implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderMileStoneView f132599d;

    public lf(com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView, com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView2) {
        this.f132599d = finderMileStoneView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = this.f132599d;
        finderMileStoneView.getMileStoneCancelContainer().setEnabled(true);
        finderMileStoneView.getMileStoneSaveContainer().setEnabled(true);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.view.FinderMileStoneView finderMileStoneView = this.f132599d;
        finderMileStoneView.getMileStoneCardContainer().setScaleY(finderMileStoneView.getWholeScare());
        finderMileStoneView.getMileStoneCardContainer().setAlpha(1.0f);
        finderMileStoneView.getMileStoneCancelContainer().setEnabled(false);
        finderMileStoneView.getMileStoneSaveContainer().setEnabled(false);
        finderMileStoneView.getMileStoneLeftAvatar().setAlpha(0.0f);
        finderMileStoneView.getMileStoneRightAvatar().setAlpha(0.0f);
    }
}
