package cz2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f224981a;

    /* renamed from: b, reason: collision with root package name */
    public final long f224982b;

    public a(int i17, long j17) {
        this.f224981a = i17;
        this.f224982b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2.a)) {
            return false;
        }
        cz2.a aVar = (cz2.a) obj;
        return this.f224981a == aVar.f224981a && this.f224982b == aVar.f224982b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f224981a) * 31) + java.lang.Long.hashCode(this.f224982b);
    }

    public java.lang.String toString() {
        return "ServerLimit(count=" + this.f224981a + ", time=" + this.f224982b + ')';
    }
}
