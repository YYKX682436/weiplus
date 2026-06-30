package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zi0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ej0 f115349d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi0(com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var) {
        super(0);
        this.f115349d = ej0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var = this.f115349d;
        ((mm2.c1) ej0Var.P0(mm2.c1.class)).N5 = 2;
        ej0Var.v1();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorMiniWindowPlugin", "miniWindow click!");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.f327984s, null, null, null, null, null, false, 126, null);
        return jz5.f0.f302826a;
    }
}
