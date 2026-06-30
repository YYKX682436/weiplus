package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class ro implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161521d;

    public ro(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f161521d = settingsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161521d;
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
            progressDialog.dismiss();
        }
    }
}
