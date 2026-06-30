package t00;

/* loaded from: classes9.dex */
public final class h2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.D;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.SetKvActionHandler", "handleAction: " + data);
        int i18 = y02.f.f458604d;
        y02.d dVar = (y02.d) urgen.ur_E2DE.UR_B160.UR_1332();
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SetKvActionHandler", "kvMgr is null");
            callback.a();
            return;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        if (data.has("keyValues")) {
            org.json.JSONObject optJSONObject = data.optJSONObject("keyValues");
            if (optJSONObject == null || optJSONObject.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SetKvActionHandler", "keyValues is empty");
                callback.a();
                return;
            }
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                java.lang.Object obj = optJSONObject.get(next);
                if (obj instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj).length() > 0) {
                        kotlin.jvm.internal.o.d(next);
                        linkedHashMap.put(next, obj);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SetKvActionHandler", "keyValues is empty");
            callback.a();
            return;
        }
        int optInt = data.has("timeout") ? data.optInt("timeout", 0) : 0;
        int UR_0F7B = optInt == -1 ? urgen.ur_E2DE.UR_B160.UR_0F7B(((y02.f) dVar).getCppPointer(), y02.s1.f458627g.b(linkedHashMap)) : optInt > 0 ? urgen.ur_E2DE.UR_B160.UR_DE3E(((y02.f) dVar).getCppPointer(), y02.s1.f458627g.b(linkedHashMap), optInt) : urgen.ur_E2DE.UR_B160.UR_0861(((y02.f) dVar).getCppPointer(), y02.s1.f458627g.b(linkedHashMap));
        com.tencent.mars.xlog.Log.i("MicroMsg.SetKvActionHandler", "setKv, count: " + linkedHashMap.size() + " errorCode: " + UR_0F7B);
        if (UR_0F7B == 0) {
            callback.b(null);
        } else {
            callback.d(new org.json.JSONObject(kz5.b1.e(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(UR_0F7B)))));
        }
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }
}
