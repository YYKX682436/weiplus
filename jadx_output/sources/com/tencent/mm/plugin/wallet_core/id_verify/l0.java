package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f179407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179408e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179409f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.m74 f179410g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ot0.q qVar, java.lang.String str, com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.m74 m74Var) {
        super(1);
        this.f179407d = qVar;
        this.f179408e = str;
        this.f179409f = realnameVerifySelectGuardianUI;
        this.f179410g = m74Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.util.Pair wi6 = ((ez.w0) ot0.j1.a()).wi(this.f179407d, "", "", this.f179408e, "", (byte[]) obj, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "sent liteapp appmsg, result: " + wi6.first);
        com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI = this.f179409f;
        realnameVerifySelectGuardianUI.setResult(-1);
        realnameVerifySelectGuardianUI.finish();
        java.lang.Integer num = (java.lang.Integer) wi6.first;
        if (num == null || num.intValue() != 0) {
            com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
            androidx.appcompat.app.AppCompatActivity context = realnameVerifySelectGuardianUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.wallet_core.id_verify.x.a(xVar, context);
        }
        com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent realnameVerifyGuardianResultEvent = new com.tencent.mm.autogen.events.RealnameVerifyGuardianResultEvent();
        java.lang.Integer num2 = (java.lang.Integer) wi6.first;
        am.pp ppVar = realnameVerifyGuardianResultEvent.f54648g;
        if (num2 != null && num2.intValue() == 0) {
            ppVar.f7644a = 1;
            r45.m74 m74Var = this.f179410g;
            ppVar.f7645b = m74Var.f380186i;
            ppVar.f7646c = m74Var.f380187m;
            ppVar.f7647d = m74Var.f380188n;
        } else {
            ppVar.f7644a = 0;
        }
        return java.lang.Boolean.valueOf(realnameVerifyGuardianResultEvent.e());
    }
}
