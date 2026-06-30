package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class yg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI f161788d;

    public yg(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyAliasUI settingsModifyAliasUI) {
        this.f161788d = settingsModifyAliasUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct modifyAliasLogStruct = new com.tencent.mm.autogen.mmdata.rpt.ModifyAliasLogStruct();
        modifyAliasLogStruct.p(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI.f160316r);
        modifyAliasLogStruct.f59239e = 7L;
        modifyAliasLogStruct.f59241g = 2L;
        modifyAliasLogStruct.k();
        this.f161788d.onBackPressed();
        return true;
    }
}
