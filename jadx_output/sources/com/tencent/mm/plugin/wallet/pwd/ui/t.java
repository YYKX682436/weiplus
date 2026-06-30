package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.ui.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI f179071d;

    public t(com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI) {
        this.f179071d = walletDigitalCertUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.x, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI = this.f179071d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletDigitalCertUI.getContext(), 1, true);
        android.widget.TextView textView = new android.widget.TextView(walletDigitalCertUI.getContext());
        textView.setGravity(17);
        textView.setHeight(i65.a.b(walletDigitalCertUI.getContext(), 56));
        textView.setTextSize(12.0f);
        textView.setTextColor(walletDigitalCertUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
        textView.setText(walletDigitalCertUI.getString(com.tencent.mm.R.string.kto, walletDigitalCertUI.getString(com.tencent.mm.R.string.ktp)));
        k0Var.s(textView, false);
        k0Var.Z1 = true;
        k0Var.f211872n = new com.tencent.mm.plugin.wallet.pwd.ui.r(this);
        k0Var.f211881s = new com.tencent.mm.plugin.wallet.pwd.ui.s(this);
        k0Var.v();
    }
}
