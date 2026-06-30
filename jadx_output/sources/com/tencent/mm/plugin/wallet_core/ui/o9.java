package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class o9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180565e;

    public o9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180565e = walletVerifyCodeUI;
        this.f180564d = bankcard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180565e;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180564d;
        java.lang.String string = walletVerifyCodeUI.getString(com.tencent.mm.R.string.kvx, bankcard.field_desc, bankcard.field_mobile);
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI2 = this.f180565e;
        db5.e1.A(walletVerifyCodeUI, string, "", walletVerifyCodeUI2.getString(com.tencent.mm.R.string.kvw), walletVerifyCodeUI2.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.wallet_core.ui.n9(this), null);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
