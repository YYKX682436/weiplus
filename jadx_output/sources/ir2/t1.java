package ir2;

/* loaded from: classes2.dex */
public final class t1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294223a;

    public t1(ir2.e1 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f294223a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.t1) && kotlin.jvm.internal.o.b(this.f294223a, ((ir2.t1) obj).f294223a);
    }

    public int hashCode() {
        return this.f294223a.hashCode();
    }

    public java.lang.String toString() {
        return "LoadedMoreState(data=" + this.f294223a + ')';
    }
}
