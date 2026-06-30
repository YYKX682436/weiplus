package pr4;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final pr4.j f357985a;

    public a(pr4.j type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f357985a = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.a) && this.f357985a == ((pr4.a) obj).f357985a;
    }

    public int hashCode() {
        return this.f357985a.hashCode();
    }

    public java.lang.String toString() {
        return "ConsumeError(type=" + this.f357985a + ')';
    }
}
