package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class sg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI f161542d;

    public sg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI) {
        this.f161542d = settingsManageFindOtherServiceUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f161542d.finish();
    }
}
