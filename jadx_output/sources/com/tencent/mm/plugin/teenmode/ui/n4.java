package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class n4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173081d;

    public n4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173081d = settingsTeenModeMain;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f173081d.getContext(), 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.teenmode.ui.k4(this);
        k0Var.f211881s = new com.tencent.mm.plugin.teenmode.ui.m4(this);
        k0Var.v();
        return true;
    }
}
