package dg1;

/* loaded from: classes13.dex */
public class f implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f232275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f232276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f232277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dg1.g f232278g;

    public f(dg1.g gVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        this.f232278g = gVar;
        this.f232275d = tVar;
        this.f232276e = lVar;
        this.f232277f = jSONObject;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onDestroy");
        this.f232275d.K(this);
        this.f232278g.f232282m = null;
        vc1.h3.a(this.f232276e.getAppId(), vc1.e3.b(this.f232276e, this.f232277f));
        this.f232278g.f232279g.quitSafely();
    }
}
