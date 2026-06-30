package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class a5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct f172929d;

    public a5(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainBizAcct settingsTeenModeMainBizAcct) {
        this.f172929d = settingsTeenModeMainBizAcct;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f172929d.onBackPressed();
        return true;
    }
}
