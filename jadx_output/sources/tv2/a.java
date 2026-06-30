package tv2;

/* loaded from: classes2.dex */
public final class a extends pv2.d {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f422265e;

    /* renamed from: f, reason: collision with root package name */
    public final int f422266f;

    /* renamed from: g, reason: collision with root package name */
    public final int f422267g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f422268h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f422269i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, int i17, int i18, java.lang.String errMsg) {
        super(java.lang.String.valueOf(finderObj.getLocalId()));
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f422265e = finderObj;
        this.f422266f = i17;
        this.f422267g = i18;
        this.f422268h = errMsg;
        this.f422269i = "LogPost.FinderFailedStage";
    }

    @Override // pv2.g
    public int a() {
        return 100;
    }

    @Override // pv2.a
    public void c() {
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject;
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2;
        int i17 = this.f422266f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int i18 = this.f422267g;
        com.tencent.mars.xlog.Log.w(this.f422269i, "post failed, errType %d, errCode %d, errMsg %s", valueOf, java.lang.Integer.valueOf(i18), this.f422268h);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f422265e;
        finderItem.setPostFailed();
        if (Integer.MIN_VALUE != i17 && (finderFeedReportObject2 = finderItem.field_reportObject) != null) {
            finderFeedReportObject2.setCgiErrorType(i17);
        }
        if (Integer.MIN_VALUE != i18 && (finderFeedReportObject = finderItem.field_reportObject) != null) {
            finderFeedReportObject.setCgiErrorCode(i18);
        }
        cu2.u.f222441a.l(finderItem);
        boolean isLongVideo = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.C(1253L, 18L, 1L);
        if (isLongVideo) {
            g0Var.C(1523L, 18L, 1L);
        }
        mv2.f0 f0Var = mv2.f0.f331561a;
        pm0.v.X(new mv2.v(finderItem.getLocalId(), false));
        pm0.v.X(new mv2.w(finderItem.getLocalId()));
        boolean isLongVideo2 = finderItem.isLongVideo();
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.C(1253L, 16L, 1L);
        if (isLongVideo2) {
            if ((1253 == 1253 ? 1523L : 0L) > 0) {
                g0Var2.C(1253 == 1253 ? 1523L : 0L, 16L, 1L);
            }
        }
    }
}
