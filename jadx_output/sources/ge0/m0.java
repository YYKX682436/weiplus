package ge0;

/* loaded from: classes4.dex */
public class m0 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
        if (m1Var.getType() == 207) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUploadSceneEnd", "snsUploadSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(hashCode()));
            boolean z17 = m1Var instanceof com.tencent.mm.plugin.sns.model.l3;
            int I = z17 ? ((com.tencent.mm.plugin.sns.model.l3) m1Var).I() : 0;
            com.tencent.mm.plugin.sns.statistics.v0.a(I, i17, i18);
            if (i17 != 0 || i18 != 0) {
                com.tencent.mm.plugin.sns.model.l4.Nj().d();
                if (z17) {
                    int i19 = i18 + 10000;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                    if (I == ba4.b.f18700c) {
                        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
                        if (snsCoverReportStruct != null) {
                            snsCoverReportStruct.f60528o = (int) (java.lang.System.currentTimeMillis() - ba4.b.f18699b);
                        }
                        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = ba4.b.f18698a;
                        if (snsCoverReportStruct2 != null) {
                            snsCoverReportStruct2.f60527n = i19;
                        }
                        if (snsCoverReportStruct2 != null) {
                            snsCoverReportStruct2.k();
                        }
                        ba4.b.f18698a = null;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsUploadSceneEnd");
    }
}
