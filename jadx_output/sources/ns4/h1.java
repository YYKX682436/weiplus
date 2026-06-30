package ns4;

/* loaded from: classes8.dex */
public final class h1 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f339536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.na7 f339538c;

    public h1(com.tencent.mm.ui.widget.dialog.z2 z2Var, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView, r45.na7 na7Var) {
        this.f339536a = z2Var;
        this.f339537b = weCoinEncashView;
        this.f339538c = na7Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinEncashView", "click disagree ");
        this.f339536a.B();
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView = this.f339537b;
        java.lang.String str = weCoinEncashView.f179162t;
        if (str != null) {
            ms4.n nVar = weCoinEncashView.f179154i;
            if (nVar != null) {
                nVar.N6(str, this.f339538c.f381215g, 2, weCoinEncashView);
            } else {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
        }
    }
}
