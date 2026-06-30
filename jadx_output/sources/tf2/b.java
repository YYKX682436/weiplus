package tf2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ps0.a f418896a;

    /* renamed from: b, reason: collision with root package name */
    public final p05.y0 f418897b;

    public b(ps0.a process, p05.y0 effect) {
        kotlin.jvm.internal.o.g(process, "process");
        kotlin.jvm.internal.o.g(effect, "effect");
        this.f418896a = process;
        this.f418897b = effect;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.b)) {
            return false;
        }
        tf2.b bVar = (tf2.b) obj;
        return kotlin.jvm.internal.o.b(this.f418896a, bVar.f418896a) && kotlin.jvm.internal.o.b(this.f418897b, bVar.f418897b);
    }

    public int hashCode() {
        return (this.f418896a.hashCode() * 31) + this.f418897b.hashCode();
    }

    public java.lang.String toString() {
        return "WeVisionInstance(process=" + this.f418896a + ", effect=" + this.f418897b + ')';
    }
}
