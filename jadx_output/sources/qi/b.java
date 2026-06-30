package qi;

/* loaded from: classes12.dex */
public abstract class b implements ri.e0, ei.a {

    /* renamed from: d, reason: collision with root package name */
    public qi.c f363452d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Application f363453e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f363454f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f363455g = 0;

    public void a(boolean z17) {
    }

    public java.lang.String b() {
        return getClass().getName();
    }

    public void c(android.app.Application application, qi.c cVar) {
        if (this.f363453e != null || this.f363452d != null) {
            throw new java.lang.RuntimeException("plugin duplicate init, application or plugin listener is not null");
        }
        this.f363455g = 1;
        this.f363453e = application;
        this.f363452d = cVar;
        cVar.c(this);
        com.tencent.matrix.lifecycle.owners.f0.f52742x.a(this);
    }

    public void d(ri.d0 d0Var) {
        if (d0Var.f395860b == null) {
            d0Var.f395860b = b();
        }
        d0Var.f395863e = this;
        org.json.JSONObject jSONObject = d0Var.f395862d;
        try {
            java.lang.String str = d0Var.f395860b;
            if (str != null) {
                jSONObject.put("tag", str);
            }
            int i17 = d0Var.f395859a;
            if (i17 != 0) {
                jSONObject.put("type", i17);
            }
            jSONObject.put("process", oj.m.b(this.f363453e));
            jSONObject.put("time", java.lang.System.currentTimeMillis());
        } catch (org.json.JSONException e17) {
            oj.j.b("Matrix.Plugin", "json error", e17);
        }
        this.f363452d.a(d0Var);
    }

    public void e() {
        int i17 = this.f363455g;
        if (i17 == 8) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already destroyed");
        }
        if (i17 == 2) {
            throw new java.lang.RuntimeException("plugin start, but plugin has been already started");
        }
        this.f363455g = 2;
        qi.c cVar = this.f363452d;
        if (cVar == null) {
            throw new java.lang.RuntimeException("plugin start, plugin listener is null");
        }
        cVar.b(this);
    }
}
