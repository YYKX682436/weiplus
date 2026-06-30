package yf5;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f461863a;

    /* renamed from: b, reason: collision with root package name */
    public int f461864b;

    public e(long j17, int i17) {
        this.f461863a = j17;
        this.f461864b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf5.e)) {
            return false;
        }
        yf5.e eVar = (yf5.e) obj;
        return this.f461863a == eVar.f461863a && this.f461864b == eVar.f461864b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f461863a) * 31) + java.lang.Integer.hashCode(this.f461864b);
    }

    public java.lang.String toString() {
        return "FlagVersion(flag=" + this.f461863a + ", version=" + this.f461864b + ')';
    }
}
