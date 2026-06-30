package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class im implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f161167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161168e;

    public im(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI, android.content.Intent intent) {
        this.f161168e = settingsSwitchAccountUI;
        this.f161167d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI = this.f161168e;
        ((com.tencent.mm.plugin.setting.ui.setting.rm) settingsSwitchAccountUI.f160701x).a(this.f161167d.getStringExtra("SWITCH_TO_USERNAME"));
        db5.t7.makeText(settingsSwitchAccountUI.getContext(), settingsSwitchAccountUI.getString(com.tencent.mm.R.string.ixe), 1).show();
    }
}
