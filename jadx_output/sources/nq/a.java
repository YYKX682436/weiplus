package nq;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f338857a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338858b;

    /* renamed from: c, reason: collision with root package name */
    public final int f338859c;

    /* renamed from: d, reason: collision with root package name */
    public final int f338860d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338861e;

    public a(int i17, int i18, int i19, int i27, int i28) {
        this.f338857a = i17;
        this.f338858b = i18;
        this.f338859c = i19;
        this.f338860d = i27;
        this.f338861e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof nq.a) {
                nq.a aVar = (nq.a) obj;
                if (this.f338857a == aVar.f338857a) {
                    if (this.f338858b == aVar.f338858b) {
                        if (this.f338859c == aVar.f338859c) {
                            if (this.f338860d == aVar.f338860d) {
                                if (this.f338861e == aVar.f338861e) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.f338857a * 31) + this.f338858b) * 31) + this.f338859c) * 31) + this.f338860d) * 31) + this.f338861e;
    }

    public java.lang.String toString() {
        return "ColorInfo(particleColor1=" + this.f338857a + ", particleColor2=" + this.f338858b + ", particleColor3=" + this.f338859c + ", bgColor1=" + this.f338860d + ", bgColor2=" + this.f338861e + ")";
    }
}
