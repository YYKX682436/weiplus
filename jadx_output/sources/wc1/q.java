package wc1;

/* loaded from: classes7.dex */
public class q extends yc1.b implements wc1.s {
    public static final int CTRL_INDEX = 467;
    public static final java.lang.String NAME = "createLoadSubPackageTask";

    public final void C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2) {
        wc1.p.x(lVar, str, "fail", str2);
    }

    public void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, ph1.g gVar, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: loadResult: %s, with appId[%s] moduleName[%s]", gVar.toString(), str2, str3);
        int ordinal = gVar.ordinal();
        if (ordinal == 0) {
            wc1.p.y(lVar, str, ya.b.SUCCESS, str3, -1, -1L, -1L, str2);
            return;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: should not happen cancel!!");
                wc1.p.y(lVar, str, "fail", str3, -1, -1L, -1L, str2);
                return;
            } else if (ordinal != 3) {
                return;
            }
        }
        wc1.p.y(lVar, str, "fail", str3, -1, -1L, -1L, str2);
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "loadTaskId";
    }

    @Override // gb1.m
    public void d(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        java.lang.String appId = lVar.getAppId();
        java.lang.String moduleName = jSONObject.optString("moduleName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(moduleName)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: null or nil moduleName");
            C(d0Var, str, moduleName);
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
        if (t37 == null || t37.L0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: runtime is not in valid state!");
            C(d0Var, str, moduleName);
            return;
        }
        ph1.h hVar = t37.R;
        if (hVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: modularizingHelper null!");
            C(d0Var, str, moduleName);
            return;
        }
        if (!hVar.e() && !moduleName.equals(com.tencent.mm.plugin.appbrand.appcache.ModulePkgInfo.MAIN_MODULE_NAME)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: not support modularizing but still called JsApiCreateLoadSubPackageTask");
            C(d0Var, str, moduleName);
            return;
        }
        boolean c17 = hVar.c(moduleName);
        k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
        if (a3Var != null) {
            k91.u0 u0Var = (k91.u0) a3Var;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(moduleName, "moduleName");
            k91.r0 Bi = u0Var.Bi(appId);
            java.util.Map map = Bi.f305757a;
            java.lang.Object obj = map.get(moduleName);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(moduleName, obj);
            }
            ((k91.m0) obj).f305672a = c17;
            u0Var.Ri(appId, Bi);
            u0Var.Ui(appId, moduleName, c17 ? 100.0f : 0.0f);
        }
        try {
            hVar.a(moduleName, new wc1.m(this, d0Var, str, appId, moduleName), new wc1.n(this, moduleName, new java.util.HashSet(), appId, d0Var, str), false);
        } catch (java.lang.IllegalAccessError e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiCreateLoadSubPackageTask", e17, "loadModule(%s)", moduleName);
            C(d0Var, str, moduleName);
        } catch (java.lang.NullPointerException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiCreateLoadSubPackageTask", e18, "loadModule(%s) npe, isRunning:%b", moduleName, java.lang.Boolean.valueOf(lVar.isRunning()));
            C(d0Var, str, moduleName);
        }
    }

    @Override // gb1.m
    public java.lang.String getTaskId() {
        return wc1.s.g() + "";
    }
}
