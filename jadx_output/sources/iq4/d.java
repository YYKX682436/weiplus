package iq4;

/* loaded from: classes14.dex */
public class d extends com.tencent.mm.plugin.ball.service.s4 {
    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void I() {
        this.f93246u = false;
        this.f93239n.q(false);
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 10;
        if (gq4.v.Bi() != null) {
            t().f93087g = java.lang.String.valueOf(gq4.v.Bi().n());
        }
        g();
    }

    @Override // com.tencent.mm.plugin.ball.service.s4
    public void p0() {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(true);
        super.p0();
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean v() {
        return false;
    }

    @Override // com.tencent.mm.plugin.ball.service.s4, com.tencent.mm.plugin.ball.service.d
    public void z() {
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        ballInfo.M.f93090m = 4;
        gp1.v vVar = this.f93136h;
        if (vVar != null) {
            vVar.i(ballInfo);
        }
    }
}
