package qo1;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f365527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365528e;

    public l(float f17, qo1.f0 f0Var) {
        this.f365527d = f17;
        this.f365528e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.wechat.aff.affroam.p0 c17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "ProgressEvent percentage = %s", java.lang.Float.valueOf(this.f365527d));
        qo1.f0 f0Var = this.f365528e;
        if (!f0Var.f365482h) {
            com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
            kotlin.jvm.internal.o.d(a2Var);
            long j17 = a2Var.c().f215950h;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            qo1.f0 f0Var2 = this.f365528e;
            long j18 = f0Var2.f365481g;
            if (j18 == -1 || j17 >= 10485760) {
                f0Var2.f365481g = currentTimeMillis;
            } else if (currentTimeMillis - j18 > 60000) {
                f0Var2.f365482h = true;
                com.tencent.mm.plugin.backup.roambackup.r0.f92684a.q(f0Var2.f365483i);
            }
        }
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        qo1.f0 task = this.f365528e;
        float f17 = this.f365527d;
        kotlin.jvm.internal.o.g(task, "task");
        java.util.Set refreshTaskUiListeners = com.tencent.mm.plugin.backup.roambackup.r0.f92686c;
        kotlin.jvm.internal.o.f(refreshTaskUiListeners, "refreshTaskUiListeners");
        synchronized (refreshTaskUiListeners) {
            java.util.Iterator it = refreshTaskUiListeners.iterator();
            while (it.hasNext()) {
                ((io1.c) it.next()).P5(task, f17);
            }
        }
        nv.v1 v1Var = (nv.v1) i95.n0.c(nv.v1.class);
        long j19 = task.f365483i;
        com.tencent.wechat.aff.affroam.a2 a2Var2 = task.f365479e;
        v1Var.Bi(j19, (a2Var2 == null || (c17 = a2Var2.c()) == null) ? "" : fo1.r.b(c17), (int) (f17 * 100));
    }
}
