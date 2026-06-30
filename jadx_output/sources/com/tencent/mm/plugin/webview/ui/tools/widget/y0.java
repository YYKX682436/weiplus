package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.a1 f187607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f187608e;

    public y0(com.tencent.mm.plugin.webview.ui.tools.widget.a1 a1Var, boolean z17) {
        this.f187607d = a1Var;
        this.f187608e = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (!this.f187608e) {
            floatValue = 1.0f - floatValue;
        }
        this.f187607d.b(floatValue);
    }
}
