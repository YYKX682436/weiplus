package ns4;

/* loaded from: classes8.dex */
public final class m3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f339594e;

    public m3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, yz5.a aVar) {
        this.f339593d = weCoinRechargeView;
        this.f339594e = aVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        ms4.o0 o0Var = this.f339593d.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(1);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21658, 1);
        this.f339594e.invoke();
        return true;
    }
}
