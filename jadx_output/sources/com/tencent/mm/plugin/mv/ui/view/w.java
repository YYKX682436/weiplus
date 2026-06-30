package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f151971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.a0 f151972e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151974g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f151975h;

    public w(int i17, com.tencent.mm.plugin.mv.ui.view.a0 a0Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, kotlin.jvm.internal.c0 c0Var3) {
        this.f151971d = i17;
        this.f151972e = a0Var;
        this.f151973f = c0Var;
        this.f151974g = c0Var2;
        this.f151975h = c0Var3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = this.f151971d;
        int i18 = i17 + org.chromium.net.NetError.ERR_INVALID_URL;
        com.tencent.mm.plugin.mv.ui.view.a0 a0Var = this.f151972e;
        if (intValue >= i18) {
            a0Var.f151768p = 2;
            if (a0Var.d().isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var = this.f151973f;
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            a0Var.d().cancel();
            a0Var.d().start();
            return;
        }
        float f17 = intValue;
        float f18 = 300;
        if (f17 >= ((i17 * 2.0f) / 3.0f) - f18) {
            a0Var.f151768p = 1;
            if (a0Var.d().isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var2 = this.f151974g;
            if (c0Var2.f310112d) {
                return;
            }
            c0Var2.f310112d = true;
            a0Var.d().cancel();
            a0Var.d().start();
            return;
        }
        if (f17 >= (i17 / 3.0f) - f18) {
            a0Var.f151768p = 0;
            if (a0Var.d().isStarted()) {
                return;
            }
            kotlin.jvm.internal.c0 c0Var3 = this.f151975h;
            if (c0Var3.f310112d) {
                return;
            }
            c0Var3.f310112d = true;
            a0Var.d().cancel();
            a0Var.d().start();
        }
    }
}
