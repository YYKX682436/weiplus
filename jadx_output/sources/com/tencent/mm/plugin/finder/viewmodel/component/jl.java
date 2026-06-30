package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC f134870d;

    public jl(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        this.f134870d = finderHomeUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, false);
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(this.f134870d.getContext()));
        long j17 = b17 != null ? b17.field_liveSwitchFlag : 0L;
        ((b92.d1) zbVar).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z17 = pm0.v.z((int) j17, 1);
        if (!o17 && z17 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127766j5).getValue()).r()).intValue() == 1) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Pk();
        }
    }
}
