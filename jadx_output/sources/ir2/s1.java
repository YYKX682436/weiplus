package ir2;

/* loaded from: classes2.dex */
public final class s1 implements ir2.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final ir2.e1 f294217a;

    public s1(ir2.e1 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f294217a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2.s1) && kotlin.jvm.internal.o.b(this.f294217a, ((ir2.s1) obj).f294217a);
    }

    public int hashCode() {
        return this.f294217a.hashCode();
    }

    public java.lang.String toString() {
        return "FirstScreenState(data=" + this.f294217a + ')';
    }
}
