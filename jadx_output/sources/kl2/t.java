package kl2;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f308814a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f308815b;

    public t(long j17, boolean z17) {
        this.f308814a = j17;
        this.f308815b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2.t)) {
            return false;
        }
        kl2.t tVar = (kl2.t) obj;
        return this.f308814a == tVar.f308814a && this.f308815b == tVar.f308815b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f308814a) * 31) + java.lang.Boolean.hashCode(this.f308815b);
    }

    public java.lang.String toString() {
        return "ItemData(content=" + this.f308814a + ", isSelect=" + this.f308815b + ')';
    }
}
