package x11;

/* loaded from: classes12.dex */
public final class f0 {

    /* renamed from: m, reason: collision with root package name */
    public static final x11.d0 f451359m = new x11.d0(null);

    /* renamed from: a, reason: collision with root package name */
    public final x11.t f451360a;

    /* renamed from: b, reason: collision with root package name */
    public final w11.k0 f451361b;

    /* renamed from: c, reason: collision with root package name */
    public fp.j f451362c;

    /* renamed from: d, reason: collision with root package name */
    public long f451363d;

    /* renamed from: e, reason: collision with root package name */
    public long f451364e;

    /* renamed from: f, reason: collision with root package name */
    public long f451365f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451366g;

    /* renamed from: h, reason: collision with root package name */
    public int f451367h;

    /* renamed from: i, reason: collision with root package name */
    public int f451368i;

    /* renamed from: j, reason: collision with root package name */
    public long f451369j;

    /* renamed from: k, reason: collision with root package name */
    public long f451370k;

    /* renamed from: l, reason: collision with root package name */
    public int f451371l;

    public f0(x11.t controller, w11.k0 initScene) {
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(initScene, "initScene");
        this.f451360a = controller;
        this.f451361b = initScene;
        this.f451366g = "";
    }

    public final long a() {
        fp.j jVar = this.f451362c;
        if (jVar != null) {
            return jVar.a();
        }
        kotlin.jvm.internal.o.o("testTime");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int b() {
        x11.t tVar = this.f451360a;
        boolean booleanValue = ((java.lang.Boolean) ((jz5.n) tVar.f451403t).getValue()).booleanValue();
        ?? r17 = booleanValue;
        if (tVar.b()) {
            r17 = (booleanValue ? 1 : 0) | 2;
        }
        return p01.f.f350364a.a() ? r17 | 4 : r17;
    }

    public final void c(int i17, int i18, int i19, int i27) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f451365f;
        long j17 = elapsedRealtime - this.f451364e;
        long j18 = i19 != 0 ? j17 / i19 : 0L;
        long j19 = i19 != 0 ? elapsedRealtime / i19 : 0L;
        x11.t tVar = this.f451360a;
        long j27 = tVar.f451406w;
        int i28 = tVar.f451398o;
        long j28 = j19;
        long j29 = this.f451370k + j27;
        x11.g gVar = x11.t.D;
        long j37 = j18;
        boolean b17 = gVar.b();
        boolean c17 = gVar.c();
        int b18 = b();
        x11.d0 d0Var = f451359m;
        int a17 = d0Var.a();
        long b19 = d0Var.b();
        java.util.HashMap hashMap = tVar.f451399p;
        java.lang.Integer num = (java.lang.Integer) hashMap.get(5);
        if (num == null) {
            num = 0;
        }
        int intValue = num.intValue();
        java.lang.Integer num2 = (java.lang.Integer) hashMap.get(2);
        if (num2 == null) {
            num2 = 0;
        }
        int intValue2 = num2.intValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "INIT DONE: hash:" + this.f451361b.hashCode() + " time:" + elapsedRealtime + " netCost:" + j29 + " newInitCnt:" + i27 + " newInitCost:" + j27 + "initRequestTimes" + this.f451367h + " batchRequestTimes:" + this.f451368i + " initContactCost:" + this.f451369j + " initAndBatchCost:" + this.f451370k + " cmdCnt:" + i19 + " finishCmdCnt:" + i28 + " msgNum:" + intValue + " contactNum:" + intValue2 + " err:[" + i17 + ',' + i18 + "] wait:" + this.f451364e + " cExeTime:" + j17 + " cExeTimePer:" + j37 + ",tPer:" + j28 + " isGetExptBeforeInit:" + b17 + " forceInitContact:" + c17 + " innerVersion:" + b18 + " cpuCoreNum:" + a17 + " memorySize:" + b19 + " sessionId:" + this.f451366g);
        try {
            com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct newInitPerformanceStruct = new com.tencent.mm.autogen.mmdata.rpt.NewInitPerformanceStruct();
            newInitPerformanceStruct.f59688e = b18;
            newInitPerformanceStruct.f59689f = elapsedRealtime;
            newInitPerformanceStruct.f59690g = j28;
            newInitPerformanceStruct.f59691h = j17;
            newInitPerformanceStruct.f59692i = j37;
            newInitPerformanceStruct.f59687d = newInitPerformanceStruct.b("reversion", com.tencent.mm.sdk.platformtools.z.f193109e, true);
            newInitPerformanceStruct.f59693j = i18;
            newInitPerformanceStruct.f59694k = i19;
            newInitPerformanceStruct.f59696m = i28;
            newInitPerformanceStruct.f59695l = j29;
            newInitPerformanceStruct.f59697n = this.f451371l;
            newInitPerformanceStruct.f59698o = b17 ? 1L : 0L;
            newInitPerformanceStruct.f59701r = a17;
            newInitPerformanceStruct.f59702s = b19;
            newInitPerformanceStruct.f59700q = newInitPerformanceStruct.b("sessionid", this.f451366g, true);
            newInitPerformanceStruct.f59707x = intValue;
            newInitPerformanceStruct.f59708y = intValue2;
            x11.b0.f451350a.a(newInitPerformanceStruct, null);
            newInitPerformanceStruct.k();
            if (i18 == 0) {
                jz5.g gVar2 = p01.b.f350360a;
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) p01.b.f350360a).getValue()).putInt("init_version", b18);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneInit.dkInit", th6, "report err", new java.lang.Object[0]);
        }
    }

    public final void d() {
        if (this.f451363d == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordStartTimer ignore");
            return;
        }
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.f451363d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneInit.dkInit", "recordStartTimer waitTime:%s", java.lang.Long.valueOf(elapsedRealtime));
        this.f451364e += elapsedRealtime;
        this.f451363d = -1L;
    }
}
