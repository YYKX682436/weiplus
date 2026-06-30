package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class qi implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI f161476d;

    public qi(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyPatSuffixUI settingsModifyPatSuffixUI) {
        this.f161476d = settingsModifyPatSuffixUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f161476d.onBackPressed();
        return true;
    }
}
