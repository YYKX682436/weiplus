package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class io implements d70.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161170a;

    public io(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161170a = settingsUI;
    }

    @Override // d70.j
    public void a(com.tencent.mm.storage.u3 u3Var, int i17, java.lang.String str) {
        if (u3Var == null || u3Var != com.tencent.mm.storage.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC) {
            return;
        }
        int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
        this.f161170a.p7();
    }

    @Override // d70.j
    public void b(int i17, int i18, java.lang.String str) {
        if (i17 == 262145 || i17 == 262157 || i17 == 262158 || i17 == 262164) {
            int i19 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
            this.f161170a.s7();
        }
    }
}
