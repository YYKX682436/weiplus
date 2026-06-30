package ho1;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282674g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282675h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f282676i;

    public g(ho1.v vVar, long j17, long j18, java.lang.String str, java.lang.String str2, long j19) {
        this.f282671d = vVar;
        this.f282672e = j17;
        this.f282673f = j18;
        this.f282674g = str;
        this.f282675h = str2;
        this.f282676i = j19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ho1.v vVar = this.f282671d;
        java.lang.String str = vVar.f282829a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadFileAsync, taskId = ");
        long j17 = this.f282672e;
        sb6.append(j17);
        sb6.append(", go in thread time = ");
        sb6.append(java.lang.System.currentTimeMillis() - this.f282673f);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ho1.v vVar2 = this.f282671d;
        ro1.g gVar = vVar2.f282831c;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        ho1.f fVar = new ho1.f(vVar2, this.f282672e, currentTimeMillis, this.f282676i);
        java.lang.String str2 = this.f282674g;
        java.lang.String str3 = this.f282675h;
        ro1.f c17 = gVar.c(str2, str3, fVar);
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "copyUDisk2Local downloadFileAsync, taskId = " + j17 + ", errCode.value = " + c17.f397986d + ", time = " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + ", localFileSize = " + new java.io.File(str3).length());
        com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
        if (t0Var != null) {
            t0Var.k0(j17, c17.f397986d);
        }
    }
}
