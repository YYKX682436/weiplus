package qn1;

/* loaded from: classes12.dex */
public class j implements sn1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.d f364991a;

    public j(qn1.d dVar) {
        this.f364991a = dVar;
    }

    @Override // sn1.r0
    public void a() {
        int i17 = qn1.c.i().j().f364961a;
        if (1 == i17 || 3 == i17) {
            qn1.c0 l17 = qn1.c.i().l();
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            l17.g(e17.f309609a);
            return;
        }
        if (2 == i17 || 4 == i17) {
            qn1.t k17 = qn1.c.i().k();
            kn1.g e18 = qn1.c.i().e();
            e18.getClass();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            k17.a(e18.f309609a);
        }
    }

    @Override // sn1.r0
    public void b(int i17) {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i18 = e17.f309609a;
        qn1.d dVar = this.f364991a;
        if (i17 == 1) {
            int i19 = dVar.f364961a;
            if ((1 == i19 || 3 == i19) && i18 == 14) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                qn1.c.i().e().f309609a = 4;
                qn1.c.i().l().g(4);
                return;
            } else {
                if ((2 == i19 || 4 == i19) && i18 == 23) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is weak connect now.");
                    qn1.c.i().e().f309609a = 4;
                    qn1.c.i().k().a(4);
                    return;
                }
                return;
            }
        }
        if (i17 == 0 && i18 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "speedCallback is normal speed now.");
            int i27 = dVar.f364961a;
            if (1 == i27 || 3 == i27) {
                qn1.c.i().e().f309609a = 14;
                qn1.c.i().l().g(14);
            } else if (2 == i27 || 4 == i27) {
                qn1.c.i().e().f309609a = 23;
                qn1.c.i().k().a(23);
            }
        }
    }

    @Override // sn1.r0
    public void c() {
        kn1.g e17 = qn1.c.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i17 = e17.f309609a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "speedOverTime callback, backupState[%d]", java.lang.Integer.valueOf(i17));
        int i18 = qn1.c.i().j().f364961a;
        if ((1 == i18 || 3 == i18) && (i17 == 14 || i17 == 4)) {
            qn1.c.i().h().e();
            qn1.c.i().l().d(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 9L, 1L, false);
            qn1.c.i().l().c(13737, 18);
            qn1.c.i().e().f309609a = -4;
            qn1.c.i().l().g(-4);
            return;
        }
        if (2 == i18 || 4 == i18) {
            if (i17 == 23 || i17 == 4) {
                qn1.c.i().h().e();
                qn1.c.i().k().d(true, false, -4);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 17L, 1L, false);
                qn1.c.i().k().b(13737, 18);
            }
        }
    }
}
