package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q8 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightUploadUI f170331d;

    public q8(com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI) {
        this.f170331d = sightUploadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$3");
        com.tencent.mm.autogen.events.SightSendResultEvent sightSendResultEvent = new com.tencent.mm.autogen.events.SightSendResultEvent();
        am.su suVar = sightSendResultEvent.f54784g;
        suVar.f7936a = 0;
        suVar.f7937b = false;
        sightSendResultEvent.e();
        com.tencent.mm.plugin.sns.ui.SightUploadUI sightUploadUI = this.f170331d;
        sightUploadUI.hideVKB();
        sightUploadUI.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SightUploadUI$3");
        return true;
    }
}
