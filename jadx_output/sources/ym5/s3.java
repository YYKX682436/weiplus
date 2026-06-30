package ym5;

/* loaded from: classes2.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f463516a;

    /* renamed from: b, reason: collision with root package name */
    public int f463517b;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463519d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463520e;

    /* renamed from: h, reason: collision with root package name */
    public int f463523h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f463524i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f463525j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f463526k;

    /* renamed from: l, reason: collision with root package name */
    public int f463527l;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f463518c = "";

    /* renamed from: f, reason: collision with root package name */
    public boolean f463521f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f463522g = true;

    public s3(int i17) {
        this.f463516a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ym5.s3) && this.f463516a == ((ym5.s3) obj).f463516a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f463516a);
    }

    public java.lang.String toString() {
        return "(actionType=" + this.f463516a + ", reasonType=" + this.f463517b + ", extra=" + this.f463519d + ", hasAnyMore=" + this.f463521f + ", isAnim=" + this.f463522g + ", remainSize=" + this.f463523h + " isFooterVisible=" + this.f463524i + ",extraData=" + this.f463520e + ')';
    }
}
