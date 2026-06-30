package ox;

/* loaded from: classes4.dex */
public final class c0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox.e0 f349453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349454b;

    public c0(ox.e0 e0Var, java.lang.String str) {
        this.f349453a = e0Var;
        this.f349454b = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        ox.e0 e0Var = this.f349453a;
        java.lang.String str2 = e0Var.f349466g;
        java.lang.String poiId = this.f349454b;
        if (!kotlin.jvm.internal.o.b(str2, poiId)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo, poiId changed, currentPoiId=" + e0Var.f349466g + ", poiId=" + poiId);
            return;
        }
        boolean z17 = true;
        boolean z18 = i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.bj3);
        java.lang.Long Ai = ((ox.h0) i95.n0.c(ox.h0.class)).Ai(poiId);
        long longValue = Ai != null ? Ai.longValue() : 0L;
        ox.h0 h0Var = (ox.h0) i95.n0.c(ox.h0.class);
        h0Var.getClass();
        kotlin.jvm.internal.o.g(poiId, "poiId");
        if (poiId.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BizSnsPublishMonitor", "recordRequestFinish: poiId is empty");
        } else {
            h0Var.f349483d.remove(poiId);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishMonitor", "recordRequestFinish: poiId=".concat(poiId));
        }
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo finish, poiId: " + poiId + ", errType: " + i17 + ", errCode: " + i18 + ", duration: " + longValue + "ms");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(2118L, 5L, 1L, false);
            return;
        }
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetMomentPoiBarInfoResp");
        r45.bj3 bj3Var = (r45.bj3) fVar2;
        java.lang.String str3 = bj3Var.f370800d;
        if (!(str3 == null || str3.length() == 0)) {
            java.lang.String str4 = bj3Var.f370801e;
            if (!(str4 == null || str4.length() == 0)) {
                java.lang.String str5 = bj3Var.f370802f;
                if (str5 != null && str5.length() != 0) {
                    z17 = false;
                }
                if (!z17) {
                    if (!bj3Var.f370803g) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo , should_show_info: false, poiId: " + poiId);
                        return;
                    }
                    java.lang.String biz_cnt_wording = bj3Var.f370800d;
                    kotlin.jvm.internal.o.f(biz_cnt_wording, "biz_cnt_wording");
                    java.lang.String cover_img_url = bj3Var.f370801e;
                    kotlin.jvm.internal.o.f(cover_img_url, "cover_img_url");
                    java.lang.String aggr_url = bj3Var.f370802f;
                    kotlin.jvm.internal.o.f(aggr_url, "aggr_url");
                    e0Var.f349463d.put(poiId, new ox.b0(biz_cnt_wording, cover_img_url, aggr_url));
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo success, poiId: " + poiId + ", data cached, duration: " + longValue + "ms");
                    return;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BizSnsPublishHelper", "getBizSnsPoiInfo params empty, " + bj3Var.f370800d + ", " + bj3Var.f370801e + ", " + bj3Var.f370802f);
    }
}
