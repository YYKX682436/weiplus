package ho1;

/* loaded from: classes5.dex */
public final class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f282703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.q1 f282704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282705f;

    public h1(com.tencent.wechat.aff.affroam.g gVar, ho1.q1 q1Var, long j17) {
        this.f282703d = gVar;
        this.f282704e = q1Var;
        this.f282705f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        xn1.k kVar = new xn1.k();
        com.tencent.wechat.aff.affroam.g gVar = this.f282703d;
        if ((gVar.f215835m & 1) != 0) {
            j17 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamAutoBackupMsgBeforeTime());
            com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_autobackup_msg_before_time is " + j17);
        } else {
            j17 = bm5.o1.f22719a.j(new com.tencent.mm.repairer.config.roambackup.RepairerConfigRoamBackupMsgBeforeTime());
            com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_roam_backup_msg_before_time is " + j17);
        }
        long j18 = j17 * 1000;
        po1.a aVar = com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo.CREATOR;
        com.tencent.wechat.aff.affroam.i iVar = gVar.f215834i;
        kotlin.jvm.internal.o.f(iVar, "getBackupRange(...)");
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo a17 = aVar.a(iVar);
        long c17 = c01.id.c();
        long j19 = a17.f92734h;
        java.util.ArrayList arrayList = (java.util.ArrayList) kotlinx.coroutines.l.f(null, new ho1.g1(a17, j19 <= 0 ? c17 - j18 : java.lang.Math.min(c17 - j18, j19), this.f282703d, kVar, null), 1, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackup.RoamProviderImpl", "rangeList size = " + arrayList.size() + ", timeInfo=" + kVar);
        com.tencent.wechat.aff.affroam.g0 g0Var = this.f282704e.f282787a;
        if (g0Var != null) {
            g0Var.M(this.f282705f, arrayList);
        }
    }
}
