package z0;

/* loaded from: classes14.dex */
public final class e implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f468904a;

    public e(float f17) {
        this.f468904a = f17;
    }

    public int a(int i17, int i18, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        float f17 = (i18 - i17) / 2.0f;
        p2.s sVar = p2.s.Ltr;
        float f18 = this.f468904a;
        if (layoutDirection != sVar) {
            f18 *= -1;
        }
        return a06.d.b(f17 * (1 + f18));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0.e) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f468904a), java.lang.Float.valueOf(((z0.e) obj).f468904a));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f468904a);
    }

    public java.lang.String toString() {
        return "Horizontal(bias=" + this.f468904a + ')';
    }
}
