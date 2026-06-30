package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class vf implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout f133238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f133239b;

    public vf(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout, pi0.n1 n1Var, android.widget.FrameLayout frameLayout) {
        this.f133238a = finderNPSFrameLayout;
        this.f133239b = frameLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        int i17 = com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout.f131330q;
        com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout = this.f133238a;
        finderNPSFrameLayout.getClass();
        android.widget.FrameLayout frameLayout = finderNPSFrameLayout.f131338n;
        if (frameLayout != null) {
            com.tencent.mm.ui.kk.c(frameLayout);
        }
        finderNPSFrameLayout.f131338n = this.f133239b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
