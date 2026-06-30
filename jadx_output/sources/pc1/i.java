package pc1;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f353360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pc1.g f353361e;

    public i(pc1.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f353361e = gVar;
        this.f353360d = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiStartBeaconDiscovery", "onDestroy");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f353360d;
        com.tencent.mm.plugin.appbrand.x0.e(lVar.getAppId(), this);
        pc1.d dVar = (pc1.d) ((java.util.concurrent.ConcurrentHashMap) pc1.e.f353348a).get(lVar.getAppId());
        if (dVar != null) {
            dVar.a();
            pc1.e.a(lVar.getAppId());
        }
        this.f353361e.f353351g = null;
    }
}
