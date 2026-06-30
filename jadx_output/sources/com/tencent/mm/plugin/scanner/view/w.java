package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes14.dex */
public final class w implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t f160002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f160003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.t0 f160004f;

    public w(com.tencent.mm.plugin.scanner.view.t tVar, android.widget.TextView textView, com.tencent.mm.plugin.scanner.view.t0 t0Var) {
        this.f160002d = tVar;
        this.f160003e = textView;
        this.f160004f = t0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mm.plugin.scanner.view.t tVar = this.f160002d;
        if (tVar.f159981b == null) {
            tVar.f159980a = false;
            return;
        }
        android.widget.TextView textView = this.f160003e;
        if (textView != null) {
            textView.setAlpha(this.f160004f.getAlpha());
        }
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.scanner.view.v(tVar), 1000L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }
}
