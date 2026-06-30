package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vt implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI f170714d;

    public vt(com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI snsUploadBrowseUI) {
        this.f170714d = snsUploadBrowseUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$1");
        this.f170714d.r7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI$1");
        return true;
    }
}
