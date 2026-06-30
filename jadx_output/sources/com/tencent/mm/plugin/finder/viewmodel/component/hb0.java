package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class hb0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mb0 f134610e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134611f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134612g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134613h;

    public hb0(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var, in5.s0 s0Var, int i17, android.view.View view2) {
        this.f134609d = view;
        this.f134610e = mb0Var;
        this.f134611f = s0Var;
        this.f134612g = i17;
        this.f134613h = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f134609d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideWithAnimation$lambda$4$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/IFinderDescPanelItem$hideWithAnimation$lambda$4$$inlined$addListener$default$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        android.view.View view2 = this.f134609d;
        view2.setTranslationY(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.height = this.f134612g;
        view2.setLayoutParams(layoutParams);
        in5.s0 s0Var = this.f134611f;
        com.tencent.mm.plugin.finder.viewmodel.component.mb0 mb0Var = this.f134610e;
        mb0Var.W6(s0Var);
        mb0Var.f135159d = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.f134613h;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = hc2.f1.n(view);
        view.setLayoutParams(layoutParams);
    }
}
