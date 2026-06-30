package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class vj implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161670d;

    public vj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161670d = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        ip.l.r(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161670d;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsNotificationUI.f160590g).h("settings_new_msg_notification_switch")).O(true);
        settingsNotificationUI.initView();
    }
}
