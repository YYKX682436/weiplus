package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f157668a;

    public d0(android.content.Context context) {
        this.f157668a = context;
    }

    public void a(com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo resendMsgInfo, com.tencent.mm.ui.widget.dialog.w1 w1Var) {
        if (resendMsgInfo == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemindCollectionDialog", "init() resendMsgInfo == null");
            return;
        }
        android.content.Context context = this.f157668a;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.cdv, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.lu6);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.cgi);
        n11.a b17 = n11.a.b();
        java.lang.String str = resendMsgInfo.f188591e;
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.drawable.f482069ce0;
        b17.h(str, imageView, fVar.a());
        mMNeat7extView.b(resendMsgInfo.f188592f);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.u(resendMsgInfo.f188590d);
        u1Var.d(inflate);
        u1Var.j(resendMsgInfo.f188593g);
        u1Var.n(resendMsgInfo.f188594h);
        u1Var.b(new com.tencent.mm.plugin.remittance.ui.c0(this, w1Var));
        u1Var.q(false);
    }
}
