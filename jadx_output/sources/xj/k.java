package xj;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f454751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f454752b;

    public k(boolean z17, int i17) {
        this.f454751a = z17;
        this.f454752b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.k)) {
            return false;
        }
        xj.k kVar = (xj.k) obj;
        return this.f454751a == kVar.f454751a && this.f454752b == kVar.f454752b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f454751a) * 31) + java.lang.Integer.hashCode(this.f454752b);
    }

    public java.lang.String toString() {
        return "AdExptInfo(open=" + this.f454751a + ", groupId=" + this.f454752b + ')';
    }
}
