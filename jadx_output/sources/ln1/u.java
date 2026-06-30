package ln1;

/* loaded from: classes12.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.x f319843d;

    public u(ln1.x xVar, boolean z17) {
        this.f319843d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.x xVar = this.f319843d;
        xVar.getClass();
        while (on1.c.f346806a) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "waitWildCleaning...");
                java.lang.Thread.sleep(500L);
                jx3.f.INSTANCE.d(21019, 0, 0, -6666);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMerger", "waitWildCleaning failed : " + th6.getMessage());
            }
        }
        xVar.f319867u.clear();
        xVar.f319868v.clear();
        xVar.f319869w.clear();
        xVar.f319870x.clear();
        xVar.f319860n = 1;
        int i17 = xVar.f319857k;
        if (i17 == 1) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.TRUE);
        } else if (i17 == 2) {
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.TRUE);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = xVar.f319861o;
        o4Var.A("MMKV_BACKUP_TRY_TIME", o4Var.getInt("MMKV_BACKUP_TRY_TIME", 0) + 1);
        xVar.f319861o.G("MMKV_BACKUP_NEED_REPORT", true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl start, mergeState[%d], totalMsgList[%d], msgListDataIdHashMap[%d]", java.lang.Integer.valueOf(xVar.f319860n), java.lang.Long.valueOf(xVar.f319853g), java.lang.Integer.valueOf(xVar.f319850d.size()));
        if (xVar.f319866t == null) {
            xVar.f319866t = java.util.concurrent.Executors.newFixedThreadPool(ln1.x.C);
        }
        java.lang.String str = (java.lang.String) tn1.f.f().e().b().l(2, null);
        ((ku5.t0) ku5.t0.f312615d).r(fo1.i.f264877d, "RoamBackup.MediaPullObserver");
        java.util.Iterator it = xVar.f319850d.keySet().iterator();
        while (it.hasNext()) {
            xVar.f319866t.execute(new ln1.v(xVar, (java.lang.String) it.next(), str));
        }
        xVar.f319866t.shutdown();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "awaitTermination awaitRet = " + xVar.f319866t.awaitTermination(com.tencent.wcdb.core.Database.DictDefaultMatchValue, java.util.concurrent.TimeUnit.MICROSECONDS));
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMerger", "awaitTermination error = " + e17.getMessage());
        }
        synchronized (xVar.f319855i) {
            if (!xVar.f319847a) {
                xVar.h();
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "Merge completed, build message FTS search index");
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Di(2);
            }
        }
    }
}
