package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class v1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.w1 f182636d;

    public v1(com.tencent.mm.plugin.webview.luggage.w1 w1Var) {
        this.f182636d = w1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f182636d.d((int) ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
