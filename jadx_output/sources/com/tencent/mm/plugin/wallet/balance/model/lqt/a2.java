package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class a2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177614a;

    public a2(com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var, km5.b bVar) {
        this.f177614a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177614a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.vg5 vg5Var = (r45.vg5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on qry purchase result finsih, retcode: %s, retmsg: %s, purchase_state: %s", java.lang.Integer.valueOf(vg5Var.f388212d), vg5Var.f388213e, java.lang.Integer.valueOf(vg5Var.f388214f));
            if (vg5Var.f388221p != null) {
                com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6205a = ((r45.vg5) fVar.f70618d).f388221p;
                wCPayLqtSaveFetchUIShowDialogEvent.e();
            }
            if (vg5Var.f388212d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(vg5Var.f388222q);
                bVar.c(vg5Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 6L, 1L, false);
            } else {
                bVar.a(vg5Var.f388221p != null ? null : vg5Var.f388213e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 7L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 8L, 1L, false);
        }
        return null;
    }
}
