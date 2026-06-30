package qo1;

/* loaded from: classes5.dex */
public final class v0 extends qo1.f0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f365555y = 0;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f365556w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f365557x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.wechat.aff.affroam.g pkgInfo, com.tencent.wechat.aff.affroam.o0 taskType) {
        super(pkgInfo, taskType);
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        kotlin.jvm.internal.o.g(taskType, "taskType");
        this.f365556w = "MicroMsg.RoamBackupTask-" + this.f365483i;
    }

    @Override // qo1.j0
    public boolean b() {
        boolean z17;
        synchronized (this.f365484j) {
            com.tencent.wechat.aff.affroam.n0 n0Var = this.f365485k;
            if (n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_PREPARING && n0Var != com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_DELETING) {
                z17 = n0Var == com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_RUNNING;
            }
        }
        return z17;
    }

    @Override // qo1.f0
    public java.lang.String n() {
        return this.f365556w;
    }

    @Override // qo1.f0
    public void s() {
        if (k()) {
            return;
        }
        this.f365490p = false;
        this.f365492r = this.f365475a;
        this.f365491q = new qo1.s0(this);
        i();
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "[stopSync] pkgId=" + this.f365483i);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ((ku5.t0) ku5.t0.f312615d).g(new qo1.u0(this, countDownLatch));
        countDownLatch.await();
    }
}
