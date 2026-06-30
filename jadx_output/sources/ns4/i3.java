package ns4;

/* loaded from: classes8.dex */
public final class i3 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView f339549a;

    public i3(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView weCoinRechargeView) {
        this.f339549a = weCoinRechargeView;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        ms4.o0 o0Var = this.f339549a.f179185d;
        if (o0Var != null) {
            o0Var.P6();
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        ms4.o0 o0Var = this.f339549a.f179185d;
        if (o0Var != null) {
            o0Var.P6();
        } else {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
    }
}
