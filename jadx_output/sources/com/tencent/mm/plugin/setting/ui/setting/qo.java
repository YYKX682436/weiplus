package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class qo implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161486d;

    public qo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161486d = settingsUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161486d;
        d17.q(281, settingsUI.f160744m);
        gm0.j1.d().q(282, settingsUI.f160745n);
        settingsUI.f160744m = null;
        settingsUI.f160745n = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.f160747p;
        if (b4Var != null) {
            b4Var.d();
        }
        android.app.ProgressDialog progressDialog = settingsUI.f160742h;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        settingsUI.l7();
        return false;
    }
}
