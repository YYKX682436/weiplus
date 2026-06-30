package ns4;

/* loaded from: classes8.dex */
public final class g3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339532e;

    public g3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView2) {
        this.f339531d = weCoinRechargeView;
        this.f339532e = weCoinRechargeView2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "setOnMenuSelectedListener click.");
        boolean z17 = false;
        if (menuItem != null && menuItem.getItemId() == 1) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339531d;
            ms4.o0 o0Var = weCoinRechargeView.f179185d;
            if (o0Var == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            ns4.f3 f3Var = new ns4.f3(weCoinRechargeView, this.f339532e);
            o0Var.f331096r.postValue(java.lang.Boolean.TRUE);
            new ks4.f().l().h(new ms4.l0(o0Var, f3Var));
        }
    }
}
