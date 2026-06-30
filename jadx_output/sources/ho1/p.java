package ho1;

/* loaded from: classes15.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.v f282776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282777f;

    public p(java.lang.String str, ho1.v vVar, long j17) {
        this.f282775d = str;
        this.f282776e = vVar;
        this.f282777f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17 = this.f282777f;
        ho1.v vVar = this.f282776e;
        java.lang.String str = this.f282775d;
        if (str != null) {
            ro1.g gVar = vVar.f282831c;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("mUDiskChannel");
                throw null;
            }
            com.tencent.wechat.aff.affroam.b0 e17 = gVar.e(str);
            if (e17 != null) {
                com.tencent.mars.xlog.Log.i(vVar.f282829a, "Get backup files count: %s", java.lang.Integer.valueOf(e17.f215798d.size()));
                com.tencent.wechat.aff.affroam.t0 t0Var = vVar.f282836h;
                if (t0Var != null) {
                    t0Var.P1(j17, 0, e17);
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e(vVar.f282829a, "Get backup files failed!");
        com.tencent.wechat.aff.affroam.t0 t0Var2 = vVar.f282836h;
        if (t0Var2 != null) {
            t0Var2.P1(j17, -2, com.tencent.wechat.aff.affroam.b0.f215797e);
        }
    }
}
