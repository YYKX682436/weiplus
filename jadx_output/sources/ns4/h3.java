package ns4;

/* loaded from: classes8.dex */
public final class h3 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f339541b;

    public h3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f339540a = weCoinRechargeView;
        this.f339541b = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        ms4.o0 o0Var = this.f339540a.f179185d;
        if (o0Var == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        o0Var.O6(10);
        this.f339541b.B();
    }
}
