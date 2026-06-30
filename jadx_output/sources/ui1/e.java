package ui1;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.utils.c {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f428043h = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f428044g;

    public e(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, kotlin.jvm.internal.i iVar) {
        super(1);
        this.f428044g = appBrandRuntime;
        ui1.b bVar = new ui1.b(this);
        kotlin.jvm.internal.o.g(appBrandRuntime, "<this>");
        java.lang.String str = appBrandRuntime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        cf.m mVar = new cf.m(str);
        bVar.invoke(mVar);
        appBrandRuntime.N.a(mVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.utils.c
    public void e(com.tencent.mm.plugin.appbrand.utils.a aVar, yz5.a onEnd) {
        boolean z17;
        com.tencent.mm.plugin.appbrand.networking.c0 c0Var;
        ui1.c task = (ui1.c) aVar;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJSApiUserAuthExecutor", "runTask " + task.f428039f);
        ui1.d dVar = new ui1.d(task.f428038e, onEnd);
        ui1.p pVar = ui1.t.f428082d;
        ui1.a0 a0Var = task.f428037d;
        if (!a0Var.f428025a.isRunning()) {
            dVar.onCancel();
            return;
        }
        com.tencent.mm.plugin.appbrand.y yVar = a0Var.f428025a;
        java.lang.String appId = yVar.getAppId();
        ui1.p pVar2 = ui1.t.f428082d;
        java.lang.String str = a0Var.f428026b;
        java.util.Set c17 = pVar2.c(appId, false);
        if (c17 != null) {
            synchronized (c17) {
                z17 = c17.contains(str);
            }
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requireUserAuth, before cgi, appId %s, api %s, found in AUTH_CACHE, return ok", appId, str);
            dVar.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "requestUSerAuth, before cgi, appId %s, api %s", appId, str);
        ui1.t tVar = new ui1.t(dVar, a0Var);
        java.lang.String appId2 = yVar.getAppId();
        if (yVar.t3() instanceof ze.n ? ((ze.n) yVar.t3()).o2().f86101d : false) {
            c0Var = xh1.g.f454507m.a(yVar);
        } else {
            c0Var = (com.tencent.mm.plugin.appbrand.networking.c0) yVar.q(com.tencent.mm.plugin.appbrand.networking.c0.class);
            java.util.Objects.requireNonNull(c0Var);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandJsApiUserAuth", "checkAuth appId = %s,mApi = %s", appId2, str);
        r45.g24 g24Var = new r45.g24();
        g24Var.f374834d = appId2;
        g24Var.f374838h = str;
        g24Var.f374836f = tVar.f428085c;
        g24Var.f374837g = new r45.nd7();
        g24Var.f374840m = yVar.t3().S0(str);
        java.lang.String str2 = a0Var.f428027c;
        if (!u46.l.e(u46.l.u(str2))) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
                r45.me7 me7Var = new r45.me7();
                g24Var.f374839i = me7Var;
                me7Var.f380432d = jSONObject.optString("appId", null);
                ne.e eVar = (ne.e) t37.p0(ne.e.class, false);
                if (eVar != null) {
                    r45.me7 me7Var2 = g24Var.f374839i;
                    me7Var2.f380434f = eVar.a(me7Var2.f380432d);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (t37 instanceof ze.n) {
            g24Var.f374837g.f381296e = ((ze.n) t37).l2().f87790f;
        }
        if (yVar instanceof com.tencent.mm.plugin.appbrand.e9) {
            g24Var.f374837g.f381297f = 1;
        } else if (yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
            g24Var.f374837g.f381297f = 2;
        }
        ((km5.q) c0Var.e1("/cgi-bin/mmbiz-bin/js-authorize", appId2, g24Var, r45.h24.class).n(new ui1.j(tVar, c0Var, appId2)).a(new ui1.i(tVar))).s(new ui1.h(tVar, appId2, str));
    }
}
