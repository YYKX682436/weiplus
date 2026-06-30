package t00;

/* loaded from: classes9.dex */
public final class f implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414339t;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f458626d.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClearPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data.has("keys")) {
            org.json.JSONArray optJSONArray = data.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ClearPreloadDataActionHandler", "keys is null");
                callback.a();
                return;
            }
            int length = optJSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                java.lang.String optString = optJSONArray.optString(i18);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClearPreloadDataActionHandler", "keys is null");
            callback.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearPreloadDataActionHandler", "clearPreload, count: " + arrayList.size());
        java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        kotlin.jvm.internal.o.g(keys, "keys");
        urgen.ur_E2DE.UR_9715.UR_4939(((y02.r0) a17).getCppPointer(), keys);
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
