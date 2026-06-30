package qo1;

/* loaded from: classes5.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f365542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.z f365543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365544f;

    public r(qo1.f0 f0Var, com.tencent.wechat.aff.affroam.z zVar, java.lang.String str) {
        this.f365542d = f0Var;
        this.f365543e = zVar;
        this.f365544f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qo1.i0 a17;
        com.tencent.wechat.aff.affroam.n0 state;
        qo1.f0 f0Var = this.f365542d;
        java.lang.Object obj = f0Var.f365484j;
        com.tencent.wechat.aff.affroam.z zVar = this.f365543e;
        java.lang.String str = this.f365544f;
        synchronized (obj) {
            qo1.h0 h0Var = qo1.i0.f365501e;
            kotlin.jvm.internal.o.d(zVar);
            a17 = h0Var.a(zVar);
            if (a17 != qo1.i0.f365502f) {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.wechat.aff.affroam.n0 n0Var = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_ERROR;
                f0Var.g(n0Var, a17);
                f0Var.r(n0Var);
            } else {
                kotlin.jvm.internal.o.d(str);
                if (r26.n0.B(str, "stopped", false)) {
                    java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.wechat.aff.affroam.n0 n0Var2 = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_STOPPED;
                    f0Var.g(n0Var2, a17);
                    f0Var.r(n0Var2);
                } else {
                    java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    com.tencent.wechat.aff.affroam.n0 n0Var3 = com.tencent.wechat.aff.affroam.n0.AFFROAM_TASK_STATE_COMPLETED;
                    f0Var.g(n0Var3, a17);
                    f0Var.r(n0Var3);
                }
            }
            f0Var.getClass();
            f0Var.f365486l = a17;
            state = f0Var.f365485k;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseRoamTask", "TaskCompletedEvent newState=" + state + ", newError=" + a17 + ", error=" + this.f365543e + ", pkgId=" + this.f365542d.f365483i);
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        qo1.f0 task = this.f365542d;
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "[notifyTaskComplete] pkgId=" + task.f365483i + ", state=" + state + ", error=" + a17);
        r0Var.r(task, state, a17);
    }
}
