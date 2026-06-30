package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ji implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsGalleryUI f169513d;

    public ji(com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI) {
        this.f169513d = snsGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$3");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsGalleryUI.I1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        this.f169513d.A7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI$3");
        return true;
    }
}
