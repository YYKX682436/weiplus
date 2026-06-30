package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class b implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI f181038a;

    public b(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI) {
        this.f181038a = walletECardBindCardListUI;
    }

    @Override // com.tencent.mm.wallet_core.g
    public android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletECardBindCardListUI", "bind card end, resultCode: %s, feedbackData: %s", java.lang.Integer.valueOf(i17), bundle);
        com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI = this.f181038a;
        if (i17 == -1) {
            com.tencent.mm.plugin.wallet_core.model.BindCardOrder bindCardOrder = (com.tencent.mm.plugin.wallet_core.model.BindCardOrder) bundle.getParcelable("key_bindcard_value_result");
            if (bindCardOrder != null) {
                r45.od odVar = new r45.od();
                odVar.f382155e = bundle.getString("key_bind_card_type");
                odVar.f382159i = bindCardOrder.f179617n;
                odVar.f382157g = bundle.getString("key_mobile");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382159i) && !com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382155e) && !com.tencent.mm.sdk.platformtools.t8.K0(odVar.f382157g)) {
                    walletECardBindCardListUI.getNetController().d(odVar);
                    return null;
                }
            }
            int i18 = com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI.f181009o;
            walletECardBindCardListUI.V6();
        }
        walletECardBindCardListUI.f181015i = false;
        return null;
    }
}
