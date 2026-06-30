package w6;

/* loaded from: classes13.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final m7.f f443131a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f443132b;

    public k0(m7.f fVar, java.util.concurrent.Executor executor) {
        this.f443131a = fVar;
        this.f443132b = executor;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof w6.k0) {
            return this.f443131a.equals(((w6.k0) obj).f443131a);
        }
        return false;
    }

    public int hashCode() {
        return this.f443131a.hashCode();
    }
}
