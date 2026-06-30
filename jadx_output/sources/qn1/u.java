package qn1;

/* loaded from: classes12.dex */
public class u implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f365023d;

    public u(qn1.c0 c0Var) {
        this.f365023d = c0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qn1.c0 c0Var = this.f365023d;
        sn1.i.Q(3, c0Var.f364956h);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp failed, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 117L, 1L, false);
            qn1.c.i().e().f309609a = -5;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c0Var.g(-5);
            return;
        }
        sn1.i.f410019p.f410092i = qn1.c.i().m().f();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd receive startResp success, errMsg[%s]", str);
        wn1.r rVar = ((sn1.t0) m1Var).f410101v;
        if (!qn1.c.i().f309604b.equals(rVar.f447461d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp not the same id");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 118L, 1L, false);
            qn1.c.i().e().f309609a = -5;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c0Var.g(-5);
            return;
        }
        kn1.g e17 = qn1.c.i().e();
        long j17 = rVar.f447466i;
        e17.f309617i = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onSendStartRequestEnd startResp BigDataSize[%d]", java.lang.Long.valueOf(j17));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_OLD_RECORDS_BOOLEAN, java.lang.Boolean.FALSE);
        sn1.i.V();
        sn1.i.I(11, c0Var.f364957i);
        sn1.p0 p0Var = new sn1.p0(c0Var.f364949a, c0Var.f364954f, c0Var.f364955g);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "backupPcSendRequestSession, chooseConvNames size[%d]", java.lang.Integer.valueOf(c0Var.f364949a.size()));
        p0Var.K();
    }
}
