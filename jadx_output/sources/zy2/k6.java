package zy2;

/* loaded from: classes2.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f477437c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.Size f477438d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f477439e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f477440f;

    public k6(java.lang.String dynamicImage, int i17, int i18, android.util.Size size, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(dynamicImage, "dynamicImage");
        kotlin.jvm.internal.o.g(size, "size");
        this.f477435a = dynamicImage;
        this.f477436b = i17;
        this.f477437c = i18;
        this.f477438d = size;
        this.f477439e = z17;
        this.f477440f = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.k6)) {
            return false;
        }
        zy2.k6 k6Var = (zy2.k6) obj;
        return kotlin.jvm.internal.o.b(this.f477435a, k6Var.f477435a) && this.f477436b == k6Var.f477436b && this.f477437c == k6Var.f477437c && kotlin.jvm.internal.o.b(this.f477438d, k6Var.f477438d) && this.f477439e == k6Var.f477439e && this.f477440f == k6Var.f477440f;
    }

    public int hashCode() {
        return (((((((((this.f477435a.hashCode() * 31) + java.lang.Integer.hashCode(this.f477436b)) * 31) + java.lang.Integer.hashCode(this.f477437c)) * 31) + this.f477438d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f477439e)) * 31) + java.lang.Boolean.hashCode(this.f477440f);
    }

    public java.lang.String toString() {
        return "DynamicImage(dynamicImage=" + this.f477435a + ", lightColor=" + this.f477436b + ", darkColor=" + this.f477437c + ", size=" + this.f477438d + ", hasLightColor=" + this.f477439e + ", hasDarkColor=" + this.f477440f + ')';
    }
}
