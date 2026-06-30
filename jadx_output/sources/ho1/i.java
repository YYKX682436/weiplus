package ho1;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282708f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f282709g;

    public i(ho1.v vVar, long j17, java.lang.String str, long j18) {
        this.f282706d = vVar;
        this.f282707e = j17;
        this.f282708f = str;
        this.f282709g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro1.g gVar;
        ho1.v vVar = this.f282706d;
        java.lang.String str = vVar.f282829a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fileStreamReadBeginAsync, before open, taskId=");
        long j17 = this.f282707e;
        sb6.append(j17);
        sb6.append(", remotePath=");
        java.lang.String str2 = this.f282708f;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        try {
            gVar = vVar.f282831c;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "Failed to read. taskId = " + j17 + ", remotePath = " + str2 + ", readSize = " + this.f282709g, new java.lang.Object[0]);
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        java.io.InputStream g17 = gVar.g(str2);
        if (g17 != null) {
            java.lang.String str3 = this.f282708f;
            long j18 = this.f282707e;
            vVar.f282835g.put(str3, g17);
            com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
            if (t0Var != null) {
                t0Var.I0(j18, 0, str3, new byte[0]);
                return;
            }
            return;
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.I0(this.f282707e, -2, this.f282708f, new byte[0]);
        }
    }
}
