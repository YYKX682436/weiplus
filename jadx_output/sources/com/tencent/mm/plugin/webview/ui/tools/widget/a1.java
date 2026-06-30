package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.o6 f187095a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f187096b;

    /* renamed from: c, reason: collision with root package name */
    public float f187097c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.m1 f187098d;

    public a1(com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var, com.tencent.mm.plugin.webview.ui.tools.widget.o6 listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f187098d = m1Var;
        this.f187095a = listener;
    }

    public final void a(boolean z17) {
        if (this.f187096b) {
            return;
        }
        this.f187096b = true;
        com.tencent.mm.plugin.webview.ui.tools.widget.m1 m1Var = this.f187098d;
        android.view.animation.Animation loadAnimation = 1 == m1Var.f187397s.f187426i ? android.view.animation.AnimationUtils.loadAnimation(m1Var.getContext(), com.tencent.mm.R.anim.f477812c6) : android.view.animation.AnimationUtils.loadAnimation(m1Var.getContext(), com.tencent.mm.R.anim.f477811c5);
        tl2.u uVar = (tl2.u) this.f187095a;
        uVar.getClass();
        com.tencent.mars.xlog.Log.i("LiveRestrictVideoTransition", "[onTransitionStart] isEnter=" + z17);
        uVar.g(z17);
        float f17 = this.f187097c;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 1.0f);
        if (z17) {
            f17 = 1.0f - f17;
        }
        ofFloat.setDuration(((((float) loadAnimation.getDuration()) * 1.2f) * f17) / 1.0f);
        com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebView", "[onTransitionStart] duration=" + ofFloat.getDuration());
        ofFloat.setInterpolator(loadAnimation.getInterpolator());
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.webview.ui.tools.widget.y0(this, z17));
        ofFloat.addListener(new com.tencent.mm.plugin.webview.ui.tools.widget.z0(this, z17));
        ofFloat.start();
    }

    public final void b(float f17) {
        this.f187097c = f17;
        tl2.u uVar = (tl2.u) this.f187095a;
        uVar.q(uVar.k(), uVar.f420277g, uVar.f420278h, f17);
    }
}
