package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class t0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.v0 f190659d;

    public t0(com.tencent.mm.pluginsdk.ui.chat.v0 v0Var) {
        this.f190659d = v0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.pluginsdk.ui.chat.v0 v0Var = this.f190659d;
        v0Var.f190688d.L4.setAlpha(floatValue);
        v0Var.f190688d.K4.setAlpha(floatValue);
        v0Var.f190688d.F4.setAlpha(floatValue);
    }
}
