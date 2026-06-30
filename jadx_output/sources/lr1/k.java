package lr1;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final lr1.k f320682a = new lr1.k();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f320683b = jz5.h.b(lr1.h.f320671d);

    public static final void a() {
        lr1.k kVar = f320682a;
        long abs = java.lang.Math.abs(java.lang.System.currentTimeMillis() - kVar.b().getLong("biz_time_line_strategy_last_time", 0L));
        if (abs < kVar.b().getLong("biz_time_line_fetch_interval", 1800000L)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizStrategyManager", "fetchBizStrategy delta < interval, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizStrategyManager", "fetchBizStrategy %d, requestType: %d", java.lang.Long.valueOf(abs), 32718762);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qm();
        lVar.f70665b = new r45.rm();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/timeline/bizstrategy";
        lVar.f70667d = 1806;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizStrategyReq");
        ((r45.qm) fVar).f384090d = 32718762;
        com.tencent.mm.modelbase.z2.d(a17, lr1.g.f320662d, false);
    }

    public final com.tencent.mm.sdk.platformtools.o4 b() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f320683b).getValue();
    }
}
