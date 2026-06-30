package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class yk implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.preference.SummaryTextPreference f161791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161792b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI f161793c;

    public yk(com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI, com.tencent.mm.ui.base.preference.SummaryTextPreference summaryTextPreference, java.lang.String str) {
        this.f161793c = settingsPersonalInfoUI;
        this.f161791a = summaryTextPreference;
        this.f161792b = str;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    public void onSuccess(java.lang.Object obj) {
        java.lang.String str;
        r45.fs3 fs3Var = (r45.fs3) obj;
        boolean z17 = fs3Var.f374586e;
        com.tencent.mm.plugin.setting.ui.setting.SettingsPersonalInfoUI settingsPersonalInfoUI = this.f161793c;
        if (z17) {
            str = settingsPersonalInfoUI.getString(com.tencent.mm.R.string.isy);
        } else if (fs3Var.f374585d > 0) {
            str = fs3Var.f374585d + " " + settingsPersonalInfoUI.getString(com.tencent.mm.R.string.j1_);
        } else {
            str = "";
        }
        this.f161791a.H(str);
        if (str.equals(this.f161792b)) {
            return;
        }
        com.tencent.mm.ui.base.preference.r rVar = settingsPersonalInfoUI.f160602g;
        if (rVar instanceof com.tencent.mm.ui.base.preference.h0) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
        }
    }
}
