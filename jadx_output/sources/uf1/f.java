package uf1;

/* loaded from: classes7.dex */
public class f implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f427158a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f427159b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf.f f427160c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf1.a f427161d;

    public f(uf1.a aVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, sf.f fVar) {
        this.f427161d = aVar;
        this.f427158a = tVar;
        this.f427159b = lVar;
        this.f427160c = fVar;
    }

    @Override // sf.e
    public void a(int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.t) this.f427159b;
        android.view.View view = this.f427161d.f427139h.getView();
        com.tencent.mm.plugin.appbrand.jsapi.s customViewContainer = tVar.getCustomViewContainer();
        android.view.ViewGroup n17 = customViewContainer != null ? ((com.tencent.mm.plugin.appbrand.page.ia) customViewContainer).n(0, false, false) : null;
        if (n17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.SameLayer.AppBrandCameraPluginHandler", "onBackground(%d), removeCameraNativeView failed null topLevelContainer, appId:%s", tVar.getAppId());
        } else {
            n17.removeView(view);
        }
    }

    @Override // sf.e
    public void b() {
        uf1.a.r(this.f427161d, this.f427158a);
    }

    @Override // sf.e
    public void onDestroy() {
        this.f427160c.f();
        this.f427161d.f427139h = null;
    }
}
