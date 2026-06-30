package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class yt implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI f171648d;

    public yt(com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI snsUploadBrowseUI) {
        this.f171648d = snsUploadBrowseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2");
        db5.e1.n(this.f171648d, com.tencent.mm.R.string.jaf, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.sns.ui.wt(this), new com.tencent.mm.plugin.sns.ui.xt(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$2");
        return true;
    }
}
