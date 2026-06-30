package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class m9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.model.Bankcard f180501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI f180502e;

    public m9(com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        this.f180502e = walletVerifyCodeUI;
        this.f180501d = bankcard;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "hy: user clicked on the reset info tv and is balance. ");
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletVertifyCodeUI", "forwardProcess and finish!");
        com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI walletVerifyCodeUI = this.f180502e;
        android.os.Bundle input = walletVerifyCodeUI.getInput();
        input.putInt("key_err_code", 417);
        boolean z17 = true;
        input.putBoolean("key_need_show_switch_phone", true);
        walletVerifyCodeUI.getInput().putBoolean("key_block_bind_new_card", true);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180501d;
        if (bankcard != null && !bankcard.v0()) {
            z17 = false;
        }
        input.putBoolean("key_isbalance", z17);
        com.tencent.mm.wallet_core.a.d(walletVerifyCodeUI, input);
        walletVerifyCodeUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
