package tl5;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f420367a;

    /* renamed from: b, reason: collision with root package name */
    public final float f420368b;

    public k(boolean z17, float f17) {
        this.f420367a = z17;
        this.f420368b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.k)) {
            return false;
        }
        tl5.k kVar = (tl5.k) obj;
        return this.f420367a == kVar.f420367a && java.lang.Float.compare(this.f420368b, kVar.f420368b) == 0;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f420367a) * 31) + java.lang.Float.hashCode(this.f420368b);
    }

    public java.lang.String toString() {
        return "PendingEndRequest(applied=" + this.f420367a + ", finalProgress=" + this.f420368b + ')';
    }
}
