package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v1 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f180663a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.w1 f180664b;

    public v1(com.tencent.mm.plugin.wallet_core.ui.w1 w1Var, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f180664b = w1Var;
        this.f180663a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            com.tencent.mm.plugin.wallet_core.ui.w1 w1Var = this.f180664b;
            w1Var.f180759d.I.setText(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = w1Var.f180759d;
            walletCardElementUI.f179901e2 = i17;
            walletCardElementUI.f179903f2 = i18;
            walletCardElementUI.f179905g2 = i19;
            walletCardElementUI.U6();
        }
        this.f180663a.b();
    }
}
