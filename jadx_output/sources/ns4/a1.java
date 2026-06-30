package ns4;

/* loaded from: classes8.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339432d;

    public a1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView) {
        this.f339432d = weCoinEncashView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339432d;
        ms4.n nVar = weCoinEncashView.f179154i;
        if (nVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        nVar.P6(20);
        ((com.tencent.mm.wallet_core.ui.WalletBaseUI) weCoinEncashView).mPayResultType = 4;
        if (!weCoinEncashView.needConfirmFinish()) {
            weCoinEncashView.finish();
            return true;
        }
        weCoinEncashView.hideVKB();
        weCoinEncashView.showDialog(1000);
        return true;
    }
}
