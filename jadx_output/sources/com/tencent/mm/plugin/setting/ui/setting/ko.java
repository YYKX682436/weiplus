package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class ko implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f161246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161247e;

    public ko(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI, com.tencent.mm.modelsimple.w0 w0Var) {
        this.f161247e = settingsUI;
        this.f161246d = w0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f161246d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161247e;
        d17.q(255, settingsUI.f160748q);
        settingsUI.f160748q = null;
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
