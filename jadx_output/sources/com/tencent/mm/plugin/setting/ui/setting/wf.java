package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class wf implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f161704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f161705b;

    public wf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f161705b = settingsManageFindMoreUI;
        this.f161704a = checkBoxPreference;
    }

    @Override // wd0.p1
    public void a() {
        this.f161704a.S(!r0.N());
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f161704a;
        checkBoxPreference.N();
        c01.z1.j();
        boolean N = checkBoxPreference.N();
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI.f160491q;
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI = this.f161705b;
        settingsManageFindMoreUI.g7(N, 16777216L, 53);
        settingsManageFindMoreUI.f160495g.put(8, java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0));
    }
}
