package ns4;

/* loaded from: classes8.dex */
public final class u1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339661d;

    public u1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339661d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        int i17 = com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.E;
        androidx.appcompat.app.AppCompatActivity context = this.f339661d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        os4.h.e(context, (ms4.a) obj, null);
    }
}
