package ho1;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282735f;

    public k(ho1.v vVar, java.lang.String str, long j17) {
        this.f282733d = vVar;
        this.f282734e = str;
        this.f282735f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ro1.g gVar;
        long j17 = this.f282735f;
        java.lang.String str = this.f282734e;
        ho1.v vVar = this.f282733d;
        try {
            gVar = vVar.f282831c;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f282829a, th6, "", new java.lang.Object[0]);
        }
        if (gVar == null) {
            kotlin.jvm.internal.o.o("mUDiskChannel");
            throw null;
        }
        java.io.OutputStream h17 = gVar.h(str);
        if (h17 != null) {
            vVar.f282834f.put(str, h17);
            com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
            if (t0Var != null) {
                t0Var.w1(j17, 0, str);
                return;
            }
            return;
        }
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.w1(j17, -1, str);
        }
    }
}
