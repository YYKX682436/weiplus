package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class g5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgFlavorBlue f161068d;

    public g5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgFlavorBlue settingsAboutMicroMsgFlavorBlue) {
        this.f161068d = settingsAboutMicroMsgFlavorBlue;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgFlavorBlue settingsAboutMicroMsgFlavorBlue = this.f161068d;
        settingsAboutMicroMsgFlavorBlue.hideVKB();
        settingsAboutMicroMsgFlavorBlue.finish();
        return true;
    }
}
