package qn1;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.d f364985d;

    public f(qn1.d dVar) {
        this.f364985d = dVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBackupAuthEnd onSceneEnd, isNewBackup = ");
        qn1.d dVar = this.f364985d;
        sb6.append(dVar.f364975o);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", sb6.toString());
        if (dVar.f364975o) {
            xn1.b.f455454a.b(0, 0, "", 0L, 0L, 0);
        }
        dVar.f364968h = true;
        xn1.c.b("Status", 0);
        dVar.f364970j.d();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(13736, 0, dVar.f364962b, kn1.k.z(com.tencent.mm.sdk.platformtools.x2.f193071a), 0, java.lang.Integer.valueOf(qn1.c.i().j().f364974n));
        sn1.i.Q(1, dVar.f364976p);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth failed, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            if (i18 == -3) {
                g0Var.idkeyStat(400L, 115L, 1L, false);
            } else if (i18 != -1) {
                g0Var.idkeyStat(400L, 116L, 1L, false);
            } else {
                g0Var.idkeyStat(400L, 114L, 1L, false);
            }
            g0Var.d(13737, 1, 0, 0, 0, java.lang.Integer.valueOf(dVar.f364974n));
            qn1.c.i().e().f309609a = -5;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            qn1.c.i().l().g(-5);
            return;
        }
        sn1.a aVar = (sn1.a) m1Var;
        int i19 = aVar.f409967v.f447489m;
        boolean z18 = (i19 & 2) != 0;
        boolean z19 = (i19 & 4) != 0;
        boolean z27 = (i19 & 8) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd auth success, pcSupportTimeSelect[%b], pcSupportQuickBackup[%b], pcSupportReconnect[%b]", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(z27));
        if (z27) {
            com.tencent.mm.protobuf.g gVar = aVar.f409967v.f447490n;
            if (gVar == null) {
                gVar = null;
            }
            if (gVar != null) {
                dVar.f364972l = false;
                dVar.f364973m = gVar;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcProcessMgr", "onBackupAuthEnd pcSupportReconnect but token is null!");
                dVar.f364972l = false;
                dVar.f364973m = null;
            }
        } else {
            dVar.f364972l = false;
            dVar.f364973m = null;
        }
        qn1.c.i().l().getClass();
        qn1.c.i().l().getClass();
    }
}
