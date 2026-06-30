package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class lb extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.lb f186345d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.lb();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186346e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186347f;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestVertifyPwd", "JsApiRequestVerifyPwd");
        f186346e = env;
        f186347f = msg;
        android.content.Context context = env.f340860a;
        if (context instanceof com.tencent.mm.ui.MMActivity) {
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(this);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(env.f340860a, "com.tencent.mm.plugin.account.ui.VerifyPwdUI");
        intent.putExtra("key_scenen", 0);
        android.content.Context context2 = env.f340860a;
        if (!(context2 instanceof com.tencent.mm.ui.MMActivity)) {
            return true;
        }
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context2).startActivityForResult(intent, 208);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 398;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "verifiyWXPassword";
    }

    public final void e(nw4.k kVar, nw4.y2 y2Var, int i17, java.util.Map map) {
        if (kVar == null || y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        java.lang.String str = i17 == 0 ? "ok" : "unknown error";
        kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ':' + str, linkedHashMap);
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1 || intent == null || i17 != 208) {
            e(f186346e, f186347f, -1, null);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("key_ticket");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (stringExtra == null) {
            stringExtra = "";
        }
        hashMap.put("ticket", stringExtra);
        hashMap.put("sucessful", "true");
        e(f186346e, f186347f, 0, hashMap);
    }
}
