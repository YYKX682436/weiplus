package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class v0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.a1 f120794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f120795e;

    public v0(com.tencent.mm.plugin.finder.live.wish.widget.a1 a1Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f120794d = a1Var;
        this.f120795e = y1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator anim) {
        kotlin.jvm.internal.o.g(anim, "anim");
        if (com.tencent.mm.ui.w9.c(this.f120794d.f118381d) || com.tencent.mm.ui.bk.g0() || !fp.h.a(30)) {
            return;
        }
        android.view.View view = this.f120795e.f212027f;
        java.lang.Object animatedValue = anim.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        view.setPadding(0, 0, 0, ((java.lang.Integer) animatedValue).intValue());
    }
}
