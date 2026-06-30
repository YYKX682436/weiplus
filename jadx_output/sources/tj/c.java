package tj;

/* loaded from: classes7.dex */
public final class c implements x31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj.d f419674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f419675b;

    public c(tj.d dVar, com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f419674a = dVar;
        this.f419675b = tVar;
    }

    @Override // x31.a
    public void b(int i17, java.lang.String status, java.lang.String extra) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.lang.String P = this.f419674a.P(i17, status);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicPlayable.JsApiInsertMiniProgramPlayableView", "playableService callback result:".concat(P));
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f419675b;
        kotlin.jvm.internal.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageView");
        com.tencent.mm.plugin.appbrand.e9 v37 = ((com.tencent.mm.plugin.appbrand.page.v5) tVar).v3();
        if (v37 != null) {
            tj.e eVar = new tj.e();
            eVar.f82374f = P;
            v37.p(eVar);
        }
    }
}
