package gf5;

/* loaded from: classes11.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f271467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f271468b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.z f271469c;

    public y(int i17, int i18, gf5.z type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f271467a = i17;
        this.f271468b = i18;
        this.f271469c = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.y)) {
            return false;
        }
        gf5.y yVar = (gf5.y) obj;
        return this.f271467a == yVar.f271467a && this.f271468b == yVar.f271468b && this.f271469c == yVar.f271469c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f271467a) * 31) + java.lang.Integer.hashCode(this.f271468b)) * 31) + this.f271469c.hashCode();
    }

    public java.lang.String toString() {
        return "TokenSpan(start=" + this.f271467a + ", end=" + this.f271468b + ", type=" + this.f271469c + ')';
    }
}
