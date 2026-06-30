package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class o4 implements com.tencent.mm.plugin.sns.ui.o9 {
    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void c(java.lang.String workTagId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$1");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mm.plugin.sns.ui.q4.a().put(workTagId, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$1");
    }

    @Override // com.tencent.mm.plugin.sns.ui.o9
    public void d(int i17, o55.a aVar, java.lang.String workTagId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$1");
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mm.plugin.sns.ui.q4.a().put(workTagId, 100);
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalSightExportProgressManager", "SightWidgetBackgroundVideoHandler finish:".concat(workTagId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.ui.GlobalSightExportProgressManager$1");
    }
}
