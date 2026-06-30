package qn1;

/* loaded from: classes12.dex */
public class b0 implements kn1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qn1.c0 f364937a;

    public b0(qn1.c0 c0Var) {
        this.f364937a = c0Var;
    }

    @Override // kn1.c
    public void a(int i17) {
        qn1.c0 c0Var = this.f364937a;
        java.util.HashSet hashSet = new java.util.HashSet(c0Var.f364952d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.u3.h(new qn1.z(this, hashSet, i17));
        if (c0Var.f364950b != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new qn1.a0(this, i17));
        }
    }

    @Override // kn1.c
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupPackAndSendCallback onCancel, isSelf[%b]", java.lang.Boolean.valueOf(z17));
        this.f364937a.d(z17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 120L, 1L, false);
    }

    @Override // kn1.c
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcServer", "onBackupFinish");
        on1.e.a();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(400L, 11L, 1L, false);
        qn1.c0 c0Var = this.f364937a;
        ln1.s sVar = c0Var.f364951c;
        g0Var.idkeyStat(400L, 12L, sVar == null ? 0L : (java.lang.System.currentTimeMillis() - sVar.f319812m) / 1000, false);
        ln1.s sVar2 = c0Var.f364951c;
        g0Var.idkeyStat(400L, 13L, sVar2 == null ? 0L : sVar2.f319811l / 1024, false);
        c0Var.c(13737, 0);
        sn1.i.X(11);
        if (c0Var.f364953e) {
            return;
        }
        c0Var.c(13737, 21);
    }
}
