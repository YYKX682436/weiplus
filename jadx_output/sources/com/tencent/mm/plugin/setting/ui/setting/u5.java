package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class u5 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.w5 f161598e;

    public u5(com.tencent.mm.plugin.setting.ui.setting.w5 w5Var, de0.i iVar) {
        this.f161598e = w5Var;
        this.f161597d = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161597d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.w5 w5Var = this.f161598e;
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
        return false;
    }
}
