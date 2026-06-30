package t00;

/* loaded from: classes9.dex */
public final class e implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.E;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearKvActionHandler", "handleAction: " + data);
        int i18 = y02.f.f458604d;
        y02.d dVar = (y02.d) urgen.ur_E2DE.UR_B160.UR_1332();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClearKvActionHandler", "kvMgr is null");
            callback.a();
            return;
        }
        int optInt = data.optInt("mode", 0);
        if (optInt == 2) {
            urgen.ur_E2DE.UR_B160.UR_C2E7(((y02.f) dVar).getCppPointer());
            com.tencent.mars.xlog.Log.i("MicroMsg.ClearKvActionHandler", "clearAll");
            callback.b(null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data.has("keys")) {
            org.json.JSONArray optJSONArray = data.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ClearKvActionHandler", "keys is null or empty");
                callback.a();
                return;
            }
            int length = optJSONArray.length();
            for (int i19 = 0; i19 < length; i19++) {
                java.lang.String optString = optJSONArray.optString(i19);
                if (optString != null) {
                    if (optString.length() > 0) {
                        arrayList.add(optString);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClearKvActionHandler", "keys is empty");
            callback.a();
            return;
        }
        if (optInt == 0) {
            java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
            kotlin.jvm.internal.o.g(keys, "keys");
            urgen.ur_E2DE.UR_B160.UR_8B30(((y02.f) dVar).getCppPointer(), keys);
            com.tencent.mars.xlog.Log.i("MicroMsg.ClearKvActionHandler", "clear specified keys, count: " + arrayList.size());
            callback.b(null);
            return;
        }
        if (optInt != 1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ClearKvActionHandler", "invalid mode: " + optInt);
            callback.a();
            return;
        }
        java.lang.String[] keys2 = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        kotlin.jvm.internal.o.g(keys2, "keys");
        urgen.ur_E2DE.UR_B160.UR_B8ED(((y02.f) dVar).getCppPointer(), keys2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClearKvActionHandler", "clearExcept keys, count: " + arrayList.size());
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
