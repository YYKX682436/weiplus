package ns4;

/* loaded from: classes8.dex */
public final class t implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView f339654d;

    public t(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView weCoinBalanceDetailView) {
        this.f339654d = weCoinBalanceDetailView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView.f179139o;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinBalanceDetailView weCoinBalanceDetailView = this.f339654d;
        weCoinBalanceDetailView.T6(23);
        weCoinBalanceDetailView.finish();
        return false;
    }
}
