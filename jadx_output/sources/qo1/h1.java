package qo1;

/* loaded from: classes5.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qo1.h1 f365500d = new qo1.h1();

    public h1() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r12v1, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [qo1.g0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("TaskManager", "Init task cache");
        qo1.j1.f365524b = true;
        java.util.HashMap hashMap = new java.util.HashMap();
        int c17 = j62.e.g().c(new com.tencent.mm.repairer.config.roambackup.RepairerConfigEnableRoamBackup());
        com.tencent.mars.xlog.Log.i("RoamBackupExpt", "Exp value of clicfg_unify_enable_new_roam_backup is " + c17);
        if (c17 == 1) {
            java.util.ArrayList<com.tencent.wechat.aff.affroam.m0> c18 = com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().c();
            kotlin.jvm.internal.o.d(c18);
            for (com.tencent.wechat.aff.affroam.m0 m0Var : c18) {
                long j17 = m0Var.f215903e;
                com.tencent.mars.xlog.Log.i("TaskManager", "Find a incompleteTasks for pkgId=" + j17 + ", status=" + m0Var.f215905g + ", type=" + m0Var.f215911p);
                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                com.tencent.wechat.aff.affroam.o0 type = m0Var.f215911p;
                ?? r122 = 0;
                r122 = 0;
                if (type == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_RESTORE) {
                    int i17 = qo1.c1.f365456y;
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamRestoreTask", "fromIncompleteTask pkgId=" + m0Var.f215903e + ", taskType=" + m0Var.f215911p);
                    com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(m0Var.f215903e);
                    if (k17 != null) {
                        qo1.c1 c1Var = new qo1.c1(k17, r122, 2, r122);
                        c1Var.f365478d = m0Var.f215906h;
                        com.tencent.wechat.aff.affroam.n0 state = m0Var.f215905g;
                        kotlin.jvm.internal.o.f(state, "state");
                        c1Var.r(state);
                        c1Var.f365490p = true;
                        c1Var.f365492r = m0Var;
                        c1Var.f365491q = new qo1.w0(c1Var);
                        c1Var.h();
                        com.tencent.mars.xlog.Log.i("MicroMsg.RoamRestoreTask", "Complete fromIncompleteTask.buildBackupTask(), pkgId=" + c1Var.f365483i);
                        r122 = c1Var;
                    }
                    if (r122 == 0) {
                        r122 = new qo1.g0(j17);
                    }
                } else if (type == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_BACKUP) {
                    int i18 = qo1.v0.f365555y;
                    kotlin.jvm.internal.o.f(type, "type");
                    com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "fromIncompleteTask pkgId=" + m0Var.f215903e + ", taskType=" + type);
                    com.tencent.wechat.aff.affroam.g k18 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(m0Var.f215903e);
                    if (k18 != null) {
                        qo1.v0 v0Var = new qo1.v0(k18, type);
                        v0Var.f365478d = m0Var.f215906h;
                        com.tencent.wechat.aff.affroam.n0 state2 = m0Var.f215905g;
                        kotlin.jvm.internal.o.f(state2, "state");
                        v0Var.r(state2);
                        v0Var.f365490p = true;
                        v0Var.f365492r = m0Var;
                        v0Var.f365491q = new qo1.k0(v0Var);
                        v0Var.h();
                        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupTask", "Complete fromIncompleteTask.buildBackupTask(), pkgId=" + v0Var.f365483i);
                        r122 = v0Var;
                    }
                    if (r122 == 0) {
                        r122 = new qo1.g0(j17);
                    }
                } else {
                    r122 = new qo1.g0(j17);
                }
                hashMap.put(valueOf, r122);
            }
        }
        return hashMap;
    }
}
