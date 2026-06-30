package vu4;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f440343a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f440344b;

    public k(int i17, java.lang.String logBuffer) {
        kotlin.jvm.internal.o.g(logBuffer, "logBuffer");
        this.f440343a = i17;
        this.f440344b = logBuffer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu4.k)) {
            return false;
        }
        vu4.k kVar = (vu4.k) obj;
        return this.f440343a == kVar.f440343a && kotlin.jvm.internal.o.b(this.f440344b, kVar.f440344b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f440343a) * 31) + this.f440344b.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("logid", java.lang.Integer.valueOf(this.f440343a)), new jz5.l("log_buffer", this.f440344b))).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
