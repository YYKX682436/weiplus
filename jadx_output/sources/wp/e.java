package wp;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f448358a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f448359b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f448360c;

    public e(android.graphics.Bitmap bitmap, android.graphics.Rect sourceRect, android.graphics.Rect destRect) {
        kotlin.jvm.internal.o.g(sourceRect, "sourceRect");
        kotlin.jvm.internal.o.g(destRect, "destRect");
        this.f448358a = bitmap;
        this.f448359b = sourceRect;
        this.f448360c = destRect;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp.e)) {
            return false;
        }
        wp.e eVar = (wp.e) obj;
        return kotlin.jvm.internal.o.b(this.f448358a, eVar.f448358a) && kotlin.jvm.internal.o.b(this.f448359b, eVar.f448359b) && kotlin.jvm.internal.o.b(this.f448360c, eVar.f448360c);
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f448358a;
        return ((((bitmap == null ? 0 : bitmap.hashCode()) * 31) + this.f448359b.hashCode()) * 31) + this.f448360c.hashCode();
    }

    public java.lang.String toString() {
        return "Mask(maskBitmap=" + this.f448358a + ", sourceRect=" + this.f448359b + ", destRect=" + this.f448360c + ')';
    }
}
