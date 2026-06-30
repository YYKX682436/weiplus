package ee1;

/* loaded from: classes4.dex */
public final class b extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f251571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f251572b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f251573c;

    public b(int i17, int i18, java.lang.String str) {
        super(null);
        this.f251571a = i17;
        this.f251572b = i18;
        this.f251573c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.b)) {
            return false;
        }
        ee1.b bVar = (ee1.b) obj;
        return this.f251571a == bVar.f251571a && this.f251572b == bVar.f251572b && kotlin.jvm.internal.o.b(this.f251573c, bVar.f251573c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f251571a) * 31) + java.lang.Integer.hashCode(this.f251572b)) * 31;
        java.lang.String str = this.f251573c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "NetworkError(errType=" + this.f251571a + ", errCode=" + this.f251572b + ", errMsg=" + this.f251573c + ')';
    }
}
