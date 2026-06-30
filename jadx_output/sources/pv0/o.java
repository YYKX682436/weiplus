package pv0;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f358540a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f358541b;

    public o(java.util.concurrent.atomic.AtomicInteger requestGroupCounter, boolean z17) {
        kotlin.jvm.internal.o.g(requestGroupCounter, "requestGroupCounter");
        this.f358540a = requestGroupCounter;
        this.f358541b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv0.o)) {
            return false;
        }
        pv0.o oVar = (pv0.o) obj;
        return kotlin.jvm.internal.o.b(this.f358540a, oVar.f358540a) && this.f358541b == oVar.f358541b;
    }

    public int hashCode() {
        return (this.f358540a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f358541b);
    }

    public java.lang.String toString() {
        return "InvokeFromOutsideMonitor(requestGroupCounter=" + this.f358540a + ", enable=" + this.f358541b + ')';
    }
}
