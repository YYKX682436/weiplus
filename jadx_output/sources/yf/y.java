package yf;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final int f461471a;

    /* renamed from: b, reason: collision with root package name */
    public final int f461472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f461473c;

    public y(int i17, int i18, int i19) {
        this.f461471a = i17;
        this.f461472b = i18;
        this.f461473c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf.y)) {
            return false;
        }
        yf.y yVar = (yf.y) obj;
        return this.f461471a == yVar.f461471a && this.f461472b == yVar.f461472b && this.f461473c == yVar.f461473c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f461471a) * 31) + java.lang.Integer.hashCode(this.f461472b)) * 31) + java.lang.Integer.hashCode(this.f461473c);
    }

    public java.lang.String toString() {
        return "Color(colorR=" + this.f461471a + ", colorG=" + this.f461472b + ", colorB=" + this.f461473c + ')';
    }
}
