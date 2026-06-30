package qn1;

/* loaded from: classes12.dex */
public class v implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f365024d;

    public v(qn1.c0 c0Var) {
        this.f365024d = c0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        qn1.c0 c0Var = this.f365024d;
        sn1.i.Q(11, c0Var.f364957i);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupPcServer", "requestSessionSceneEnd sessionName or timeInterval null or request session resp number error, errType[%d], errCode[%d], errMsg[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 119L, 1L, false);
            c0Var.d(false);
            qn1.c.i().e().f309609a = -5;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            c0Var.g(-5);
            return;
        }
        wn1.m mVar = ((sn1.p0) m1Var).f410073v;
        java.util.LinkedList q17 = kn1.k.q(mVar.f447439d, mVar.f447440e);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "requestSessionSceneEnd receive requestsessionResp, backupSessionList size[%d], sIsMigrate = %b", java.lang.Integer.valueOf(q17.size()), java.lang.Boolean.valueOf(qn1.c0.f364948o));
        ln1.s sVar = c0Var.f364951c;
        int i19 = qn1.c.i().j().f364974n;
        boolean z18 = qn1.c0.f364945l;
        boolean z19 = qn1.c0.f364948o;
        sVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend", "startBackup, backupSessionList size[%d], isOnlyText[%b], isPcMigrate[%b]", java.lang.Integer.valueOf(q17.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        sVar.f319804e = z19;
        if (sVar.f319805f == 1 && ln1.s.f319798s == 0) {
            ln1.s.f319798s = java.lang.System.currentTimeMillis();
        }
        on1.b.f346804c = z19;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        sn1.i.f410019p.a();
        ((ku5.t0) ku5.t0.f312615d).q(new ln1.t(sVar, q17, z18, currentTimeMillis));
    }
}
