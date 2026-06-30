package ds1;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds1.j f242837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f242838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ds1.j jVar, java.lang.String str) {
        super(0);
        this.f242837d = jVar;
        this.f242838e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f242837d.getClass();
        java.lang.String str = this.f242838e;
        if (str != null) {
            ts1.o oVar = new ts1.o(str, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(str, false), nu4.b0.P, com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94447c, null, null, null, null, false, null, null, 2032, null);
            oVar.d();
            oVar.f();
            oVar.n();
            if (com.tencent.mm.sdk.platformtools.y3.a(oVar.f(), oVar.n())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] onUrlExposed cache expired");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21075, 500, str, "", 3, 0);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                jSONArray.put(str);
                jSONObject.put("pageUrlList", jSONArray);
                od.l lVar = fs1.j.f266293f;
                if (lVar != null) {
                    lVar.f344518c.a(new od.d("urlExposed", jSONObject));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
