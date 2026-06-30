package ka3;

/* loaded from: classes15.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.List a() {
        java.lang.String[] b17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = ra3.q.f393527a;
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = ra3.q.f393527a;
        if (o4Var2 == null) {
            b17 = new java.lang.String[0];
        } else {
            b17 = o4Var2.b();
            if (b17 == null) {
                b17 = new java.lang.String[0];
            }
        }
        com.tencent.mars.xlog.Log.i(ka3.g.f306069i, "mmkv getallkeys=" + b17);
        java.util.Iterator a17 = kotlin.jvm.internal.c.a(b17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            kotlin.jvm.internal.b bVar = (kotlin.jvm.internal.b) a17;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            java.lang.String str = (java.lang.String) bVar.next();
            if (ka3.g.f306068h.e(str)) {
                org.json.JSONObject c17 = c(str, "{}");
                try {
                    ka3.f fVar = new ka3.f(c17, str);
                    com.tencent.mars.xlog.Log.i(ka3.g.f306069i, "get RegisterData from mmkv, aids=" + fVar.f306058a + ", key=" + str);
                    arrayList.add(fVar);
                } catch (org.json.JSONException unused) {
                    com.tencent.mars.xlog.Log.e(ka3.g.f306069i, "parse register option error, option=" + c17);
                }
            } else {
                com.tencent.mars.xlog.Log.i(ka3.g.f306069i, "invalid hce register key=".concat(str));
            }
        }
    }

    public final java.lang.String b(java.lang.String uin, java.lang.String liteAppId) {
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        return uin + '_' + liteAppId;
    }

    public final org.json.JSONObject c(java.lang.String key, java.lang.String defaultVal) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = ra3.q.f393527a;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(defaultVal, "defaultVal");
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = ra3.q.f393527a;
        java.lang.String string = o4Var2.getString(key, defaultVal);
        if (string != null) {
            defaultVal = string;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(defaultVal);
        if (jSONObject.length() != 0 && !jSONObject.has("wallet")) {
            try {
                ka3.v vVar = ka3.w.f306106e;
                jSONObject.put("wallet", "cn");
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                o4Var2.putString(key, jSONObject2);
            } catch (org.json.JSONException unused) {
            }
        }
        return jSONObject;
    }

    public final ka3.f d(java.lang.String uin, java.lang.String liteAppId) {
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        return new ka3.f(c(b(uin, liteAppId), "{}"), b(uin, liteAppId));
    }

    public final boolean e(java.lang.String uin, java.lang.String liteAppId, ka3.w walletType) {
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(liteAppId, "liteAppId");
        kotlin.jvm.internal.o.g(walletType, "walletType");
        try {
            org.json.JSONObject c17 = c(b(uin, liteAppId), "{}");
            if (c17.length() == 0) {
                return false;
            }
            ka3.v vVar = ka3.w.f306106e;
            java.lang.String optString = c17.optString("wallet");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            return vVar.a(optString) == walletType;
        } catch (org.json.JSONException unused) {
            return false;
        }
    }
}
