package hw;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final int f285424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f285426c;

    /* renamed from: d, reason: collision with root package name */
    public final int f285427d;

    /* renamed from: e, reason: collision with root package name */
    public final int f285428e;

    public r(int i17, int i18, int i19, int i27, int i28) {
        this.f285424a = i17;
        this.f285425b = i18;
        this.f285426c = i19;
        this.f285427d = i27;
        this.f285428e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw.r)) {
            return false;
        }
        hw.r rVar = (hw.r) obj;
        return this.f285424a == rVar.f285424a && this.f285425b == rVar.f285425b && this.f285426c == rVar.f285426c && this.f285427d == rVar.f285427d && this.f285428e == rVar.f285428e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f285424a) * 31) + java.lang.Integer.hashCode(this.f285425b)) * 31) + java.lang.Integer.hashCode(this.f285426c)) * 31) + java.lang.Integer.hashCode(this.f285427d)) * 31) + java.lang.Integer.hashCode(this.f285428e);
    }

    public java.lang.String toString() {
        return "BrandCoverViewAttribute(left=" + this.f285424a + ", top=" + this.f285425b + ", width=" + this.f285426c + ", height=" + this.f285427d + ", hide=" + this.f285428e + ')';
    }
}
