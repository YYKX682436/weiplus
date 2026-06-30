package vo4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f438595a;

    /* renamed from: b, reason: collision with root package name */
    public int f438596b;

    /* renamed from: c, reason: collision with root package name */
    public int f438597c;

    /* renamed from: d, reason: collision with root package name */
    public int f438598d;

    /* renamed from: e, reason: collision with root package name */
    public int f438599e;

    /* renamed from: f, reason: collision with root package name */
    public int f438600f;

    /* renamed from: g, reason: collision with root package name */
    public int f438601g;

    public a(int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        this.f438595a = i17;
        this.f438596b = i18;
        this.f438597c = i19;
        this.f438598d = i27;
        this.f438599e = i28;
        this.f438600f = i29;
        this.f438601g = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo4.a)) {
            return false;
        }
        vo4.a aVar = (vo4.a) obj;
        return this.f438595a == aVar.f438595a && this.f438596b == aVar.f438596b && this.f438597c == aVar.f438597c && this.f438598d == aVar.f438598d && this.f438599e == aVar.f438599e && this.f438600f == aVar.f438600f && this.f438601g == aVar.f438601g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f438595a) * 31) + java.lang.Integer.hashCode(this.f438596b)) * 31) + java.lang.Integer.hashCode(this.f438597c)) * 31) + java.lang.Integer.hashCode(this.f438598d)) * 31) + java.lang.Integer.hashCode(this.f438599e)) * 31) + java.lang.Integer.hashCode(this.f438600f)) * 31) + java.lang.Integer.hashCode(this.f438601g);
    }

    public java.lang.String toString() {
        return "MaterialCacheInfo(width=" + this.f438595a + ", height=" + this.f438596b + ", rotate=" + this.f438597c + ", cropLeft=" + this.f438598d + ", cropTop=" + this.f438599e + ", cropRight=" + this.f438600f + ", cropBottom=" + this.f438601g + ')';
    }
}
