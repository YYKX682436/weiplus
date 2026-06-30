package ns4;

/* loaded from: classes8.dex */
public final class i1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f339545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339546b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.na7 f339547c;

    public i1(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView, r45.na7 na7Var) {
        this.f339545a = z2Var;
        this.f339546b = weCoinEncashView;
        this.f339547c = na7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "click agree");
        this.f339545a.B();
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339546b;
        java.lang.String str = weCoinEncashView.f179162t;
        if (str != null) {
            ms4.n nVar = weCoinEncashView.f179154i;
            if (nVar != null) {
                nVar.N6(str, this.f339547c.f381215g, 1, weCoinEncashView);
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
    }
}
