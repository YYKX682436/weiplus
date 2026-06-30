package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class vf implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f161644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f161645b;

    public vf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f161645b = settingsManageFindMoreUI;
        this.f161644a = checkBoxPreference;
    }

    @Override // wd0.p1
    public void a() {
        this.f161644a.S(!r0.N());
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f161644a;
        checkBoxPreference.N();
        c01.z1.j();
        boolean N = checkBoxPreference.N();
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI = this.f161645b;
        settingsManageFindMoreUI.g7(N, 2097152L, 50);
        settingsManageFindMoreUI.f160495g.put(3, java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0));
    }
}
