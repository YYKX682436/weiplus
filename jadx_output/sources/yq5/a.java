package yq5;

/* loaded from: classes11.dex */
public class a implements yq5.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f464588a;

    public a(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f464588a = bitmap;
        bitmap.getWidth();
        bitmap.getHeight();
        bitmap.getByteCount();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.a.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f464588a, ((yq5.a) obj).f464588a);
    }

    public int hashCode() {
        return this.f464588a.hashCode();
    }

    public java.lang.String toString() {
        return "BitmapTileImage(bitmap=" + yq5.o.a(this.f464588a) + ')';
    }
}
