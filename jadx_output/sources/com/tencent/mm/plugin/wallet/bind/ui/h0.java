package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI f178630d;

    public h0(com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI walletResetInfoUI) {
        this.f178630d = walletResetInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI.f178589r;
        com.tencent.mm.plugin.wallet.bind.ui.WalletResetInfoUI walletResetInfoUI = this.f178630d;
        if (!walletResetInfoUI.U6()) {
            com.tencent.mars.xlog.Log.w("Micromsg.WalletResetInfoUI", "input format illegal!");
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (walletResetInfoUI.f178593g.getVisibility() == 0) {
            walletResetInfoUI.f178597n.f179552q = walletResetInfoUI.f178593g.getText();
        }
        if (walletResetInfoUI.f178592f.getVisibility() == 0) {
            com.tencent.mm.plugin.wallet_core.model.Authen authen = walletResetInfoUI.f178597n;
            java.lang.String text = walletResetInfoUI.f178592f.getText();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (text == null) {
                text = "";
            }
            authen.f179553r = text;
        }
        if (walletResetInfoUI.f178595i.getVisibility() == 0) {
            com.tencent.mm.plugin.wallet_core.model.Authen authen2 = walletResetInfoUI.f178597n;
            java.lang.String text2 = walletResetInfoUI.f178594h.getText();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            authen2.f179550o = text2 != null ? text2 : "";
            walletResetInfoUI.getInput().putString("key_mobile", com.tencent.mm.wallet_core.ui.r1.e0(walletResetInfoUI.f178597n.f179550o));
        }
        com.tencent.mm.plugin.wallet_core.model.Authen authen3 = walletResetInfoUI.f178597n;
        java.lang.String str = authen3.f179545g;
        java.lang.String str2 = authen3.f179546h;
        authen3.f179543e = 1;
        authen3.M = "+" + walletResetInfoUI.f178595i.getCountryCode();
        if (walletResetInfoUI.getInput().getBoolean("key_is_changing_balance_phone_num", false)) {
            walletResetInfoUI.doSceneProgress(zr4.a.b(walletResetInfoUI.f178597n, walletResetInfoUI.f178596m, walletResetInfoUI.getInput().getBoolean("key_isbalance", false)));
        } else {
            as4.b a17 = zr4.a.a(walletResetInfoUI.f178597n, walletResetInfoUI.f178596m, false);
            if (a17 != null) {
                walletResetInfoUI.doSceneProgress(a17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletResetInfoUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
