package ka1;

/* loaded from: classes7.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f306000a;

    /* renamed from: b, reason: collision with root package name */
    public final int f306001b;

    /* renamed from: c, reason: collision with root package name */
    public final int f306002c;

    /* renamed from: d, reason: collision with root package name */
    public int f306003d;

    /* renamed from: e, reason: collision with root package name */
    public int f306004e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.report.quality.t1 f306005f;

    public j(com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime qualitySessionRuntime, com.tencent.mm.plugin.appbrand.report.quality.t1 t1Var) {
        this.f306000a = qualitySessionRuntime.f88135e;
        this.f306002c = qualitySessionRuntime.f88136f;
        this.f306001b = qualitySessionRuntime.f88139i;
        this.f306005f = t1Var;
    }

    public void a(boolean z17) {
        com.tencent.mm.plugin.appbrand.report.quality.t1 t1Var = this.f306005f;
        if (t1Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.quality.p1 p1Var = t1Var.f88328c;
        if (p1Var != null) {
            this.f306003d = p1Var.ordinal();
        } else {
            this.f306003d = 0;
        }
        this.f306004e = t1Var.f88337l;
        int i17 = this.f306002c;
        int i18 = this.f306001b;
        if (z17) {
            if (t1Var != null) {
                int i19 = t1Var.f88336k;
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.String str = this.f306000a;
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f306003d);
                int i27 = t1Var.f88338m;
                g0Var.d(14959, str, valueOf, valueOf2, valueOf3, 2, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f306004e));
                com.tencent.mars.xlog.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportCpu cpu = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(this.f306004e), java.lang.Integer.valueOf(this.f306003d));
            }
            if (t1Var != null) {
                int i28 = t1Var.f88336k;
                int i29 = t1Var.f88334i;
                int i37 = t1Var.f88335j;
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var2.d(14959, this.f306000a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f306003d), 3, java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f306004e));
                java.lang.String str2 = this.f306000a;
                java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf5 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf6 = java.lang.Integer.valueOf(this.f306003d);
                int i38 = t1Var.f88332g;
                g0Var2.d(14959, str2, valueOf4, valueOf5, valueOf6, 101, java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f306004e));
                java.lang.String str3 = this.f306000a;
                java.lang.Integer valueOf7 = java.lang.Integer.valueOf(i18);
                java.lang.Integer valueOf8 = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf9 = java.lang.Integer.valueOf(this.f306003d);
                int i39 = t1Var.f88333h;
                g0Var2.d(14959, str3, valueOf7, valueOf8, valueOf9, 102, java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f306004e));
                g0Var2.d(14959, this.f306000a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f306003d), 104, java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f306004e));
                com.tencent.mars.xlog.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportMemory pid = [%d] native = [%d] dalvik = [%d] delta = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i29), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(this.f306004e), java.lang.Integer.valueOf(this.f306003d));
            }
        }
        if (t1Var == null) {
            return;
        }
        int i47 = t1Var.f88336k;
        int i48 = t1Var.f88326a;
        com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var3.d(14959, this.f306000a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f306003d), 1, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f306004e));
        com.tencent.mars.xlog.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportFps fps = [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f306004e), java.lang.Integer.valueOf(this.f306003d));
        int i49 = (int) t1Var.f88327b;
        if (i49 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Kv_14959", "variance == -1!");
        } else {
            g0Var3.d(14959, this.f306000a, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f306003d), 105, java.lang.Integer.valueOf(i49), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f306004e));
            com.tencent.mars.xlog.Log.i("MicroMsg.Kv_14959", "Kv_14959.reportFps variance fps = [%d] eventid: [%d] duration = [%d] runtimeCount = [%d] canvasType = [%d]", java.lang.Integer.valueOf(i49), 105, java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(this.f306004e), java.lang.Integer.valueOf(this.f306003d));
        }
    }
}
