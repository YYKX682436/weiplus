package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class a6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f160804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f160805e;

    public a6(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, com.tencent.mm.modelsimple.w0 w0Var) {
        this.f160805e = settingsAboutMicroMsgUI;
        this.f160804d = w0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f160804d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f160805e;
        d17.q(255, settingsAboutMicroMsgUI.f160270r);
        settingsAboutMicroMsgUI.f160270r = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsAboutMicroMsgUI.f160269q;
        if (b4Var != null) {
            b4Var.d();
            settingsAboutMicroMsgUI.f160269q = null;
        }
        android.app.ProgressDialog progressDialog = settingsAboutMicroMsgUI.f160268p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
