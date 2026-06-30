package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class oj implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI f161396a;

    public oj(com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI) {
        this.f161396a = settingsNotificationUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI settingsNotificationUI = this.f161396a;
        if (!z17) {
            settingsNotificationUI.initView();
            return;
        }
        com.tencent.mm.plugin.setting.ui.setting.nj njVar = new com.tencent.mm.plugin.setting.ui.setting.nj(this);
        java.lang.String a17 = n25.a.a();
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.f160589o;
        settingsNotificationUI.X6(njVar, a17);
    }
}
