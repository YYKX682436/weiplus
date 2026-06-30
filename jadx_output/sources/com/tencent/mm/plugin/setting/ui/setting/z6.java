package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class z6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI f161815d;

    public z6(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI) {
        this.f161815d = settingsAliasUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI = this.f161815d;
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = settingsAliasUI.f160326q;
        modifyAliasLogStruct.f59239e = 7L;
        modifyAliasLogStruct.k();
        settingsAliasUI.onBackPressed();
        return true;
    }
}
