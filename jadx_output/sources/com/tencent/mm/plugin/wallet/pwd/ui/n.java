package com.tencent.mm.plugin.wallet.pwd.ui;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI f179037d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI) {
        super(false);
        this.f179037d = walletDelayTransferSettingUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        int i17 = com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI.f178839u;
        com.tencent.mm.plugin.wallet.pwd.ui.WalletDelayTransferSettingUI walletDelayTransferSettingUI = this.f179037d;
        java.lang.String string = walletDelayTransferSettingUI.V6(16) ? walletDelayTransferSettingUI.getString(com.tencent.mm.R.string.kku) : walletDelayTransferSettingUI.V6(32) ? walletDelayTransferSettingUI.getString(com.tencent.mm.R.string.kks) : walletDelayTransferSettingUI.getString(com.tencent.mm.R.string.kkz);
        if (android.text.TextUtils.isEmpty(string)) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(walletDelayTransferSettingUI.getContext(), 1, 2);
        android.view.View inflate = android.view.View.inflate(walletDelayTransferSettingUI.getContext(), com.tencent.mm.R.layout.f489165bj2, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odb);
        textView.setText(string);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        z2Var.s(inflate);
        java.lang.String str = walletDelayTransferSettingUI.f178848o;
        if (android.text.TextUtils.isEmpty(str)) {
            str = walletDelayTransferSettingUI.getString(com.tencent.mm.R.string.kky);
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(walletDelayTransferSettingUI.getContext());
        linearLayout.setOrientation(1);
        android.widget.TextView textView2 = new android.widget.TextView(walletDelayTransferSettingUI.getContext());
        linearLayout.addView(textView2);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(textView2.getLayoutParams());
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = i65.a.f(walletDelayTransferSettingUI.getContext(), com.tencent.mm.R.dimen.f479646bl);
        layoutParams.bottomMargin = i65.a.f(walletDelayTransferSettingUI.getContext(), com.tencent.mm.R.dimen.f479688cn);
        textView2.setTextColor(walletDelayTransferSettingUI.getResources().getColor(com.tencent.mm.R.color.f478719fa));
        textView2.setTextSize(1, 15.0f);
        textView2.setText(str);
        textView2.setLayoutParams(layoutParams);
        z2Var.j(linearLayout);
        z2Var.m(walletDelayTransferSettingUI.getResources().getString(com.tencent.mm.R.string.f490347sg), walletDelayTransferSettingUI.getResources().getString(com.tencent.mm.R.string.f490507x1));
        z2Var.o(0);
        com.tencent.mm.plugin.wallet.pwd.ui.o oVar = new com.tencent.mm.plugin.wallet.pwd.ui.o(walletDelayTransferSettingUI, z2Var);
        com.tencent.mm.plugin.wallet.pwd.ui.p pVar = new com.tencent.mm.plugin.wallet.pwd.ui.p(walletDelayTransferSettingUI, z2Var);
        z2Var.D = oVar;
        z2Var.E = pVar;
        z2Var.C();
    }
}
