package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class e3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f172978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro f172979b;

    public e3(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro) {
        this.f172978a = u3Var;
        this.f172979b = settingsSysTeenModeIntro;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        this.f172978a.dismiss();
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            return null;
        }
        r45.m20 m20Var = (r45.m20) fVar.f70618d;
        boolean z17 = m20Var.f380087d;
        com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro settingsSysTeenModeIntro = this.f172979b;
        if (z17) {
            android.content.Intent intent = new android.content.Intent(settingsSysTeenModeIntro.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
            intent.putExtra("intent_process", 1);
            settingsSysTeenModeIntro.startActivityForResult(intent, 100);
            return null;
        }
        if (m20Var.f380088e) {
            settingsSysTeenModeIntro.startActivityForResult(new android.content.Intent(settingsSysTeenModeIntro.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.class), 101);
            return null;
        }
        settingsSysTeenModeIntro.startActivityForResult(new android.content.Intent(settingsSysTeenModeIntro.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModeVerifyPwdUI.class), 101);
        return null;
    }
}
