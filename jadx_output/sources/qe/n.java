package qe;

/* loaded from: classes7.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.appbrand.y env, int i17, int i18, com.tencent.mm.protobuf.f fVar) {
        kotlin.jvm.internal.o.g(env, "env");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_ID, java.lang.Integer.valueOf(i17));
        hashMap.put("api", java.lang.Integer.valueOf(i18));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, com.tencent.mm.plugin.appbrand.utils.v3.e(fVar != null ? fVar.toByteArray() : null));
        com.tencent.mm.plugin.appbrand.utils.v3.d(env.getJsRuntime(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) env.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
        env.p(new qe.o(hashMap, null));
    }
}
