package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class po implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f161454e;

    public po(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI, de0.i iVar) {
        this.f161454e = settingsUI;
        this.f161453d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161453d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f161454e;
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
