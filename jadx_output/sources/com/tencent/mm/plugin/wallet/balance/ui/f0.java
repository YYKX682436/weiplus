package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class f0 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI f177888d;

    public f0(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI) {
        this.f177888d = walletBalanceFetchUI;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        java.lang.String str;
        java.lang.String str2;
        if (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66) {
            com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI walletBalanceFetchUI = this.f177888d;
            walletBalanceFetchUI.f177784f = com.tencent.mm.sdk.platformtools.t8.F(walletBalanceFetchUI.f177787i.getText(), 0.0d);
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBalanceFetchUI.f177783e;
            if (bankcard != null) {
                java.lang.String str3 = bankcard.field_bankcardType;
                str2 = bankcard.field_bindSerial;
                str = str3;
            } else {
                at4.n a17 = at4.n.a();
                if (a17.b()) {
                    db5.e1.s(walletBalanceFetchUI, a17.f13902b, walletBalanceFetchUI.getString(com.tencent.mm.R.string.f490573yv));
                } else {
                    str = "";
                    str2 = str;
                }
            }
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard2 = walletBalanceFetchUI.f177783e;
            if (bankcard2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(bankcard2.field_forbidWord)) {
                db5.t7.makeText(walletBalanceFetchUI.getContext(), walletBalanceFetchUI.f177783e.field_forbidWord, 0).show();
            } else if (walletBalanceFetchUI.f177784f <= 0.0d || !walletBalanceFetchUI.f177787i.n()) {
                db5.t7.makeText(walletBalanceFetchUI.getContext(), com.tencent.mm.R.string.kfm, 0).show();
            } else if (walletBalanceFetchUI.f177784f > vr4.f1.wi().Ai().f13999h.O2) {
                db5.t7.makeText(walletBalanceFetchUI.getContext(), com.tencent.mm.R.string.keq, 0).show();
            } else if (walletBalanceFetchUI.f177784f > vr4.f1.wi().Ai().f13999h.Q2) {
                db5.t7.makeText(walletBalanceFetchUI.getContext(), com.tencent.mm.R.string.ker, 0).show();
            } else {
                com.tencent.mm.wallet_core.b.a().getClass();
                com.tencent.mm.wallet_core.b.a().getClass();
                walletBalanceFetchUI.e7(21, walletBalanceFetchUI.f177784f, "1", str, str2, walletBalanceFetchUI.I);
                walletBalanceFetchUI.hideWcKb();
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = walletBalanceFetchUI.L;
            objArr[1] = 7;
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard3 = walletBalanceFetchUI.f177783e;
            objArr[2] = bankcard3 != null ? bankcard3.field_bankcardType : "";
            objArr[3] = bankcard3 != null ? bankcard3.field_bindSerial : "";
            g0Var.d(16398, objArr);
        }
        return true;
    }
}
