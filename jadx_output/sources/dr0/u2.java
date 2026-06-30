package dr0;

/* loaded from: classes12.dex */
public final class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr0.a3 f242562d;

    public u2(dr0.a3 a3Var) {
        this.f242562d = a3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int e17 = dr0.a3.f242403d.a().e();
        dr0.a3 a3Var = this.f242562d;
        boolean z17 = false;
        if (dr0.a3.a(a3Var)) {
            a3Var.q("准备回收主进程（耗时大约 10s）");
            e17 = 0;
        } else if (e17 <= 0 || e17 > 1440) {
            com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: bg, delayMin=" + e17);
            return;
        } else {
            if (!dr0.j2.f242442d.a()) {
                return;
            }
            dr0.t2 t2Var = a3Var.f242408a;
            if (t2Var != null && t2Var.f242553b) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "abort: bg, has task with higher priority");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.proc.Recycler", "recycle schedule: bg, delayMin=" + e17);
        a3Var.d("post-2");
        dr0.q3.j(dr0.q3.f242505i, ((long) e17) * 60000, null, 2, null);
    }
}
