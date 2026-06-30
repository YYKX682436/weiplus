package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes5.dex */
public final class hn implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mn f118577d;

    public hn(com.tencent.mm.plugin.finder.live.widget.mn mnVar) {
        this.f118577d = mnVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.tencent.mm.plugin.finder.live.widget.mn mnVar = this.f118577d;
        android.view.ViewGroup.LayoutParams layoutParams = mnVar.f119087h.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(intValue);
        mnVar.f119087h.requestLayout();
    }
}
