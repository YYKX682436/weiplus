package sd;

/* loaded from: classes8.dex */
public abstract class l0 implements sd.d {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f406618d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public td.c f406619e;

    public void a() {
    }

    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.k0 k0Var = new sd.k0(this, str, jSONObject);
        td.c cVar = this.f406619e;
        if (cVar == null) {
            cVar = td.c.f417583a;
        }
        cVar.a(str, k0Var);
    }

    public void c(sd.e eVar) {
        sd.j0 j0Var = new sd.j0(this, eVar);
        td.c cVar = this.f406619e;
        if (cVar == null) {
            cVar = td.c.f417583a;
        }
        cVar.a(eVar.b(), j0Var);
    }

    public abstract od.l d();

    public abstract java.lang.String e();

    public void f(java.lang.Class cls, sd.d dVar) {
        try {
            sd.c cVar = (sd.c) cls.newInstance();
            if (dVar == null) {
                dVar = this;
            }
            try {
                cVar.f406598d = dVar;
                this.f406618d.put(cVar.b(), cls);
                d().f344520e.put(cVar.b(), new sd.h0(this, cVar));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("Luggage.LuggageRuntime", "registerJsApi: " + e17);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("Luggage.LuggageRuntime", "JsApi Initialize failed, %s, %s", cls.getName(), e18);
        }
    }

    public void g(java.util.List list, sd.d dVar) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            f((java.lang.Class) it.next(), dVar);
        }
    }
}
