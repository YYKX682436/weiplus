package zo1;

/* loaded from: classes5.dex */
public final class c5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474574d;

    public c5(long j17) {
        this.f474574d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.h1 b17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.b(this.f474574d);
        if (b17 != null) {
            b17.i();
        }
        qo1.j1 j1Var = qo1.j1.f365523a;
        long j17 = this.f474574d;
        synchronized (j1Var.c()) {
            com.tencent.mars.xlog.Log.i("TaskManager", "stop and remove auto backup task, pkgId=" + j17);
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j17));
            if (j0Var == null) {
                return;
            }
            if (j0Var instanceof qo1.v0) {
                ((qo1.v0) j0Var).t();
                j1Var.f(j17);
            }
        }
    }
}
