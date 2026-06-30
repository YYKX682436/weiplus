package com.tencent.mm.ui.tools;

/* loaded from: classes2.dex */
public final class w3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f210866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f210867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f210868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f210869g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f210870h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f210871i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f210872m;

    public w3(android.view.View view, float f17, float f18, float f19, float f27, float f28, float f29) {
        this.f210866d = view;
        this.f210867e = f17;
        this.f210868f = f18;
        this.f210869g = f19;
        this.f210870h = f27;
        this.f210871i = f28;
        this.f210872m = f29;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        java.lang.Object animatedValue = animator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float e17 = e06.p.e(((java.lang.Float) animatedValue).floatValue(), 0.0f, 1.0f);
        float f17 = this.f210868f;
        float f18 = this.f210867e;
        float f19 = f18 + ((f17 - f18) * e17);
        android.view.View view = this.f210866d;
        view.setTranslationX(f19);
        float f27 = this.f210870h;
        float f28 = this.f210869g;
        view.setTranslationY(f28 + ((f27 - f28) * e17));
        float f29 = this.f210872m;
        float f37 = this.f210871i;
        view.setScaleX(((f29 - f37) * e17) + f37);
        view.setScaleY(f37 + ((f29 - f37) * e17));
    }
}
