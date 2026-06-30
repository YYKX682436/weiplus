package o2;

/* loaded from: classes14.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f342358a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342359b;

    /* renamed from: c, reason: collision with root package name */
    public final int f342360c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f342361d;

    /* renamed from: e, reason: collision with root package name */
    public final int f342362e;

    public k(int i17, int i18, int i19, java.lang.String str, int i27) {
        this.f342358a = i17;
        this.f342359b = i18;
        this.f342360c = i19;
        this.f342361d = str;
        this.f342362e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2.k)) {
            return false;
        }
        o2.k kVar = (o2.k) obj;
        return this.f342358a == kVar.f342358a && this.f342359b == kVar.f342359b && this.f342360c == kVar.f342360c && kotlin.jvm.internal.o.b(this.f342361d, kVar.f342361d) && this.f342362e == kVar.f342362e;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f342358a) * 31) + java.lang.Integer.hashCode(this.f342359b)) * 31) + java.lang.Integer.hashCode(this.f342360c)) * 31;
        java.lang.String str = this.f342361d;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Integer.hashCode(this.f342362e);
    }

    public java.lang.String toString() {
        return "SourceLocation(lineNumber=" + this.f342358a + ", offset=" + this.f342359b + ", length=" + this.f342360c + ", sourceFile=" + this.f342361d + ", packageHash=" + this.f342362e + ')';
    }
}
