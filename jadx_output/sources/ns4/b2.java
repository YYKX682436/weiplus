package ns4;

/* loaded from: classes8.dex */
public final class b2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339439d;

    public b2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339439d = weCoinIncomeDetailView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339439d;
        ms4.t tVar = weCoinIncomeDetailView.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar.R6(10);
        weCoinIncomeDetailView.finish();
        return true;
    }
}
