package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class oo implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161403e;

    public oo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI, de0.i iVar) {
        this.f161403e = settingsUI;
        this.f161402d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161402d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161403e;
        d17.q(281, settingsUI.f160744m);
        gm0.j1.d().q(282, settingsUI.f160745n);
        settingsUI.f160744m = null;
        settingsUI.f160745n = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.f160746o;
        if (b4Var != null) {
            b4Var.d();
            settingsUI.f160746o = null;
        }
        android.app.ProgressDialog progressDialog = settingsUI.f160742h;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        settingsUI.l7();
        return false;
    }
}
