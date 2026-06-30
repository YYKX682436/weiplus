package zd1;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f471543a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Bitmap f471544b;

    public l(int i17, android.graphics.Bitmap bitmap) {
        this.f471543a = i17;
        this.f471544b = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd1.l)) {
            return false;
        }
        zd1.l lVar = (zd1.l) obj;
        return this.f471543a == lVar.f471543a && kotlin.jvm.internal.o.b(this.f471544b, lVar.f471544b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f471543a) * 31;
        android.graphics.Bitmap bitmap = this.f471544b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "ScreenshotBitmapDescriptor(top=" + this.f471543a + ", bitmap=" + this.f471544b + ')';
    }
}
