package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class b3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI f160854d;

    public b3(com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI) {
        this.f160854d = settingDeleteAccountInputPassUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingDeleteAccountInputPassUI settingDeleteAccountInputPassUI = this.f160854d;
        settingDeleteAccountInputPassUI.hideVKB();
        settingDeleteAccountInputPassUI.finish();
        return true;
    }
}
