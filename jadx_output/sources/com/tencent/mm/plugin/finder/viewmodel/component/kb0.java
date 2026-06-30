package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class kb0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Integer f134945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f134947f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134948g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f134949h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.db0 f134950i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f134951m;

    public kb0(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var, in5.s0 s0Var, int i17, com.tencent.mm.plugin.finder.viewmodel.component.db0 db0Var, int i18) {
        this.f134946e = view;
        this.f134947f = mb0Var;
        this.f134948g = s0Var;
        this.f134949h = i17;
        this.f134950i = db0Var;
        this.f134951m = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View view = this.f134946e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$showWithAnimation$2$1$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f134946e;
        view2.setTranslationY(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = this.f134949h;
        java.lang.Integer num = this.f134945d;
        if (this.f134950i == com.tencent.mm.plugin.finder.viewmodel.component.db0.f134118d && num != null && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
            ((android.widget.FrameLayout.LayoutParams) layoutParams).gravity = num.intValue();
        }
        view2.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = this.f134947f;
        mb0Var.f135159d = null;
        mb0Var.getClass();
        in5.s0 holder = this.f134948g;
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC finderDescPanelUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) ((jz5.n) mb0Var.f135160e).getValue();
        if (finderDescPanelUIC != null) {
            finderDescPanelUIC.P6(holder);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View view = this.f134946e;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.f134951m;
        if (this.f134950i == com.tencent.mm.plugin.finder.viewmodel.component.db0.f134118d && (layoutParams instanceof android.widget.FrameLayout.LayoutParams)) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            this.f134945d = java.lang.Integer.valueOf(layoutParams2.gravity);
            layoutParams2.gravity = 48;
        }
        view.setLayoutParams(layoutParams);
    }
}
