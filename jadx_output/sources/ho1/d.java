package ho1;

/* loaded from: classes15.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282648f;

    public d(java.lang.String str, ho1.v vVar, long j17) {
        this.f282646d = str;
        this.f282647e = vVar;
        this.f282648f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a17;
        long j17 = this.f282648f;
        ho1.v vVar = this.f282647e;
        java.lang.String str = this.f282646d;
        if (str != null) {
            try {
                ro1.g gVar = vVar.f282831c;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("mUDiskChannel");
                    throw null;
                }
                a17 = gVar.a(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "", new java.lang.Object[0]);
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.o1(j17, -1);
                    return;
                }
                return;
            }
        } else {
            a17 = false;
        }
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "[deleteDirAsync] delete successfully, dirPath=" + str);
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.o1(j17, a17 ? 0 : -2);
        }
    }
}
