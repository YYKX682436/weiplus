package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class z1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177761a;

    public z1(com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var, km5.b bVar) {
        this.f177761a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177761a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.ff5 ff5Var = (r45.ff5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on purchaseFund finsih, retcode: %s, retmsg: %s, prepayid: %s, out_trade_no: %s", java.lang.Integer.valueOf(ff5Var.f374280d), ff5Var.f374281e, ff5Var.f374282f, ff5Var.f374283g);
            if (ff5Var.f374287n != null) {
                com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6205a = ((r45.ff5) fVar.f70618d).f374287n;
                wCPayLqtSaveFetchUIShowDialogEvent.e();
            }
            if (ff5Var.f374280d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(ff5Var.f374288o);
                bVar.c(fVar.f70618d);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 3L, 1L, false);
            } else {
                bVar.a(ff5Var.f374287n != null ? null : ff5Var.f374281e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(664L, 4L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(664L, 5L, 1L, false);
        }
        return null;
    }
}
