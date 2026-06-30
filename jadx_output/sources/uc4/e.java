package uc4;

/* loaded from: classes4.dex */
public final class e implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public static final uc4.e f426390d = new uc4.e();

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        if (ta4.y0.f416866d) {
            com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct wCMomentsMenuActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCMomentsMenuActionReportStruct();
            wCMomentsMenuActionReportStruct.f62076d = ta4.y0.f416864b;
            wCMomentsMenuActionReportStruct.f62078f = 1;
            wCMomentsMenuActionReportStruct.k();
        }
        ta4.y0.f416866d = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissPopup", "com.tencent.mm.plugin.sns.report.SnsMenuActionReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$register$4");
    }
}
