package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class t5 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.w5 f161563d;

    public t5(com.tencent.mm.plugin.setting.ui.setting.w5 w5Var) {
        this.f161563d = w5Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.w5 w5Var = this.f161563d;
        d17.q(281, w5Var.f161686d);
        w5Var.f161686d = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = w5Var.f161687e;
        if (b4Var != null) {
            b4Var.d();
            w5Var.f161687e = null;
        }
        android.app.ProgressDialog progressDialog = w5Var.f161688f.f160268p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMicroMsgUI.V6(w5Var.f161688f);
    }
}
