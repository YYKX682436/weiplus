package mn1;

/* loaded from: classes12.dex */
public class h implements sn1.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.e f329866a;

    public h(mn1.e eVar) {
        this.f329866a = eVar;
    }

    @Override // sn1.r0
    public void a() {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f329866a.a(e17.f309609a);
    }

    @Override // sn1.r0
    public void b(int i17) {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i18 = e17.f309609a;
        mn1.e eVar = this.f329866a;
        if (i17 == 1) {
            if (i18 == 23) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is weak connect now.");
                mn1.d.i().e().f309609a = 4;
                eVar.a(4);
                eVar.e(11789, 8);
                return;
            }
            return;
        }
        if (i17 == 0 && i18 == 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveRecoverServer", "speedCallback is normal speed now.");
            mn1.d.i().e().f309609a = 23;
            eVar.a(23);
            eVar.e(11789, 9);
        }
    }

    @Override // sn1.r0
    public void c() {
        kn1.g e17 = mn1.d.i().e();
        e17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i17 = e17.f309609a;
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveRecoverServer", "speedOverTime callback, backupState[%d]", java.lang.Integer.valueOf(i17));
        if (i17 == 23 || i17 == 4) {
            mn1.e eVar = this.f329866a;
            eVar.g(true, false, -4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(485L, 43L, 1L, false);
            eVar.e(11789, 4);
            mn1.d.i().h().e();
        }
    }
}
