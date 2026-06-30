package i04;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286561a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f286562b;

    /* renamed from: c, reason: collision with root package name */
    public final int f286563c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f286564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f286565e;

    /* renamed from: f, reason: collision with root package name */
    public final int f286566f;

    /* renamed from: g, reason: collision with root package name */
    public final int f286567g;

    public n(java.lang.String uin, com.tencent.mm.sdk.platformtools.o4 mmkv) {
        kotlin.jvm.internal.o.g(uin, "uin");
        kotlin.jvm.internal.o.g(mmkv, "mmkv");
        this.f286561a = uin;
        this.f286562b = mmkv;
        this.f286563c = 1800000;
        this.f286564d = new java.util.ArrayList();
        this.f286565e = 3600000;
        this.f286566f = 28800000;
        this.f286567g = 17;
    }

    public final long a() {
        long c17 = c01.id.c();
        return c17 - ((java.util.TimeZone.getDefault().getRawOffset() + c17) % 86400000);
    }

    public final java.lang.String b() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (i04.m mVar : this.f286564d) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("disable", mVar.f286559a);
            jSONObject.put("time", mVar.f286560b);
            jSONArray.put(jSONObject);
        }
        java.lang.String jSONArray2 = jSONArray.toString();
        kotlin.jvm.internal.o.f(jSONArray2, "toString(...)");
        return jSONArray2;
    }
}
