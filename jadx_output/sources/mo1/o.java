package mo1;

/* loaded from: classes10.dex */
public final class o extends mo1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f330313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String message) {
        super(null);
        kotlin.jvm.internal.o.g(message, "message");
        this.f330313a = message;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo1.o) && kotlin.jvm.internal.o.b(this.f330313a, ((mo1.o) obj).f330313a);
    }

    public int hashCode() {
        return this.f330313a.hashCode();
    }

    public java.lang.String toString() {
        return "Error(message=" + this.f330313a + ')';
    }
}
