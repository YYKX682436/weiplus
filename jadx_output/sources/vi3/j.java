package vi3;

/* loaded from: classes12.dex */
public class j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f437599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi3.k f437600e;

    public j(vi3.k kVar, vi3.f fVar) {
        this.f437600e = kVar;
        this.f437599d = fVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        c01.d9.e().q(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT, this);
        vi3.k kVar = this.f437600e;
        vi3.f fVar = this.f437599d;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize appmsg.  errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            kVar.a();
            if (fVar.f437573a.equals("afterLogin")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 3L, 1L, false);
            } else if (fVar.f437573a.equals("afterSleep")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 18L, 1L, false);
            } else if (fVar.f437573a.equals("getMore")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(466L, 34L, 1L, false);
            }
            vi3.b.b(0L, 0L, 0L, 0L, 2, kVar.f437603b, fVar.f437573a);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize success. ");
        kn1.k.k(vi3.l.b());
        kn1.k.k(vi3.l.c());
        kVar.f437606e = false;
        long j17 = kVar.f437604c;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        if (fVar.f437573a.equals("afterLogin")) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(466L, 1L, 1L, false);
            g0Var.idkeyStat(466L, 5L, fVar.f437577e, false);
            g0Var.idkeyStat(466L, 7L, currentTimeMillis, false);
            g0Var.idkeyStat(466L, 11L, fVar.f437576d, false);
            g0Var.idkeyStat(466L, 12L, fVar.f437575c, false);
        } else if (fVar.f437573a.equals("afterSleep")) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(466L, 16L, 1L, false);
            g0Var2.idkeyStat(466L, 20L, fVar.f437577e, false);
            g0Var2.idkeyStat(466L, 22L, currentTimeMillis, false);
            g0Var2.idkeyStat(466L, 26L, fVar.f437576d, false);
            g0Var2.idkeyStat(466L, 27L, fVar.f437575c, false);
        } else if (fVar.f437573a.equals("getMore")) {
            com.tencent.mm.plugin.report.service.g0 g0Var3 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var3.idkeyStat(466L, 32L, 1L, false);
            g0Var3.idkeyStat(466L, 36L, fVar.f437577e, false);
            g0Var3.idkeyStat(466L, 38L, currentTimeMillis, false);
            g0Var3.idkeyStat(466L, 42L, fVar.f437576d, false);
            g0Var3.idkeyStat(466L, 43L, fVar.f437575c, false);
        }
        vi3.b.b(fVar.f437577e, currentTimeMillis, fVar.f437576d, fVar.f437575c, 0, kVar.f437603b, fVar.f437573a);
    }
}
