package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f171703d;

    public zn(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f171703d = snsOnlineVideoActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7");
        this.f171703d.l7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$7");
        return true;
    }
}
