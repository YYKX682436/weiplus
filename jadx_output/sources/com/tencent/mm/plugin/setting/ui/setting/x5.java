package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f161725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161727f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.y5 f161728g;

    public x5(com.tencent.mm.plugin.setting.ui.setting.y5 y5Var, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f161728g = y5Var;
        this.f161725d = m1Var;
        this.f161726e = i17;
        this.f161727f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.y5 y5Var = this.f161728g;
        d17.q(255, y5Var.f161776d.f160270r);
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = y5Var.f161776d;
        settingsAboutMicroMsgUI.f160270r = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsAboutMicroMsgUI.f160269q;
        if (b4Var != null) {
            b4Var.d();
            y5Var.f161776d.f160269q = null;
        }
        android.app.ProgressDialog progressDialog = y5Var.f161776d.f160268p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f161725d;
        if (m1Var.getType() == 255 && ((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 1) {
            if (this.f161726e != -3 || this.f161727f != 4) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.W6(y5Var.f161776d);
                return;
            }
            android.content.Intent intent = new android.content.Intent(y5Var.f161776d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
            intent.putExtra("kintent_hint", y5Var.f161776d.getString(com.tencent.mm.R.string.hx9));
            y5Var.f161776d.startActivityForResult(intent, 0);
        }
    }
}
