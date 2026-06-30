package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public final class p7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage f157874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.MarginLayoutParams f157875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f157876f;

    public p7(com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage, android.view.ViewGroup.MarginLayoutParams marginLayoutParams, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f157874d = remittanceRemarkInputHalfPage;
        this.f157875e = marginLayoutParams;
        this.f157876f = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        com.tencent.mm.plugin.remittance.ui.RemittanceRemarkInputHalfPage remittanceRemarkInputHalfPage = this.f157874d;
        boolean c17 = com.tencent.mm.ui.b4.c(remittanceRemarkInputHalfPage.f157561d);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f157876f;
        if (c17) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = this.f157875e;
            if (marginLayoutParams != null) {
                java.lang.Object animatedValue = anim.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                marginLayoutParams.bottomMargin = ((java.lang.Integer) animatedValue).intValue();
            }
            java.lang.Object parent = z2Var.f212058g.getParent();
            android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view != null) {
                view.setLayoutParams(marginLayoutParams);
            }
        }
        if (com.tencent.mm.ui.w9.c(remittanceRemarkInputHalfPage.f157561d) || com.tencent.mm.ui.bk.g0() || com.tencent.mm.ui.bk.f0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view2 = z2Var.f212058g;
        java.lang.Object animatedValue2 = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        view2.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue2).intValue());
    }
}
