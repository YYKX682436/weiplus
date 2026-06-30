package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final /* synthetic */ class bs$$a implements android.widget.PopupWindow.OnDismissListener {
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getPopupMenu$0", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (ta4.y0.f416866d) {
            com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct wCMomentsMenuActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct();
            wCMomentsMenuActionReportStruct.f62076d = ta4.y0.f416864b;
            wCMomentsMenuActionReportStruct.f62078f = 1;
            wCMomentsMenuActionReportStruct.k();
        }
        ta4.y0.f416866d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getPopupMenu$0", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter");
    }
}
