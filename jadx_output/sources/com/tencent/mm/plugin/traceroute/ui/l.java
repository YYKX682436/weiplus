package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class l implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI f175329d;

    public l(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI) {
        this.f175329d = networkDiagnoseIntroUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f175329d.finish();
        return true;
    }
}
