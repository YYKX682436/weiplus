package n2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f334206a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f334207b;

    public c(java.lang.Object current, java.lang.Object target) {
        kotlin.jvm.internal.o.g(current, "current");
        kotlin.jvm.internal.o.g(target, "target");
        this.f334206a = current;
        this.f334207b = target;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2.c)) {
            return false;
        }
        n2.c cVar = (n2.c) obj;
        return kotlin.jvm.internal.o.b(this.f334206a, cVar.f334206a) && kotlin.jvm.internal.o.b(this.f334207b, cVar.f334207b);
    }

    public int hashCode() {
        return (this.f334206a.hashCode() * 31) + this.f334207b.hashCode();
    }

    public java.lang.String toString() {
        return "TransitionState(current=" + this.f334206a + ", target=" + this.f334207b + ')';
    }
}
