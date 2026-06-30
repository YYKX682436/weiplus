package mz4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f333284a;

    /* renamed from: b, reason: collision with root package name */
    public final int f333285b;

    public i(int i17, int i18) {
        this.f333284a = i17;
        this.f333285b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz4.i)) {
            return false;
        }
        mz4.i iVar = (mz4.i) obj;
        return this.f333284a == iVar.f333284a && this.f333285b == iVar.f333285b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f333284a) * 31) + java.lang.Integer.hashCode(this.f333285b);
    }

    public java.lang.String toString() {
        return "InsertResult(pos=" + this.f333284a + ", subOffset=" + this.f333285b + ')';
    }
}
