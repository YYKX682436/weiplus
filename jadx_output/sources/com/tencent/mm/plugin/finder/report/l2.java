package com.tencent.mm.plugin.finder.report;

/* loaded from: classes5.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderFeedReportObject f125111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f125112e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject, boolean z17) {
        super(0);
        this.f125111d = finderFeedReportObject;
        this.f125112e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String string;
        yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
        if (m7Var.Zi()) {
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = this.f125111d;
            java.util.Map j17 = p2Var.j(finderFeedReportObject);
            j17.put("FeedID", "0");
            boolean z17 = this.f125112e;
            j17.put("PostState", z17 ? "4" : "3");
            java.lang.String mjPublisherSessionID = finderFeedReportObject.getMjPublisherSessionID();
            java.lang.String str = "";
            if (mjPublisherSessionID == null) {
                mjPublisherSessionID = "";
            }
            r45.ke4 mjPublisherInfo = finderFeedReportObject.getMjPublisherInfo();
            if (mjPublisherInfo != null && (string = mjPublisherInfo.getString(0)) != null) {
                str = string;
            }
            m7Var.pj(mjPublisherSessionID, str, j17);
            java.util.Map k17 = p2Var.k(finderFeedReportObject);
            k17.put("feed_id", "0");
            java.lang.String str2 = z17 ? "post_save_exit" : "post_exit";
            k17.put("view_id", str2);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.yj(str2, null, k17, 6, false);
            k17.put("view_id", "post_out");
            k17.put("post_state", z17 ? "4" : "3");
            aVar.yj("post_out", null, k17, 6, false);
        }
        return jz5.f0.f302826a;
    }
}
