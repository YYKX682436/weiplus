package t00;

/* loaded from: classes9.dex */
public final class l0 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.C;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        java.util.Map map;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetKvActionHandler", "handleAction: " + data);
        int i18 = y02.f.f458604d;
        y02.d dVar = (y02.d) urgen.ur_E2DE.UR_B160.UR_1332();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetKvActionHandler", "kvMgr is null");
            callback.a();
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (data.has("keys")) {
            org.json.JSONArray optJSONArray = data.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.GetKvActionHandler", "keys is null");
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
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetKvActionHandler", "keys is empty");
            callback.a();
            return;
        }
        java.lang.String[] keys = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        kotlin.jvm.internal.o.g(keys, "keys");
        y02.p1 p1Var = (y02.p1) urgen.ur_E2DE.UR_B160.UR_746F(((y02.f) dVar).getCppPointer(), keys);
        if (p1Var == null) {
            map = kz5.q0.f314001d;
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String[] T1 = p1Var.T1();
            java.lang.String[] Cc = p1Var.Cc();
            int length2 = T1.length;
            for (int i27 = 0; i27 < length2; i27++) {
                hashMap.put(T1[i27], Cc[i27]);
            }
            map = hashMap;
        }
        java.util.Map e17 = kz5.b1.e(new jz5.l("keyValues", map));
        com.tencent.mars.xlog.Log.i("MicroMsg.GetKvActionHandler", "getKv, count: " + map.size());
        callback.b(new org.json.JSONObject(e17));
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
