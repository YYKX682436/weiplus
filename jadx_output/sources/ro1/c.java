package ro1;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final ro1.b f397976c = new ro1.b(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397977a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397978b;

    public c(java.lang.String deviceId, java.lang.String accessMode) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(accessMode, "accessMode");
        this.f397977a = deviceId;
        this.f397978b = accessMode;
    }

    public static final byte[] a(ro1.c cVar) {
        cVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("deviceId", cVar.f397977a);
        jSONObject.put("accessMode", cVar.f397978b);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.w2.a("wechat-microMsg".concat(jSONObject2));
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        jSONObject3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2).put("digest", a17);
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        byte[] bytes = jSONObject4.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        return bytes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro1.c)) {
            return false;
        }
        ro1.c cVar = (ro1.c) obj;
        return kotlin.jvm.internal.o.b(this.f397977a, cVar.f397977a) && kotlin.jvm.internal.o.b(this.f397978b, cVar.f397978b);
    }

    public int hashCode() {
        return (this.f397977a.hashCode() * 31) + this.f397978b.hashCode();
    }

    public java.lang.String toString() {
        return "DeviceMeta(deviceId=" + this.f397977a + ", accessMode=" + this.f397978b + ')';
    }
}
