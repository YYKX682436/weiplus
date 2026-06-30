package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class y implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145931d;

    public y(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145931d = envelopeAppBarLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        int i17 = com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.f145773f2;
        this.f145931d.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        int i17 = com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout.f145773f2;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145931d;
        envelopeAppBarLayout.getClass();
        envelopeAppBarLayout.f145792y.setVisibility(0);
        envelopeAppBarLayout.f145792y.setAlpha(0.0f);
    }
}
