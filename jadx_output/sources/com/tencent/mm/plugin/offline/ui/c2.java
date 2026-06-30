package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class c2 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ey4 f152593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI f152594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI, r45.ey4 ey4Var) {
        super(false);
        this.f152594e = walletOfflineCoinPurseUI;
        this.f152593d = ey4Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI walletOfflineCoinPurseUI = this.f152594e;
        walletOfflineCoinPurseUI.J1 = true;
        com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.f7(5);
        r45.ey4 ey4Var = this.f152593d;
        int i17 = ey4Var.f373822s;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.wallet_core.ui.r1.V(walletOfflineCoinPurseUI.getContext(), ey4Var.f373823t, false);
            } else if (i17 != 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "unknown entrance type");
            } else {
                com.tencent.mm.wallet_core.ui.r1.c0(ey4Var.f373824u, ey4Var.f373825v, 0, 1137, new com.tencent.mm.plugin.offline.ui.b2(this));
            }
        }
    }
}
