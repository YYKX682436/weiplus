package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class t5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hs4.d f178378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f178379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI f178381g;

    public t5(com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI, hs4.d dVar, int i17, java.lang.String str) {
        this.f178381g = walletLqtSaveFetchUI;
        this.f178378d = dVar;
        this.f178379e = i17;
        this.f178380f = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        hs4.d dVar = this.f178378d;
        if (dVar == null) {
            return;
        }
        int i18 = this.f178379e;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI walletLqtSaveFetchUI = this.f178381g;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI.U6(walletLqtSaveFetchUI, i18);
        dVar.c();
        if (i17 < ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).size()) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) ((java.util.LinkedList) walletLqtSaveFetchUI.f178073x0).get(i17);
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
            java.lang.String str = this.f178380f;
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
