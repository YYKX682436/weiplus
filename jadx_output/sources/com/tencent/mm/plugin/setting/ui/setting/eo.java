package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class eo implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161008e;

    public eo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI, de0.i iVar) {
        this.f161008e = settingsUI;
        this.f161007d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161007d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161008e;
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
        return false;
    }
}
