package nv;

/* loaded from: classes12.dex */
public class p2 implements java.lang.Runnable {
    public p2(nv.r2 r2Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        mn1.e j17 = mn1.d.i().j();
        j17.getClass();
        xn1.c.a("Type", 7);
        xn1.b.f455454a.a(7, 1, qn1.c.o().f364969i);
        synchronized (j17.f329847j) {
            ln1.x xVar = j17.f329838a;
            if (xVar != null && xVar.f319849c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "startMerge hasStartMerge, return.");
                return;
            }
            if (xVar != null) {
                ((ku5.t0) ku5.t0.f312615d).g(new mn1.f(j17, xVar));
            }
            java.util.HashSet hashSet = j17.f329853p;
            if (hashSet != null && hashSet.size() > 0) {
                i17 = j17.f329853p.size();
                mn1.d.i().e().f309609a = 26;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                mn1.d.i().e().f309612d = 0;
                j17.a(26);
                tn1.f.f().c();
                j17.f329855r = java.lang.System.currentTimeMillis();
                ln1.x xVar2 = new ln1.x(mn1.d.i(), 2, j17, i17, false, new java.util.LinkedList(), new java.util.LinkedList());
                j17.f329838a = xVar2;
                xVar2.g(true);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 46L, 1L, false);
            }
            android.database.Cursor B = c01.d9.b().h().f195188d.B("SELECT COUNT(DISTINCT sessionName) FROM BackupRecoverMsgListDataId ", null);
            int i18 = B.moveToLast() ? B.getInt(0) : 0;
            B.close();
            i17 = i18;
            mn1.d.i().e().f309609a = 26;
            boolean z172 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            mn1.d.i().e().f309612d = 0;
            j17.a(26);
            tn1.f.f().c();
            j17.f329855r = java.lang.System.currentTimeMillis();
            ln1.x xVar22 = new ln1.x(mn1.d.i(), 2, j17, i17, false, new java.util.LinkedList(), new java.util.LinkedList());
            j17.f329838a = xVar22;
            xVar22.g(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 46L, 1L, false);
        }
    }
}
