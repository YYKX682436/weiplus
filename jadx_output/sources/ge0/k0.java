package ge0;

/* loaded from: classes4.dex */
public class k0 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
        if (m1Var.getType() == 209) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostSceneEnd", "snsPostSceneEnd, errType:%s, errCode:%s, errMsg:%s, hashCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(hashCode()));
            com.tencent.mm.plugin.sns.model.r2 r2Var = (com.tencent.mm.plugin.sns.model.r2) m1Var;
            int L = r2Var.L();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            if (L == ba4.b.f18700c) {
                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
                if (snsCoverReportStruct != null) {
                    snsCoverReportStruct.f60528o = (int) (java.lang.System.currentTimeMillis() - ba4.b.f18699b);
                }
                com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct2 = ba4.b.f18698a;
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.f60527n = i18;
                }
                if (snsCoverReportStruct2 != null) {
                    snsCoverReportStruct2.k();
                }
                ba4.b.f18698a = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPostFinish", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            boolean z17 = r2Var.f164630m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                long j17 = r2Var.f164628h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsPostSceneEnd", "get the del post come back %d " + j17, java.lang.Integer.valueOf(L));
                if (j17 != 0) {
                    com.tencent.mm.plugin.sns.model.l4.xj().c(j17);
                    gm0.j1.i();
                    gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(j17, 1));
                }
                com.tencent.mm.plugin.sns.model.l4.Fj().L0(L);
                if (j17 != 0) {
                    com.tencent.mm.plugin.sns.model.l4.Aj().y0(j17);
                    com.tencent.mm.plugin.sns.storage.u1.a(j17);
                }
            }
            if (i17 == 0 && i18 == 0) {
                com.tencent.mm.plugin.sns.model.l4.Nj().k(r2Var.L(), true);
            } else {
                com.tencent.mm.plugin.sns.model.l4.Nj().k(r2Var.L(), false);
            }
            com.tencent.mm.plugin.sns.statistics.u0 u0Var = com.tencent.mm.plugin.sns.statistics.v0.f164987a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.statistics.u0 u0Var2 = com.tencent.mm.plugin.sns.statistics.v0.f164987a;
            com.tencent.mm.autogen.mmdata.rpt.SnsUploadReportStruct snsUploadReportStruct = u0Var2.f164979a;
            snsUploadReportStruct.f60759o = currentTimeMillis - u0Var2.f164980b;
            snsUploadReportStruct.f60753i = 7L;
            com.tencent.mm.plugin.sns.statistics.v0.b(u0Var2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTimeLine", "com.tencent.mm.plugin.sns.statistics.SnsUploadReportManager");
            com.tencent.mm.plugin.sns.model.o7 Nj = com.tencent.mm.plugin.sns.model.l4.Nj();
            Nj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
            Nj.f164557b = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScenePost", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.feature.sns.extension.SnsPostSceneEnd");
    }
}
