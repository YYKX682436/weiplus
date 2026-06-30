package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes15.dex */
public class i0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior f145883d;

    public i0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior) {
        this.f145883d = envelopeStoryBehavior;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior = this.f145883d;
        envelopeStoryBehavior.B(-(envelopeStoryBehavior.f145798x.getTotalScrollRange() - envelopeStoryBehavior.E));
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
