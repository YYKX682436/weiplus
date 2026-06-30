package cw2;

/* loaded from: classes10.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public long f223790a;

    /* renamed from: b, reason: collision with root package name */
    public int f223791b;

    /* renamed from: c, reason: collision with root package name */
    public int f223792c;

    /* renamed from: d, reason: collision with root package name */
    public int f223793d;

    public j9(long j17, int i17, int i18, int i19) {
        this.f223790a = j17;
        this.f223791b = i17;
        this.f223792c = i18;
        this.f223793d = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.j9)) {
            return false;
        }
        cw2.j9 j9Var = (cw2.j9) obj;
        return this.f223790a == j9Var.f223790a && this.f223791b == j9Var.f223791b && this.f223792c == j9Var.f223792c && this.f223793d == j9Var.f223793d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f223790a) * 31) + java.lang.Integer.hashCode(this.f223791b)) * 31) + java.lang.Integer.hashCode(this.f223792c)) * 31) + java.lang.Integer.hashCode(this.f223793d);
    }

    public java.lang.String toString() {
        return "PlayTaskResult(hitPreloadSize=" + this.f223790a + ", notStartDownloaderInPlayCount=" + this.f223791b + ", lessMinBufferCount=" + this.f223792c + ", preloadCount=" + this.f223793d + ')';
    }
}
