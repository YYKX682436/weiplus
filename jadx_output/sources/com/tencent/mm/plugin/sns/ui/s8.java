package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class s8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightUploadUI f170445d;

    public s8(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI) {
        this.f170445d = sightUploadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4");
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = this.f170445d;
        db5.e1.e(sightUploadUI.getContext(), null, new java.lang.String[]{sightUploadUI.getString(com.tencent.mm.R.string.j5_)}, null, new com.tencent.mm.plugin.sns.ui.r8(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$4");
        return false;
    }
}
