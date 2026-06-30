package yc0;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f460752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f460753b;

    public e(boolean z17, int i17) {
        this.f460752a = z17;
        this.f460753b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc0.e)) {
            return false;
        }
        yc0.e eVar = (yc0.e) obj;
        return this.f460752a == eVar.f460752a && this.f460753b == eVar.f460753b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f460752a) * 31) + java.lang.Integer.hashCode(this.f460753b);
    }

    public java.lang.String toString() {
        return "RemuxResult(result=" + this.f460752a + ", errCode=" + this.f460753b + ')';
    }
}
