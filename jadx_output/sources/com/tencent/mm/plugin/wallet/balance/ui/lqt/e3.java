package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class e3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f178155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI f178156b;

    public e3(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI, java.util.List list) {
        this.f178156b = walletLqtPlanAddUI;
        this.f178155a = list;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI walletLqtPlanAddUI = this.f178156b;
        hs4.d dVar = walletLqtPlanAddUI.Z;
        if (dVar != null) {
            dVar.c();
            int i17 = walletLqtPlanAddUI.Z.f284628m;
            if (i17 < 0 || i17 >= this.f178155a.size()) {
                com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtPlanAddUI.Y6(walletLqtPlanAddUI);
                return;
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.ArrayList) walletLqtPlanAddUI.G).get(walletLqtPlanAddUI.Z.f284628m);
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
