package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class d3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178135e;

    public d3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, java.util.List list) {
        this.f178135e = walletLqtPlanAddUI;
        this.f178134d = list;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178135e;
        hs4.d dVar = walletLqtPlanAddUI.Z;
        if (dVar != null) {
            dVar.c();
            if (i17 < 0 || i17 >= this.f178134d.size()) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Y6(walletLqtPlanAddUI);
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.ArrayList) walletLqtPlanAddUI.G).get(i17);
            r45.n85 n85Var = walletLqtPlanAddUI.I;
            n85Var.f381167h = bankcard.field_bindSerial;
            n85Var.f381165f = bankcard.field_bankcardType;
            n85Var.f381174r = bankcard.field_bankName;
            n85Var.f381166g = bankcard.field_bankcardTail;
            walletLqtPlanAddUI.f7();
            walletLqtPlanAddUI.h7();
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Z6(walletLqtPlanAddUI);
        }
    }
}
