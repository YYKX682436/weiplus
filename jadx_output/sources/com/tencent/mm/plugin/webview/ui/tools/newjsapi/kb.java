package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class kb extends qw4.a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.newjsapi.kb f186320d = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.kb();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f186321e;

    /* renamed from: f, reason: collision with root package name */
    public static nw4.y2 f186322f;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestSubscribeMessage", com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.s.NAME);
        f186321e = new java.lang.ref.WeakReference(env);
        f186322f = msg;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("appId");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("extInfo");
        java.lang.String str3 = (java.lang.String) ((java.util.HashMap) msg.f340790a).get("templateIdList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str3 != null) {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str3);
            int length = jSONArray.length();
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    break;
                }
                java.lang.Object obj = jSONArray.get(i17);
                if (!(obj instanceof java.lang.String)) {
                    f186320d.e(msg, com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID, ":fail templateId invalid", null);
                    break;
                }
                arrayList.add(obj);
                i17++;
            }
        }
        if (arrayList.isEmpty()) {
            e(msg, 10001, ":fail templateIdList empty", null);
        } else {
            android.content.Context context = env.f340860a;
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) context).mmSetOnActivityResultCallback(this);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key_extra_info", str2);
            bundle.putBoolean("key_need_result", true);
            bundle.putStringArrayList("key_template_id_list", arrayList);
            e31.k kVar = (e31.k) ((jz5.n) ((ba0.h) ((ca0.e) i95.n0.c(ca0.e.class))).f18677d).getValue();
            if (kVar != null) {
                android.content.Context context2 = env.f340860a;
                if (str == null) {
                    str = "";
                }
                kVar.g(context2, 2, 213, str, bundle);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return zd.d.CTRL_INDEX;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.tencent.mm.plugin.appbrand.jsapi.msgsubscription.s.NAME;
    }

    public final void e(nw4.y2 y2Var, int i17, java.lang.String str, java.util.Map map) {
        nw4.k kVar;
        nw4.g gVar;
        if (y2Var == null) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("err_code", java.lang.Integer.valueOf(i17));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (i17 == 0) {
            if (!(str.length() > 0)) {
                str = "ok";
            }
        } else {
            if (!(str.length() > 0)) {
                str = "unknown error";
            }
        }
        java.lang.ref.WeakReference weakReference = f186321e;
        if (weakReference != null && (kVar = (nw4.k) weakReference.get()) != null && (gVar = kVar.f340863d) != null) {
            gVar.e(y2Var.f341013c, y2Var.f341019i + ':' + str, linkedHashMap);
        }
        f186321e = null;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent == null || i17 != 213) {
            return;
        }
        java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_result_data");
        int intExtra = intent.getIntExtra("key_result_err_code", -1);
        java.lang.String stringExtra = intent.getStringExtra("key_result_err_msg");
        if (stringExtra == null) {
            stringExtra = "unknown error";
        }
        java.lang.String stringExtra2 = intent.getStringExtra("key_result_ext_data");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(intExtra);
        objArr[1] = stringExtra;
        objArr[2] = parcelableArrayListExtra != null ? java.lang.Integer.valueOf(parcelableArrayListExtra.size()) : null;
        objArr[3] = stringExtra2;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestSubscribeMessage", "requestSubscribeMessage onActivityResult errCode: %s, errMsg: %s, template size: %s, extData: %s", objArr);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (parcelableArrayListExtra != null) {
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem : parcelableArrayListExtra) {
                java.lang.String str = subscribeMsgTmpItem.f71803f;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("status", subscribeMsgTmpItem.f71811q);
                jSONObject.put(str, jSONObject2.toString());
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("templatesDetail", jSONObject.toString());
        hashMap.put("ext_info", stringExtra2);
        e(f186322f, intExtra, stringExtra, hashMap);
    }
}
