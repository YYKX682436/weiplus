package hp2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f282921a;

    /* renamed from: b, reason: collision with root package name */
    public final long f282922b;

    public b(int i17, long j17) {
        this.f282921a = i17;
        this.f282922b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp2.b)) {
            return false;
        }
        hp2.b bVar = (hp2.b) obj;
        return this.f282921a == bVar.f282921a && this.f282922b == bVar.f282922b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f282921a) * 31) + java.lang.Long.hashCode(this.f282922b);
    }

    public java.lang.String toString() {
        return "CachedTargetItem(pos=" + this.f282921a + ", itemId=" + this.f282922b + ')';
    }
}
