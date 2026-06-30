package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f179394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f179395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI f179396f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.fo f179397g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ot0.q qVar, java.lang.String str, com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI realnameVerifySelectGuardianUI, r45.fo foVar) {
        super(1);
        this.f179394d = qVar;
        this.f179395e = str;
        this.f179396f = realnameVerifySelectGuardianUI;
        this.f179397g = foVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.util.Pair wi6 = ((ez.w0) ot0.j1.a()).wi(this.f179394d, "", "", this.f179395e, "", (byte[]) obj, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.RealnameVerifySelectGuardianUI", "sent appmsg, result: " + wi6.first);
        this.f179396f.setResult(-1);
        this.f179396f.finish();
        java.lang.Integer num = (java.lang.Integer) wi6.first;
        if (num != null && num.intValue() == 0) {
            return ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.wallet_core.id_verify.i0(this.f179397g));
        }
        com.tencent.mm.plugin.wallet_core.id_verify.x xVar = com.tencent.mm.plugin.wallet_core.id_verify.RealnameVerifySelectGuardianUI.E;
        androidx.appcompat.app.AppCompatActivity context = this.f179396f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.wallet_core.id_verify.x.a(xVar, context);
        return jz5.f0.f302826a;
    }
}
