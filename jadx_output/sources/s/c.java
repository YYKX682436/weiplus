package s;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final b.c f401827a;

    public c(b.c cVar) {
        this.f401827a = cVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof s.c) {
            return ((s.c) obj).f401827a.asBinder().equals(this.f401827a.asBinder());
        }
        return false;
    }

    public int hashCode() {
        return this.f401827a.asBinder().hashCode();
    }
}
