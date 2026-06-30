package ir2;

/* loaded from: classes2.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294248a;

    public z(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f294248a = id6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.z) && kotlin.jvm.internal.o.b(this.f294248a, ((ir2.z) obj).f294248a);
    }

    public int hashCode() {
        return this.f294248a.hashCode();
    }

    public java.lang.String toString() {
        return "Key(id=" + this.f294248a + ')';
    }
}
