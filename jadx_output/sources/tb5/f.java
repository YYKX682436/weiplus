package tb5;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public java.util.Map f417049a;

    public f(java.util.Map data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f417049a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb5.f) && kotlin.jvm.internal.o.b(this.f417049a, ((tb5.f) obj).f417049a);
    }

    public int hashCode() {
        return this.f417049a.hashCode();
    }

    public java.lang.String toString() {
        return "MethodCostInfo(data=" + this.f417049a + ')';
    }
}
