package eh0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final eh0.g f252875a = new eh0.g();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f252876b = jz5.h.b(eh0.f.f252874d);

    public final com.tencent.mm.sdk.platformtools.o4 a() {
        java.lang.Object value = ((jz5.n) f252876b).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final void b(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        a().remove(key);
        com.tencent.mars.xlog.Log.i("MicroMsg.StreamMMKVHelper", "removeStreamInfo key:%s", key);
    }

    public final void c(java.lang.String key, eh0.i info) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(info, "info");
        long j17 = info.f252878a;
        java.lang.String str = info.f252882e;
        if (j17 != 0) {
            if (!(str == null || str.length() == 0)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("msgSvrId", j17);
                jSONObject.put("msgId", info.f252879b);
                jSONObject.put("ilinkStreamId", info.f252880c);
                jSONObject.put("streamTicket", info.f252881d);
                jSONObject.put("talker", str);
                jSONObject.put("createTime", info.f252883f);
                jSONObject.put("isThinking", info.f252886i);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                a().putString(key, jSONObject2);
                com.tencent.mars.xlog.Log.i("MicroMsg.StreamMMKVHelper", "saveStreamInfo msgSvrId:%s, textLen:%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(info.a().length()));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.StreamMMKVHelper", "saveStreamInfo error: msgSvrId:%s, talker:%s", java.lang.Long.valueOf(j17), str);
    }
}
