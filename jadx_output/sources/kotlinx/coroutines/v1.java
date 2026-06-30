package kotlinx.coroutines;

/* loaded from: classes14.dex */
public final class v1 implements kotlinx.coroutines.k2 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f310683d;

    public v1(boolean z17) {
        this.f310683d = z17;
    }

    @Override // kotlinx.coroutines.k2
    public boolean a() {
        return this.f310683d;
    }

    @Override // kotlinx.coroutines.k2
    public kotlinx.coroutines.h3 f() {
        return null;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Empty{");
        sb6.append(this.f310683d ? "Active" : "New");
        sb6.append('}');
        return sb6.toString();
    }
}
