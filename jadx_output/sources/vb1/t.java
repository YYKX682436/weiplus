package vb1;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f434498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434499e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f434500f;

    public t(com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f434498d = n7Var;
        this.f434499e = i17;
        this.f434500f = magicBrush;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public final void c() {
        com.tencent.mars.xlog.Log.i("JsApiInsertHTMLCanvasElement", "background");
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f434498d;
        if (n7Var.getRuntime().L0()) {
            return;
        }
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = n7Var.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vb1.d a17 = bVar.a(appId);
        a17.b(this.f434499e);
        if (a17.d() == 0) {
            this.f434500f.e();
        }
    }
}
