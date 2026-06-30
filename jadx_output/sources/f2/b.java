package f2;

/* loaded from: classes14.dex */
public final class b implements f2.x {

    /* renamed from: b, reason: collision with root package name */
    public final int f258791b;

    public b(int i17) {
        this.f258791b = i17;
    }

    @Override // f2.x
    public int a(int i17) {
        return i17;
    }

    @Override // f2.x
    public f2.r b(f2.r fontWeight) {
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        int i17 = this.f258791b;
        return (i17 == 0 || i17 == Integer.MAX_VALUE) ? fontWeight : new f2.r(e06.p.f(fontWeight.f258825d + i17, 1, 1000));
    }

    @Override // f2.x
    public f2.h c(f2.h hVar) {
        return hVar;
    }

    @Override // f2.x
    public int d(int i17) {
        return i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2.b) && this.f258791b == ((f2.b) obj).f258791b;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f258791b);
    }

    public java.lang.String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f258791b + ')';
    }
}
