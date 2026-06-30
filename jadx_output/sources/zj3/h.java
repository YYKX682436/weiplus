package zj3;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f473325a;

    /* renamed from: b, reason: collision with root package name */
    public long f473326b;

    /* renamed from: c, reason: collision with root package name */
    public int f473327c;

    public h(int i17, long j17, int i18) {
        this.f473325a = i17;
        this.f473326b = j17;
        this.f473327c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj3.h)) {
            return false;
        }
        zj3.h hVar = (zj3.h) obj;
        return this.f473325a == hVar.f473325a && this.f473326b == hVar.f473326b && this.f473327c == hVar.f473327c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f473325a) * 31) + java.lang.Long.hashCode(this.f473326b)) * 31) + java.lang.Integer.hashCode(this.f473327c);
    }

    public java.lang.String toString() {
        return "CostInfo(idx=" + this.f473325a + ", totalCost=" + this.f473326b + ", times=" + this.f473327c + ')';
    }
}
