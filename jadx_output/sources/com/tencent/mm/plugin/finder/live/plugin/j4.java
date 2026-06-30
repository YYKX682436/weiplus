package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class j4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.a5 f113056d;

    public j4(com.tencent.mm.plugin.finder.live.plugin.a5 a5Var) {
        this.f113056d = a5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = this.f113056d;
        com.tencent.mm.plugin.finder.live.plugin.a5.u1(a5Var, false);
        wm2.n nVar = a5Var.Z;
        nVar.f447259i = new com.tencent.mm.plugin.finder.live.plugin.i4(a5Var);
        nVar.b();
    }
}
