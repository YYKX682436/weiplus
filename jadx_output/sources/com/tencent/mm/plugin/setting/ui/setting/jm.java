package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class jm implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI f161204d;

    public jm(com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI settingsSwitchAccountUI) {
        this.f161204d = settingsSwitchAccountUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.f160683y;
        this.f161204d.X6();
        return false;
    }
}
