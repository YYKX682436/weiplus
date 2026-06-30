package cw2;

/* loaded from: classes10.dex */
public final class k9 {

    /* renamed from: a, reason: collision with root package name */
    public int f223808a;

    /* renamed from: b, reason: collision with root package name */
    public int f223809b;

    /* renamed from: c, reason: collision with root package name */
    public int f223810c;

    /* renamed from: d, reason: collision with root package name */
    public long f223811d;

    public k9(int i17, int i18, int i19, long j17) {
        this.f223808a = i17;
        this.f223809b = i18;
        this.f223810c = i19;
        this.f223811d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.k9)) {
            return false;
        }
        cw2.k9 k9Var = (cw2.k9) obj;
        return this.f223808a == k9Var.f223808a && this.f223809b == k9Var.f223809b && this.f223810c == k9Var.f223810c && this.f223811d == k9Var.f223811d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f223808a) * 31) + java.lang.Integer.hashCode(this.f223809b)) * 31) + java.lang.Integer.hashCode(this.f223810c)) * 31) + java.lang.Long.hashCode(this.f223811d);
    }

    public java.lang.String toString() {
        return "PreloadTaskResult(startCount=" + this.f223808a + ", stopCount=" + this.f223809b + ", completeCount=" + this.f223810c + ", preloadSize=" + this.f223811d + ')';
    }
}
