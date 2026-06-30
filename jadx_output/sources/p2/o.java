package p2;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f351391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f351392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f351393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f351394d;

    public o(int i17, int i18, int i19, int i27) {
        this.f351391a = i17;
        this.f351392b = i18;
        this.f351393c = i19;
        this.f351394d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2.o)) {
            return false;
        }
        p2.o oVar = (p2.o) obj;
        return this.f351391a == oVar.f351391a && this.f351392b == oVar.f351392b && this.f351393c == oVar.f351393c && this.f351394d == oVar.f351394d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f351391a) * 31) + java.lang.Integer.hashCode(this.f351392b)) * 31) + java.lang.Integer.hashCode(this.f351393c)) * 31) + java.lang.Integer.hashCode(this.f351394d);
    }

    public java.lang.String toString() {
        return "IntRect.fromLTRB(" + this.f351391a + ", " + this.f351392b + ", " + this.f351393c + ", " + this.f351394d + ')';
    }
}
