package com.tencent.mm.plugin.wallet.pay.ui;

/* loaded from: classes9.dex */
public class a0 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI f178744b;

    public a0(com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI, java.util.List list) {
        this.f178744b = walletPayDeductUI;
        this.f178743a = list;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pay.ui.WalletPayDeductUI walletPayDeductUI = this.f178744b;
        androidx.appcompat.app.AppCompatActivity context = walletPayDeductUI.getContext();
        java.lang.String str = walletPayDeductUI.f178703p;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletPayDeductUI.f178705r;
        com.tencent.mm.plugin.wallet.pay.ui.z zVar = new com.tencent.mm.plugin.wallet.pay.ui.z(this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> list = this.f178743a;
        if ((list == null || list.size() == 0) && com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletDialogHelper", "hy: bankcard list is null and should not show new");
            return;
        }
        int i17 = 0;
        if (list == null || list.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletDialogHelper", "hy: no bankcard show new only");
            linkedList.add(null);
        } else {
            int i18 = 0;
            for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 : list) {
                linkedList.add(bankcard2.field_desc);
                if (bankcard != null && bankcard.equals(bankcard2)) {
                    i17 = i18;
                }
                i18++;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                linkedList.add(null);
                if (bankcard == null) {
                    i17 = i18;
                }
            }
        }
        db5.e1.S(context, str, linkedList, i17, null, zVar);
    }
}
