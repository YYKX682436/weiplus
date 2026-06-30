package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes15.dex */
public class j0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior f145885d;

    public j0(com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior) {
        this.f145885d = envelopeStoryBehavior;
        envelopeStoryBehavior.y();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior envelopeStoryBehavior = this.f145885d;
        envelopeStoryBehavior.B(intValue);
        com.google.android.material.appbar.g gVar = envelopeStoryBehavior.H;
        if (gVar != null) {
            gVar.a(envelopeStoryBehavior.f145798x, intValue);
        }
    }
}
