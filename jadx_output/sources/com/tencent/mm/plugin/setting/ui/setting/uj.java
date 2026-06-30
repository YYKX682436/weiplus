package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class uj implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161614a;

    public uj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161614a = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        ip.l.r(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161614a;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsNotificationUI.f160590g).h("settings_new_msg_notification_switch")).O(true);
        settingsNotificationUI.initView();
    }
}
