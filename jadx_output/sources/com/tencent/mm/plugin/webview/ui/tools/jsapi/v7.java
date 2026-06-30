package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class v7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185477f;

    public v7(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, nw4.y2 y2Var, com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var2) {
        this.f185477f = c1Var;
        this.f185475d = y2Var;
        this.f185476e = c1Var2;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ib3 ib3Var;
        r45.gi5 gi5Var;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185477f;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f184979h.dismiss();
            c1Var.f184979h = null;
        }
        gm0.j1.d().q(1393, this);
        int i19 = -1;
        java.lang.String str2 = "openEnterpriseContact:fail";
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.webview.model.d1) m1Var).f182833e;
            ib3Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.ib3) fVar;
            if (ib3Var != null && (gi5Var = ib3Var.f376899d) != null) {
                i19 = gi5Var.f375288d;
                java.lang.String str3 = gi5Var.f375289e;
                if (str3 != null && str3.length() > 0) {
                    str2 = ib3Var.f376899d.f375289e;
                }
            }
        } else {
            ib3Var = null;
        }
        if (i19 != 0) {
            c1Var.i5(this.f185475d, str2, null);
            return;
        }
        java.lang.String str4 = ib3Var.f376900e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str4);
        intent.putExtra("useJs", true);
        ((com.tencent.mm.ui.MMActivity) c1Var.f184975d).mmSetOnActivityResultCallback(this.f185476e);
        j45.l.n(c1Var.f184975d, "webview", ".ui.tools.WebViewUI", intent, 31);
    }
}
