package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class tl implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI f161582d;

    public tl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI) {
        this.f161582d = settingsSelectBgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161582d.finish();
        return true;
    }
}
