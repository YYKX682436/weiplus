package zf1;

/* loaded from: classes7.dex */
public final class h implements uf.h {

    /* renamed from: e, reason: collision with root package name */
    public static final zf1.b f472627e = new zf1.b(null);

    /* renamed from: d, reason: collision with root package name */
    public final uf.f f472628d;

    public h(uf.f fVar, kotlin.jvm.internal.i iVar) {
        this.f472628d = fVar;
    }

    @Override // uf.j
    public void a() {
        zf1.d dVar = new zf1.d();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        d(dVar, jSONObject);
    }

    @Override // uf.j
    public void b() {
        zf1.c cVar = new zf1.c();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        d(cVar, jSONObject);
    }

    @Override // uf.j
    public void c(int i17) {
    }

    public final void d(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, org.json.JSONObject jSONObject) {
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.LivePlayerCastEventHandler", "dispatchJsEvent, event: " + n5Var.k() + ", data: " + jSONObject2);
        com.tencent.mm.plugin.appbrand.jsapi.l m17 = ((uf.o1) this.f472628d).f427073e.m();
        if (m17 == null) {
            return;
        }
        n5Var.r(jSONObject2);
        if (m17 instanceof com.tencent.mm.plugin.appbrand.e9) {
            m17.i(n5Var, null);
            com.tencent.mm.plugin.appbrand.page.v5 V0 = ((com.tencent.mm.plugin.appbrand.e9) m17).V0();
            if (V0 != null) {
                V0.i(n5Var, null);
                return;
            }
            return;
        }
        if (!(m17 instanceof com.tencent.mm.plugin.appbrand.page.v5)) {
            m17.i(n5Var, null);
            return;
        }
        m17.i(n5Var, null);
        com.tencent.mm.plugin.appbrand.e9 v37 = ((com.tencent.mm.plugin.appbrand.page.v5) m17).v3();
        if (v37 != null) {
            v37.i(n5Var, null);
        }
    }

    @Override // uf.j
    public void f() {
        zf1.f fVar = new zf1.f();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        d(fVar, jSONObject);
    }

    @Override // uf.j
    public void g(boolean z17) {
        uf.g2 g2Var = new uf.g2();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("state", z17 ? ya.b.SUCCESS : "fail");
        d(g2Var, jSONObject);
    }

    @Override // uf.j
    public void i() {
        uf.e2 e2Var = new uf.e2();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        d(e2Var, jSONObject);
    }

    @Override // uf.j
    public void j(boolean z17) {
        uf.f2 f2Var = new uf.f2();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        jSONObject.put("state", z17 ? ya.b.SUCCESS : "fail");
        d(f2Var, jSONObject);
    }

    @Override // uf.j
    public void l(int i17, int i18) {
    }

    @Override // uf.j
    public void m() {
        zf1.g gVar = new zf1.g();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        d(gVar, jSONObject);
    }

    @Override // uf.j
    public void onPause() {
        zf1.e eVar = new zf1.e();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("viewId", ((uf.o1) this.f472628d).f427072d);
        jSONObject.put("type", "DLNA");
        d(eVar, jSONObject);
    }
}
