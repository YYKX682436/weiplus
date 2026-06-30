package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class l8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f190464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190465e;

    public l8(android.widget.FrameLayout.LayoutParams layoutParams, com.tencent.mm.pluginsdk.ui.chat.h9 h9Var) {
        this.f190464d = layoutParams;
        this.f190465e = h9Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        android.widget.FrameLayout.LayoutParams layoutParams = this.f190464d;
        layoutParams.topMargin = intValue;
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190465e;
        android.view.View view = h9Var.f190371q;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
        android.view.View view2 = h9Var.f190371q;
        if (view2 != null) {
            view2.requestLayout();
        }
    }
}
