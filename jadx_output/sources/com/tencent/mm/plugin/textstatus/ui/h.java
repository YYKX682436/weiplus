package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.b f173917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f173918e;

    public h(com.tencent.mm.plugin.textstatus.ui.b bVar, android.view.View view) {
        this.f173917d = bVar;
        this.f173918e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue() / this.f173917d.f173737a;
        android.view.View view = this.f173918e;
        view.setScaleX(floatValue);
        view.setScaleY(floatValue);
    }
}
