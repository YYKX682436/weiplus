package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class bj implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI f160875d;

    public bj(com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI settingsMusicUI) {
        this.f160875d = settingsMusicUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.setting.ui.setting.SettingsMusicUI settingsMusicUI = this.f160875d;
        settingsMusicUI.hideVKB();
        settingsMusicUI.finish();
        return true;
    }
}
