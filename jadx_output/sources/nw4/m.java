package nw4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f340877a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f340878b = new java.util.HashMap();

    public m() {
        try {
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_webview_jsapi_call_limit, "{\"list\":[{\"limit\":10,\"pos\":14},{\"limit\":10,\"pos\":15}]}", true);
            org.json.JSONArray optJSONArray = new org.json.JSONObject(Zi).optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.Object obj = optJSONArray.get(i17);
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
                    org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                    this.f340878b.put(java.lang.Integer.valueOf(jSONObject.optInt("pos")), java.lang.Integer.valueOf(jSONObject.optInt("limit")));
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFrequentHelper", "size=" + this.f340878b.size() + ", config=" + Zi);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiFrequentHelper", "parse fail: ex=" + th6.getMessage());
        }
    }

    public final boolean a(int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f340878b;
        if (hashMap.containsKey(valueOf)) {
            java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.d(obj);
            int intValue = ((java.lang.Number) obj).intValue();
            if (intValue <= 0) {
                return false;
            }
            java.util.HashMap hashMap2 = this.f340877a;
            nw4.l lVar = (nw4.l) hashMap2.get(java.lang.Integer.valueOf(i17));
            long currentTimeMillis = java.lang.System.currentTimeMillis() / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            if (lVar == null) {
                lVar = new nw4.l(currentTimeMillis, 1);
            } else if (lVar.f340871a == currentTimeMillis) {
                lVar.f340872b++;
            } else {
                lVar.f340871a = currentTimeMillis;
                lVar.f340872b = 1;
            }
            hashMap2.put(java.lang.Integer.valueOf(i17), lVar);
            if (lVar.f340872b >= intValue) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiFrequentHelper", "isTooFrequent controlByte:" + i17 + ", count:" + lVar.f340872b);
        }
        return false;
    }

    public final void b(int i17, java.lang.String funcName, java.lang.String url) {
        nw4.l lVar;
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.HashMap hashMap = this.f340878b;
        if (hashMap.containsKey(valueOf)) {
            java.lang.Object obj = hashMap.get(java.lang.Integer.valueOf(i17));
            kotlin.jvm.internal.o.d(obj);
            int intValue = ((java.lang.Number) obj).intValue();
            if (intValue > 0 && (lVar = (nw4.l) this.f340877a.get(java.lang.Integer.valueOf(i17))) != null && lVar.f340872b == intValue) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
                g0Var.d(18188, funcName, com.tencent.mm.sdk.platformtools.y9.a(url));
            }
        }
    }
}
