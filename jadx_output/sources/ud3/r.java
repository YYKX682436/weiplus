package ud3;

/* loaded from: classes7.dex */
public final class r {
    public final lc3.z a(lc3.a0 data, java.lang.String metaInstanceName) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("key");
        java.lang.String optString2 = data.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String optString3 = data.optString("instanceName", null);
        com.tencent.mars.xlog.Log.i("MBJsApiSetLocalDataSync", "key:" + optString + ",instanceName:" + optString3);
        try {
            jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString3 != null ? r26.n0.s0(optString3, "-", optString3) : null);
            if (wi6 == null) {
                return lc3.y.f317939a;
            }
            lc3.z g17 = ((ue3.f) wi6).g(optString, optString2, "String");
            lc3.z zVar = lc3.x.f317934a;
            return kotlin.jvm.internal.o.b(g17, zVar) ? zVar : g17;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.e("MBGetLocalDataImpl", "set local data oom, reason:" + e17.getMessage());
            return lc3.y.f317943e;
        }
    }
}
