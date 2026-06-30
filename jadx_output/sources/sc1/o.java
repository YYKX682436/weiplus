package sc1;

/* loaded from: classes7.dex */
public class o implements com.tencent.mm.plugin.appbrand.jsapi.v {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f405702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc1.f f405703e;

    public o(sc1.z zVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar, sc1.f fVar) {
        this.f405702d = tVar;
        this.f405703e = fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v
    public void c() {
        com.tencent.mm.plugin.appbrand.w0 d17 = com.tencent.mm.plugin.appbrand.x0.d(this.f405702d.getAppId());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiInsertLivePlayer", "LivePlayer enter background, pause type:%s", d17.name());
        sc1.f fVar = this.f405703e;
        sc1.k1 m17 = ((sc1.o1) fVar.f405660e).m(fVar.f405659d, d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLivePlayerView", "onBackground code:%d info:%s", java.lang.Integer.valueOf(m17.f405688a), m17.f405689b);
    }
}
