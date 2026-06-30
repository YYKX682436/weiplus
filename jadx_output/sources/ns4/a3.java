package ns4;

/* loaded from: classes8.dex */
public final class a3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339434d;

    public a3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339434d = weCoinRechargeView;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339434d;
        ms4.o0 o0Var = weCoinRechargeView.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(8);
        weCoinRechargeView.finish();
        return false;
    }
}
