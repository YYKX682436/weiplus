package ns4;

/* loaded from: classes8.dex */
public final class l2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339586e;

    public l2(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView, java.lang.String str) {
        this.f339585d = weCoinIncomeDetailView;
        this.f339586e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339585d;
        ms4.t tVar = weCoinIncomeDetailView.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        tVar.R6(3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f339586e);
        intent.putExtra("showShare", false);
        intent.putExtra(com.tencent.mm.ui.w2.f211205r, true);
        com.tencent.mm.wallet_core.ui.r1.T(weCoinIncomeDetailView.getContext(), intent);
        return true;
    }
}
