package vb1;

/* loaded from: classes7.dex */
public final class s implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f434495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f434496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f434497f;

    public s(com.tencent.mm.plugin.appbrand.page.n7 n7Var, int i17, com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f434495d = n7Var;
        this.f434496e = i17;
        this.f434497f = magicBrush;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public final void b() {
        com.tencent.mars.xlog.Log.i("JsApiInsertHTMLCanvasElement", "foreground");
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = this.f434495d.getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vb1.d a17 = bVar.a(appId);
        a17.c(this.f434496e);
        if (a17.d() == 1) {
            this.f434497f.f();
        }
    }
}
