package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class qy extends com.tencent.mm.plugin.sns.ui.l1 {
    public qy(android.content.Context context) {
        super(context, 2, "", 0, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoadingEndInvisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
        this.f169706g = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoadingEndInvisible", "com.tencent.mm.plugin.sns.ui.BaseTimeLine");
    }

    @Override // com.tencent.mm.plugin.sns.ui.l1
    public int k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.WsFoldDetailTimeLine");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("timelineScene", "com.tencent.mm.plugin.sns.ui.WsFoldDetailTimeLine");
        return 1;
    }
}
