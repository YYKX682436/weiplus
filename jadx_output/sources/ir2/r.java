package ir2;

/* loaded from: classes2.dex */
public final class r implements ir2.x {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294212a;

    public r(ir2.e1 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f294212a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.r) && kotlin.jvm.internal.o.b(this.f294212a, ((ir2.r) obj).f294212a);
    }

    public int hashCode() {
        return this.f294212a.hashCode();
    }

    public java.lang.String toString() {
        return "FirstScreenEvent(data=" + this.f294212a + ')';
    }
}
