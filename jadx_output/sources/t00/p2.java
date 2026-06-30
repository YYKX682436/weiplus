package t00;

/* loaded from: classes9.dex */
public final class p2 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414338s;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("MicroMsg.TryPreloadDataActionHandler", "handleAction: " + data);
        y02.p0 a17 = y02.r0.f458626d.a();
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TryPreloadDataActionHandler", "preloadMgr is null");
            callback.a();
            return;
        }
        org.json.JSONArray optJSONArray = data.optJSONArray("itemList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TryPreloadDataActionHandler", "itemList is null");
            callback.a();
            return;
        }
        bw5.d6 d6Var = new bw5.d6();
        d6Var.f26337d = data.optInt("preloadScene", 0);
        boolean[] zArr = d6Var.f26339f;
        zArr[1] = true;
        if (data.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
            java.lang.Object obj = data.get(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
            if (obj instanceof java.lang.String) {
                if (((java.lang.CharSequence) obj).length() > 0) {
                    byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    d6Var.f26338e = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                    zArr[2] = true;
                }
            } else if (obj instanceof org.json.JSONObject) {
                byte[] bytes2 = obj.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                d6Var.f26338e = new com.tencent.mm.protobuf.g(bytes2, 0, bytes2.length);
                zArr[2] = true;
            }
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        c75.c.d(optJSONArray, new t00.o2(linkedList));
        bw5.m7 m7Var = new bw5.m7();
        m7Var.f30097d = linkedList;
        m7Var.f30098e[1] = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.TryPreloadDataActionHandler", "tryStartPreload, count: " + linkedList.size() + ", scene: " + d6Var.f26337d);
        ((y02.r0) a17).e(m7Var, d6Var);
        callback.b(null);
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }
}
