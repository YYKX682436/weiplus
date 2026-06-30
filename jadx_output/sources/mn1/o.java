package mn1;

/* loaded from: classes12.dex */
public class o implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329874d;

    public o(mn1.e eVar) {
        this.f329874d = eVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        mn1.e.O = true;
        kn1.m mVar = kn1.m.f309634g;
        kn1.o oVar = kn1.o.f309650f;
        kn1.q.a(mVar, oVar, "connect success");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(485L, 42L, 1L, false);
        g0Var.d(11787, 0);
        sn1.i.Q(1, this.f329874d.I);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth failed");
            kn1.q.a(kn1.m.f309635h, kn1.o.f309651g, "OnHandShake: auth failed");
            mn1.d.i().e().f309609a = -5;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f329874d.a(-5);
            this.f329874d.e(11789, 3);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd auth success");
        sn1.a aVar = (sn1.a) m1Var;
        int i19 = aVar.f409967v.f447487h;
        if (i19 < 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start old move, version:%d", java.lang.Integer.valueOf(i19));
            g0Var.idkeyStat(485L, 104L, 1L, false);
            mn1.d.i().e().f309609a = -12;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f329874d.a(-12);
            kn1.q.a(kn1.m.f309635h, kn1.o.f309651g, "OnHandShake: version conflict");
            return;
        }
        kn1.q.f309661d = i19;
        kn1.q.a(kn1.m.f309635h, oVar, "OnHandshake success");
        wn1.u uVar = aVar.f409967v;
        int i27 = uVar.f447488i;
        this.f329874d.f329858u = (uVar.f447489m & 1) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd start new move, version:%d, type:%d, isServerSupportKv:%b", java.lang.Integer.valueOf(uVar.f447487h), java.lang.Integer.valueOf(i27), java.lang.Boolean.valueOf(this.f329874d.f329858u));
        if (i27 != 1) {
            if (this.f329874d.i()) {
                this.f329874d.f329863z = 3;
            } else {
                this.f329874d.f329863z = 1;
            }
            this.f329874d.f329861x = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
            ((ku5.t0) ku5.t0.f312615d).g(new mn1.n(this));
            return;
        }
        if (!this.f329874d.i()) {
            this.f329874d.f329861x = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Normal move.");
            this.f329874d.f329863z = 2;
            ((ku5.t0) ku5.t0.f312615d).g(new mn1.m(this));
            return;
        }
        this.f329874d.f329861x = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "onBackupAuthEnd is Resume Move!!!.");
        mn1.e eVar = this.f329874d;
        eVar.f329863z = 4;
        mn1.e.d(eVar);
    }
}
