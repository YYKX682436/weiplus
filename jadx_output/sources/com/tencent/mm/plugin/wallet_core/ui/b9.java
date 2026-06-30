package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b9 implements com.tencent.mm.plugin.wallet_core.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.jd f180153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI f180154b;

    public b9(com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI, r45.jd jdVar) {
        this.f180154b = walletSwitchVerifyPhoneUI;
        this.f180153a = jdVar;
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.a4
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI walletSwitchVerifyPhoneUI = this.f180154b;
        r45.jd jdVar = this.f180153a;
        int i17 = com.tencent.mm.plugin.wallet_core.ui.WalletSwitchVerifyPhoneUI.f180102g;
        walletSwitchVerifyPhoneUI.getClass();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = new com.tencent.mm.plugin.wallet_core.model.Bankcard();
        bankcard.field_bindSerial = jdVar.f377713g;
        bankcard.field_mobile = jdVar.f377711e;
        bankcard.field_bankcardType = jdVar.f377712f;
        bankcard.field_desc = jdVar.f377714h;
        walletSwitchVerifyPhoneUI.getInput().putParcelable("key_bankcard", bankcard);
        if (((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d.a(bankcard.field_bankcardType) == null) {
            walletSwitchVerifyPhoneUI.doSceneProgress(new ss4.z("", "", null), true);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "go to reset directly");
            walletSwitchVerifyPhoneUI.U6();
        }
    }
}
