package t16;

/* loaded from: classes15.dex */
public final class u extends t16.w {

    /* renamed from: a, reason: collision with root package name */
    public final f26.o0 f414627a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f26.o0 type) {
        super(null);
        kotlin.jvm.internal.o.g(type, "type");
        this.f414627a = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t16.u) && kotlin.jvm.internal.o.b(this.f414627a, ((t16.u) obj).f414627a);
    }

    public int hashCode() {
        return this.f414627a.hashCode();
    }

    public java.lang.String toString() {
        return "LocalClass(type=" + this.f414627a + ')';
    }
}
