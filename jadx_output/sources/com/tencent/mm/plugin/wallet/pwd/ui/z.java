package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class z extends com.tencent.mm.wallet_core.ui.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI f179125d;

    public z(com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI) {
        this.f179125d = walletDigitalCertUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.x, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        if (view.getTag() instanceof com.tencent.mm.wallet_core.model.o1) {
            com.tencent.mm.wallet_core.model.o1 o1Var = (com.tencent.mm.wallet_core.model.o1) view.getTag();
            com.tencent.mm.plugin.wallet.pwd.ui.WalletDigitalCertUI walletDigitalCertUI = this.f179125d;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) walletDigitalCertUI.getContext(), 1, true);
            android.widget.TextView textView = new android.widget.TextView(walletDigitalCertUI.getContext());
            textView.setGravity(17);
            textView.setHeight(i65.a.b(walletDigitalCertUI.getContext(), 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(walletDigitalCertUI.getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView.setText(walletDigitalCertUI.getString(com.tencent.mm.R.string.kto, o1Var.f213958a));
            k0Var.s(textView, false);
            k0Var.Z1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.wallet.pwd.ui.x(this);
            k0Var.f211881s = new com.tencent.mm.plugin.wallet.pwd.ui.y(this, o1Var);
            k0Var.v();
        }
    }
}
