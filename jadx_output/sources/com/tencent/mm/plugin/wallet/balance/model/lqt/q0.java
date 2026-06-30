package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class q0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f177707b;

    public q0(com.tencent.mm.plugin.wallet.balance.model.lqt.s0 s0Var, int i17, km5.b bVar) {
        this.f177706a = i17;
        this.f177707b = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtDetailInteractor", "lqtOnClickPurchase end, errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            if (((r45.ny4) fVar.f70618d).A != null) {
                com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent wCPayLqtSaveFetchUIShowDialogEvent = new com.tencent.mm.autogen.events.WCPayLqtSaveFetchUIShowDialogEvent();
                wCPayLqtSaveFetchUIShowDialogEvent.f54948g.f6205a = ((r45.ny4) fVar.f70618d).A;
                wCPayLqtSaveFetchUIShowDialogEvent.e();
            }
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(((r45.ny4) fVar.f70618d).B);
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 l0Var = com.tencent.mm.plugin.wallet.balance.model.lqt.l0.f177669q;
            l0Var.e(((r45.ny4) fVar.f70618d).f381747f, true, false, "");
            l0Var.f((r45.ny4) fVar.f70618d, this.f177706a);
        } else {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l0g), 1).show();
        }
        this.f177707b.resume();
        return null;
    }
}
