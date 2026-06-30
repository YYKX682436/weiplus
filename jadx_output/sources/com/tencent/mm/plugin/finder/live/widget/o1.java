package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f119237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.finder.live.widget.t1 t1Var, boolean z17) {
        super(0);
        this.f119237d = t1Var;
        this.f119238e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.widget.t1 t1Var = this.f119237d;
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "get cache valid");
        r45.ze2 ze2Var = t1Var.L;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (ze2Var != null) {
            t1Var.m0(ze2Var);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            boolean z17 = this.f119238e;
            if (z17) {
                t1Var.I.a();
            }
            ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
            com.tencent.mm.plugin.finder.live.widget.t1.e0(t1Var, ((java.lang.Number) k0Var.P6().f302833d).floatValue(), ((java.lang.Number) k0Var.P6().f302834e).floatValue(), z17);
        }
        return f0Var2;
    }
}
