package to3;

/* loaded from: classes9.dex */
public class o implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to3.q f420971d;

    public o(to3.q qVar) {
        this.f420971d = qVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if ((m1Var instanceof wo3.e) && i17 == 0 && i18 == 0) {
            wo3.e eVar = (wo3.e) m1Var;
            int i19 = eVar.f448149e;
            to3.q.f420974d = i19;
            if (i19 == 0) {
                to3.q.f420974d = 5000;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "NetSceneOfflineGetMsg: ackkey: %s, appMsg: %s", eVar.f448150f, eVar.f448148d);
            if (com.tencent.mm.sdk.platformtools.t8.K0(eVar.f448148d) || com.tencent.mm.sdk.platformtools.t8.K0(eVar.f448150f)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "OfflineGetMsgLogic msg is null");
            } else if (to3.q.d(eVar.f448150f, eVar.f448148d)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "from cgi");
                if (com.tencent.mm.sdk.platformtools.aa.d(eVar.f448148d, "sysmsg", null) == null) {
                    return;
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(135L, 71L, 1L, true);
                wo3.c0 Ri = to3.c0.Ai().Ri();
                java.lang.String str2 = eVar.f448148d;
                Ri.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "notifyMsgFromCgi");
                if (!android.text.TextUtils.isEmpty(str2)) {
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str2, "sysmsg", null);
                    int i27 = -1;
                    if (d17 != null) {
                        i27 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.paymsg.PayMsgType"), -1);
                    }
                    if (i27 != 7 && i27 != 10) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineMsgManager", "process msg from pull");
                        Ri.h(str2);
                        Ri.a(str2, false);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflineGetMsgLogic", "mIntercal=" + to3.q.f420974d);
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f420971d.f420976b;
            long j17 = (long) to3.q.f420974d;
            b4Var.c(j17, j17);
        }
    }
}
