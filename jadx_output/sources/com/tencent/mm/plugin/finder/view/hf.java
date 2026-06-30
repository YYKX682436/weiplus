package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class hf implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f132237d;

    public hf(yz5.l lVar) {
        this.f132237d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mars.xlog.Log.i("Finder.FinderMileStoneView", "bgAlpha animatedValue: " + floatValue);
        this.f132237d.invoke(java.lang.Float.valueOf(floatValue));
    }
}
