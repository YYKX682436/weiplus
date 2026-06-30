package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class z5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.w0 f161813d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI f161814e;

    public z5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, com.tencent.mm.modelsimple.w0 w0Var) {
        this.f161814e = settingsAboutMicroMsgUI;
        this.f161813d = w0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d(this.f161813d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f161814e;
        d17.q(255, settingsAboutMicroMsgUI.f160270r);
        settingsAboutMicroMsgUI.f160270r = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsAboutMicroMsgUI.f160269q;
        if (b4Var != null) {
            b4Var.d();
            settingsAboutMicroMsgUI.f160269q = null;
        }
        android.app.ProgressDialog progressDialog = settingsAboutMicroMsgUI.f160268p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.W6(settingsAboutMicroMsgUI);
        return false;
    }
}
