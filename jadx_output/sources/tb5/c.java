package tb5;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final int a() {
        c25.e eVar;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("startup_cost_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        int o17 = M.o("device_benchmark_level", Integer.MIN_VALUE);
        if (o17 != Integer.MIN_VALUE) {
            return o17;
        }
        int i17 = 0;
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            return 0;
        }
        try {
            eVar = (c25.e) gm0.j1.s(c25.e.class);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("ChattingFpsCollector", th6, "[tomys] Cannot get config value, return 0 as benchmark level.", new java.lang.Object[0]);
        }
        if (eVar == null) {
            com.tencent.mars.xlog.Log.e("ChattingFpsCollector", "[tomys] Cannot get config service on main process, return 0 as benchmark level.");
            return 0;
        }
        int b17 = ((com.tencent.mm.plugin.zero.a) eVar).b().b("ClientBenchmarkLevel", Integer.MIN_VALUE);
        if (b17 >= 0) {
            M.A("device_benchmark_level", b17);
            i17 = b17;
        } else {
            com.tencent.mars.xlog.Log.e("ChattingFpsCollector", "[tomys] Cannot get config value, return 0 as benchmark level.");
        }
        return i17;
    }
}
