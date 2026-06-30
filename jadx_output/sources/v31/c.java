package v31;

/* loaded from: classes7.dex */
public final class c implements x31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.t f433087a;

    public c(com.tencent.mm.plugin.appbrand.jsapi.t tVar) {
        this.f433087a = tVar;
    }

    @Override // x31.a
    public void b(int i17, java.lang.String status, java.lang.String extra) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", java.lang.Integer.valueOf(i17));
        hashMap.put("status", status);
        hashMap.put("extra", extra);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiInsertMiniProgramPlayableView", "playableService callback result:".concat(gVar));
        com.tencent.mm.plugin.appbrand.jsapi.t tVar = this.f433087a;
        kotlin.jvm.internal.o.e(tVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.AppBrandPageView");
        com.tencent.mm.plugin.appbrand.e9 v37 = ((com.tencent.mm.plugin.appbrand.page.v5) tVar).v3();
        if (v37 != null) {
            w31.a aVar = new w31.a();
            aVar.f82374f = gVar;
            v37.p(aVar);
        }
    }
}
