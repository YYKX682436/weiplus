package f4;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f259412a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f259413b;

    public v(java.lang.String stateName, java.lang.String state) {
        kotlin.jvm.internal.o.g(stateName, "stateName");
        kotlin.jvm.internal.o.g(state, "state");
        this.f259412a = stateName;
        this.f259413b = state;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(f4.v.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.metrics.performance.StateInfo");
        f4.v vVar = (f4.v) obj;
        return kotlin.jvm.internal.o.b(this.f259412a, vVar.f259412a) && kotlin.jvm.internal.o.b(this.f259413b, vVar.f259413b);
    }

    public int hashCode() {
        return (this.f259412a.hashCode() * 31) + this.f259413b.hashCode();
    }

    public java.lang.String toString() {
        return this.f259412a + ": " + this.f259413b;
    }
}
