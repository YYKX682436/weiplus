package hk0;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final int f281752a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Bundle f281753b;

    public j(int i17, android.os.Bundle extra) {
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f281752a = i17;
        this.f281753b = extra;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.j)) {
            return false;
        }
        hk0.j jVar = (hk0.j) obj;
        return this.f281752a == jVar.f281752a && kotlin.jvm.internal.o.b(this.f281753b, jVar.f281753b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f281752a) * 31) + this.f281753b.hashCode();
    }

    public java.lang.String toString() {
        return "EditEvent(eventType=" + this.f281752a + ", extra=" + this.f281753b + ')';
    }
}
