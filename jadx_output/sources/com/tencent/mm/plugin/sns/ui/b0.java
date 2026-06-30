package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ArtistBrowseUI f167796d;

    public b0(com.tencent.mm.plugin.sns.ui.ArtistBrowseUI artistBrowseUI) {
        this.f167796d = artistBrowseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$1");
        this.f167796d.f7().f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.ArtistBrowseUI$1");
        return true;
    }
}
