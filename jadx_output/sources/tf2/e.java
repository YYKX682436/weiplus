package tf2;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f418914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f418915b;

    public e(int i17, int i18) {
        this.f418914a = i17;
        this.f418915b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.e)) {
            return false;
        }
        tf2.e eVar = (tf2.e) obj;
        return this.f418914a == eVar.f418914a && this.f418915b == eVar.f418915b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f418914a) * 31) + java.lang.Integer.hashCode(this.f418915b);
    }

    public java.lang.String toString() {
        return "ShowingPagLocation(marginLeft=" + this.f418914a + ", marginTop=" + this.f418915b + ')';
    }
}
