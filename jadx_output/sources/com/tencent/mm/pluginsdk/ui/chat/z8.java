package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class z8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f190775e;

    public z8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f190774d = h9Var;
        this.f190775e = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190774d;
        android.animation.ValueAnimator valueAnimator = h9Var.f190378x;
        android.widget.FrameLayout.LayoutParams layoutParams = this.f190775e;
        if (valueAnimator == animation) {
            android.content.Context context = h9Var.f190360f;
            java.lang.Object animatedValue = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.width = com.tencent.mm.ui.zk.a(context, ((java.lang.Integer) animatedValue).intValue());
        } else if (h9Var.f190379y == animation) {
            android.content.Context context2 = h9Var.f190360f;
            java.lang.Object animatedValue2 = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = com.tencent.mm.ui.zk.a(context2, ((java.lang.Integer) animatedValue2).intValue());
        } else if (h9Var.f190380z == animation) {
            android.content.Context context3 = h9Var.f190360f;
            java.lang.Object animatedValue3 = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue3, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.topMargin = com.tencent.mm.ui.zk.a(context3, ((java.lang.Integer) animatedValue3).intValue());
        }
        android.view.View view = h9Var.f190370p;
        if (view != null) {
            view.setLayoutParams(layoutParams);
        }
    }
}
