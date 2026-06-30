package ln2;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.kv1 f319890a;

    /* renamed from: b, reason: collision with root package name */
    public long f319891b;

    /* renamed from: c, reason: collision with root package name */
    public final long f319892c;

    public f(r45.kv1 gift, long j17, long j18) {
        kotlin.jvm.internal.o.g(gift, "gift");
        this.f319890a = gift;
        this.f319891b = j17;
        this.f319892c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln2.f)) {
            return false;
        }
        ln2.f fVar = (ln2.f) obj;
        return kotlin.jvm.internal.o.b(this.f319890a, fVar.f319890a) && this.f319891b == fVar.f319891b && this.f319892c == fVar.f319892c;
    }

    public int hashCode() {
        return (((this.f319890a.hashCode() * 31) + java.lang.Long.hashCode(this.f319891b)) * 31) + java.lang.Long.hashCode(this.f319892c);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("name: ");
        r45.kv1 kv1Var = this.f319890a;
        sb6.append(kv1Var.getString(8));
        sb6.append(" price: ");
        sb6.append(kv1Var.getFloat(9));
        sb6.append(" target: ");
        sb6.append(this.f319891b);
        sb6.append(" curCount: ");
        sb6.append(this.f319892c);
        return sb6.toString();
    }
}
