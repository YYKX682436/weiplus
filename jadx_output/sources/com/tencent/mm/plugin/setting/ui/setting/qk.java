package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RcptRecentAddrEvent f161478d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI f161479e;

    public qk(com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent, com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI) {
        this.f161478d = rcptRecentAddrEvent;
        this.f161479e = settingsPersonalInfoPreviewUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        am.lp lpVar = this.f161478d.f54644h;
        if (lpVar.f7253a == 0) {
            java.util.List list = lpVar.f7264l;
            com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoPreviewUI settingsPersonalInfoPreviewUI = this.f161479e;
            settingsPersonalInfoPreviewUI.f160599e = list;
            if (list == null) {
                settingsPersonalInfoPreviewUI.f160599e = new java.util.ArrayList();
            }
        }
    }
}
