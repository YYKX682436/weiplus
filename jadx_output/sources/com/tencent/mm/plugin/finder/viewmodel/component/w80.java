package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class w80 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f136314d;

    public w80(com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var) {
        this.f136314d = e90Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        kotlin.jvm.internal.o.g(valueAnimator, "valueAnimator");
        java.lang.Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar = this.f136314d.f134235h;
        if (rcVar != null) {
            rcVar.c(floatValue);
        }
    }
}
