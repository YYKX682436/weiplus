package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ac extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.ac f185948d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ac();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        long j17;
        long j18;
        int intExtra;
        long j19;
        java.lang.String str;
        long j27;
        long parseLong;
        long parseLong2;
        android.content.Intent intent;
        android.content.Intent intent2;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSendMessageToLiteApp", "JsApiSendMessageToLiteApp");
        java.lang.Object obj = ((java.util.HashMap) msg.f340790a).get("target");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        org.json.JSONObject jSONObject = str2 != null ? new org.json.JSONObject(str2) : new org.json.JSONObject();
        java.lang.String optString = jSONObject.optString("type", "");
        if (kotlin.jvm.internal.o.b(optString, ya.b.SOURCE)) {
            android.content.Context context = env.f340860a;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            java.lang.Long valueOf = (activity == null || (intent2 = activity.getIntent()) == null) ? null : java.lang.Long.valueOf(intent2.getLongExtra("liteAppUuid", 0L));
            java.lang.Long valueOf2 = (activity == null || (intent = activity.getIntent()) == null) ? null : java.lang.Long.valueOf(intent.getLongExtra("liteAppPageId", 0L));
            if (valueOf != null && valueOf2 != null) {
                parseLong = valueOf.longValue();
                parseLong2 = valueOf2.longValue();
                j27 = parseLong;
                str = "app.postmessage";
                intExtra = 0;
                j19 = parseLong2;
            }
            j27 = 0;
            j19 = 0;
            str = "app.postmessage";
            intExtra = 0;
        } else {
            if (kotlin.jvm.internal.o.b(optString, "liteapp")) {
                java.lang.String optString2 = jSONObject.optString(dm.i4.COL_ID, "");
                kotlin.jvm.internal.o.d(optString2);
                java.util.List f07 = r26.n0.f0(optString2, new java.lang.String[]{"_"}, false, 0, 6, null);
                if (f07.size() == 2) {
                    parseLong = java.lang.Long.parseLong((java.lang.String) f07.get(0));
                    parseLong2 = java.lang.Long.parseLong((java.lang.String) f07.get(1));
                    j27 = parseLong;
                    str = "app.postmessage";
                    intExtra = 0;
                    j19 = parseLong2;
                }
            } else if (optString.equals("parent")) {
                zg0.q2 a17 = env.a();
                com.tencent.mm.plugin.webview.core.r0 r0Var = a17 instanceof com.tencent.mm.plugin.webview.core.r0 ? (com.tencent.mm.plugin.webview.core.r0) a17 : null;
                long intExtra2 = r0Var != null ? r0Var.d0().getIntExtra("liteAppAppUuid", 0) : 0L;
                if (r0Var != null) {
                    j17 = intExtra2;
                    j18 = r0Var.d0().getIntExtra("liteAppPageId", 0);
                } else {
                    j17 = intExtra2;
                    j18 = 0;
                }
                intExtra = r0Var != null ? r0Var.d0().getIntExtra("liteAppNodeId", 0) : 0;
                j19 = j18;
                str = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
                j27 = j17;
            }
            j27 = 0;
            j19 = 0;
            str = "app.postmessage";
            intExtra = 0;
        }
        nw4.g gVar = env.f340863d;
        if (j27 == 0 || j19 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "appUuid or pageId is 0");
            gVar.e(msg.f341013c, msg.f341019i + ":fail", null);
            return false;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put("type", "webview");
        jSONObject3.put(dm.i4.COL_ID, java.lang.String.valueOf(gVar.d()));
        jSONObject2.put(ya.b.SOURCE, jSONObject3);
        java.lang.Object obj2 = ((java.util.HashMap) msg.f340790a).get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String str3 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str3 != null ? new org.json.JSONObject(str3) : new org.json.JSONObject());
        if (str.equals("app.postmessage")) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(j27, j19, str, jSONObject2);
        } else if (str.equals(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.initLib();
            com.tencent.mm.plugin.lite.LiteAppCenter.publishEventToNode(j27, j19, intExtra, str, jSONObject2);
        }
        gVar.e(msg.f341013c, msg.f341019i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 525;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sendMessageToLiteApp";
    }
}
