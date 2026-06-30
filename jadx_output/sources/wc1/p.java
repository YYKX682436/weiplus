package wc1;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.plugin.appbrand.jsapi.o0 {
    public static final int CTRL_INDEX = 468;
    public static final java.lang.String NAME = "onLoadSubPackageTaskStateChange";

    public static void x(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        y(lVar, str, str2, str3, -1, -1L, -1L, null);
    }

    public static void y(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, long j18, java.lang.String str4) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        wc1.t tVar = (wc1.t) lVar.k(wc1.t.class);
        if (tVar == null) {
            tVar = new wc1.t(d0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "the provided state:" + str2);
        if (!(str2.equals(ya.b.SUCCESS) || str2.equals("fail") || tVar.f444495d.contains(str2) || !tVar.f444496e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: formatEventCallback, but it has not been listened: taskId: %s, state: %s, progress: %d, currentWritten: %d, totalWritten: %d", str, str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiCreateLoadSubPackageTask", "hy: formatEventCallback taskId: %s, state: %s, progress: %d, currentWritten: %d, totalWritten: %d", str, str2, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("taskId", str);
        hashMap.put("state", str2);
        hashMap.put("moduleName", str3);
        if (i17 >= 0) {
            hashMap.put("progress", java.lang.Integer.valueOf(i17));
        }
        if (j17 >= 0) {
            hashMap.put("totalBytesWritten", java.lang.Long.valueOf(j17));
        }
        if (j18 >= 0) {
            hashMap.put("totalBytesExpectedToWrite", java.lang.Long.valueOf(j18));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        if (u46.l.c(str2, ya.b.SUCCESS)) {
            com.tencent.luggage.sdk.jsapi.component.service.v0.f47555b.a(lVar, str3, jSONObject);
        }
        if (str4 != null && (u46.l.c(str2, ya.b.SUCCESS) || u46.l.c(str2, "fail"))) {
            k91.a3 a3Var = (k91.a3) i95.n0.c(k91.a3.class);
            if (a3Var != null) {
                k91.r0 Di = ((k91.u0) a3Var).Di(str4);
                if (Di != null) {
                    java.util.Map map = Di.f305757a;
                    k91.m0 m0Var = (k91.m0) map.get(str3);
                    if (m0Var != null) {
                        m0Var.a();
                    }
                    map.keySet();
                    if (m0Var != null) {
                        try {
                            jSONObject.put("loadInfo", new org.json.JSONObject(m0Var.a()).toString());
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiCreateLoadSubPackageTask", "[LoadSubpackage] put loadInfo error: %s", e17.getMessage());
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "[LoadSubpackage] [%s] packageLoadInfo is null", str4);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiCreateLoadSubPackageTask", "[LoadSubpackage] IAppBrandPackageLoadService is null");
            }
        }
        wc1.p pVar = new wc1.p();
        pVar.u(lVar);
        pVar.r(jSONObject.toString());
        pVar.m();
    }
}
