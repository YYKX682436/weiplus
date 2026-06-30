package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class eo implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsPermissionUI f168256d;

    public eo(com.tencent.mm.plugin.sns.ui.SnsPermissionUI snsPermissionUI) {
        this.f168256d = snsPermissionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$1");
        com.tencent.mm.plugin.sns.ui.SnsPermissionUI snsPermissionUI = this.f168256d;
        snsPermissionUI.hideVKB();
        snsPermissionUI.setResult(-1, new android.content.Intent());
        snsPermissionUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsPermissionUI$1");
        return true;
    }
}
