package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class l7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass46 f178264b;

    public l7(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass46 anonymousClass46, java.util.List list) {
        this.f178264b = anonymousClass46;
        this.f178263a = list;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI;
        boolean z17;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.AnonymousClass46 anonymousClass46 = this.f178264b;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI2 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this;
        int i17 = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.R1;
        java.util.Iterator it = walletLqtSaveFetchUI2.e7().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            walletLqtSaveFetchUI = com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.this;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) it.next();
            java.util.Iterator it6 = this.f178263a.iterator();
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
