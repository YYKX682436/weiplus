package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class o6 extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.o6 f186407d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.o6();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186408e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186409f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186408e = env;
        f186409f = msg;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCTID", "jsapi call, params:%s", msg.f340790a);
        android.content.Intent intent = new android.content.Intent();
        intent.setComponent(new android.content.ComponentName("cn.cyberIdentity.certification", "cn.wh.project.view.v.authorization.WAuthActivity"));
        intent.setFlags(8388608);
        java.lang.Object obj = msg.f340790a.get("orgID");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("orgID", (java.lang.String) obj);
        java.lang.Object obj2 = msg.f340790a.get("appID");
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("appID", (java.lang.String) obj2);
        java.lang.Object obj3 = msg.f340790a.get("bizSeq");
        kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("bizSeq", (java.lang.String) obj3);
        java.lang.Object obj4 = msg.f340790a.get("type");
        kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.String");
        intent.putExtra("type", (java.lang.String) obj4);
        intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.PACKAGENAME, com.tencent.mm.sdk.platformtools.x2.f193072b);
        android.content.Context context = env.f340860a;
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            return true;
        }
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(this);
        android.content.Context context2 = env.f340860a;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context2).startActivityForResult(intent, 212);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.v.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openCTID";
    }

    public final void e(nw4.y2 y2Var, int i17, java.util.Map map) {
        nw4.g gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCTID", "callbackJsApi, msg:" + y2Var + ", errCode:" + i17 + "， retMap:" + map);
        if (f186408e == null || y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.put("result", map);
        }
        java.lang.String str = i17 == 0 ? "ok" : "unknown error";
        nw4.k kVar = f186408e;
        if (kVar != null && (gVar = kVar.f340863d) != null) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + str, linkedHashMap);
        }
        f186408e = null;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 212) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JsApiOpenCTID onActivityResult requestCode: ");
        sb6.append(i17);
        sb6.append(", resultCode: ");
        sb6.append(i18);
        sb6.append(", data: ");
        sb6.append(intent == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCTID", sb6.toString());
        if (i18 != -1 || intent == null) {
            e(f186409f, -1, null);
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String stringExtra = intent.getStringExtra("resultCode");
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("resultCode", stringExtra);
        java.lang.String stringExtra2 = intent.getStringExtra("resultDesc");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        hashMap.put("resultDesc", stringExtra2);
        java.lang.String stringExtra3 = intent.getStringExtra("idCardAuthData");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        hashMap.put("idCardAuthData", stringExtra3);
        java.lang.String stringExtra4 = intent.getStringExtra("certPwdData");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        hashMap.put("certPwdData", stringExtra4);
        java.lang.String stringExtra5 = intent.getStringExtra("resultData");
        hashMap.put("resultData", stringExtra5 != null ? stringExtra5 : "");
        e(f186409f, 0, hashMap);
    }
}
