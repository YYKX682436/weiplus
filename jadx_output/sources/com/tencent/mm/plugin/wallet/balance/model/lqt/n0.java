package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class n0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f177694a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.model.lqt.s0 f177695b;

    public n0(com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var, km5.b bVar) {
        this.f177695b = s0Var;
        this.f177694a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "on close lqt account finish, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        this.f177695b.getClass();
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_OPEN_FLAG_INT_SYNC, -1);
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_LQT_ENTRY_WORDING_STRING_SYNC, null);
        int i17 = fVar.f70615a;
        km5.b bVar = this.f177694a;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.u40 u40Var = (r45.u40) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "on close lqt account finsih, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(u40Var.f387004d), u40Var.f387005e);
            if (u40Var.f387006f != null) {
                com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent wCPayLqtDetailUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtDetailUIShowDialogEvent();
                wCPayLqtDetailUIShowDialogEvent.f54947g.f6116a = u40Var.f387006f;
                wCPayLqtDetailUIShowDialogEvent.e();
            }
            if (u40Var.f387004d == 0) {
                com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(u40Var.f387007g);
                bVar.c(u40Var);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 15L, 1L, false);
            } else {
                bVar.a(u40Var.f387006f != null ? null : u40Var.f387005e);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 16L, 1L, false);
            }
        } else {
            bVar.a(java.lang.Boolean.FALSE);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(663L, 17L, 1L, false);
        }
        return null;
    }
}
