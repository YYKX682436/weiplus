package n0;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f333786a;

    public y2(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f333786a = key;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0.y2) && kotlin.jvm.internal.o.b(this.f333786a, ((n0.y2) obj).f333786a);
    }

    public int hashCode() {
        return this.f333786a.hashCode();
    }

    public java.lang.String toString() {
        return "OpaqueKey(key=" + this.f333786a + ')';
    }
}
