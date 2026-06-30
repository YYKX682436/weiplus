package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class t2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185412d;

    public t2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185412d = c1Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185412d;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f184979h.dismiss();
            c1Var.f184979h = null;
        }
        gm0.j1.d().q(1177, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
            c1Var.i5(c1Var.f184976e, "selectSingleContact:fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
        com.tencent.mm.plugin.webview.model.m1 m1Var2 = (com.tencent.mm.plugin.webview.model.m1) m1Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("package", m1Var2.f183008f);
        hashMap.put("sign", m1Var2.f183009g);
        hashMap.put("headImgUrl", m1Var2.f183010h);
        hashMap.put("nickName", m1Var2.f183011i);
        hashMap.put("friendRelation", java.lang.Integer.valueOf(m1Var2.f183012m));
        c1Var.i5(c1Var.f184976e, "selectSingleContact:ok", hashMap);
    }
}
