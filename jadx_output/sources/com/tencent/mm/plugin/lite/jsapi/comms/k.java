package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class k extends com.tencent.mm.plugin.lite.api.p {
    public final void A(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("webtype");
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_USERNAME);
        java.lang.String optString3 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        java.lang.String optString4 = jSONObject.optString("scenenote");
        java.lang.String optString5 = jSONObject.optString("profileReportInfo");
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddContact", "addContact fail, invalid arguments, webType = " + optString + ", username" + optString2);
            this.f143443f.a("addContact: fail");
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(optString, -1);
        if (P == -1) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiAddContact", "addContact fail, parseInt fail, str = ".concat(optString));
            this.f143443f.a("addContact: fail");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiteAppJsApiAddContact", "addContact scene = %s, sceneNote = %s", optString3, optString4);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("webtype", optString);
        hashMap.put(dm.i4.COL_USERNAME, optString2);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, optString3);
        hashMap.put("addscene", java.lang.String.valueOf(P));
        hashMap.put("scenenote", optString4);
        hashMap.put("profileReportInfo", optString5);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 2);
        int i17 = m93.j.f325045e + 1;
        m93.j.f325045e = i17;
        m93.j.f325046f.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325045e);
        intent.putExtra("add_contact_params", hashMap);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiAddContact", "addContact", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).getClass();
        if (!com.tencent.mm.model.gdpr.g.a()) {
            A(str, jSONObject, z17);
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            this.f143443f.a("username is null");
            return;
        }
        ((r60.e) ((s60.e) i95.n0.c(s60.e.class))).wi(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.model.gdpr.a.BIZ, optString, new com.tencent.mm.plugin.lite.jsapi.comms.j(this, str, jSONObject, z17));
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void d(int i17) {
        if (i17 != -2) {
            if (i17 == -1) {
                this.f143443f.a("fail");
                return;
            } else if (i17 == 0) {
                this.f143443f.a("cancel");
                return;
            } else if (i17 != 1) {
                this.f143443f.a("fail");
                return;
            }
        }
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 0;
    }
}
