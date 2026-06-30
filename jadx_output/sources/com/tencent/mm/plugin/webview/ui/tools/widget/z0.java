package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class z0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.a1 f187617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187618e;

    public z0(com.tencent.mm.plugin.webview.ui.tools.widget.a1 a1Var, boolean z17) {
        this.f187617d = a1Var;
        this.f187618e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.webview.ui.tools.widget.a1 a1Var = this.f187617d;
        tl2.u uVar = (tl2.u) a1Var.f187095a;
        uVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTransitionEnd] isEnter=");
        boolean z17 = this.f187618e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", sb6.toString());
        if (!z17) {
            uVar.p();
        }
        a1Var.f187096b = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
