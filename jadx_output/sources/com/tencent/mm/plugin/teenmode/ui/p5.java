package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class p5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram f173106d;

    public p5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainMiniProgram settingsTeenModeMainMiniProgram) {
        this.f173106d = settingsTeenModeMainMiniProgram;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f173106d.onBackPressed();
        return true;
    }
}
