package pr4;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f357986a;

    public b(long j17) {
        this.f357986a = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr4.b) && this.f357986a == ((pr4.b) obj).f357986a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f357986a);
    }

    public java.lang.String toString() {
        return "ConsumeSuccessResult(balance=" + this.f357986a + ')';
    }
}
