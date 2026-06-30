package t00;

/* loaded from: classes9.dex */
public final class o0 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414337r;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f458626d.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        t00.m0 i18 = i(data);
        if (!i18.f414315a || (arrayList = i18.f414318d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "data invalid");
            callback.a();
            return;
        }
        if (!i18.f414316b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Sync");
            h(((y02.r0) a17).a((java.lang.String[]) arrayList.toArray(new java.lang.String[0])), callback);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Async");
        java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        t00.n0 n0Var = new t00.n0(this, callback);
        kotlin.jvm.internal.o.g(keys, "keys");
        y02.o1 o1Var = new y02.o1();
        o1Var.f458623i = n0Var;
        urgen.ur_E2DE.UR_9715.UR_A1FB(((y02.r0) a17).getCppPointer(), keys, i18.f414317c, o1Var);
    }

    @Override // t00.r0
    public boolean d(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "preHandleAction: " + data);
        y02.p0 a17 = y02.r0.f458626d.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return true;
        }
        t00.m0 i18 = i(data);
        if (!i18.f414315a || (arrayList = i18.f414318d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "data invalid");
            callback.a();
            return true;
        }
        if (i18.f414316b) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "handle Sync");
        h(((y02.r0) a17).a((java.lang.String[]) arrayList.toArray(new java.lang.String[0])), callback);
        return true;
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }

    public final void h(bw5.e6[] e6VarArr, c00.n3 n3Var) {
        if (e6VarArr == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "onFail, invalid preloadResp");
            n3Var.a();
            return;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (bw5.e6 e6Var : e6VarArr) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = "";
            jSONObject.put("key", e6Var.f26744g[1] ? e6Var.f26741d : "");
            if (e6Var.f26744g[2]) {
                str = e6Var.f26742e;
            }
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            jSONObject.put("time", e6Var.f26743f);
            jSONArray.put(jSONObject);
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("kvData", jSONArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetPreloadDataActionHandler", "onSuccess, result count: " + jSONArray.length());
        n3Var.b(jSONObject2);
    }

    public final t00.m0 i(org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (jSONObject.has("keys")) {
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "invalid keys");
                return new t00.m0(false, false, 0, null, 8, null);
            }
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.lang.String optString = optJSONArray.optString(i17);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetPreloadDataActionHandler", "keys isEmpty");
                return new t00.m0(false, false, 0, null, 8, null);
            }
        }
        return new t00.m0(true, (jSONObject.has("async") ? jSONObject.optInt("async", 0) : 0) == 1, jSONObject.has("timeoutMs") ? jSONObject.optInt("timeoutMs", 3000) : 3000, arrayList);
    }
}
