package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class q5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther f173116d;

    public q5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainOther settingsTeenModeMainOther) {
        this.f173116d = settingsTeenModeMainOther;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f173116d.onBackPressed();
        return true;
    }
}
