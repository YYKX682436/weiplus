package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes7.dex */
public final class c8 extends com.tencent.mm.plugin.ball.service.s4 {

    /* renamed from: v, reason: collision with root package name */
    public static java.lang.String f116229v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(dp1.x pageAdapter) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 15;
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void p0() {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
        super.p0();
    }

    public final void t0(boolean z17) {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(z17);
        this.f93132d.M.f93090m = 4;
        super.z();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return false;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        this.f93132d.M.f93090m = 4;
        super.z();
    }
}
