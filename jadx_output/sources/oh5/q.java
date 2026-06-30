package oh5;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f345518a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345519b;

    public q(java.lang.Object obj, long j17) {
        this.f345518a = obj;
        this.f345519b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh5.q)) {
            return false;
        }
        oh5.q qVar = (oh5.q) obj;
        return kotlin.jvm.internal.o.b(this.f345518a, qVar.f345518a) && this.f345519b == qVar.f345519b;
    }

    public int hashCode() {
        java.lang.Object obj = this.f345518a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f345519b);
    }

    public java.lang.String toString() {
        return "WhiteListItem(value=" + this.f345518a + ", expiredTimeMillis=" + this.f345519b + ')';
    }
}
