package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class b implements et4.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI f177865a;

    public b(com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI walletBalanceFetchPwdInputUI) {
        this.f177865a = walletBalanceFetchPwdInputUI;
    }

    @Override // et4.g0
    public void a() {
    }

    @Override // et4.g0
    public void b(java.lang.String str, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI walletBalanceFetchPwdInputUI = this.f177865a;
        if (walletBalanceFetchPwdInputUI.getProcess() != null) {
            walletBalanceFetchPwdInputUI.getNetController().d(str);
        }
    }

    @Override // et4.g0
    public void onCancel() {
        com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI walletBalanceFetchPwdInputUI = this.f177865a;
        walletBalanceFetchPwdInputUI.finish();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16398, walletBalanceFetchPwdInputUI.f177766g, 8, "", "");
    }
}
