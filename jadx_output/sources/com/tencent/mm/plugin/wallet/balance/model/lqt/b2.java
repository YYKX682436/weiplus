package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class b2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177617a;

    public b2(com.tencent.mm.plugin.wallet.balance.model.lqt.d2 d2Var, km5.b bVar) {
        this.f177617a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finish, cgiBack: %s, errType: %s, errCode: %s", fVar, java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177617a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.an5 an5Var = (r45.an5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtSaveFetchInteractor", "on redeem fund finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(an5Var.f370142d), an5Var.f370143e);
            if (an5Var.f370154s != null) {
                com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6205a = ((r45.an5) fVar.f70618d).f370154s;
                wCPayLqtSaveFetchUIShowDialogEvent.e();
            }
            if (an5Var.f370142d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(an5Var.f370155t);
                bVar.c(an5Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 12L, 1L, false);
            } else {
                if (an5Var.f370154s != null) {
                    an5Var = null;
                }
                bVar.a(an5Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 13L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 14L, 1L, false);
        }
        return null;
    }
}
