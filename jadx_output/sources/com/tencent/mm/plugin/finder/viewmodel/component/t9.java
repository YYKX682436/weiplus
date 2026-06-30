package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t9 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f136000d;

    public t9(android.view.ViewGroup viewGroup) {
        this.f136000d = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = this.f136000d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.height = ((java.lang.Integer) animatedValue).intValue();
        viewGroup.setLayoutParams(layoutParams);
    }
}
