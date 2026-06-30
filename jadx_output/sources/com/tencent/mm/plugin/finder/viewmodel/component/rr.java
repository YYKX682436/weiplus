package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class rr implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f135831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pi0.n1 f135832b;

    public rr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, pi0.n1 n1Var) {
        this.f135831a = hsVar;
        this.f135832b = n1Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f135831a.f134654g = this.f135832b;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
