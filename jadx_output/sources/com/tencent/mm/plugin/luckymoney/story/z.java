package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public int f145935d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145936e;

    public z(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145936e = envelopeAppBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        java.util.Objects.toString(valueAnimator.getAnimatedValue());
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        int i17 = intValue - this.f145935d;
        this.f145935d = intValue;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145936e;
        float f17 = (r2 - intValue) / (envelopeAppBarLayout.f145791x1 * 1.0f);
        int i18 = envelopeAppBarLayout.K1;
        envelopeAppBarLayout.offsetTopAndBottom(i17);
        if (i17 > 0) {
            envelopeAppBarLayout.R.offsetTopAndBottom((int) (i17 * 0.123f));
        } else {
            envelopeAppBarLayout.f145792y.setAlpha(f17);
        }
    }
}
