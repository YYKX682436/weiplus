package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class n0 implements com.tencent.mm.modelbase.j1 {
    @Override // com.tencent.mm.modelbase.j1
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " type = " + m1Var.getType() + " @" + Cj.hashCode());
        if (m1Var.getType() != 208) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        } else {
            com.tencent.mm.plugin.sns.model.o2 o2Var = (com.tencent.mm.plugin.sns.model.o2) m1Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]NetSceneSnsDownload download finish type:%d code:%d", "[image-flow]", o2Var.H(), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            java.lang.String mediaId = o2Var.H();
            ta4.u0 u0Var = ta4.u0.f416838a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            kotlin.jvm.internal.o.g(mediaId, "mediaId");
            pm0.v.O("SnsImageLoadReporter", new ta4.i0(mediaId, i17, i18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("netSceneSnsDownloadFinish", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            java.util.Set set = Cj.f164447j;
            if (i17 == 0 && i18 == 0) {
                if (m1Var.getType() == 208) {
                    java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.sns.model.h0 h0Var = (com.tencent.mm.plugin.sns.model.h0) it.next();
                        if (h0Var != null) {
                            if (o2Var.I() == 3) {
                                h0Var.onSetbg(o2Var.H());
                            } else if (o2Var.I() == 1 || o2Var.I() == 5 || o2Var.I() == 7) {
                                h0Var.onThumbFinish(o2Var.H());
                            } else if (o2Var.I() == 2 || o2Var.I() == 10 || o2Var.I() == 11 || o2Var.I() == 8) {
                                h0Var.onImageFinish(o2Var.H(), o2Var.I(), true);
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } else {
                if (o2Var.I() == 2 || o2Var.I() == 10 || o2Var.I() == 11 || o2Var.I() == 8) {
                    java.util.Iterator it6 = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
                    while (it6.hasNext()) {
                        com.tencent.mm.plugin.sns.model.h0 h0Var2 = (com.tencent.mm.plugin.sns.model.h0) it6.next();
                        if (h0Var2 != null) {
                            h0Var2.onImageFinish(o2Var.H(), o2Var.I(), false);
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.model.DownloadManagerOnSceneEnd");
    }
}
