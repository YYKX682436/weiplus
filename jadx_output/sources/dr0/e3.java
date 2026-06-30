package dr0;

/* loaded from: classes12.dex */
public final class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final dr0.e3 f242420d = new dr0.e3();

    @Override // java.lang.Runnable
    public final void run() {
        dr0.t0 t0Var = dr0.t0.f242540k;
        t0Var.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.p()) {
            if (!mm.o.h(false, 1, null)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "checkAlive abort: report=" + mm.o.h(false, 1, null) + ", pull=false");
                return;
            }
            dr0.h1 h1Var = dr0.p1.f242489d;
            dr0.p1 a17 = h1Var.a();
            java.lang.String PROCESS_MAIN = com.tencent.mm.sdk.platformtools.w9.f193053a;
            kotlin.jvm.internal.o.f(PROCESS_MAIN, "PROCESS_MAIN");
            boolean j17 = a17.j(PROCESS_MAIN);
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "checkAlive: " + j17 + ", count=" + t0Var.f242542b);
            t0Var.i().collectCheckAliveCount((long) t0Var.f242542b);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("ver", 1);
            linkedHashMap.put("report-alive", java.lang.Boolean.valueOf(j17));
            dr0.p1 a18 = h1Var.a();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            a18.getClass();
            linkedHashMap.put("batt-ign-opt", java.lang.Boolean.valueOf(com.tencent.mm.booter.o.f(context)));
            linkedHashMap.put("report-aliveCount", java.lang.Integer.valueOf(t0Var.f242542b));
            dr0.w1 w1Var = dr0.a3.f242403d;
            linkedHashMap.put("report-suicideMin", java.lang.Integer.valueOf(w1Var.a().e()));
            linkedHashMap.put("report-suicideMode", java.lang.Integer.valueOf(w1Var.a().n()));
            linkedHashMap.put("report-pullMainProc", java.lang.Boolean.FALSE);
            w1Var.a().getClass();
            int i17 = com.tencent.mm.sdk.platformtools.o4.L().getInt("battery-accproclife-pull-up-mode", -1);
            if (i17 == -1) {
                i17 = new java.util.Random().nextInt(3) + 0;
                com.tencent.mm.sdk.platformtools.o4.L().putInt("battery-accproclife-pull-up-mode", i17);
            }
            linkedHashMap.put("report-pullMainMode", java.lang.Integer.valueOf(i17));
            java.lang.String[] strArr = new java.lang.String[4];
            strArr[0] = j17 ? "1" : "0";
            strArr[1] = java.lang.String.valueOf(t0Var.f242542b);
            strArr[2] = java.lang.String.valueOf(w1Var.a().n());
            strArr[3] = java.lang.String.valueOf(w1Var.a().e());
            ap.a.a(1, "accProcCheckAlive", null, linkedHashMap, strArr);
            if (j17 || t0Var.f242542b > 6) {
                t0Var.f242542b = 0;
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.AccMonitor", "post checkAlive");
            t0Var.f242542b++;
            t0Var.i().collectCheckAliveCount(t0Var.f242542b);
            dr0.q3.j(dr0.q3.f242513t, 600000L, null, 2, null);
        }
    }
}
