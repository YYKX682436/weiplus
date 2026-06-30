package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class s6 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI f161531d;

    public s6(com.tencent.mm.plugin.setting.ui.setting.SettingsAliasResultUI settingsAliasResultUI) {
        this.f161531d = settingsAliasResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161531d.finish();
        return true;
    }
}
