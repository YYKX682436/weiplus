package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class n implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI f175331d;

    public n(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI) {
        this.f175331d = networkDiagnoseReportUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f175331d.finish();
        return true;
    }
}
