package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class f7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI f180273d;

    public f7(com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI) {
        this.f180273d = walletPwdConfirmUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI walletPwdConfirmUI = this.f180273d;
        java.lang.String string = walletPwdConfirmUI.getInput().getString("key_new_pwd1");
        java.lang.String md5Value = walletPwdConfirmUI.f180075d.getMd5Value();
        java.lang.String string2 = walletPwdConfirmUI.getInput().getString("kreq_token");
        java.lang.String string3 = walletPwdConfirmUI.getInput().getString("key_verify_code");
        java.util.Objects.toString(walletPwdConfirmUI.f180077f);
        if (string == null || !string.equals(md5Value)) {
            com.tencent.mm.wallet_core.a.b(walletPwdConfirmUI, com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR);
        } else {
            at4.z0 z0Var = new at4.z0();
            z0Var.f14023b = walletPwdConfirmUI.f180075d.getText();
            z0Var.f14035n = walletPwdConfirmUI.f180077f;
            z0Var.f14025d = string2;
            z0Var.f14024c = string3;
            z0Var.f14028g = walletPwdConfirmUI.getInput().getBoolean("key_is_bind_bankcard", true);
            if (com.tencent.mm.wallet_core.a.g(walletPwdConfirmUI).r()) {
                z0Var.f14022a = "4";
            } else {
                z0Var.f14022a = "1";
            }
            com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = (com.tencent.mm.plugin.wallet_core.model.FavorPayInfo) walletPwdConfirmUI.getInput().getParcelable("key_favor_pay_info");
            if (favorPayInfo != null) {
                z0Var.f14030i = favorPayInfo.f179670g;
                z0Var.f14031j = favorPayInfo.f179667d;
            }
            walletPwdConfirmUI.getNetController().d(z0Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdConfirmUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
