package ns4;

/* loaded from: classes8.dex */
public final class l1 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f339584b;

    public l1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView, long j17) {
        this.f339583a = weCoinEncashView;
        this.f339584b = j17;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339583a;
        ms4.n nVar = weCoinEncashView.f179154i;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar.P6(4);
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = weCoinEncashView.f179151f;
        if (walletFormView == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        walletFormView.setText(com.tencent.mm.wallet_core.ui.r1.o(os4.h.c(this.f339584b + "", "100", 2)));
        com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = weCoinEncashView.f179151f;
        if (walletFormView2 == null) {
            kotlin.jvm.internal.o.o("mInputMoneyText");
            throw null;
        }
        walletFormView2.getContentEt().requestFocus();
        weCoinEncashView.showWcKb();
    }
}
