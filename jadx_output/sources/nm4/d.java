package nm4;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f338485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f338486b;

    public d(android.graphics.Bitmap bitmap, int i17) {
        this.f338485a = bitmap;
        this.f338486b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm4.d)) {
            return false;
        }
        nm4.d dVar = (nm4.d) obj;
        return kotlin.jvm.internal.o.b(this.f338485a, dVar.f338485a) && this.f338486b == dVar.f338486b;
    }

    public int hashCode() {
        android.graphics.Bitmap bitmap = this.f338485a;
        return ((bitmap == null ? 0 : bitmap.hashCode()) * 31) + java.lang.Integer.hashCode(this.f338486b);
    }

    public java.lang.String toString() {
        return "PagCoverBitmap(coverBitmap=" + this.f338485a + ", index=" + this.f338486b + ')';
    }
}
