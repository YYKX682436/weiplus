package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class ug implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI f161612d;

    public ug(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasCheckUI settingsModifyAliasCheckUI) {
        this.f161612d = settingsModifyAliasCheckUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 7L;
        modifyAliasLogStruct.k();
        this.f161612d.onBackPressed();
        return true;
    }
}
