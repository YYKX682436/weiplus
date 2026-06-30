package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145818d;

    public a0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145818d = envelopeAppBarLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145818d;
        envelopeAppBarLayout.R.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.story.TouchCoordinatorLayout touchCoordinatorLayout = envelopeAppBarLayout.f145789x;
        if (touchCoordinatorLayout != null) {
            touchCoordinatorLayout.E = false;
        }
        envelopeAppBarLayout.f145777c2 = true;
        envelopeAppBarLayout.q();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
