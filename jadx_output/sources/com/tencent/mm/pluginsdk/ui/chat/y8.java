package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes3.dex */
public final class y8 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.h9 f190762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f190763e;

    public y8(com.tencent.mm.pluginsdk.ui.chat.h9 h9Var, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f190762d = h9Var;
        this.f190763e = layoutParams;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.pluginsdk.ui.chat.h9 h9Var = this.f190762d;
        android.animation.ValueAnimator valueAnimator = h9Var.A;
        android.widget.FrameLayout.LayoutParams layoutParams = this.f190763e;
        if (valueAnimator == animation) {
            if (layoutParams != null) {
                android.content.Context context = h9Var.f190360f;
                java.lang.Object animatedValue = animation.getAnimatedValue();
                kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.width = com.tencent.mm.ui.zk.a(context, ((java.lang.Integer) animatedValue).intValue());
            }
        } else if (h9Var.B == animation && layoutParams != null) {
            android.content.Context context2 = h9Var.f190360f;
            java.lang.Object animatedValue2 = animation.getAnimatedValue();
            kotlin.jvm.internal.o.e(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
            layoutParams.height = com.tencent.mm.ui.zk.a(context2, ((java.lang.Integer) animatedValue2).intValue());
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = h9Var.f190369o;
        if (weImageView != null) {
            weImageView.setLayoutParams(layoutParams);
        }
    }
}
