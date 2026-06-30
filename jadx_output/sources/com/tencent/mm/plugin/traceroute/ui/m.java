package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class m implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI f175330d;

    public m(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI) {
        this.f175330d = networkDiagnoseReportUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f175330d.finish();
        return false;
    }
}
