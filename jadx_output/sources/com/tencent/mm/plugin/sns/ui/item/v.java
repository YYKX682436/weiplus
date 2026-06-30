package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class v implements java.lang.Runnable {
    public v(com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew fullCardAdTimeLineItemNew) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$2");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.FullCardAdTimeLineItemNew$2");
    }
}
