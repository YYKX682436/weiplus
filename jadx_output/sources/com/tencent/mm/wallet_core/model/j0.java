package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class j0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f213921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f213922e;

    public j0(com.tencent.mm.wallet_core.model.p0 p0Var, android.app.Activity activity) {
        this.f213922e = p0Var;
        this.f213921d = activity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpRemind", "onClick2");
        com.tencent.mm.wallet_core.model.p0 p0Var = this.f213922e;
        com.tencent.mm.wallet_core.model.o0 o0Var = p0Var.f213967f;
        if (o0Var == null || !o0Var.f213957c.equals("left_button_wording")) {
            p0Var.f213969h.onCancel();
        } else {
            p0Var.e(this.f213921d);
        }
    }
}
