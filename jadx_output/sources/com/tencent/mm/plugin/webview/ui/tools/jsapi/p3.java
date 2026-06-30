package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class p3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.q3 f185333d;

    public p3(com.tencent.mm.plugin.webview.ui.tools.jsapi.q3 q3Var) {
        this.f185333d = q3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.q3 q3Var = this.f185333d;
        java.lang.String a17 = com.tencent.mm.plugin.webview.model.o5.a(q3Var.f185356f);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "after parse to json data : %s", a17);
        android.app.ProgressDialog progressDialog = q3Var.f185358h.f184979h;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "after parse to json data : %s", a17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", 1);
        hashMap.put("localIds", a17);
        hashMap.put("appId", q3Var.f185357g.getStringExtra("key_game_video_appid"));
        hashMap.put("appName", q3Var.f185357g.getStringExtra("key_game_video_appname"));
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = q3Var.f185358h;
        c1Var.i5(c1Var.f184976e, "chooseHaowanMedia:ok", hashMap);
    }
}
