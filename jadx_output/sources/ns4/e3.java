package ns4;

/* loaded from: classes8.dex */
public final class e3 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339512a;

    public e3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339512a = weCoinRechargeView;
    }

    @Override // wd0.p1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onCancalBtn.");
    }

    @Override // wd0.p1
    public void onSuccess() {
        ((vd0.j2) ((wd0.q1) i95.n0.c(wd0.q1.class))).wi(false, 8L);
        ms4.o0 o0Var = this.f339512a.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.P6();
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinRechargeView", "changeSwitchWechatForStatus2CommonTips onPositionBtn.");
    }
}
