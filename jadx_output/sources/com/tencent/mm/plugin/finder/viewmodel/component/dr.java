package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dr extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.hs f134157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f134158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f134159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f134160g;

    public dr(com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar, android.widget.FrameLayout frameLayout, in5.s0 s0Var, yz5.a aVar) {
        this.f134157d = hsVar;
        this.f134158e = frameLayout;
        this.f134159f = s0Var;
        this.f134160g = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.viewmodel.component.hs hsVar = this.f134157d;
        com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar = hsVar.f134656i;
        if (lqVar != null) {
            lqVar.c(1.0f);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.lq lqVar2 = hsVar.f134656i;
        if (lqVar2 != null) {
            lqVar2.a(false);
        }
        this.f134158e.setVisibility(8);
        hsVar.y7(this.f134159f, com.tencent.mm.plugin.finder.viewmodel.component.rq.f135823d);
        yz5.a aVar = this.f134160g;
        if (aVar != null) {
            aVar.invoke();
        }
        pi0.n1 n1Var = hsVar.f134654g;
        if (n1Var != null) {
            n1Var.a();
        }
        hsVar.f134654g = null;
        hsVar.f134655h = null;
    }
}
