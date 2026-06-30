package ns4;

/* loaded from: classes4.dex */
public final class c3 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339486d;

    public c3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339486d = weCoinRechargeView;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339486d;
        g4Var.d(1, weCoinRechargeView.getResources().getColor(com.tencent.mm.R.color.a2y), weCoinRechargeView.getString(com.tencent.mm.R.string.f493682l94));
    }
}
