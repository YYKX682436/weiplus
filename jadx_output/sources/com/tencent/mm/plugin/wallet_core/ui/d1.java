package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI f180232d;

    public d1(com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI) {
        this.f180232d = walletBankcardIdUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11353, 1, 0);
        com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI walletBankcardIdUI = this.f180232d;
        if (walletBankcardIdUI.getProcess() == null) {
            com.tencent.mars.xlog.Log.e("Micromsg.WalletInputCardIDUI", "WalletBankcardIdUI doNext, process is null");
        } else {
            java.lang.String string = walletBankcardIdUI.getProcess().f213801c.getString("kreq_token");
            int i17 = walletBankcardIdUI.getInput().getInt("entry_scene", -1);
            int i18 = walletBankcardIdUI.getInput().getInt("real_name_verify_mode") == 4 ? 1 : 0;
            if (walletBankcardIdUI.f179863h != null) {
                ss4.z zVar = new ss4.z(walletBankcardIdUI.getPayReqKey(), null, (com.tencent.mm.pluginsdk.wallet.PayInfo) walletBankcardIdUI.getInput().getParcelable("key_pay_info"), string, walletBankcardIdUI.f179866n, i17, i18);
                zVar.f412150g = walletBankcardIdUI.f179863h.field_bankcardType;
                walletBankcardIdUI.getInput().putParcelable("key_history_bankcard", walletBankcardIdUI.f179863h);
                walletBankcardIdUI.doSceneProgress(zVar);
            } else if (walletBankcardIdUI.U6()) {
                walletBankcardIdUI.doSceneProgress(new ss4.z(walletBankcardIdUI.getPayReqKey(), walletBankcardIdUI.f179860e.getText(), (com.tencent.mm.pluginsdk.wallet.PayInfo) walletBankcardIdUI.getInput().getParcelable("key_pay_info"), string, walletBankcardIdUI.f179866n, i17, i18));
            } else {
                db5.e1.i(walletBankcardIdUI, com.tencent.mm.R.string.krm, com.tencent.mm.R.string.f490573yv);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletBankcardIdUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
