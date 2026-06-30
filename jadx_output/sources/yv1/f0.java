package yv1;

/* loaded from: classes12.dex */
public final class f0 implements aw1.w {

    /* renamed from: a, reason: collision with root package name */
    public long f466026a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f466027b = new long[21];

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f466028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f466029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long[] f466030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw1.f f466031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f466032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f466033h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f466034i;

    public f0(long j17, yv1.i0 i0Var, long[] jArr, bw1.f fVar, int i17, java.util.Set set, byte[] bArr) {
        this.f466028c = j17;
        this.f466029d = i0Var;
        this.f466030e = jArr;
        this.f466031f = fVar;
        this.f466032g = i17;
        this.f466033h = set;
        this.f466034i = bArr;
    }

    @Override // aw1.w
    public void a(int i17, long j17) {
        yv1.h1.g(2, null, 2, null);
        long j18 = j17 - this.f466026a;
        yv1.i0 i0Var = this.f466029d;
        synchronized (i0Var) {
            i0Var.f466074f += j18;
        }
        yv1.g1 g1Var = this.f466029d.f466069a;
        if (g1Var != null) {
            long[] jArr = this.f466030e;
            synchronized (g1Var) {
                g1Var.f466044c -= j18;
                g1Var.f466045d -= j18;
                for (int i18 = 0; i18 < 21; i18++) {
                    long[] jArr2 = g1Var.f466053l;
                    jArr2[i18] = jArr2[i18] - (jArr[i18] - this.f466027b[i18]);
                }
            }
        }
        yv1.i0.e(this.f466029d, false, false, 2, null);
        this.f466026a = j17;
        kz5.v.o(this.f466030e, this.f466027b, 0, 0, 0, 14, null);
    }

    @Override // aw1.w
    public void b(boolean z17, long j17, int i17) {
        int i18;
        com.tencent.mm.autogen.events.AggressiveCleanCacheEvent aggressiveCleanCacheEvent = new com.tencent.mm.autogen.events.AggressiveCleanCacheEvent();
        int i19 = this.f466032g;
        am.l lVar = aggressiveCleanCacheEvent.f53972g;
        lVar.f7202a = i19;
        lVar.f7203b = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "triggering AggressiveCleanCacheEvent with groupFlags " + aggressiveCleanCacheEvent.f53972g.f7202a);
        aggressiveCleanCacheEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Done AggressiveCleanCacheEvent");
        long j18 = (z17 ? j17 : this.f466028c) - this.f466026a;
        yv1.i0 i0Var = this.f466029d;
        synchronized (i0Var) {
            i0Var.f466074f += j18;
        }
        yv1.g1 g1Var = this.f466029d.f466069a;
        if (g1Var != null) {
            long[] jArr = this.f466030e;
            java.util.Set set = this.f466033h;
            byte[] bArr = this.f466034i;
            synchronized (g1Var) {
                g1Var.f466044c -= j18;
                g1Var.f466045d -= j18;
                for (int i27 = 0; i27 < 21; i27++) {
                    long[] jArr2 = g1Var.f466053l;
                    jArr2[i27] = jArr2[i27] - (jArr[i27] - this.f466027b[i27]);
                }
                if (!z17) {
                    for (0; i18 < 21; i18 + 1) {
                        if (i18 == 6) {
                            i18 = !set.isEmpty() ? i18 + 1 : 0;
                        }
                        if (bArr[i18] < Byte.MAX_VALUE) {
                            g1Var.f466053l[i18] = 0;
                        }
                    }
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("4:");
        long[] jArr3 = this.f466030e;
        sb6.append(jArr3[10] + jArr3[11]);
        sb6.append("#6:");
        sb6.append(this.f466030e[8]);
        sb6.append("#7:");
        sb6.append(this.f466030e[9]);
        sb6.append("#8:");
        sb6.append(this.f466030e[17]);
        sb6.append("#9:");
        sb6.append(this.f466030e[7]);
        sb6.append("#10:");
        sb6.append(this.f466030e[4]);
        sb6.append("#11:");
        sb6.append(this.f466030e[19]);
        sb6.append("#12:");
        sb6.append(this.f466030e[18]);
        sb6.append("#13:");
        long[] jArr4 = this.f466030e;
        sb6.append(jArr4[0] + jArr4[2] + jArr4[3] + jArr4[16]);
        sb6.append("#14:");
        sb6.append(this.f466030e[5]);
        sb6.append("#15:");
        sb6.append(this.f466030e[15]);
        this.f466029d.f466084p.D("clean_cache_typed_deleted_size", sb6.toString());
        this.f466029d.f466084p.B("clean_cache_appbrand1", this.f466030e[6]);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Clean cache: FileSystem stage ");
        sb7.append(z17 ? "cancelled" : "done");
        sb7.append('.');
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", sb7.toString());
        this.f466031f.a(jz5.f0.f302826a);
        yv1.i0.e(this.f466029d, true, false, 2, null);
    }
}
