package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class p9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180578e;

    public p9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180578e = walletVerifyCodeUI;
        this.f180577d = bankcard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess3 and finish!");
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180578e;
        at4.t tVar = walletVerifyCodeUI.f180124u;
        if (tVar != null) {
            if ((tVar.f13963b == 0 || com.tencent.mm.sdk.platformtools.t8.K0(tVar.f13964c)) ? false : true) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13731, 9);
            }
        }
        android.os.Bundle input = walletVerifyCodeUI.getInput();
        input.putInt("key_err_code", 417);
        input.putBoolean("key_need_show_switch_phone", true);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180577d;
        input.putBoolean("key_isbalance", bankcard == null || bankcard.v0());
        com.tencent.mm.wallet_core.a.d(walletVerifyCodeUI, input);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
