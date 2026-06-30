package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class u8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightUploadUI f170568d;

    public u8(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI) {
        this.f170568d = sightUploadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = this.f170568d;
        if (sightUploadUI.isFinishing()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
            return false;
        }
        java.lang.String obj = com.tencent.mm.plugin.sns.ui.SightUploadUI.T6(sightUploadUI).getText().toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        sightUploadUI.f166637g = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.SightUploadUI");
        int pasterLen = com.tencent.mm.plugin.sns.ui.SightUploadUI.T6(sightUploadUI).getPasterLen();
        ck5.f b17 = ck5.f.b(com.tencent.mm.plugin.sns.ui.SightUploadUI.T6(sightUploadUI));
        int n17 = ip.c.n();
        b17.f42561f = 0;
        b17.f42560e = n17;
        b17.f42556a = true;
        b17.d(new com.tencent.mm.plugin.sns.ui.t8(this, pasterLen));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$5");
        return false;
    }
}
