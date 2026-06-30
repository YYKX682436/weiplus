package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i40 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.k40 f118635d;

    public i40(com.tencent.mm.plugin.finder.live.widget.k40 k40Var) {
        this.f118635d = k40Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View view = this.f118635d.f118811c;
        android.graphics.drawable.Drawable background = view != null ? view.getBackground() : null;
        if (background == null) {
            return;
        }
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        background.setAlpha((int) (((java.lang.Float) animatedValue).floatValue() * 255));
    }
}
