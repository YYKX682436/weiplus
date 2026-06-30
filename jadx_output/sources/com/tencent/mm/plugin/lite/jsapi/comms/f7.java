package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class f7 extends com.tencent.mm.plugin.lite.api.p {

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f143579g = "";

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String str2;
        boolean z18;
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendTextMessage", "invoke sendTextMessage, appId=%s, data=%s", str, jSONObject);
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendTextMessage", "sendTextMessage fail, text is empty");
            this.f143443f.a("text is empty");
            return;
        }
        this.f143579g = optString;
        android.content.Context c17 = c();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, optString);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c17, com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 0);
        intent.putExtra("webview_params", hashMap);
        intent.putExtra("callback_id", m93.j.a(this));
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extra");
        if (optJSONObject != null) {
            boolean optBoolean = optJSONObject.optBoolean("isRecentForward");
            java.lang.String optString2 = optJSONObject.optString("content");
            int optInt = optJSONObject.optInt(ya.b.INDEX);
            if (optBoolean) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 12L, 1L, false);
                ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                java.util.ArrayList Ui = new com.tencent.mm.pluginsdk.forward.m().Ui();
                if (!Ui.isEmpty()) {
                    for (int i17 = 0; i17 < Ui.size(); i17++) {
                        o25.m2 m2Var = (o25.m2) Ui.get(i17);
                        if (optInt == i17 && optString2.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.w2.a(m2Var.f342560a))) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 13L, 1L, false);
                            z18 = true;
                            str2 = m2Var.f342560a;
                            break;
                        }
                    }
                }
            }
        }
        str2 = "";
        z18 = false;
        hashMap.put("isText", "true");
        if (z18 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1865L, 14L, 1L, false);
            intent.putExtra("Select_Conv_User", str2);
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendTextMessage", "startActivity intent=%s", intent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendTextMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiSendTextMessage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void x(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiSendTextMessage", "onSelectConversationUICallback requestCode=%d, resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 != -1 || intent == null) {
            this.f143443f.a("cancel");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && !android.text.TextUtils.isEmpty(this.f143579g)) {
            ((dk5.s5) tg3.t1.a()).fj(stringExtra, this.f143579g, c01.e2.C(stringExtra), 0);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(stringExtra);
        }
        this.f143443f.d(false);
    }
}
