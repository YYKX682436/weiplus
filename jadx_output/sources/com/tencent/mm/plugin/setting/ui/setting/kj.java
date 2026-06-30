package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class kj implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161241d;

    public kj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161241d = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        ip.l.s(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161241d;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsNotificationUI.f160590g).h("settings_new_voip_msg_invite_notification")).O(true);
        settingsNotificationUI.initView();
        c01.a9.b(false, true);
    }
}
