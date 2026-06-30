package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class m0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177690a;

    public m0(com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var, km5.b bVar) {
        this.f177690a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177690a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.zg5 zg5Var = (r45.zg5) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "on qryusrfunddetail finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(zg5Var.f392009d), zg5Var.f392010e);
            if (zg5Var.f392034y1 != null) {
                com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent wCPayLqtDetailUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent();
                wCPayLqtDetailUIShowDialogEvent.f54947g.f6116a = zg5Var.f392034y1;
                wCPayLqtDetailUIShowDialogEvent.e();
            }
            if (zg5Var.f392009d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(zg5Var.f392036z1);
                ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(com.tencent.mm.storage.u3.USERINFO_NEW_LQT_LONG_SYNC, java.lang.Long.valueOf(zg5Var.f392011f));
                bVar.c(zg5Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 0L, 1L, false);
            } else {
                bVar.a(zg5Var.f392034y1 != null ? null : zg5Var.f392010e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 1L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 2L, 1L, false);
        }
        return null;
    }
}
