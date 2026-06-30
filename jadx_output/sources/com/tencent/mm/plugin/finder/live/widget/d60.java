package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d60 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z60 f118078d;

    public d60(com.tencent.mm.plugin.finder.live.widget.z60 z60Var) {
        this.f118078d = z60Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.widget.z60 z60Var = this.f118078d;
        z60Var.getClass();
        android.widget.LinearLayout linearLayout = z60Var.f120539m;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout.getLayoutParams().height = -2;
        android.widget.LinearLayout linearLayout2 = z60Var.f120539m;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        linearLayout2.requestLayout();
        z60Var.f120534e = null;
        com.tencent.mm.plugin.finder.live.widget.z60.d(z60Var, z60Var.f120543q);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f118078d.getClass();
    }
}
