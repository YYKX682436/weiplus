package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class y9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.y9 f186682d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.y9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        nw4.k kVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        int intValue;
        java.lang.Object obj;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.String str3;
        java.lang.String str4 = "";
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Object obj2 = msg.f340790a.get("businessType");
            try {
                kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
                str = null;
            }
            str2 = str == null ? "" : str;
            java.lang.Object obj3 = msg.f340790a.get("finderJumpId");
            try {
                kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                num = java.lang.Integer.valueOf(((java.lang.Integer) obj3).intValue());
            } catch (java.lang.Throwable th7) {
                oj.j.d("Matrix.Safe", th7, "", new java.lang.Object[0]);
                num = null;
            }
            intValue = num != null ? num.intValue() : 0;
            obj = msg.f340790a.get("commentScene");
        } catch (java.lang.Exception unused) {
            kVar = env;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPostFinderDanmuku", java.lang.String.valueOf(msg.f340790a));
            kVar.f340863d.e(msg.f341013c, msg.f341019i + ":fail", null);
            return false;
        }
        try {
            try {
                kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                num2 = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue());
            } catch (java.lang.Throwable th8) {
                oj.j.d("Matrix.Safe", th8, "", new java.lang.Object[0]);
                num2 = null;
            }
            int intValue2 = num2 != null ? num2.intValue() : 0;
            java.lang.Object obj4 = msg.f340790a.get("actionType");
            try {
                kotlin.jvm.internal.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
                num3 = java.lang.Integer.valueOf(((java.lang.Integer) obj4).intValue());
            } catch (java.lang.Throwable th9) {
                oj.j.d("Matrix.Safe", th9, "", new java.lang.Object[0]);
                num3 = null;
            }
            int intValue3 = num3 != null ? num3.intValue() : 0;
            java.lang.Object obj5 = msg.f340790a.get("content");
            try {
                kotlin.jvm.internal.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                str3 = (java.lang.String) obj5;
            } catch (java.lang.Throwable th10) {
                oj.j.d("Matrix.Safe", th10, "", new java.lang.Object[0]);
                str3 = null;
            }
            if (str3 != null) {
                str4 = str3;
            }
            jSONObject.put("businessType", str2);
            jSONObject.put("finderJumpId", intValue);
            jSONObject.put("commentScene", intValue2);
            jSONObject.put("actionType", intValue3);
            jSONObject.put("content", str4);
            jSONObject.put("eventType", 101);
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.w9.f193053a;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            com.tencent.mm.ipcinvoker.extension.l.a(str5, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPostFinderDanmuku$PostDanmakuData(jSONObject2), com.tencent.mm.plugin.webview.ui.tools.newjsapi.w9.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.x9(env, msg));
            return true;
        } catch (java.lang.Exception unused2) {
            kVar = env;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPostFinderDanmuku", java.lang.String.valueOf(msg.f340790a));
            kVar.f340863d.e(msg.f341013c, msg.f341019i + ":fail", null);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.tencent.mm.plugin.appbrand.jsapi.storage.m.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "callFinderBulletCommentHandler";
    }
}
