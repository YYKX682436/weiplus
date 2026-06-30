package z81;

/* loaded from: classes13.dex */
public class g implements h91.b {

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f470697d;

    /* renamed from: e, reason: collision with root package name */
    public org.json.JSONArray f470698e;

    /* renamed from: f, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg f470699f;

    /* renamed from: g, reason: collision with root package name */
    public final z81.i f470700g;

    /* renamed from: i, reason: collision with root package name */
    public final h91.b f470702i;

    /* renamed from: m, reason: collision with root package name */
    public volatile java.lang.String f470703m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f470704n;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f470707q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f470709s;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f470705o = new z81.b(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f470706p = new z81.c(this);

    /* renamed from: r, reason: collision with root package name */
    public boolean f470708r = true;

    /* renamed from: h, reason: collision with root package name */
    public final z81.h f470701h = new z81.h();

    public g(h91.b bVar) {
        this.f470702i = bVar;
        this.f470700g = new z81.i(new z81.f(bVar));
    }

    @Override // h91.b
    public void a() {
    }

    @Override // h91.b
    public void b(java.lang.Runnable runnable) {
        if (equals(this.f470702i)) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(runnable);
    }

    @Override // h91.b
    public void c(org.json.JSONArray jSONArray, h91.a aVar) {
        this.f470702i.b(new z81.d(this, jSONArray, aVar));
    }

    @Override // h91.b
    public boolean d(android.graphics.Canvas canvas) {
        if (this.f470708r) {
            this.f470700g.f470719i = false;
            return f(canvas, this.f470698e);
        }
        this.f470700g.f470719i = true;
        if (this.f470699f == null) {
            this.f470697d = false;
            return false;
        }
        if (this.f470699f.f77169h) {
            this.f470699f.getClass();
            this.f470699f.getClass();
            return f(canvas, null);
        }
        this.f470697d = false;
        java.util.List<com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper> list = this.f470699f != null ? this.f470699f.f77167f : null;
        if (list == null || list.size() == 0) {
            return false;
        }
        java.lang.System.nanoTime();
        this.f470700g.a();
        for (com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper drawActionWrapper : list) {
            try {
                if (drawActionWrapper != null) {
                    try {
                        int i17 = drawActionWrapper.f77046d;
                        if (i17 == 1) {
                            this.f470701h.b(this.f470700g, canvas, drawActionWrapper.f77048f);
                            throw new java.lang.IllegalStateException("please use draw obj " + drawActionWrapper.f77048f.toString());
                            break;
                        }
                        if (i17 != 2) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.DrawActionDelegateImpl", "unknown arg type %d", java.lang.Integer.valueOf(i17));
                        } else {
                            z81.h hVar = this.f470701h;
                            z81.i iVar = this.f470700g;
                            com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg baseDrawActionArg = drawActionWrapper.f77047e;
                            a91.d dVar = (a91.d) ((java.util.HashMap) hVar.f470710a).get(baseDrawActionArg.f77041d);
                            if (dVar != null) {
                                dVar.b(iVar, canvas, baseDrawActionArg);
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", e17);
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DrawActionDelegateImpl", e18, "", new java.lang.Object[0]);
            }
        }
        java.lang.System.nanoTime();
        java.lang.System.currentTimeMillis();
        return true;
    }

    @Override // h91.b
    public void e(org.json.JSONArray jSONArray, h91.a aVar) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.f470702i.b(new z81.e(this, jSONArray, aVar));
    }

    public final boolean f(android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        this.f470697d = false;
        if (jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        java.lang.System.nanoTime();
        this.f470700g.a();
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
            if (optJSONObject != null) {
                try {
                    this.f470701h.b(this.f470700g, canvas, optJSONObject);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DrawActionDelegateImpl", "drawAction error with method[%s], exception : %s", optJSONObject.optString(ya.b.METHOD), e17);
                }
            }
        }
        java.lang.System.nanoTime();
        java.lang.System.currentTimeMillis();
        return true;
    }
}
