package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180383e;

    public k9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180383e = walletVerifyCodeUI;
        this.f180382d = bankcard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180383e;
        com.tencent.mm.wallet_core.h process = walletVerifyCodeUI.getProcess();
        if (walletVerifyCodeUI.f180123t && process != null && "PayProcess".equals(process.e())) {
            com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180382d;
            int i17 = bankcard != null ? bankcard.v0() ? 1 : bankcard.D0() ? 3 : 2 : 0;
            com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(walletVerifyCodeUI.getContext());
            i0Var.g(com.tencent.mm.R.string.l0l);
            java.lang.String string = walletVerifyCodeUI.getString(com.tencent.mm.R.string.l0k, walletVerifyCodeUI.V6());
            com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
            aVar.f211729s = string;
            aVar.A = true;
            i0Var.f(com.tencent.mm.R.string.l0j);
            i0Var.e(com.tencent.mm.R.string.l0i);
            aVar.E = new com.tencent.mm.plugin.wallet_core.ui.g9(this, i17);
            aVar.F = new com.tencent.mm.plugin.wallet_core.ui.h9(this, i17);
            i0Var.h();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15443, 1);
            walletVerifyCodeUI.f180123t = false;
        } else {
            walletVerifyCodeUI.W6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
