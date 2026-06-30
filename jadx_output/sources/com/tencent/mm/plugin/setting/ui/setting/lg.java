package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class lg implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI f161295d;

    public lg(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI) {
        this.f161295d = settingsManageFindOtherServiceUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = this.f161295d;
        java.lang.String string = settingsManageFindOtherServiceUI.getString(com.tencent.mm.R.string.f493016io4);
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI2 = this.f161295d;
        db5.e1.A(settingsManageFindOtherServiceUI, string, null, settingsManageFindOtherServiceUI2.getString(com.tencent.mm.R.string.f493017io5), settingsManageFindOtherServiceUI2.getString(com.tencent.mm.R.string.f493015io3), new com.tencent.mm.plugin.setting.ui.setting.jg(this), new com.tencent.mm.plugin.setting.ui.setting.kg(this));
        return true;
    }
}
