package p05;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f350452a;

    /* renamed from: b, reason: collision with root package name */
    public final long f350453b;

    /* renamed from: c, reason: collision with root package name */
    public int f350454c;

    public a4(java.lang.String path, long j17, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f350452a = path;
        this.f350453b = j17;
        this.f350454c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.a4)) {
            return false;
        }
        p05.a4 a4Var = (p05.a4) obj;
        return kotlin.jvm.internal.o.b(this.f350452a, a4Var.f350452a) && this.f350453b == a4Var.f350453b && this.f350454c == a4Var.f350454c;
    }

    public int hashCode() {
        return (((this.f350452a.hashCode() * 31) + java.lang.Long.hashCode(this.f350453b)) * 31) + java.lang.Integer.hashCode(this.f350454c);
    }

    public java.lang.String toString() {
        return "EffectRunningData(path=" + this.f350452a + ", ptr=" + this.f350453b + ", rate=" + this.f350454c + ')';
    }
}
