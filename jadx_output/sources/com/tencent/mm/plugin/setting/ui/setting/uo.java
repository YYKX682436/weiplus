package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class uo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f161619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161620e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f161621f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.vo f161622g;

    public uo(com.tencent.mm.plugin.setting.ui.setting.vo voVar, com.tencent.mm.modelbase.m1 m1Var, int i17, int i18) {
        this.f161622g = voVar;
        this.f161619d = m1Var;
        this.f161620e = i17;
        this.f161621f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.vo voVar = this.f161622g;
        d17.q(255, voVar.f161676d.f160748q);
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = voVar.f161676d;
        settingsUI.f160748q = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = settingsUI.f160746o;
        if (b4Var != null) {
            b4Var.d();
            voVar.f161676d.f160746o = null;
        }
        android.app.ProgressDialog progressDialog = voVar.f161676d.f160742h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.modelbase.m1 m1Var = this.f161619d;
        if (m1Var.getType() == 255 && ((com.tencent.mm.modelsimple.w0) m1Var).f71444f == 1) {
            if (this.f161620e != -3 || this.f161621f != 4) {
                voVar.f161676d.a7(true);
                return;
            }
            android.content.Intent intent = new android.content.Intent(voVar.f161676d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
            intent.putExtra("kintent_hint", voVar.f161676d.getString(com.tencent.mm.R.string.hx9));
            voVar.f161676d.startActivityForResult(intent, 0);
        }
    }
}
