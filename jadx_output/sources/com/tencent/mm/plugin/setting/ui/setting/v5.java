package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes11.dex */
public class v5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ de0.i f161631d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.w5 f161632e;

    public v5(com.tencent.mm.plugin.setting.ui.setting.w5 w5Var, de0.i iVar) {
        this.f161632e = w5Var;
        this.f161631d = iVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d((com.tencent.mm.modelbase.m1) this.f161631d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.setting.ui.setting.w5 w5Var = this.f161632e;
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
    }
}
