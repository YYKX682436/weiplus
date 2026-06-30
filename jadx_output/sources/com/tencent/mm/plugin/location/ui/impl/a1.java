package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes3.dex */
public class a1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144748d;

    public a1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144748d = x1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144748d;
        android.view.ViewGroup.LayoutParams layoutParams = x1Var.f144943z1.getLayoutParams();
        layoutParams.height = intValue;
        x1Var.f144943z1.setLayoutParams(layoutParams);
    }
}
