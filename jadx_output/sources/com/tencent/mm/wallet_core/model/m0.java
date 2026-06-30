package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class m0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.q f213937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.model.p0 f213938e;

    public m0(com.tencent.mm.wallet_core.model.p0 p0Var, com.tencent.mm.wallet_core.model.q qVar) {
        this.f213938e = p0Var;
        this.f213937d = qVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JumpRemind", "onClick2");
        com.tencent.mm.wallet_core.model.p0 p0Var = this.f213938e;
        com.tencent.mm.wallet_core.model.o0 o0Var = p0Var.f213967f;
        com.tencent.mm.wallet_core.model.q qVar = this.f213937d;
        if (o0Var == null || !o0Var.f213957c.equals("left_button_wording")) {
            qVar.onCancel();
        } else {
            com.tencent.mm.wallet_core.model.o0 o0Var2 = p0Var.f213967f;
            qVar.a(o0Var2.f213955a, o0Var2.f213956b);
        }
    }
}
