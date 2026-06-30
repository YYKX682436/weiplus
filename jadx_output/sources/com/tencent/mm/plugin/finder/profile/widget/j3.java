package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class j3 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.l3 f124587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124588e;

    public j3(com.tencent.mm.plugin.finder.profile.widget.l3 l3Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var) {
        this.f124587d = l3Var;
        this.f124588e = n3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.f124587d.e(((java.lang.Float) animatedValue).floatValue(), this.f124588e);
    }
}
