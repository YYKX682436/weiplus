package ns4;

/* loaded from: classes8.dex */
public final class q1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339623d;

    public q1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339623d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.E;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339623d;
        weCoinIncomeDetailView.removeAllOptionMenu();
        if (str != null) {
            java.lang.String string = weCoinIncomeDetailView.getString(com.tencent.mm.R.string.l9v);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            weCoinIncomeDetailView.addTextOptionMenu(0, string, new ns4.l2(weCoinIncomeDetailView, str), null, com.tencent.mm.ui.fb.TRANSPARENT_BG_BLACK_TEXT);
        }
    }
}
