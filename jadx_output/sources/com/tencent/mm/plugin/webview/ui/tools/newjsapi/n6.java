package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class n6 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.n6 f186374d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.n6();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        nw4.y2 y2Var;
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.f340790a.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.Object obj2 = msg.f340790a.get("sceneNote");
        java.lang.String str2 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.Object obj3 = msg.f340790a.get("relativeURL");
        java.lang.String str3 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.Object obj4 = msg.f340790a.get("appVersion");
        java.lang.String str4 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
        if (str4 == null) {
            str4 = "";
        }
        java.lang.Object obj5 = msg.f340790a.get("nativeExtraData");
        java.lang.String str5 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
        if (str5 == null) {
            str5 = "";
        }
        java.lang.Object obj6 = msg.f340790a.get("privateExtraData");
        java.lang.String str6 = obj6 instanceof java.lang.String ? (java.lang.String) obj6 : null;
        if (str6 == null) {
            str6 = "";
        }
        java.lang.Object obj7 = msg.f340790a.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        java.lang.String str7 = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
        if (str7 == null) {
            str7 = "";
        }
        java.lang.Object obj8 = msg.f340790a.get("sourceAppId");
        java.lang.String str8 = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
        if (str8 == null) {
            str8 = "";
        }
        java.lang.String str9 = str8;
        boolean y17 = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) msg.f340790a.get("useDraft"), false);
        java.lang.Object obj9 = msg.f340790a.get("mpPublishAction");
        java.lang.String str10 = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
        if (str10 == null) {
            tk.v vVar = tk.w.f419878e;
            str10 = "openImage";
        }
        java.lang.String str11 = str10;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, str);
            jSONObject.put("sceneNote", str2);
            jSONObject.put("relativeURL", str3);
            jSONObject.put("appVersion", str4);
            jSONObject.put("nativeExtraData", str5);
            jSONObject.put("privateExtraData", str6);
            jSONObject.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, str7);
            jSONObject.put("sourceAppId", str9);
            jSONObject.put("useDraft", y17);
            jSONObject.put("mpPublishAction", str11);
            y2Var = msg;
            try {
                if (y2Var.f340790a.get("draftScene") instanceof java.lang.String) {
                    jSONObject.put("draftScene", y2Var.f340790a.get("draftScene"));
                }
                if (y2Var.f340790a.get("draftType") instanceof java.lang.String) {
                    jSONObject.put("draftType", com.tencent.mm.sdk.platformtools.t8.O(y2Var.f340790a.get("draftType"), 0));
                }
            } catch (org.json.JSONException e17) {
                e = e17;
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenBizPublishImage", "generate json error: " + e);
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), com.tencent.mm.plugin.webview.ui.tools.newjsapi.l6.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m6(env, y2Var));
                return true;
            }
        } catch (org.json.JSONException e18) {
            e = e18;
            y2Var = msg;
        }
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject.toString()), com.tencent.mm.plugin.webview.ui.tools.newjsapi.l6.class, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.m6(env, y2Var));
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 536;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openBizPublishImage";
    }
}
