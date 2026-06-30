package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a60 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.r60 f111814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f111815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f111816f;

    public a60(com.tencent.mm.plugin.finder.live.plugin.r60 r60Var, android.view.View view, com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var) {
        this.f111814d = r60Var;
        this.f111815e = view;
        this.f111816f = ep0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = this.f111814d;
        r60Var.D1("onAnimationEnd", this.f111815e);
        android.view.ViewGroup.LayoutParams layoutParams = r60Var.f114096q.getLayoutParams();
        layoutParams.height = -2;
        r60Var.f114096q.setLayoutParams(layoutParams);
        android.widget.ScrollView scrollView = r60Var.f114103x;
        if (scrollView == null) {
            kotlin.jvm.internal.o.o("promoteBubbleContainerScrollView");
            throw null;
        }
        scrollView.setScrollY(0);
        this.f111816f.U();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
