package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class k8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI f169612d;

    public k8(com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI settingSnsBackgroundUI) {
        this.f169612d = settingSnsBackgroundUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$4");
        this.f169612d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverReportStruct snsCoverReportStruct = ba4.b.f18698a;
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.f60517d = 3;
        }
        if (snsCoverReportStruct != null) {
            snsCoverReportStruct.k();
        }
        ba4.b.f18698a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markPageOut", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$4");
        return true;
    }
}
