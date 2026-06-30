package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class r2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185378d;

    public r2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185378d = c1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185378d;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f184979h.dismiss();
            c1Var.f184979h = null;
        }
        gm0.j1.d().q(1566, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId fail");
            c1Var.i5(c1Var.f184976e, "selectSingleContact:fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId success");
        com.tencent.mm.modelbase.o oVar = ((com.tencent.mm.plugin.webview.model.g1) m1Var).f182887e;
        r45.t14 t14Var = oVar == null ? null : (r45.t14) oVar.f70711b.f70700a;
        if (t14Var == null) {
            c1Var.i5(c1Var.f184976e, "selectSingleContact:fail", null);
            return;
        }
        java.lang.Object obj = c1Var.f184976e.f340790a.get("result_sign_type");
        int P = obj != null ? com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) obj, 0) : 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("package", t14Var.f386061g);
        hashMap.put("sign", t14Var.f386062h);
        if (P == 1) {
            hashMap.put("signType", t14Var.f386063i);
        }
        hashMap.put(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, t14Var.f386060f);
        hashMap.put("noncestr", t14Var.f386059e);
        c1Var.i5(c1Var.f184976e, "selectSingleContact:ok", hashMap);
    }
}
