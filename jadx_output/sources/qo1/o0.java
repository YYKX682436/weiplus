package qo1;

/* loaded from: classes5.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.v0 f365535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f365536e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f365537f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f365538g;

    public o0(qo1.v0 v0Var, com.tencent.wechat.aff.affroam.g gVar, yz5.a aVar, kotlin.jvm.internal.f0 f0Var) {
        this.f365535d = v0Var;
        this.f365536e = gVar;
        this.f365537f = aVar;
        this.f365538g = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        if (this.f365535d.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
            j17 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamAutoBackupMsgBeforeTime());
            com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        } else {
            j17 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamBackupMsgBeforeTime());
            com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_msg_before_time is " + j17);
        }
        long j18 = this.f365536e.f215829d;
        com.tencent.mars.xlog.Log.i("BackupPackageHelper", "Post new task to ThreadPool");
        wu5.c s17 = ((ku5.t0) ku5.t0.f312615d).s(new go1.c(j18, j17 * 1000));
        kotlin.jvm.internal.o.d(s17);
        try {
            this.f365535d.f365492r = s17.get();
            this.f365535d.f365491q = this.f365537f;
            ku5.u0 u0Var = ku5.t0.f312615d;
            final qo1.v0 v0Var = this.f365535d;
            ((ku5.t0) u0Var).h(new java.lang.Runnable() { // from class: qo1.n0
                @Override // java.lang.Runnable
                public final void run() {
                    qo1.v0.this.i();
                }
            }, v0Var.f365556w);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "exception=" + e17 + ", try call calc directly");
            this.f365538g.f310116d = 104;
        }
    }
}
