package de1;

/* loaded from: classes.dex */
public abstract class b {
    public static final java.lang.String a(com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, int i17, java.lang.String errMsg, java.util.Map map) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        java.util.Map map2 = de1.a.f229369a;
        jc1.d dVar = (jc1.d) de1.a.f229369a.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            java.lang.String q17 = k0Var.q(errMsg, dVar, map);
            kotlin.jvm.internal.o.f(q17, "makeReturnJson(...)");
            return q17;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCardErrnoMigration", "makeReturnJson, errCode: " + i17 + ", errMsg: " + errMsg + ", errInfo is null, falling back");
        if (r26.n0.N(errMsg)) {
            errMsg = "TransitCard internal error: " + i17;
        }
        if (errMsg == null) {
            errMsg = "fail:internal error";
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!(map instanceof java.util.HashMap)) {
            map = map == null ? new java.util.HashMap() : new java.util.HashMap(map);
        }
        map.put("errno", 4);
        java.lang.String t17 = k0Var.t(errMsg, map);
        kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
        return t17;
    }
}
