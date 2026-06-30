package lf3;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f318322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f318323b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f318324c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f318325d;

    public k(int i17, int i18, boolean z17, boolean z18) {
        this.f318322a = i17;
        this.f318323b = i18;
        this.f318324c = z17;
        this.f318325d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf3.k)) {
            return false;
        }
        lf3.k kVar = (lf3.k) obj;
        return this.f318322a == kVar.f318322a && this.f318323b == kVar.f318323b && this.f318324c == kVar.f318324c && this.f318325d == kVar.f318325d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f318322a) * 31) + java.lang.Integer.hashCode(this.f318323b)) * 31) + java.lang.Boolean.hashCode(this.f318324c)) * 31) + java.lang.Boolean.hashCode(this.f318325d);
    }

    public java.lang.String toString() {
        return "ImageParserInfo(width=" + this.f318322a + ", height=" + this.f318323b + ", isHorizontalLong=" + this.f318324c + ", isVerticalLong=" + this.f318325d + ')';
    }
}
