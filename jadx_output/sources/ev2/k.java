package ev2;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f256916a;

    /* renamed from: b, reason: collision with root package name */
    public final int f256917b;

    public k(long j17, int i17) {
        this.f256916a = j17;
        this.f256917b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        ev2.k kVar = obj instanceof ev2.k ? (ev2.k) obj : null;
        return kVar != null && kVar.f256916a == this.f256916a && kVar.f256917b == this.f256917b;
    }

    public int hashCode() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f256916a);
        sb6.append('_');
        sb6.append(this.f256917b);
        return sb6.toString().hashCode();
    }
}
