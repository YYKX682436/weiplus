package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class j5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder f173041d;

    public j5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder) {
        this.f173041d = settingsTeenModeMainFinder;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f173041d.onBackPressed();
        return true;
    }
}
