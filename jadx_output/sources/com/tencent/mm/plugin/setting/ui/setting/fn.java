package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public final class fn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI f161042d;

    public fn(com.tencent.mm.plugin.setting.ui.setting.SettingsSystemPermissionUI settingsSystemPermissionUI) {
        this.f161042d = settingsSystemPermissionUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f161042d.finish();
        return true;
    }
}
