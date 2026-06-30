package za4;

/* loaded from: classes4.dex */
public abstract class f1 {
    public static void a(java.util.LinkedList linkedList, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            b((r45.g5) linkedList.get(i17), z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    public static void b(r45.g5 g5Var, boolean z17) {
        r45.f76 f76Var;
        r45.du5 du5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (g5Var == null || (f76Var = g5Var.f374885d) == null || (du5Var = f76Var.f374077e) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        java.lang.String g17 = x51.j1.g(du5Var);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            ((ku5.t0) ku5.t0.f312615d).g(new za4.a1(g5Var, g17, z17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPages", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }

    public static void c(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.sns.storage.SnsInfo W0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
        if (linkedList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = (com.tencent.mm.protocal.protobuf.SnsObject) linkedList.get(i17);
            if (snsObject != null && (W0 = Fj.W0(snsObject.Id)) != null) {
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = W0.getTimeLine();
                java.lang.String str = timeLine == null ? "" : timeLine.canvasInfo;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((ku5.t0) ku5.t0.f312615d).g(new za4.b1(str, W0.getSnsId()));
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preDownloadAdLandingPagesForSnsObject", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesPreDownloadResHelper");
    }
}
