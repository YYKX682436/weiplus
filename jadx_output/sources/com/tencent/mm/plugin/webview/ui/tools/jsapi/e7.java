package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class e7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 f185083b;

    public e7(com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var, java.lang.String str) {
        this.f185083b = h7Var;
        this.f185082a = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var = this.f185083b;
        android.app.ProgressDialog progressDialog = h7Var.f185174g.f184979h;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = h7Var.f185174g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            c1Var.f184980i = false;
        }
        android.content.Context context = c1Var.f184975d;
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "recent forward context is Finishing");
            return null;
        }
        ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).aj(h7Var.f185168a);
        java.lang.String str = (java.lang.String) h7Var.f185169b.f340790a.get("appid");
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2 = h7Var.f185174g;
        if (str == null) {
            str = "";
        }
        c1Var2.R5(null, str, h7Var.f185170c, h7Var.f185168a, h7Var.f185171d, h7Var.f185172e, this.f185082a, null, new com.tencent.mm.plugin.webview.ui.tools.jsapi.d7(this));
        return null;
    }
}
