package zx4;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f477170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477171b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f477172c;

    public p(int i17, int i18, android.graphics.Bitmap bitmap) {
        this.f477170a = i17;
        this.f477171b = i18;
        this.f477172c = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4.p)) {
            return false;
        }
        zx4.p pVar = (zx4.p) obj;
        return this.f477170a == pVar.f477170a && this.f477171b == pVar.f477171b && kotlin.jvm.internal.o.b(this.f477172c, pVar.f477172c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f477170a) * 31) + java.lang.Integer.hashCode(this.f477171b)) * 31;
        android.graphics.Bitmap bitmap = this.f477172c;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "ScreenshotBitmapDescriptor(top=" + this.f477170a + ", bitmapHeight=" + this.f477171b + ", bitmap=" + this.f477172c + ')';
    }
}
