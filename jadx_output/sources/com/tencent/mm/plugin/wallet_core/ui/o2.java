package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o2 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f180548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.p2 f180549b;

    public o2(com.tencent.mm.plugin.wallet_core.ui.p2 p2Var, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f180549b = p2Var;
        this.f180548a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            if (i17 <= 0 || i18 <= 0 || i19 <= 0) {
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.p2 p2Var = this.f180549b;
            if (i17 == 1) {
                com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = p2Var.f180569d;
                walletCardElementUI.H.setText(walletCardElementUI.getString(com.tencent.mm.R.string.l48));
                com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI2 = p2Var.f180569d;
                walletCardElementUI2.Y1 = 9999;
                walletCardElementUI2.Z1 = 12;
                walletCardElementUI2.f179895a2 = 31;
            } else {
                p2Var.f180569d.H.setText(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
                com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI3 = p2Var.f180569d;
                walletCardElementUI3.Y1 = i17;
                walletCardElementUI3.Z1 = i18;
                walletCardElementUI3.f179895a2 = i19;
            }
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI4 = p2Var.f180569d;
            int i27 = com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI.f179893q2;
            walletCardElementUI4.U6();
        }
        this.f180548a.b();
    }
}
