package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class r0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistUI f170370d;

    public r0(com.tencent.mm.plugin.sns.ui.ArtistUI artistUI) {
        this.f170370d = artistUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$7");
        this.f170370d.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistUI$7");
        return true;
    }
}
