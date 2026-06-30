package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity f171638d;

    public yn(com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f171638d = snsOnlineVideoActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6");
        db5.e1.n(this.f171638d, com.tencent.mm.R.string.jgs, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.wn(this), new com.tencent.mm.plugin.sns.ui.xn(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$6");
        return true;
    }
}
