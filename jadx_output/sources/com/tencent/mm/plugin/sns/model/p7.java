package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class p7 implements com.tencent.mm.plugin.sns.model.v7 {
    public p7(com.tencent.mm.plugin.sns.model.o7 o7Var) {
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void onPostEnd(final int i17, final boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.w7.class, new fs.o() { // from class: com.tencent.mm.plugin.sns.model.p7$$b
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onPostEnd$0", "com.tencent.mm.plugin.sns.model.UploadManager$1");
                ge0.f0 f0Var = (ge0.f0) ((com.tencent.mm.plugin.sns.model.w7) nVar);
                f0Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                boolean z18 = z17;
                int i18 = i17;
                if (z18) {
                    ((su4.x0) i95.n0.c(su4.x0.class)).getClass();
                    if (i18 <= 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                    } else {
                        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Ai(2, "SnsPostEnd_" + i18, wa4.u.class, new ge0.e0(f0Var, i18));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTagSearchOnSnsPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTextSubmitOnPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                ta4.x0 a17 = ta4.x0.f416851j.a();
                if (a17 != null) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i18);
                    if (i19 != null) {
                        long j17 = i19.field_snsId;
                        if (j17 != 0) {
                            java.lang.String t07 = ca4.z0.t0(j17);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                            kotlin.jvm.internal.o.g(t07, "<set-?>");
                            a17.f416854b = t07;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublishFeedId", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOpResult", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                    a17.f416861i = 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOpResult", "com.tencent.mm.plugin.sns.report.SnsInputAreaReporter");
                    a17.b();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTextSubmitOnPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onPostEnd$0", "com.tencent.mm.plugin.sns.model.UploadManager$1");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPostEnd", "com.tencent.mm.plugin.sns.model.UploadManager$1");
    }

    @Override // com.tencent.mm.plugin.sns.model.v7
    public void updateBackView(final com.tencent.mm.plugin.sns.storage.x1 x1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.plugin.sns.model.UploadManager$1");
        fs.g.b(com.tencent.mm.plugin.sns.model.w7.class, new fs.o(x1Var) { // from class: com.tencent.mm.plugin.sns.model.p7$$a
            @Override // fs.o
            public final boolean a(fs.n nVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$updateBackView$1", "com.tencent.mm.plugin.sns.model.UploadManager$1");
                ((ge0.f0) ((com.tencent.mm.plugin.sns.model.w7) nVar)).getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBackView", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.feature.sns.extension.SnsCoreOnUploadListener");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$updateBackView$1", "com.tencent.mm.plugin.sns.model.UploadManager$1");
                return false;
            }
        });
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBackView", "com.tencent.mm.plugin.sns.model.UploadManager$1");
    }
}
