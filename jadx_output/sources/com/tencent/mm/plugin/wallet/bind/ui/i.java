package com.tencent.mm.plugin.wallet.bind.ui;

/* loaded from: classes9.dex */
public class i implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.bind.ui.j f178631a;

    public i(com.tencent.mm.plugin.wallet.bind.ui.j jVar) {
        this.f178631a = jVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        if (i17 != 0) {
            return;
        }
        com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI walletBankcardDetailUI = this.f178631a.f178633d;
        int i18 = com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI.f178540n;
        walletBankcardDetailUI.getClass();
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = walletBankcardDetailUI.f178541d;
        walletBankcardDetailUI.doSceneProgress(new tr4.a(bankcard.field_bankcardType, bankcard.field_bindSerial), true);
    }
}
