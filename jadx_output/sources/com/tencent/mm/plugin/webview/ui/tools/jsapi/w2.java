package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class w2 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f185490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185492f;

    public w2(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, android.content.Intent intent, java.lang.String str) {
        this.f185492f = c1Var;
        this.f185490d = intent;
        this.f185491e = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185492f;
        android.app.ProgressDialog progressDialog = c1Var.f184979h;
        if (progressDialog != null && progressDialog.isShowing()) {
            c1Var.f184979h.dismiss();
            c1Var.f184979h = null;
        }
        gm0.j1.d().q(1177, this);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
            c1Var.i5(c1Var.f184976e, "sendSingleAppMessage:fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
        com.tencent.mm.plugin.webview.model.m1 m1Var2 = (com.tencent.mm.plugin.webview.model.m1) m1Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.android.gms.common.Scopes.OPEN_ID, m1Var2.f183008f);
        hashMap.put("headImgUrl", m1Var2.f183010h);
        hashMap.put("nickName", m1Var2.f183011i);
        java.lang.String str2 = (java.lang.String) c1Var.f184976e.f340790a.get("img_url");
        java.lang.String str3 = (java.lang.String) c1Var.f184976e.f340790a.get("src_username");
        java.lang.String str4 = (java.lang.String) c1Var.f184976e.f340790a.get("src_displayname");
        android.content.Intent intent = this.f185490d;
        this.f185492f.Q5(null, "", this.f185491e, str2, str3, str4, intent != null ? intent.getStringExtra("custom_send_text") : null, null);
        android.content.Context context = c1Var.f184975d;
        if (context != null) {
            db5.e1.T(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490560yi));
        }
        c1Var.i5(c1Var.f184976e, "sendSingleAppMessage:ok", hashMap);
    }
}
