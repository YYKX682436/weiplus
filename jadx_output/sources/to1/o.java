package to1;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final long f420927a;

    /* renamed from: b, reason: collision with root package name */
    public final long f420928b;

    public o(long j17, long j18) {
        this.f420927a = j17;
        this.f420928b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to1.o)) {
            return false;
        }
        to1.o oVar = (to1.o) obj;
        return this.f420927a == oVar.f420927a && this.f420928b == oVar.f420928b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f420927a) * 31) + java.lang.Long.hashCode(this.f420928b);
    }

    public java.lang.String toString() {
        return "StateInfo(length=" + this.f420927a + ", lastModified=" + this.f420928b + ')';
    }
}
