package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class t2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("fail: data is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String optString = jSONObject.optString("chat_username");
        if (com.tencent.mm.storage.z3.J4(optString)) {
            java.lang.String str2 = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).f265829p;
            kotlin.jvm.internal.o.d(str2);
            hashMap.put("chat_username", str2);
        } else {
            hashMap.put("chat_username", optString);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(c(), com.tencent.mm.plugin.lite.ui.WxaLiteAppApiProxyUI.class);
        intent.putExtra("proxyui_action_code_key", 10);
        intent.putExtra("get_msg_proof_items_params", hashMap);
        int i17 = m93.j.f325061u + 1;
        m93.j.f325061u = i17;
        m93.j.f325062v.put(java.lang.Integer.valueOf(i17), this);
        intent.putExtra("callback_id", m93.j.f325061u);
        android.content.Context c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        c17.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(c17, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetMsgProofItems", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public void m(int i17, int i18, android.content.Intent intent) {
        if (i18 != -1) {
            this.f143443f.a("select chat record : cancel");
            return;
        }
        if (intent == null) {
            this.f143443f.a("select chat record : fail");
            return;
        }
        long[] longArrayExtra = intent.getLongArrayExtra("k_outside_expose_proof_item_list");
        java.lang.String stringExtra = intent.getStringExtra("k_username");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        boolean z17 = false;
        if (longArrayExtra != null) {
            for (long j17 : longArrayExtra) {
                arrayList.add(pt0.f0.Li(stringExtra, j17));
            }
        }
        int size = arrayList.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        java.lang.String[] strArr3 = new java.lang.String[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        java.lang.String[] strArr4 = new java.lang.String[size];
        int i19 = 0;
        while (i19 < size) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) arrayList.get(i19);
            strArr[i19] = java.lang.String.valueOf(f9Var.I0());
            if (intent.getBooleanExtra("k_is_group_chat", z17)) {
                if (f9Var.isVideo()) {
                    strArr2[i19] = c01.w9.u(f9Var.J0());
                } else {
                    strArr2[i19] = c01.w9.u(f9Var.j());
                }
                strArr3[i19] = c01.w9.s(f9Var.j());
            } else {
                if (f9Var.isVideo()) {
                    strArr2[i19] = f9Var.J0();
                } else {
                    strArr2[i19] = f9Var.j();
                }
                if (com.tencent.mm.storage.z3.V3(f9Var.Q0())) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    strArr3[i19] = com.tencent.mm.plugin.finder.service.m4.f126148a.h(f9Var.Q0());
                } else if (com.tencent.mm.storage.z3.H4(f9Var.Q0())) {
                    strArr3[i19] = ((ki4.i0) ((bi4.y0) i95.n0.c(bi4.y0.class))).wi(f9Var.Q0());
                } else {
                    strArr3[i19] = f9Var.Q0();
                }
            }
            if (f9Var.A0() == 1) {
                if (com.tencent.mm.storage.z3.V3(f9Var.Q0())) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    strArr3[i19] = com.tencent.mm.plugin.finder.service.m4.f126148a.f(f9Var.Q0());
                } else {
                    strArr3[i19] = c01.z1.r();
                }
            }
            if (com.tencent.mm.storage.z3.J4(f9Var.Q0())) {
                if (f9Var.A0() == 1) {
                    strArr3[i19] = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Di();
                } else {
                    strArr3[i19] = ((fr4.g0) ((gr4.f) i95.n0.c(gr4.f.class))).Zi(f9Var.Q0());
                }
            }
            if (strArr2[i19] == null) {
                strArr2[i19] = "";
            }
            if (strArr3[i19] == null) {
                strArr3[i19] = "";
            }
            if (f9Var.k2()) {
                iArr[i19] = 49;
            } else {
                iArr[i19] = f9Var.getType();
            }
            iArr2[i19] = (int) (f9Var.getCreateTime() / 1000);
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.G, "msgsource", null);
            if (d17 != null && d17.get(".msgsource.signature") != null) {
                strArr4[i19] = (java.lang.String) d17.get(".msgsource.signature");
                if (d17.get(".msgsource.realcreatetime") != null) {
                    iArr2[i19] = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msgsource.realcreatetime"), (int) (f9Var.getCreateTime() / 1000));
                }
            }
            i19++;
            z17 = false;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (int i27 = 0; i27 < size; i27++) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("newMsgId", strArr[i27]);
                jSONObject2.put("content", strArr2[i27]);
                jSONObject2.put("sender", strArr3[i27]);
                jSONObject2.put("msgType", iArr[i27]);
                jSONObject2.put("msgTime", iArr2[i27]);
                jSONObject2.put("msgSignature", strArr4[i27]);
                jSONArray.put(jSONObject2);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e17.getMessage());
            }
        }
        try {
            jSONObject.put("result", jSONArray);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiGetMsgProofItems", "GetMsgProofItems exception " + e18.getMessage());
        }
        this.f143443f.c(jSONObject, false);
    }
}
