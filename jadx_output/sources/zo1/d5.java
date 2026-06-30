package zo1;

/* loaded from: classes5.dex */
public final class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f474586f;

    public d5(long j17, int i17, com.tencent.wechat.aff.affroam.g gVar) {
        this.f474584d = j17;
        this.f474585e = i17;
        this.f474586f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        long j17 = this.f474584d;
        int i17 = this.f474585e;
        com.tencent.wechat.aff.affroam.h1 b17 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.b(j17);
        if (b17 != null) {
            long Ui = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_check_interval, 900L);
            long Ui2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_roam_autobackup_interval, 86400L);
            long j18 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamAutoBackupMsgBeforeTime());
            com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j18);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewRoamBackupManager", "setup auto backup event: checkInterval=" + Ui + ", interval=" + Ui2 + ", reserveTime=" + j18 + ", pkgId=" + j17);
            com.tencent.wechat.aff.affroam.e eVar = new com.tencent.wechat.aff.affroam.e();
            eVar.f215818h = i17;
            eVar.f215816f = 60L;
            eVar.f215815e = Ui;
            eVar.f215814d = Ui2;
            eVar.f215817g = j18;
            b17.h(eVar);
        }
        qo1.j1 j1Var = qo1.j1.f365523a;
        com.tencent.wechat.aff.affroam.g pkgInfo = this.f474586f;
        kotlin.jvm.internal.o.g(pkgInfo, "pkgInfo");
        synchronized (j1Var.c()) {
            long j19 = pkgInfo.f215829d;
            qo1.j0 j0Var = (qo1.j0) j1Var.c().get(java.lang.Long.valueOf(j19));
            if ((j0Var instanceof qo1.f0) && ((qo1.f0) j0Var).b()) {
                com.tencent.mars.xlog.Log.w("TaskManager", "There is a running task=" + ((qo1.f0) j0Var).hashCode() + " for pkgId=" + j19);
            } else {
                com.tencent.mars.xlog.Log.i("TaskManager", "Ready remove and start new task, pkgId=" + j19);
                j1Var.c().put(java.lang.Long.valueOf(j19), new qo1.g0(j19));
                j1Var.g(pkgInfo);
                qo1.d1 d1Var = qo1.d1.f365463d;
            }
        }
    }
}
