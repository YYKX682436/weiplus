package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI f181050d;

    public l(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI walletECardLogoutUI) {
        this.f181050d = walletECardLogoutUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI.f181027o;
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardLogoutUI walletECardLogoutUI = this.f181050d;
        walletECardLogoutUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardLogoutUI", "do logout");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_show_detail", false);
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
        bankcard.field_bindSerial = walletECardLogoutUI.f181034m;
        bankcard.field_bankcardType = walletECardLogoutUI.f181035n;
        bundle.putParcelable("key_bankcard", bankcard);
        bundle.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        bundle.putString("key_check_pwd_title", walletECardLogoutUI.getString(com.tencent.mm.R.string.kk6));
        com.tencent.mm.wallet_core.a.j(walletECardLogoutUI, sr4.b.class, bundle, null);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
