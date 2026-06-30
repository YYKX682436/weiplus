package of1;

/* loaded from: classes7.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.w1 f344913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(of1.w1 w1Var) {
        super(0);
        this.f344913d = w1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        si1.g gVar;
        java.lang.String str = com.tencent.mm.plugin.appbrand.jsapi.webview.j.NAME;
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f344913d.f345034e;
        boolean z17 = false;
        if (n7Var != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = n7Var.getRuntime();
            ze.n nVar = runtime instanceof ze.n ? (ze.n) runtime : null;
            if (nVar != null && (gVar = nVar.X1) != null) {
                z17 = gVar.a(n7Var, com.tencent.mm.plugin.appbrand.jsapi.webview.j.class);
            }
            com.tencent.mars.xlog.Log.i("Luggage.EnableAutoplayPolicy", "enableAutoPlay appId:" + n7Var.getAppId() + " isSupport:" + z17);
        } else {
            com.tencent.mars.xlog.Log.w("Luggage.EnableAutoplayPolicy", "enableAutoPlay fail, component is null");
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
