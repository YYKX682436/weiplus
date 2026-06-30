package wb1;

/* loaded from: classes7.dex */
public final class f implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f444369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wb1.h f444370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f444371f;

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar, wb1.h hVar, com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f444369d = lVar;
        this.f444370e = hVar;
        this.f444371f = magicBrush;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "background");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f444369d;
        if (((com.tencent.mm.plugin.appbrand.page.v5) lVar).getRuntime().L0()) {
            return;
        }
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = ((com.tencent.mm.plugin.appbrand.page.v5) lVar).getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vb1.d a17 = bVar.a(appId);
        a17.b(this.f444370e.f444377i);
        if (a17.d() == 0) {
            this.f444371f.e();
        }
    }
}
