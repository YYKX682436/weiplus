package n0;

/* loaded from: classes3.dex */
public final class g5 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f333519d;

    public g5(java.lang.Object obj) {
        this.f333519d = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0.g5) {
            return kotlin.jvm.internal.o.b(this.f333519d, ((n0.g5) obj).f333519d);
        }
        return false;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f333519d;
    }

    public int hashCode() {
        java.lang.Object obj = this.f333519d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "StaticValueHolder(value=" + this.f333519d + ')';
    }
}
