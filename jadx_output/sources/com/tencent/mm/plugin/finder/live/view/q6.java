package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class q6 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f116603d;

    public q6(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f116603d = weImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.f116603d.setIconColor(((java.lang.Integer) animatedValue).intValue());
    }
}
