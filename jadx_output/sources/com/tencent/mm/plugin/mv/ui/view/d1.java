package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes2.dex */
public final class d1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f151804e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f151805f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f151806g;

    public d1(android.view.View view, yz5.l lVar, int i17, int i18) {
        this.f151803d = view;
        this.f151804e = lVar;
        this.f151805f = i17;
        this.f151806g = i18;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.view.View view = this.f151803d;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = intValue;
        view.setLayoutParams(layoutParams);
        yz5.l lVar = this.f151804e;
        if (lVar != null) {
            int i17 = this.f151805f;
            lVar.invoke(java.lang.Float.valueOf((intValue - i17) / (this.f151806g - i17)));
        }
    }
}
