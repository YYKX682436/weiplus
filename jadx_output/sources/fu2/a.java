package fu2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f266872a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f266873b;

    public a(android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f266872a = bitmap;
        this.f266873b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fu2.a)) {
            return false;
        }
        fu2.a aVar = (fu2.a) obj;
        return kotlin.jvm.internal.o.b(this.f266872a, aVar.f266872a) && kotlin.jvm.internal.o.b(this.f266873b, aVar.f266873b);
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f266872a;
        int hashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        java.lang.String str = this.f266873b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CoverData(coverBitmap=" + this.f266872a + ", coverKey=" + this.f266873b + ')';
    }
}
