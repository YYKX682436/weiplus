package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class u5 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hs4.d f178395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f178396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178398d;

    public u5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, hs4.d dVar, int i17, java.lang.String str) {
        this.f178398d = walletLqtSaveFetchUI;
        this.f178395a = dVar;
        this.f178396b = i17;
        this.f178397c = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public void a() {
        hs4.d dVar = this.f178395a;
        if (dVar == null) {
            return;
        }
        int i17 = this.f178396b;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178398d;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.U6(walletLqtSaveFetchUI, i17);
        dVar.c();
        if (dVar.f284628m < ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).size()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).get(dVar.f284628m);
            walletLqtSaveFetchUI.W = bankcard.field_bindSerial;
            walletLqtSaveFetchUI.X = bankcard;
            walletLqtSaveFetchUI.h7(false);
            if (walletLqtSaveFetchUI.S != 2) {
                if (walletLqtSaveFetchUI.F && !bankcard.v0()) {
                    com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.V6(walletLqtSaveFetchUI);
                }
                walletLqtSaveFetchUI.s7(walletLqtSaveFetchUI.f178056h.getText(), false);
                return;
            }
            java.lang.String str = this.f178397c;
            if (android.text.TextUtils.isEmpty(str) || bankcard.v0()) {
                walletLqtSaveFetchUI.f178056h.d();
                return;
            }
            walletLqtSaveFetchUI.f178056h.setText(str);
            walletLqtSaveFetchUI.f178056h.getContentEt().requestFocus();
            walletLqtSaveFetchUI.showWcKb();
        }
    }
}
