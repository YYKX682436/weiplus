package qx3;

/* loaded from: classes10.dex */
public final class e extends qx3.g {

    /* renamed from: a, reason: collision with root package name */
    public final long f367351a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367352b;

    public e(long j17, int i17) {
        super(null);
        this.f367351a = j17;
        this.f367352b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qx3.e)) {
            return false;
        }
        qx3.e eVar = (qx3.e) obj;
        return this.f367351a == eVar.f367351a && this.f367352b == eVar.f367352b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f367351a) * 31) + java.lang.Integer.hashCode(this.f367352b);
    }

    public java.lang.String toString() {
        return "onNewState(id=" + this.f367351a + ", uiState=" + this.f367352b + ')';
    }
}
