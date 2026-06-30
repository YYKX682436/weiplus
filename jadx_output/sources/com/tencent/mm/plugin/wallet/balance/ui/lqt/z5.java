package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class z5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178470a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178471b;

    public z5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, java.util.List list) {
        this.f178471b = walletLqtSaveFetchUI;
        this.f178470a = list;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178471b;
        java.util.Iterator it = walletLqtSaveFetchUI.e7().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            java.util.Iterator it6 = this.f178470a.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    z17 = false;
                    break;
                }
                if (bankcard.field_bindSerial.equals(((com.tencent.mm.plugin.wallet_core.model.Bankcard) it6.next()).field_bindSerial)) {
                    z17 = true;
                    break;
                }
            }
            if (!z17) {
                walletLqtSaveFetchUI.W = bankcard.field_bindSerial;
                walletLqtSaveFetchUI.X = bankcard;
                break;
            }
        }
        walletLqtSaveFetchUI.h7(false);
        return null;
    }
}
