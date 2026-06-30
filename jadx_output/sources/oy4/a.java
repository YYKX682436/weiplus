package oy4;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f350051a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.Buffer f350052b;

    public a(android.graphics.Bitmap bitmap, java.nio.Buffer buffer) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f350051a = bitmap;
        this.f350052b = buffer;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4.a)) {
            return false;
        }
        oy4.a aVar = (oy4.a) obj;
        return kotlin.jvm.internal.o.b(this.f350051a, aVar.f350051a) && kotlin.jvm.internal.o.b(this.f350052b, aVar.f350052b);
    }

    public int hashCode() {
        return (this.f350051a.hashCode() * 31) + this.f350052b.hashCode();
    }

    public java.lang.String toString() {
        return "BufferResult(bitmap=" + this.f350051a + ", buffer=" + this.f350052b + ')';
    }
}
