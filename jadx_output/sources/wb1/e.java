package wb1;

/* loaded from: classes7.dex */
public final class e implements com.tencent.mm.plugin.appbrand.jsapi.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f444366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wb1.h f444367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicbrush.MagicBrush f444368f;

    public e(com.tencent.mm.plugin.appbrand.jsapi.l lVar, wb1.h hVar, com.tencent.magicbrush.MagicBrush magicBrush) {
        this.f444366d = lVar;
        this.f444367e = hVar;
        this.f444368f = magicBrush;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.x
    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandWebGLPluginHandler", "foreground");
        vb1.b bVar = vb1.d.f434473c;
        java.lang.String appId = ((com.tencent.mm.plugin.appbrand.page.v5) this.f444366d).getAppId();
        kotlin.jvm.internal.o.f(appId, "getAppId(...)");
        vb1.d a17 = bVar.a(appId);
        a17.c(this.f444367e.f444377i);
        if (a17.d() == 1) {
            this.f444368f.f();
        }
    }
}
