package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class go implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f161083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.ho f161086g;

    public go(com.tencent.mm.plugin.setting.ui.setting.ho hoVar, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f161086g = hoVar;
        this.f161083d = m1Var;
        this.f161084e = i17;
        this.f161085f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.ho hoVar = this.f161086g;
        d17.q(255, hoVar.f161121d.f160748q);
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = hoVar.f161121d;
        settingsUI.f160748q = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.f160746o;
        if (b4Var != null) {
            b4Var.d();
            hoVar.f161121d.f160746o = null;
        }
        android.app.ProgressDialog progressDialog = hoVar.f161121d.f160742h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f161083d;
        if (m1Var.getType() == 255 && ((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 2) {
            if (this.f161084e != -3 || this.f161085f != 4) {
                hoVar.f161121d.Y6();
                return;
            }
            android.content.Intent intent = new android.content.Intent(hoVar.f161121d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
            intent.putExtra("kintent_hint", hoVar.f161121d.getString(com.tencent.mm.R.string.hx9));
            hoVar.f161121d.startActivityForResult(intent, 5);
        }
    }
}
