package ee1;

/* loaded from: classes4.dex */
public final class d extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f251576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String reason) {
        super(null);
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f251576a = reason;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee1.d) && kotlin.jvm.internal.o.b(this.f251576a, ((ee1.d) obj).f251576a);
    }

    public int hashCode() {
        return this.f251576a.hashCode();
    }

    public java.lang.String toString() {
        return "Timeout(reason=" + this.f251576a + ')';
    }
}
