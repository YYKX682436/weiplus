package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class e0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI f178759d;

    public e0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI) {
        this.f178759d = walletPayUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        java.util.List list;
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI walletPayUI = this.f178759d;
        com.tencent.mars.xlog.Log.i(walletPayUI.f178712d, "click continue pay");
        if (walletPayUI.f178729u != null && (orders = walletPayUI.f178713e) != null && (list = orders.M) != null && ((java.util.ArrayList) list).size() > 0) {
            if (walletPayUI.f178729u.f192109e == 8) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15368, 2, 2, 3, ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) walletPayUI.f178713e.M).get(0)).f179714r);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15368, 1, 2, 3, ((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) ((java.util.ArrayList) walletPayUI.f178713e.M).get(0)).f179714r);
            }
        }
        walletPayUI.b7();
    }
}
