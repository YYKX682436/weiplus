package mn1;

/* loaded from: classes12.dex */
public class p implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329875d;

    public p(mn1.e eVar) {
        this.f329875d = eVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        mn1.e eVar = this.f329875d;
        sn1.i.Q(3, eVar.f329837J);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "backupmove receive startrequest response.[%d,%d,%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "start request failed, errMsg:" + str);
            mn1.d.i().e().f309609a = -5;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            eVar.a(-5);
            kn1.q.a(kn1.m.f309636i, kn1.o.f309651g, "onSendStartRequestEnd: start request failed, errMsg:" + str);
            return;
        }
        sn1.t0 t0Var = (sn1.t0) m1Var;
        wn1.r rVar = t0Var.f410101v;
        if (!mn1.d.i().f309604b.equals(rVar.f447461d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "start response not the same id");
            mn1.d.i().e().f309609a = -5;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            eVar.a(-5);
            kn1.q.a(kn1.m.f309636i, kn1.o.f309651g, "onSendStartRequestEnd: wrong id");
            return;
        }
        mn1.d.i().e().f309617i = rVar.f447466i;
        wn1.r rVar2 = t0Var.f410101v;
        wn1.p pVar = rVar2.f447467m;
        eVar.B = pVar.f447446d;
        java.lang.String str2 = pVar.f447449g;
        if (str2.toLowerCase().contains("ios")) {
            eVar.C = 1;
        } else {
            eVar.C = 2;
        }
        java.lang.String lowerCase = str2.toLowerCase();
        if (lowerCase.contains("ios")) {
            kn1.n nVar = kn1.n.f309645g;
            kn1.p pVar2 = kn1.q.f309658a;
            kn1.q.f309659b = nVar;
        } else if (lowerCase.contains(com.eclipsesource.mmv8.Platform.ANDROID)) {
            kn1.n nVar2 = kn1.n.f309644f;
            kn1.p pVar3 = kn1.q.f309658a;
            kn1.q.f309659b = nVar2;
        } else if (lowerCase.contains("ohos")) {
            kn1.n nVar3 = kn1.n.f309646h;
            kn1.p pVar4 = kn1.q.f309658a;
            kn1.q.f309659b = nVar3;
        } else {
            kn1.n nVar4 = kn1.n.f309643e;
            kn1.p pVar5 = kn1.q.f309658a;
            kn1.q.f309659b = nVar4;
        }
        eVar.f329842e = rVar2.f447463f;
        eVar.f329857t = rVar2.f447465h;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "move recover backupMoveDevice[%d], totalCount[%d], totalSize[%d kb], and wait old mobile's pushData", java.lang.Integer.valueOf(eVar.C), java.lang.Long.valueOf(rVar2.f447462e), java.lang.Long.valueOf(rVar2.f447463f / 1024));
        if (eVar.f329859v && eVar.f329858u) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            eVar.getClass();
            g0Var.idkeyStat(485L, eVar.f329857t == 1 ? 66 : 65, 1L, false);
        }
        if (rVar2.f447468n == 3) {
            eVar.f329860w = true;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "isQuickBackup!!!");
        } else {
            eVar.f329860w = false;
        }
        com.tencent.mm.pointers.PLong pLong = new com.tencent.mm.pointers.PLong();
        com.tencent.mm.pointers.PLong pLong2 = new com.tencent.mm.pointers.PLong();
        gm0.j1.i();
        kn1.k.d(0L, pLong, pLong2, gm0.j1.u().d());
        long j17 = eVar.f329842e;
        long j18 = j17 + ((long) (((double) j17) * 0.1d <= 5.24288E8d ? j17 * 0.1d : 5.24288E8d));
        eVar.getClass();
        long j19 = pLong2.value;
        if (j19 >= j18) {
            eVar.f329854q = java.lang.System.currentTimeMillis();
            sn1.i.V();
            return;
        }
        kn1.q.b(kn1.m.f309636i, kn1.o.f309651g, "onSendStartRequestEnd: space not enough", 0L, 0L, eVar.f329842e, j19);
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "startRequestNotify Not Enough Space:%d < dataSize:%d, dataSize:%d", java.lang.Long.valueOf(pLong2.value), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(eVar.f329842e));
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.d(11787, 5);
        mn1.d.i().h().e();
        mn1.d.i().e().f309609a = -13;
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        eVar.a(-13);
        g0Var2.idkeyStat(485L, 5L, 1L, false);
    }
}
