package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class yf implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f161786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f161787b;

    public yf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f161787b = settingsManageFindMoreUI;
        this.f161786a = checkBoxPreference;
    }

    @Override // wd0.p1
    public void a() {
        this.f161786a.S(!r0.N());
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f161786a;
        checkBoxPreference.N();
        c01.z1.j();
        boolean N = checkBoxPreference.N();
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI = this.f161787b;
        settingsManageFindMoreUI.f7(N);
        settingsManageFindMoreUI.f160495g.put(10, java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0));
    }
}
