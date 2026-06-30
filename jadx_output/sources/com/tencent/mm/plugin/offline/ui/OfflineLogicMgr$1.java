package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
class OfflineLogicMgr$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletPayResultEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.wallet.PayInfo f152483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.a1 f152484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfflineLogicMgr$1(com.tencent.mm.plugin.offline.ui.a1 a1Var, androidx.lifecycle.y yVar, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        super(yVar);
        this.f152484e = a1Var;
        this.f152483d = payInfo;
        this.__eventId = 520089918;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent) {
        com.tencent.mm.autogen.events.WalletPayResultEvent walletPayResultEvent2 = walletPayResultEvent;
        if (walletPayResultEvent2.f54965g.f7865e) {
            com.tencent.mars.xlog.Log.f("MicroMsg.OfflineLogicMgr", "WalletPayResultEvent is from kinda, ScanQRCodePay");
            return false;
        }
        dead();
        int i17 = walletPayResultEvent2.f54965g.f7863c;
        com.tencent.mm.plugin.offline.ui.a1 a1Var = this.f152484e;
        if (i17 != 0) {
            if (i17 != -1) {
                return false;
            }
            to3.q.e();
            ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) a1Var.f152578b).s7();
            return false;
        }
        com.tencent.mm.pluginsdk.wallet.PayInfo payInfo = this.f152483d;
        wo3.d dVar = new wo3.d(payInfo.f192114m, payInfo.f192109e, payInfo.f192111g);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(dVar);
        to3.q.e();
        ((com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI) a1Var.f152578b).s7();
        return false;
    }
}
