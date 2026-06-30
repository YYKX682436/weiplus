package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public class ag implements wd0.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.CheckBoxPreference f160832a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f160833b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wd0.o1 f160834c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI f160835d;

    public ag(com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, int i17, wd0.o1 o1Var) {
        this.f160835d = settingsManageFindMoreUI;
        this.f160832a = checkBoxPreference;
        this.f160833b = i17;
        this.f160834c = o1Var;
    }

    @Override // wd0.o1
    public void a() {
        this.f160832a.S(!r0.N());
        wd0.o1 o1Var = this.f160834c;
        if (o1Var != null) {
            o1Var.a();
        }
    }

    @Override // wd0.o1
    public void onSuccess() {
        com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = this.f160832a;
        checkBoxPreference.N();
        com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI settingsManageFindMoreUI = this.f160835d;
        int i17 = this.f160833b;
        if (i17 == 3) {
            settingsManageFindMoreUI.i7(checkBoxPreference, checkBoxPreference.N(), false);
        } else if (i17 == 10) {
            settingsManageFindMoreUI.f7(checkBoxPreference.N());
        } else if (i17 == 11) {
            settingsManageFindMoreUI.g7(checkBoxPreference.N(), 34359738368L, 57);
        } else if (i17 == 8) {
            boolean N = checkBoxPreference.N();
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI.f160491q;
            settingsManageFindMoreUI.g7(N, 16777216L, 53);
        }
        int i19 = com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreUI.f160491q;
        settingsManageFindMoreUI.getClass();
        boolean N2 = checkBoxPreference.N();
        if (i17 >= 0) {
            settingsManageFindMoreUI.f160495g.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(N2 ? 1 : 0));
        }
        wd0.o1 o1Var = this.f160834c;
        if (o1Var != null) {
            o1Var.onSuccess();
        }
    }
}
