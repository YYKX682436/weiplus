package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class yj implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161790a;

    public yj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161790a = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        ip.l.s(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161790a;
        ((com.tencent.mm.ui.base.preference.CheckBoxPreference) ((com.tencent.mm.ui.base.preference.h0) settingsNotificationUI.f160590g).h("settings_new_voip_msg_invite_notification")).O(true);
        settingsNotificationUI.initView();
        c01.a9.b(false, true);
    }
}
