package kc2;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.k f306309a;

    /* renamed from: b, reason: collision with root package name */
    public final int f306310b;

    public a(kc2.k id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f306309a = id6;
        this.f306310b = i17;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.COL_ID, this.f306309a.f306445d);
        jSONObject.put("time_stamp", this.f306310b);
        return jSONObject;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc2.a)) {
            return false;
        }
        kc2.a aVar = (kc2.a) obj;
        return this.f306309a == aVar.f306309a && this.f306310b == aVar.f306310b;
    }

    public int hashCode() {
        return (this.f306309a.hashCode() * 31) + java.lang.Integer.hashCode(this.f306310b);
    }

    public java.lang.String toString() {
        return "ActionSeqInfo(id=" + this.f306309a + ", timeStamp=" + this.f306310b + ')';
    }
}
