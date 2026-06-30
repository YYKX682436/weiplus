package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class zf implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f161826a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f161827b;

    public zf(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference) {
        this.f161827b = settingsManageFindMoreUI;
        this.f161826a = checkBoxPreference;
    }

    @Override // wd0.p1
    public void a() {
        this.f161826a.S(!r0.N());
    }

    @Override // wd0.p1
    public void onSuccess() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f161826a;
        checkBoxPreference.N();
        c01.z1.j();
        boolean N = checkBoxPreference.N();
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI = this.f161827b;
        settingsManageFindMoreUI.g7(N, 34359738368L, 57);
        settingsManageFindMoreUI.f160495g.put(11, java.lang.Integer.valueOf(checkBoxPreference.N() ? 1 : 0));
    }
}
