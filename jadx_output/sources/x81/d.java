package x81;

/* loaded from: classes7.dex */
public class d extends x81.f {
    public d(x81.e eVar, int i17, long j17, long j18, com.tencent.mm.plugin.appbrand.report.AppBrandRecommendStatObj appBrandRecommendStatObj) {
        super(i17, j17, j18, appBrandRecommendStatObj);
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "account nor ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "CgiRTReportRecommdClick profile click errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Recommend.CgiRTReportRecommdClick", "report success");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Recommend.CgiRTReportRecommdClick", "report fail");
        }
    }
}
