package dx0;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f244467a;

    /* renamed from: b, reason: collision with root package name */
    public final int f244468b;

    public p(android.graphics.Bitmap bitmap, int i17) {
        this.f244467a = bitmap;
        this.f244468b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0.p)) {
            return false;
        }
        dx0.p pVar = (dx0.p) obj;
        return kotlin.jvm.internal.o.b(this.f244467a, pVar.f244467a) && this.f244468b == pVar.f244468b;
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f244467a;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + java.lang.Integer.hashCode(this.f244468b);
    }

    public java.lang.String toString() {
        return "ThumbnailBitmapInfo(thumbnail=" + this.f244467a + ", orinentation=" + this.f244468b + ')';
    }
}
