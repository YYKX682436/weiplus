package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro f173104d;

    public p3(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro settingsTeenModeIntro) {
        this.f173104d = settingsTeenModeIntro;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f173104d.onBackPressed();
        return true;
    }
}
