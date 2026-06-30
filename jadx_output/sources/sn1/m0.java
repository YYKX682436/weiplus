package sn1;

/* loaded from: classes12.dex */
public class m0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sn1.o0 f410057d;

    public m0(sn1.o0 o0Var) {
        this.f410057d = o0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        sn1.o0 o0Var = this.f410057d;
        if (o0Var.f410064c) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler stopped is true, index[%d]", java.lang.Integer.valueOf(sn1.o0.f410061f));
            o0Var.f410063b = 0;
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupReconnectHandler", "backupReconnectTimeHandler start reconnect, index[%d]", java.lang.Integer.valueOf(sn1.o0.f410061f));
        if (sn1.o0.f410061f < o0Var.f410062a.length) {
            qn1.k kVar = (qn1.k) o0Var.f410065d;
            kVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback callback to reconnect");
            kn1.g e17 = qn1.c.i().e();
            e17.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (e17.f309609a != 5) {
                qn1.c.i().e().f309609a = 5;
                int i17 = qn1.c.i().j().f364961a;
                if (1 == i17 || 3 == i17) {
                    qn1.c.i().l().g(5);
                } else if (2 == i17 || 4 == i17) {
                    qn1.c.i().k().a(5);
                }
            }
            kVar.f364992a.e(9);
            com.tencent.mm.sdk.platformtools.b4 b4Var = o0Var.f410066e;
            long j17 = o0Var.f410062a[sn1.o0.f410061f];
            b4Var.c(j17, j17);
            sn1.o0.f410061f++;
        } else {
            o0Var.f410064c = true;
            o0Var.f410063b = 0;
            int i18 = ((qn1.k) o0Var.f410065d).f364992a.f364961a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupPcProcessMgr", "reconnectCallback reconnectFail, commandMode[%d]", java.lang.Integer.valueOf(i18));
            if (1 == i18 || 3 == i18) {
                qn1.c.i().l();
                qn1.c0.f364947n = true;
                qn1.c.i().l().d(true);
                qn1.c.i().h().e();
                qn1.c.i().e().f309609a = -4;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                qn1.c.i().l().g(-4);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 9L, 1L, false);
                qn1.c.i().l().c(13737, 3);
            } else if (2 == i18 || 4 == i18) {
                qn1.c.i().k();
                qn1.t.f365005q = true;
                qn1.c.i().k().d(true, false, -4);
                qn1.c.i().h().e();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(400L, 17L, 1L, false);
                qn1.c.i().k().b(13737, 3);
            }
        }
        return false;
    }
}
