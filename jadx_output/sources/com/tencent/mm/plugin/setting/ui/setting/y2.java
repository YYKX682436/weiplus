package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class y2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode f161773d;

    public y2(com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode settingDarkMode) {
        this.f161773d = settingDarkMode;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161773d.finish();
        return true;
    }
}
