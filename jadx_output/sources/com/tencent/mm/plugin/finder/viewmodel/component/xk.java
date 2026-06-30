package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class xk extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f136467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f136468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f136469f;

    public xk(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.bl blVar, android.widget.FrameLayout frameLayout) {
        this.f136467d = view;
        this.f136468e = blVar;
        this.f136469f = frameLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator startDelay;
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f136467d;
        android.view.ViewPropertyAnimator updateListener = view.animate().alpha(0.0f).setUpdateListener(null);
        android.widget.FrameLayout frameLayout = this.f136469f;
        com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f136468e;
        updateListener.setListener(new com.tencent.mm.plugin.finder.viewmodel.component.wk(frameLayout, view, blVar)).setDuration(250L).setStartDelay(3000L).start();
        android.view.View findViewById = blVar.findViewById(com.tencent.mm.R.id.nzm);
        if (findViewById == null || (animate = findViewById.animate()) == null || (translationX = animate.translationX(0.0f)) == null || (alpha = translationX.alpha(0.5f)) == null || (duration = alpha.setDuration(250L)) == null || (startDelay = duration.setStartDelay(3000L)) == null) {
            return;
        }
        startDelay.start();
    }
}
