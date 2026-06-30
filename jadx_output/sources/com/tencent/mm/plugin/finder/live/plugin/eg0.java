package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eg0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kg0 f112411d;

    public eg0(com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var) {
        this.f112411d = kg0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.live.plugin.kg0 kg0Var = this.f112411d;
        com.tencent.mm.plugin.finder.live.plugin.kg0.u1(kg0Var, false);
        wm2.n nVar = kg0Var.C;
        nVar.f447259i = new com.tencent.mm.plugin.finder.live.plugin.dg0(kg0Var);
        nVar.b();
    }
}
