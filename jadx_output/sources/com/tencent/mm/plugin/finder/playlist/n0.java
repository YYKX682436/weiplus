package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class n0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.o0 f122374a;

    public n0(com.tencent.mm.plugin.finder.playlist.o0 o0Var) {
        this.f122374a = o0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        this.f122374a.f122387n = false;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f122374a.f122387n = true;
    }
}
