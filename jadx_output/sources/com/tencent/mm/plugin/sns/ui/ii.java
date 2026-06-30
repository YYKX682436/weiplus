package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ii implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f168612d;

    public ii(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f168612d = snsGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$2");
        com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = this.f168612d;
        if (!snsGalleryUI.X || com.tencent.mm.plugin.sns.ui.SnsGalleryUI.r7(snsGalleryUI) == null || com.tencent.mm.plugin.sns.ui.SnsGalleryUI.r7(snsGalleryUI).isEmpty()) {
            snsGalleryUI.f7().f();
        } else {
            snsGalleryUI.z7();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$2");
        return true;
    }
}
