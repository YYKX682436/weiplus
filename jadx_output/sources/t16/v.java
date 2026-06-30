package t16;

/* loaded from: classes15.dex */
public final class v extends t16.w {

    /* renamed from: a, reason: collision with root package name */
    public final t16.f f414628a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t16.f value) {
        super(null);
        kotlin.jvm.internal.o.g(value, "value");
        this.f414628a = value;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t16.v) && kotlin.jvm.internal.o.b(this.f414628a, ((t16.v) obj).f414628a);
    }

    public int hashCode() {
        return this.f414628a.hashCode();
    }

    public java.lang.String toString() {
        return "NormalClass(value=" + this.f414628a + ')';
    }
}
