package lr1;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.b f320640a = new lr1.b();

    public final void a() {
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("brandService", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - J2.getLong("biz_common_strategy_last_time", 0L));
        com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J("brandService", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J3, "getAccountAwareMMKV(...)");
        long j17 = J3.getLong("biz_common_strategy_fetch_interval", 1800000L);
        if (j17 < 60000) {
            j17 = 60000;
        }
        if (abs < j17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy delta < interval, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy %d", java.lang.Long.valueOf(abs));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ek();
        lVar.f70665b = new r45.fk();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizattr/bizstrategy";
        lVar.f70667d = 2723;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizCommonStrategyReq");
        java.util.LinkedList linkedList = ((r45.ek) fVar).f373574d;
        r45.dk dkVar = new r45.dk();
        dkVar.f372533d = 1;
        dkVar.f372534e = 1;
        linkedList.add(dkVar);
        com.tencent.mm.modelbase.z2.d(a17, lr1.a.f320636d, false);
    }
}
