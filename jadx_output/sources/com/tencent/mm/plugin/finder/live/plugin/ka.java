package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class ka extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.na f113209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(com.tencent.mm.plugin.finder.live.plugin.na naVar) {
        super(0);
        this.f113209d = naVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.na naVar = this.f113209d;
        com.tencent.mars.xlog.Log.i(naVar.f113603p, "releaseBattle");
        qi2.s1 w17 = naVar.w1();
        if (w17 != null) {
            lj2.c0 c0Var = (lj2.c0) w17;
            c0Var.e(null);
            qi2.s1.a(c0Var, null, 1, null);
            c0Var.g(8);
        }
        naVar.f113604q.h();
        naVar.K0(8);
        ((mm2.o4) naVar.P0(mm2.o4.class)).Z = null;
        df2.wy wyVar = (df2.wy) naVar.U0(df2.wy.class);
        if (wyVar != null && !wyVar.f231744u) {
            wyVar.b7(null);
        }
        zi2.w wVar = (zi2.w) naVar.X0(zi2.w.class);
        if (wVar != null) {
            wVar.B1();
        }
        tf2.n nVar = (tf2.n) naVar.U0(tf2.n.class);
        if (nVar != null) {
            nVar.Z6(false);
        }
        return jz5.f0.f302826a;
    }
}
