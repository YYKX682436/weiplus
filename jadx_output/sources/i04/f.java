package i04;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final i04.e f286537f = new i04.e(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286538a;

    /* renamed from: b, reason: collision with root package name */
    public final int f286539b;

    /* renamed from: c, reason: collision with root package name */
    public final j04.f f286540c;

    /* renamed from: d, reason: collision with root package name */
    public long f286541d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f286542e;

    public f(java.lang.String sessionId, int i17, j04.f callback, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f286538a = sessionId;
        this.f286539b = i17;
        this.f286540c = callback;
        this.f286541d = j17;
        this.f286542e = z17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_ID, this.f286538a);
        jSONObject.put("i", this.f286539b);
        f06.d a17 = kotlin.jvm.internal.i0.a(this.f286540c.getClass());
        kotlin.jvm.internal.o.g(a17, "<this>");
        jSONObject.put("cb", ((i06.k1) a17).f286680e.getName());
        jSONObject.put("t", this.f286541d);
        jSONObject.put("o", this.f286542e);
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i04.f)) {
            return false;
        }
        i04.f fVar = (i04.f) obj;
        return kotlin.jvm.internal.o.b(this.f286538a, fVar.f286538a) && this.f286539b == fVar.f286539b && kotlin.jvm.internal.o.b(this.f286540c, fVar.f286540c) && this.f286541d == fVar.f286541d && this.f286542e == fVar.f286542e;
    }

    public int hashCode() {
        return (((((((this.f286538a.hashCode() * 31) + java.lang.Integer.hashCode(this.f286539b)) * 31) + this.f286540c.hashCode()) * 31) + java.lang.Long.hashCode(this.f286541d)) * 31) + java.lang.Boolean.hashCode(this.f286542e);
    }

    public java.lang.String toString() {
        return "MTimerTask(sessionId=" + this.f286538a + ", interval=" + this.f286539b + ", callback=" + this.f286540c + ", time=" + this.f286541d + ", offline=" + this.f286542e + ')';
    }
}
