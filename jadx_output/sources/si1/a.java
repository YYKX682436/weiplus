package si1;

/* loaded from: classes7.dex */
public class a extends com.tencent.mm.plugin.appbrand.x {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.o6 f408223d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.d0 f408224e;

    /* renamed from: f, reason: collision with root package name */
    public final vd1.b f408225f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.SparseIntArray f408226g;

    public a(com.tencent.mm.plugin.appbrand.o6 o6Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var) {
        super(o6Var, d0Var, o6Var.X1);
        this.f408226g = new android.util.SparseIntArray();
        this.f408223d = o6Var;
        this.f408224e = d0Var;
        this.f408225f = o6Var.f86176k2;
    }

    @Override // com.tencent.mm.plugin.appbrand.x, com.tencent.mm.plugin.appbrand.jsapi.k
    public void a(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        synchronized (this.f408226g) {
            this.f408226g.delete(i17);
        }
        if (android.text.TextUtils.isEmpty(str3)) {
            return;
        }
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        if ((o45.wf.f343034l || o45.wf.f343033k) && "fail:internal error invalid js component".equals(str3)) {
            throw new java.lang.ClassCastException(java.lang.String.format("Mismatch api(%s) component", k0Var.k()));
        }
        this.f408225f.b(i17, str3);
    }

    @Override // com.tencent.mm.plugin.appbrand.x, com.tencent.mm.plugin.appbrand.jsapi.k
    public boolean c(com.tencent.mm.plugin.appbrand.jsapi.k0 api, java.lang.String str, java.lang.String str2, int i17, com.tencent.mm.plugin.appbrand.jsapi.j jVar) {
        vd1.b bVar = this.f408225f;
        com.tencent.mm.plugin.appbrand.jsapi.d0 component = this.f408224e;
        java.lang.String str3 = "";
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f408223d;
        if (o6Var.q2()) {
            try {
                java.lang.String str4 = o6Var.u0().f77283i;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str4 != null) {
                    str3 = str4;
                }
            } catch (java.lang.Exception unused) {
            }
        } else {
            com.tencent.mm.plugin.appbrand.page.d5 x07 = o6Var.x0();
            str3 = x07 == null ? null : x07.getCurrentUrl();
        }
        bVar.getClass();
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(api, "api");
        if (!((java.util.HashSet) com.tencent.mm.plugin.appbrand.report.model.e0.f87937a).contains(api.k())) {
            vd1.g gVar = (vd1.g) bVar.f435563b.f435560a.poll();
            if (gVar == null) {
                gVar = new vd1.g();
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            gVar.f435580a = component;
            gVar.f435581b = api;
            gVar.f435582c = str;
            gVar.f435583d = elapsedRealtime;
            gVar.f435584e = str3;
            gVar.f435585f = 0;
            android.util.SparseArray sparseArray = bVar.f435562a;
            synchronized (sparseArray) {
                sparseArray.put(i17, gVar);
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.d0 env = this.f408224e;
        java.util.LinkedList linkedList = si1.q1.f408286a;
        kotlin.jvm.internal.o.g(env, "env");
        if (si1.q1.f408286a.contains(api.k()) ? !com.tencent.mm.sdk.platformtools.f9.PaymentAppbrandJsb.l(env.getF147807d(), new si1.p1(jVar, api, env)) : false) {
            return true;
        }
        return super.c(api, str, str2, i17, jVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.x, com.tencent.mm.plugin.appbrand.jsapi.k
    public void d(int i17, java.lang.String str) {
        this.f408225f.b(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.x
    public void f(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, int i18) {
        java.lang.Object obj;
        android.util.SparseArray sparseArray = this.f408225f.f435562a;
        synchronized (sparseArray) {
            obj = sparseArray.get(i17, null);
        }
        vd1.g gVar = (vd1.g) obj;
        if (gVar != null) {
            gVar.f435585f = i18;
        }
        if (4 == i18) {
            java.util.HashSet hashSet = m05.f.f322560a;
            java.lang.String apiName = k0Var.k();
            kotlin.jvm.internal.o.g(apiName, "apiName");
            if (m05.f.f322560a.contains(apiName)) {
                java.lang.String functionId = "AppBrand-".concat(apiName);
                kotlin.jvm.internal.o.g(functionId, "functionId");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(24610, "4", functionId, "3", "", "", java.lang.Integer.valueOf(com.tencent.mm.ui.bk.C() ? 1 : 0), java.lang.Integer.valueOf(j65.e.b() ? 1 : 0), java.lang.Integer.valueOf(i65.a.q(com.tencent.mm.sdk.platformtools.x2.f193071a) > 1.0f ? 1 : 0));
                r11 = 1;
            }
            if (r11 != 0) {
                synchronized (this.f408226g) {
                    this.f408226g.delete(i17);
                }
            }
        }
    }

    public void g(final java.lang.String str, final int i17) {
        this.f408224e.getAsyncHandler().post(new java.lang.Runnable() { // from class: si1.a$$a
            @Override // java.lang.Runnable
            public final void run() {
                boolean z17;
                si1.a aVar = si1.a.this;
                int i18 = i17;
                java.lang.String apiName = str;
                synchronized (aVar.f408226g) {
                    z17 = aVar.f408226g.get(i18, 0) == 1;
                }
                java.util.HashSet hashSet = m05.f.f322560a;
                boolean z18 = !z17;
                kotlin.jvm.internal.o.g(apiName, "apiName");
                if (z18 || !m05.f.f322560a.contains(apiName)) {
                    return;
                }
                m05.i.f322570a.c("AppBrand-".concat(apiName), "2", "maybe not invoked");
            }
        });
    }

    public boolean h(java.lang.String apiName, int i17) {
        java.util.HashSet hashSet = m05.f.f322560a;
        kotlin.jvm.internal.o.g(apiName, "apiName");
        if (!m05.f.f322560a.contains(apiName)) {
            return false;
        }
        synchronized (this.f408226g) {
            this.f408226g.put(i17, 1);
        }
        return true;
    }
}
