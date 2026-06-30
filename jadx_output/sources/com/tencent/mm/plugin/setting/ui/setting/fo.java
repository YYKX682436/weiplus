package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class fo implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161044e;

    public fo(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI, de0.i iVar) {
        this.f161044e = settingsUI;
        this.f161043d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161043d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161044e;
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
    }
}
