package t00;

/* loaded from: classes8.dex */
public final class h1 implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414322c;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        bw5.x7 a17;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction context null");
            callback.a();
            return;
        }
        pq.a aVar = new pq.a(context);
        java.lang.String optString = data.optString("ecsJumpInfoBase64");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            org.json.JSONObject optJSONObject = data.optJSONObject("ecsJumpInfo");
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction jumpInfo null");
                callback.a();
                return;
            }
            a17 = r10.b.f368574a.a(optJSONObject);
        } else {
            bw5.x7 x7Var = new bw5.x7();
            x7Var.parseFrom(android.util.Base64.decode(optString, 0));
            a17 = x7Var;
        }
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PreloadEcsEcsActionHandler", "handleAction jumpInfoObject null");
            callback.a();
            return;
        }
        bw5.l8 l8Var = new bw5.l8();
        org.json.JSONObject optJSONObject2 = data.optJSONObject("config");
        if (optJSONObject2 != null) {
            l8Var.f29680g = optJSONObject2.optInt("cgiPreloadScene", 0);
            boolean[] zArr = l8Var.f29682i;
            zArr[4] = true;
            if (optJSONObject2.has("cgiPreloadExtraData")) {
                java.lang.Object obj = optJSONObject2.get("cgiPreloadExtraData");
                if (obj instanceof java.lang.String) {
                    if (((java.lang.CharSequence) obj).length() > 0) {
                        byte[] bytes = ((java.lang.String) obj).getBytes(r26.c.f368865a);
                        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                        l8Var.f29681h = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                        zArr[5] = true;
                    }
                } else if (obj instanceof org.json.JSONObject) {
                    byte[] bytes2 = obj.toString().getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                    l8Var.f29681h = new com.tencent.mm.protobuf.g(bytes2, 0, bytes2.length);
                    zArr[5] = true;
                }
            }
        }
        i95.m c17 = i95.n0.c(pq.q.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        pq.q.h6((pq.q) c17, aVar, a17, l8Var, null, 8, null);
        callback.b(null);
    }
}
