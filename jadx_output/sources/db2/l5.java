package db2;

/* loaded from: classes5.dex */
public final class l5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228061g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228062h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228063i;

    /* renamed from: m, reason: collision with root package name */
    public db2.k5 f228064m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(long j17, java.lang.String str, int i17, int i18, java.lang.String reportData, r45.cl2 cl2Var) {
        super(null, 1, null);
        java.util.LinkedList list;
        r45.fl2 fl2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(reportData, "reportData");
        this.f228061g = "Finder.NetSceneFinderAdReport";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 9935;
        r45.xt0 xt0Var = new r45.xt0();
        xt0Var.set(2, java.lang.Integer.valueOf(i18));
        xt0Var.set(3, reportData);
        db2.t4 t4Var = db2.t4.f228171a;
        xt0Var.set(1, t4Var.a(9935));
        xt0Var.set(5, cl2Var);
        t4Var.h((r45.kv0) xt0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = xt0Var;
        r45.yt0 yt0Var = new r45.yt0();
        yt0Var.set(0, new r45.ie());
        lVar.f70665b = yt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadreport";
        this.f228062h = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderAdReport", "NetSceneFinderAdReport " + i18 + ", " + reportData);
        r45.kv0 kv0Var = (r45.kv0) xt0Var.getCustom(1);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderAdReport", "NetSceneFinderAdReport sessionBuffer: ".concat((kv0Var == null || (list = kv0Var.getList(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(list)) == null || (string = fl2Var.getString(1)) == null) ? "" : string));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228061g, "NetSceneFinderAdReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.tencent.mm.modelbase.u0 u0Var = this.f228063i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        db2.k5 k5Var = this.f228064m;
        if (k5Var != null) {
            long j17 = ((com.tencent.mm.plugin.finder.report.m3) k5Var).f125129a;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.tencent.mm.autogen.mmdata.rpt.FinderAdvertisementKvReportStruct finderAdvertisementKvReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderAdvertisementKvReportStruct();
                finderAdvertisementKvReportStruct.f56477d = finderAdvertisementKvReportStruct.b("object_id", pm0.v.u(j17), true);
                finderAdvertisementKvReportStruct.f56478e = r6.f125130b;
                finderAdvertisementKvReportStruct.f56479f = r6.f125131c;
                finderAdvertisementKvReportStruct.f56480g = i18;
                finderAdvertisementKvReportStruct.f56481h = i19;
                finderAdvertisementKvReportStruct.k();
                com.tencent.mars.xlog.Log.i("Finder.FinderReportLogic", "reportHardAdvertisement end, feedId=" + pm0.v.u(j17) + ", errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str);
                kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228063i = u0Var;
        com.tencent.mars.xlog.Log.i(this.f228061g, "NetSceneFinderAdReport doScene");
        return dispatch(sVar, this.f228062h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 9935;
    }
}
