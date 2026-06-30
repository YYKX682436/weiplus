package rx4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f401089a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401090b;

    public a(int i17, java.lang.String logBuffer) {
        kotlin.jvm.internal.o.g(logBuffer, "logBuffer");
        this.f401089a = i17;
        this.f401090b = logBuffer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.a)) {
            return false;
        }
        rx4.a aVar = (rx4.a) obj;
        return this.f401089a == aVar.f401089a && kotlin.jvm.internal.o.b(this.f401090b, aVar.f401090b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f401089a) * 31) + this.f401090b.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(new jz5.l("logid", java.lang.Integer.valueOf(this.f401089a)), new jz5.l("log_buffer", this.f401090b))).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }
}
