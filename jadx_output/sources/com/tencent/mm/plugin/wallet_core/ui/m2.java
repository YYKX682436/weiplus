package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m2 implements com.tencent.mm.ui.widget.picker.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.picker.o f180487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.n2 f180488b;

    public m2(com.tencent.mm.plugin.wallet_core.ui.n2 n2Var, com.tencent.mm.ui.widget.picker.o oVar) {
        this.f180488b = n2Var;
        this.f180487a = oVar;
    }

    @Override // com.tencent.mm.ui.widget.picker.n
    public void onResult(boolean z17, int i17, int i18, int i19) {
        if (z17) {
            if (i17 <= 0 || i18 <= 0 || i19 <= 0) {
                return;
            }
            com.tencent.mm.plugin.wallet_core.ui.n2 n2Var = this.f180488b;
            n2Var.f180505d.G.setText(java.lang.String.format("%04d%02d%02d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
            com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI walletCardElementUI = n2Var.f180505d;
            walletCardElementUI.f179896b2 = i17;
            walletCardElementUI.f179897c2 = i18;
            walletCardElementUI.f179899d2 = i19;
            walletCardElementUI.U6();
        }
        this.f180487a.b();
    }
}
