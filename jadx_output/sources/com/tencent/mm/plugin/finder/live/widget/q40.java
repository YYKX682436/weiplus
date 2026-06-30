package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class q40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f119494d;

    public q40(com.tencent.mm.plugin.finder.live.widget.q50 q50Var) {
        this.f119494d = q50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f119494d;
        android.view.View view = q50Var.f119496J;
        if (view == null) {
            q50Var.getClass();
            return;
        }
        float a17 = i65.a.a(q50Var.f118183e, 8.0f);
        android.animation.ValueAnimator ofObject = android.animation.ValueAnimator.ofObject(new android.animation.ArgbEvaluator(), 0, java.lang.Integer.valueOf(android.graphics.Color.argb(77, 7, 193, 96)), 0);
        ofObject.setDuration(1500L);
        ofObject.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.s40(a17, view));
        ofObject.start();
        ofObject.addListener(new com.tencent.mm.plugin.finder.live.widget.r40(0, a17, view));
    }
}
