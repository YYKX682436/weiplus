package ud3;

/* loaded from: classes7.dex */
public final class a {
    public final lc3.z a(lc3.a0 data, java.lang.String metaInstanceName) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(metaInstanceName, "metaInstanceName");
        java.lang.String optString = data.optString("instanceName", null);
        com.tencent.mars.xlog.Log.i("MBJsApiClearLocalDataSync", "instanceName:" + optString);
        try {
            jc3.t wi6 = ((com.tencent.mm.plugin.magicbrush.b7) ((com.tencent.mm.plugin.magicbrush.o4) i95.n0.c(com.tencent.mm.plugin.magicbrush.o4.class))).wi(r26.n0.s0(metaInstanceName, "-", metaInstanceName), optString != null ? r26.n0.s0(optString, "-", optString) : null);
            if (wi6 == null) {
                return lc3.y.f317939a;
            }
            ((ue3.f) wi6).a();
            return lc3.x.f317934a;
        } catch (java.lang.OutOfMemoryError e17) {
            com.tencent.mars.xlog.Log.e("MBGetLocalDataImpl", "clear local data oom, reason:" + e17.getMessage());
            return lc3.y.f317943e;
        }
    }
}
