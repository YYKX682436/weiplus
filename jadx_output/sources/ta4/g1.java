package ta4;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta4.g1 f416747a = new ta4.g1();

    /* renamed from: b, reason: collision with root package name */
    public static int f416748b;

    public final void a(int i17, int i18, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        int i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarActionReporter", "doReport >> " + i17 + ", " + t07);
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        kotlin.jvm.internal.o.f(e17, "getMergeSnsObject(...)");
        com.tencent.mm.autogen.mmdata.rpt.WCMomentsStarActionReporterLogIDStruct wCMomentsStarActionReporterLogIDStruct = new com.tencent.mm.autogen.mmdata.rpt.WCMomentsStarActionReporterLogIDStruct();
        wCMomentsStarActionReporterLogIDStruct.f62084d = (long) i17;
        wCMomentsStarActionReporterLogIDStruct.f62085e = i18;
        int i27 = 1;
        wCMomentsStarActionReporterLogIDStruct.f62087g = wCMomentsStarActionReporterLogIDStruct.b("feedID", t07, true);
        wCMomentsStarActionReporterLogIDStruct.f62090j = snsInfo.getCreateTime();
        wCMomentsStarActionReporterLogIDStruct.f62086f = f416748b;
        wCMomentsStarActionReporterLogIDStruct.f62089i = e17.CommentCount;
        wCMomentsStarActionReporterLogIDStruct.f62088h = e17.LikeCount;
        ca4.e1 e1Var = ca4.f1.f39897a;
        if (e1Var.e(e17)) {
            wCMomentsStarActionReporterLogIDStruct.f62092l = 2L;
        } else if (e1Var.c(e17)) {
            wCMomentsStarActionReporterLogIDStruct.f62092l = 3L;
        } else if (com.tencent.mm.plugin.sns.model.s5.i(snsInfo.getLocalPrivate(), true)) {
            wCMomentsStarActionReporterLogIDStruct.f62092l = 4L;
        } else {
            wCMomentsStarActionReporterLogIDStruct.f62092l = 1L;
        }
        java.lang.String userName = snsInfo.getUserName();
        kotlin.jvm.internal.o.f(userName, "getUserName(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        r45.cb6 b17 = p94.w0.c() != null ? ((com.tencent.mm.plugin.sns.storage.e2) p94.w0.c()).b1(userName) : null;
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsStarActionReporter", "userinfo is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
            i19 = -1;
        } else {
            int i28 = b17.f371431g;
            int i29 = b17.f371432h;
            if (i29 == 4320 && (i28 & 4096) > 0) {
                i27 = 2;
            } else if (i29 == 72 && (i28 & 4096) > 0) {
                i27 = 4;
            } else if (i29 == 720 && (i28 & 4096) > 0) {
                i27 = 3;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVisibleType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
            i19 = i27;
        }
        wCMomentsStarActionReporterLogIDStruct.f62091k = i19;
        wCMomentsStarActionReporterLogIDStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doReport", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
    }
}
