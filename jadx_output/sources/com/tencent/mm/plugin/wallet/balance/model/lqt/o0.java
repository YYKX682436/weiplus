package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class o0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177698a;

    public o0(com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var, km5.b bVar) {
        this.f177698a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickRedeem end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            if (((r45.ry4) fVar.f70618d).B != null) {
                com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6205a = ((r45.ry4) fVar.f70618d).B;
                wCPayLqtSaveFetchUIShowDialogEvent.e();
            }
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.ry4) fVar.f70618d).C);
            com.tencent.mm.plugin.wallet.balance.model.lqt.m1.b().c((r45.ry4) fVar.f70618d);
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
            r45.ry4 ry4Var = (r45.ry4) fVar.f70618d;
            java.lang.String str = ry4Var.f385295r;
            r45.bp0 bp0Var = ry4Var.f385296s;
            l0Var.f177684m = str;
            l0Var.f177685n = bp0Var;
            if (ry4Var.f385284d != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(ry4Var.f385285e)) {
                r45.ry4 ry4Var2 = (r45.ry4) fVar.f70618d;
                if (ry4Var2.B == null) {
                    l0Var.e(ry4Var2.f385290m, false, true, ry4Var2.f385285e);
                }
            }
            l0Var.e(((r45.ry4) fVar.f70618d).f385290m, false, false, "");
        } else {
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q.e(null, false, true, "");
        }
        this.f177698a.resume();
        return null;
    }
}
