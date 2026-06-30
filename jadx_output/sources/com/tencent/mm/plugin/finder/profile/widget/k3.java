package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class k3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.l3 f124599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f124600e;

    public k3(com.tencent.mm.plugin.finder.profile.widget.l3 l3Var, androidx.recyclerview.widget.k3 k3Var) {
        this.f124599d = l3Var;
        this.f124600e = k3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        androidx.recyclerview.widget.k3 viewHolder = this.f124600e;
        kotlin.jvm.internal.o.f(viewHolder, "$viewHolder");
        this.f124599d.e(floatValue, (com.tencent.mm.plugin.finder.profile.widget.n3) viewHolder);
    }
}
