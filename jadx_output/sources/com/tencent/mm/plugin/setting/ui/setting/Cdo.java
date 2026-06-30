package com.tencent.mm.plugin.setting.ui.setting;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.do, reason: invalid class name */
/* loaded from: classes11.dex */
public class Cdo implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f160956d;

    public Cdo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f160956d = settingsUI;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f160956d;
        d17.q(281, settingsUI.H);
        settingsUI.H = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.G;
        if (b4Var != null) {
            b4Var.d();
            settingsUI.G = null;
        }
        android.app.ProgressDialog progressDialog = settingsUI.f160742h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        settingsUI.o7();
    }
}
