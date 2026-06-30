package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class ia implements com.tencent.mm.plugin.setting.ui.setting.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI f161151a;

    public ia(com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI) {
        this.f161151a = settingsDelAuthUI;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.c7
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsDelAuthUI settingsDelAuthUI = this.f161151a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsDelAuthUI.f160383f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.t7.g(settingsDelAuthUI.getContext(), settingsDelAuthUI.getResources().getString(com.tencent.mm.R.string.ipf));
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.c7
    public void onSuccess() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f161151a.f160383f;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.t7.h(this.f161151a.getContext(), this.f161151a.getResources().getString(com.tencent.mm.R.string.iph));
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.setting.ui.setting.ha haVar = new com.tencent.mm.plugin.setting.ui.setting.ha(this.f161151a);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(haVar, 300L, false);
    }
}
