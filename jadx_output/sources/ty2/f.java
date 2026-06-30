package ty2;

/* loaded from: classes5.dex */
public final class f implements ty2.c {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f423065a;

    public f(yz5.l showTypesFilter) {
        kotlin.jvm.internal.o.g(showTypesFilter, "showTypesFilter");
        this.f423065a = showTypesFilter;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ty2.f) && kotlin.jvm.internal.o.b(this.f423065a, ((ty2.f) obj).f423065a);
    }

    public int hashCode() {
        return this.f423065a.hashCode();
    }

    public java.lang.String toString() {
        return "Config(showTypesFilter=" + this.f423065a + ')';
    }
}
