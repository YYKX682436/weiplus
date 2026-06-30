package ir2;

/* loaded from: classes2.dex */
public final class u1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294227a;

    public u1(ir2.e1 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f294227a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.u1) && kotlin.jvm.internal.o.b(this.f294227a, ((ir2.u1) obj).f294227a);
    }

    public int hashCode() {
        return this.f294227a.hashCode();
    }

    public java.lang.String toString() {
        return "RefreshedState(data=" + this.f294227a + ')';
    }
}
