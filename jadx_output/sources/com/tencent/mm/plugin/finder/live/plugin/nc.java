package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public final int f113608a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f113609b = jz5.h.b(com.tencent.mm.plugin.finder.live.plugin.mc.f113485d);

    public nc(int i17) {
        this.f113608a = i17;
    }

    public static final void a(com.tencent.mm.plugin.finder.live.plugin.nc ncVar, android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.live.plugin.jc jcVar) {
        ncVar.getClass();
        view.setScaleX(jcVar.f113079a);
        view.setScaleY(jcVar.f113080b);
        android.graphics.drawable.Drawable drawable = jcVar.f113081c;
        if (drawable == null) {
            ncVar.d(view2, jcVar.f113082d);
        } else {
            if (view2 == null) {
                return;
            }
            view2.setBackground(drawable);
        }
    }

    public final android.animation.AnimatorSet b(android.view.View view, android.view.View view2, float f17, float f18, int i17, int i18, long j17, android.view.animation.Interpolator interpolator) {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17, f18);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17, f18);
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(i17, i18);
        ofArgb.addUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.kc(this, view2));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofArgb);
        animatorSet.setDuration(j17);
        animatorSet.setInterpolator(interpolator);
        return animatorSet;
    }

    public final android.animation.AnimatorSet c(android.view.View view, android.view.View view2, com.tencent.mm.plugin.finder.live.plugin.jc jcVar, com.tencent.mm.plugin.finder.live.plugin.ic icVar, com.tencent.mm.plugin.finder.live.plugin.hc hcVar) {
        android.animation.AnimatorSet b17 = b(view, view2, icVar.f112954a, icVar.f112955b, jcVar.f113082d, hcVar.f112795a, icVar.f112957d, new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet b18 = b(view, view2, icVar.f112955b, icVar.f112956c, hcVar.f112795a, hcVar.f112796b, icVar.f112957d, new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet b19 = b(view, view2, icVar.f112956c, icVar.f112955b, hcVar.f112796b, hcVar.f112795a, icVar.f112957d, new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet b27 = b(view, view2, icVar.f112955b, icVar.f112956c, hcVar.f112795a, hcVar.f112796b, icVar.f112957d, new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet b28 = b(view, view2, icVar.f112956c, icVar.f112955b, hcVar.f112796b, hcVar.f112795a, icVar.f112957d, new android.view.animation.DecelerateInterpolator());
        float f17 = icVar.f112955b;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", f17, jcVar.f113079a);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", f17, jcVar.f113080b);
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb(hcVar.f112795a, jcVar.f113082d);
        ofArgb.addUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.kc(this, view2));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofArgb);
        animatorSet.setDuration(icVar.f112957d);
        animatorSet.setInterpolator(new android.view.animation.DecelerateInterpolator());
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playSequentially(b17, b18, b19, b27, b28, animatorSet);
        return animatorSet2;
    }

    public final void d(android.view.View view, int i17) {
        if (view == null) {
            return;
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i17);
        jz5.g gVar = this.f113609b;
        gradientDrawable.setSize(((java.lang.Number) ((jz5.n) gVar).getValue()).intValue(), ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue());
        view.setBackground(gradientDrawable);
    }
}
