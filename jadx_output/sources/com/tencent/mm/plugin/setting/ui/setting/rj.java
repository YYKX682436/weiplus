package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes4.dex */
public class rj implements com.tencent.mm.ui.base.preference.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161512a;

    public rj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161512a = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.base.preference.d
    public void a(android.view.View view) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161512a;
        if (settingsNotificationUI.f160592i) {
            return;
        }
        settingsNotificationUI.f160592i = true;
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.setting.ui.setting.qj qjVar = new com.tencent.mm.plugin.setting.ui.setting.qj(this, view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(qjVar, 300L, false);
    }
}
