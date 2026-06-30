package yv1;

/* loaded from: classes12.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f466004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f466005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f466006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw1.f f466007g;

    public c0(java.lang.String[] strArr, yv1.i0 i0Var, long j17, bw1.f fVar) {
        this.f466004d = strArr;
        this.f466005e = i0Var;
        this.f466006f = j17;
        this.f466007g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "Start CleanAppBrand task");
        yv1.h1.g(1, null, 2, null);
        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Aa(kz5.v.f(this.f466004d));
        yv1.g1 g1Var = this.f466005e.f466069a;
        if (g1Var != null) {
            long j17 = this.f466006f;
            synchronized (g1Var) {
                g1Var.f466044c -= j17;
                g1Var.f466045d -= j17;
                long[] jArr = g1Var.f466053l;
                jArr[6] = jArr[6] - j17;
            }
        }
        this.f466005e.f466084p.B("clean_cache_appbrand2", this.f466006f);
        yv1.i0 i0Var = this.f466005e;
        long j18 = this.f466006f;
        synchronized (i0Var) {
            i0Var.f466074f += j18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "CleanAppBrand task done");
        this.f466007g.a(jz5.f0.f302826a);
        yv1.i0.e(this.f466005e, true, false, 2, null);
    }
}
