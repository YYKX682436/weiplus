package mo1;

/* loaded from: classes10.dex */
public final class q extends mo1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f330322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.util.List data) {
        super(null);
        kotlin.jvm.internal.o.g(data, "data");
        this.f330322a = data;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo1.q) && kotlin.jvm.internal.o.b(this.f330322a, ((mo1.q) obj).f330322a);
    }

    public int hashCode() {
        return this.f330322a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(data=" + this.f330322a + ')';
    }
}
