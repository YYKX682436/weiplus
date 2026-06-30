package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class bs$$b implements rl5.o {
    @Override // rl5.o
    public final void onShow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getPopupMenu$1", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        ta4.y0.f416866d = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getPopupMenu$1", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }
}
