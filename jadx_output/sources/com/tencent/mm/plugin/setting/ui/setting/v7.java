package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class v7 implements com.tencent.mm.plugin.setting.ui.setting.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI f161635a;

    public v7(com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI) {
        this.f161635a = settingsAuthUI;
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.c7
    public void a(int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161635a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsAuthUI.f160341t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.t7.g(settingsAuthUI.getContext(), settingsAuthUI.getResources().getString(com.tencent.mm.R.string.ipf));
    }

    @Override // com.tencent.mm.plugin.setting.ui.setting.c7
    public void onSuccess() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsAuthUI settingsAuthUI = this.f161635a;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = settingsAuthUI.f160341t;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        db5.t7.h(settingsAuthUI.getContext(), settingsAuthUI.getResources().getString(com.tencent.mm.R.string.iph));
        com.tencent.mm.plugin.setting.ui.setting.l7 l7Var = settingsAuthUI.f160335n;
        boolean z17 = false;
        if (l7Var != null && l7Var.y(settingsAuthUI.f160340s)) {
            z17 = true;
        }
        if (z17) {
            settingsAuthUI.W6();
        }
    }
}
