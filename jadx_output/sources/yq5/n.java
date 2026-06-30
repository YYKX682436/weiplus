package yq5;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final yq5.n f464614b = new yq5.n(200, 8);

    /* renamed from: c, reason: collision with root package name */
    public static final yq5.n f464615c = new yq5.n(0, 8);

    /* renamed from: a, reason: collision with root package name */
    public final long f464616a;

    public n(long j17, long j18) {
        this.f464616a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yq5.n) {
            return this.f464616a == ((yq5.n) obj).f464616a;
        }
        return false;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f464616a) * 31) + java.lang.Long.hashCode(8L);
    }

    public java.lang.String toString() {
        return "TileAnimationSpec(duration=" + this.f464616a + ", interval=8)";
    }
}
