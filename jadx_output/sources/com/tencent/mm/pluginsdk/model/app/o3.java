package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class o3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.p3 f189010d;

    public o3(com.tencent.mm.pluginsdk.model.app.p3 p3Var) {
        this.f189010d = p3Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.w("MicroMsg.LoadAppInfoAfterLogin", "do init canceled");
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.pluginsdk.model.app.p3 p3Var = this.f189010d;
        p3Var.getClass();
        d17.getClass();
        zo3.p.Bi().a(7, p3Var);
        lt.o0 o0Var = p3Var.f189032d;
        if (o0Var != null) {
            com.tencent.mm.plugin.account.ui.SimpleLoginUI simpleLoginUI = ((com.tencent.mm.plugin.account.ui.li) o0Var).f74021a.f74048a;
            int i17 = com.tencent.mm.plugin.account.ui.SimpleLoginUI.f73660v;
            simpleLoginUI.W6(-1);
        }
    }
}
