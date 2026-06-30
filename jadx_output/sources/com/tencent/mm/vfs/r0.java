package com.tencent.mm.vfs;

/* loaded from: classes11.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f213150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d95.f f213151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f213152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f213153g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f213154h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.s0 f213155i;

    public r0(com.tencent.mm.vfs.s0 s0Var, java.lang.String str, d95.f fVar, long j17, long j18, long j19) {
        this.f213155i = s0Var;
        this.f213150d = str;
        this.f213151e = fVar;
        this.f213152f = j17;
        this.f213153g = j18;
        this.f213154h = j19;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.vfs.s0 s0Var = this.f213155i;
        java.lang.String str = !s0Var.f213169e ? "m2-before" : "m-before";
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.String str2 = this.f213150d;
        d95.f fVar2 = this.f213151e;
        java.lang.String k17 = fVar2.k();
        long j17 = this.f213152f;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        long j18 = this.f213153g;
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
        long j19 = this.f213154h;
        fVar.d(25824, str2, k17, valueOf, 0, valueOf2, str, 0, java.lang.Long.valueOf(j19), 0, 0, 0, 1, 0);
        boolean z17 = fVar2.z();
        com.tencent.mars.xlog.Log.i("VFS.DiskFileStatistics", "vacuumRet = " + z17);
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long g17 = fVar2.g();
        long j27 = (j17 - j18) / currentTimeMillis2;
        java.lang.String str3 = !s0Var.f213169e ? "m2-" : "m-";
        fVar.d(25824, this.f213150d, fVar2.k(), java.lang.Long.valueOf(j17), 0, java.lang.Long.valueOf(j18), str3 + z17, java.lang.Long.valueOf(g17), java.lang.Long.valueOf(j19), java.lang.Long.valueOf(j17 - g17), java.lang.Long.valueOf(currentTimeMillis2), 0, 1, java.lang.Long.valueOf(j27));
    }
}
