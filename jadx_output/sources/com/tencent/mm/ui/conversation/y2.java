package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class y2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jl1.a f208258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.b3 f208260f;

    public y2(jl1.a aVar, android.view.View view, com.tencent.mm.ui.conversation.b3 b3Var) {
        this.f208258d = aVar;
        this.f208259e = view;
        this.f208260f = b3Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue("ratio");
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int a17 = this.f208258d.a(((java.lang.Float) animatedValue).floatValue());
        this.f208259e.setBackgroundColor(a17);
        android.graphics.drawable.ColorDrawable colorDrawable = this.f208260f.f207461c;
        if (colorDrawable != null) {
            colorDrawable.setColor(a17);
        }
    }
}
