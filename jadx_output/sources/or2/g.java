package or2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f347626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f347627b;

    public g(long j17, int i17) {
        this.f347626a = j17;
        this.f347627b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or2.g)) {
            return false;
        }
        or2.g gVar = (or2.g) obj;
        return this.f347626a == gVar.f347626a && this.f347627b == gVar.f347627b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f347626a) * 31) + java.lang.Integer.hashCode(this.f347627b);
    }

    public java.lang.String toString() {
        return "Frame(frameTimeNs=" + this.f347626a + ", frameType=" + this.f347627b + ')';
    }
}
