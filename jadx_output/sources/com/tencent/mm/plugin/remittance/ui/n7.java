package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public final class n7 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f157849d;

    public n7(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f157849d = z2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        android.view.View view = this.f157849d.f212058g;
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue).intValue());
    }
}
