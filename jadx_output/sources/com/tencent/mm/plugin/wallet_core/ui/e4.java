package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI f180248e;

    public e4(com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI, java.lang.String str) {
        this.f180248e = walletConfirmCardIDUI;
        this.f180247d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI walletConfirmCardIDUI = this.f180248e;
        java.lang.String str = walletConfirmCardIDUI.f180000e.get3DesEncrptData();
        if (str == null || !str.equals(this.f180247d)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 0, 2);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 0, 1);
        }
        walletConfirmCardIDUI.getClass();
        com.tenpay.bankcard.TenpaySegmentEditText.setSalt(java.lang.Long.toString(c01.id.a() / 1000));
        int i17 = walletConfirmCardIDUI.getInput().getInt("entry_scene", -1);
        int i18 = walletConfirmCardIDUI.getInput().getInt("real_name_verify_mode") == 4 ? 1 : 0;
        java.lang.String string = walletConfirmCardIDUI.getInput().getString("kreq_token");
        if (string == null || string.isEmpty()) {
            walletConfirmCardIDUI.doSceneProgress(new ss4.z(3, walletConfirmCardIDUI.getPayReqKey(), walletConfirmCardIDUI.f180000e.getEncryptDataWithHash(false), (com.tencent.mm.pluginsdk.wallet.PayInfo) walletConfirmCardIDUI.getInput().getParcelable("key_pay_info"), null, -1, i17, i18));
        } else {
            int i19 = walletConfirmCardIDUI.getInput().getInt("key_bind_scene");
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletConfirmCardIDUI", "doNext has token, bind_scene:" + i19);
            walletConfirmCardIDUI.doSceneProgress(new ss4.z(walletConfirmCardIDUI.getPayReqKey(), walletConfirmCardIDUI.f180000e.getEncryptDataWithHash(false), (com.tencent.mm.pluginsdk.wallet.PayInfo) walletConfirmCardIDUI.getInput().getParcelable("key_pay_info"), string, i19, i17, i18));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
