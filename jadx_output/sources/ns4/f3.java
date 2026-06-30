package ns4;

/* loaded from: classes8.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339525e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView2) {
        super(1);
        this.f339524d = weCoinRechargeView;
        this.f339525e = weCoinRechargeView2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView = this.f339524d;
        if (booleanValue) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(weCoinRechargeView);
            u1Var.g(weCoinRechargeView.getString(com.tencent.mm.R.string.l9d));
            u1Var.a(false);
            u1Var.m(com.tencent.mm.R.string.l9e);
            u1Var.q(false);
        } else {
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            ns4.e3 e3Var = new ns4.e3(weCoinRechargeView);
            ((vd0.j2) q1Var).getClass();
            v24.o0.b(this.f339525e, 8L, false, e3Var);
        }
        return jz5.f0.f302826a;
    }
}
