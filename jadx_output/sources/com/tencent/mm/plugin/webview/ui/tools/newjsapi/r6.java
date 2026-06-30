package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class r6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.r6 f186483d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.r6();

    /* renamed from: e, reason: collision with root package name */
    public static nw4.k f186484e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186485f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f186486g;

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        f186484e = env;
        f186485f = msg;
        java.lang.String str = (java.lang.String) msg.f340790a.get("extInfo");
        if (str == null || str.length() == 0) {
            e(1, "extInfo empty");
            return true;
        }
        java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.Integer valueOf = obj instanceof java.lang.String ? java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) obj)) : obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        int intValue = valueOf != null ? valueOf.intValue() : 3;
        zg0.q2 a17 = env.a();
        com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
        byte[] a07 = r0Var != null ? r0Var.a0() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("url");
        java.lang.String optString2 = jSONObject.optString("finder_context", "");
        boolean b17 = kotlin.jvm.internal.o.b(msg.f340790a.get("dismissSelf"), "true");
        f186486g = b17;
        boolean z17 = (intValue == 3 && b17) || intValue == 4;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat scene: %s, extInfo: %s, dismissWebView: %s, needShowErrToast: %s", java.lang.Integer.valueOf(intValue), str, java.lang.Boolean.valueOf(f186486g), java.lang.Boolean.valueOf(z17));
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat url invalid");
            e(1, "url empty");
        } else {
            boolean b18 = kotlin.jvm.internal.o.b(msg.f340790a.get("halfScreen"), "true");
            com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest openIMKefuStartConversationRequest = new com.tencent.mm.openim.api.OpenIMKefuStartConversationRequest();
            openIMKefuStartConversationRequest.f72272d = env.f340860a;
            openIMKefuStartConversationRequest.f72274f = intValue;
            r45.s4 s4Var = new r45.s4();
            s4Var.f385486d = optString;
            s4Var.f385487e = optString;
            openIMKefuStartConversationRequest.f72277i = s4Var;
            openIMKefuStartConversationRequest.f72276h = b18 ? 1 : j41.f0.a(openIMKefuStartConversationRequest.f72274f);
            openIMKefuStartConversationRequest.f72281p = z17;
            openIMKefuStartConversationRequest.f72282q = openIMKefuStartConversationRequest.f72272d.getResources().getString(com.tencent.mm.R.string.hez);
            openIMKefuStartConversationRequest.f72290y = optString2;
            android.content.Intent intent = new android.content.Intent();
            openIMKefuStartConversationRequest.f72288w = intent;
            android.os.Handler createFreeHandler = com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper());
            kotlin.jvm.internal.o.f(createFreeHandler, "createFreeHandler(...)");
            intent.putExtra("key_result_receiver", new com.tencent.mm.openim.model.OpenImKefuStartChattingResultReceiver(createFreeHandler, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.q6()));
            openIMKefuStartConversationRequest.f72288w.putExtra("key_spam_context", a07);
            j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
            if (zVar != null) {
                ((l41.g2) zVar).Bi(openIMKefuStartConversationRequest);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 412;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openCustomerServiceChat";
    }

    public final void e(int i17, java.lang.String str) {
        nw4.g gVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_code", java.lang.Integer.valueOf(i17));
        nw4.k kVar = f186484e;
        if (kVar != null && (gVar = kVar.f340863d) != null) {
            nw4.y2 y2Var = f186485f;
            java.lang.String str2 = y2Var != null ? y2Var.f341013c : null;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            nw4.y2 y2Var2 = f186485f;
            sb6.append(y2Var2 != null ? y2Var2.f341019i : null);
            sb6.append(':');
            sb6.append(str);
            gVar.e(str2, sb6.toString(), hashMap);
        }
        nw4.k kVar2 = f186484e;
        android.content.Context context = kVar2 != null ? kVar2.f340860a : null;
        if (f186486g && (context instanceof android.app.Activity)) {
            android.app.Activity activity = (android.app.Activity) context;
            activity.finish();
            activity.overridePendingTransition(0, 0);
        }
        f186484e = null;
    }
}
