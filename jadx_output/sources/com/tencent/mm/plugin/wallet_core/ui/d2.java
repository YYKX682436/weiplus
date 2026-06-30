package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI f180233a;

    public d2(com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI) {
        this.f180233a = walletCardElementUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        this.f180233a.hideVKB();
        this.f180233a.hideTenpayKB();
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = this.f180233a;
            int i17 = walletCardElementUI.f179915m2;
            if (i17 == -1) {
                return;
            }
            walletCardElementUI.f179917n2 = i17;
            int intValue = ((java.lang.Integer) walletCardElementUI.W.a().get(this.f180233a.f179915m2)).intValue();
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI2 = this.f180233a;
            if (walletCardElementUI2.B1 != intValue) {
                walletCardElementUI2.B1 = intValue;
                walletCardElementUI2.f179907h2 = walletCardElementUI2.f179934y.getText();
                this.f180233a.f179934y.setText(((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.b(this.f180233a.getContext(), this.f180233a.B1));
                com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI3 = this.f180233a;
                walletCardElementUI3.Z6(walletCardElementUI3.f179937z, walletCardElementUI3.B1);
                this.f180233a.f179937z.d();
                this.f180233a.f179937z.e();
                this.f180233a.c7(false);
            }
        }
        this.f180233a.f179915m2 = -1;
    }
}
