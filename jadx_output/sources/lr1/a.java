package lr1;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public static final lr1.a f320636d = new lr1.a();

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BizCommonStrategyManager", "fetchBizCommonStrategy callback %d/%d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        com.tencent.mm.sdk.platformtools.o4 J2 = com.tencent.mm.sdk.platformtools.o4.J("brandService", gm0.j1.b().h(), 1);
        kotlin.jvm.internal.o.f(J2, "getAccountAwareMMKV(...)");
        J2.putLong("biz_common_strategy_last_time", java.lang.System.currentTimeMillis());
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizCommonStrategyResp");
            r45.fk fkVar = (r45.fk) fVar;
            r45.pm pmVar = fkVar.f374403d;
            if (pmVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizCommonStrategyManager", "updateBizCStrategyControlInfo RefreshInterval = %d", java.lang.Integer.valueOf(pmVar.f383173d));
                if (pmVar.f383173d > 0) {
                    com.tencent.mm.sdk.platformtools.o4 J3 = com.tencent.mm.sdk.platformtools.o4.J("brandService", gm0.j1.b().h(), 1);
                    kotlin.jvm.internal.o.f(J3, "getAccountAwareMMKV(...)");
                    J3.putLong("biz_common_strategy_fetch_interval", pmVar.f383173d);
                }
            }
            r45.ti4 ti4Var = fkVar.f374404e;
            int i19 = ti4Var != null ? ti4Var.f386472d : 0;
            com.tencent.mm.sdk.platformtools.o4 J4 = com.tencent.mm.sdk.platformtools.o4.J("biz_masssend", gm0.j1.b().h(), 1);
            kotlin.jvm.internal.o.f(J4, "getAccountAwareMMKV(...)");
            J4.A("BizMassSendHideFlag", i19);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizMassSendUtil", "updateMassSendStrategy newHideFlag = " + i19);
        }
        return 0;
    }
}
