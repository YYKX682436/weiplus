package ho1;

/* loaded from: classes15.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282659f;

    public e(java.lang.String str, ho1.v vVar, long j17) {
        this.f282657d = str;
        this.f282658e = vVar;
        this.f282659f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean i17;
        long j17 = this.f282659f;
        ho1.v vVar = this.f282658e;
        java.lang.String str = this.f282657d;
        if (str != null) {
            try {
                ro1.g gVar = vVar.f282831c;
                if (gVar == null) {
                    kotlin.jvm.internal.o.o("mUDiskChannel");
                    throw null;
                }
                i17 = gVar.i(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "", new java.lang.Object[0]);
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.h1(j17, -1);
                    return;
                }
                return;
            }
        } else {
            i17 = false;
        }
        com.tencent.mars.xlog.Log.i(vVar.f282829a, "[deleteFileAsync] delete successfully, filePath=" + str);
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.h1(j17, i17 ? 0 : -2);
        }
    }
}
