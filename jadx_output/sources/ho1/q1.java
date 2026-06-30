package ho1;

/* loaded from: classes11.dex */
public final class q1 implements com.tencent.wechat.aff.affroam.h0, io1.d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g0 f282787a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f282788b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f282789c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f282790d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.y0 f282791e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.f2 f282792f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f282793g;

    /* renamed from: h, reason: collision with root package name */
    public final do1.a f282794h = new do1.a(true, false);

    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "initRecover");
        com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
        java.io.File file = new java.io.File(com.tencent.mm.plugin.backup.roambackup.v1.f92919f);
        vz5.q.d(file);
        file.mkdirs();
        long D = com.tencent.mm.sdk.platformtools.t8.D(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i17 = j62.e.g().l("clicfg_roam_recover_thread_pool_4_num", false, true, true) ? 4 : D < 10 ? 8 : 12;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "[initRecover] insertThreadNum=" + i17 + ", totalMemInGb=" + D);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        this.f282792f = new kotlinx.coroutines.g2(new java.util.concurrent.ThreadPoolExecutor(i17, i17, 0L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(64), new ho1.b1("Roam-Recover-Pool1")));
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.f2 f2Var = this.f282792f;
        kotlin.jvm.internal.o.d(f2Var);
        this.f282791e = kotlinx.coroutines.z0.a(oz5.g.a((kotlinx.coroutines.c3) a17, f2Var));
        this.f282793g = new java.util.concurrent.ThreadPoolExecutor(i17, i17, 0L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(128), new ho1.b1("Roam-Recover-Pool2"));
        ((ku5.t0) ku5.t0.f312615d).r(fo1.i.f264877d, "RoamBackup.MediaPullObserver");
    }

    public void b(boolean z17, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        if (state == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PAUSED || state == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_QUIT || state == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED || state == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED) {
            if (z17) {
                if (!(qo1.j1.f365523a.b(qo1.f1.f365496d) > 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "RoamBackupTask release, onTaskStateChanged state = " + state.name() + ", hasInitRecover = " + this.f282789c);
                    synchronized (this) {
                        if (this.f282790d) {
                            this.f282790d = false;
                            java.util.concurrent.ExecutorService executorService = this.f282788b;
                            if (executorService != null) {
                                executorService.shutdownNow();
                            }
                            this.f282788b = null;
                        }
                    }
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "RoamRestoreTask release, onTaskStateChanged state = " + state.name() + ", hasInitRecover = " + this.f282789c);
            synchronized (this) {
                if (this.f282789c) {
                    this.f282789c = false;
                    kotlinx.coroutines.y0 y0Var = this.f282791e;
                    if (y0Var != null) {
                        kotlinx.coroutines.z0.c(y0Var, null);
                    }
                    this.f282791e = null;
                    kotlinx.coroutines.f2 f2Var = this.f282792f;
                    if (f2Var != null) {
                        ((kotlinx.coroutines.g2) f2Var).close();
                    }
                    this.f282792f = null;
                    java.util.concurrent.ExecutorService executorService2 = this.f282793g;
                    if (executorService2 != null) {
                        ((java.util.concurrent.ThreadPoolExecutor) executorService2).shutdownNow();
                    }
                    this.f282793g = null;
                }
            }
        }
    }
}
