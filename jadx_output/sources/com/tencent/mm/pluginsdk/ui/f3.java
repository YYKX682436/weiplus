package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes13.dex */
public class f3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.g3 f190834d;

    public f3(com.tencent.mm.pluginsdk.ui.g3 g3Var) {
        this.f190834d = g3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        com.tencent.mm.pluginsdk.ui.g3 g3Var = this.f190834d;
        g3Var.getClass();
        g3Var.invalidateSelf();
    }
}
