package zv3;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f476427a;

    /* renamed from: b, reason: collision with root package name */
    public final long f476428b;

    public a(android.graphics.Bitmap bitmap, long j17) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f476427a = bitmap;
        this.f476428b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv3.a)) {
            return false;
        }
        zv3.a aVar = (zv3.a) obj;
        return kotlin.jvm.internal.o.b(this.f476427a, aVar.f476427a) && this.f476428b == aVar.f476428b;
    }

    public int hashCode() {
        return (this.f476427a.hashCode() * 31) + java.lang.Long.hashCode(this.f476428b);
    }

    public java.lang.String toString() {
        return "FrameInfo(bitmap=" + this.f476427a + ", frameDuration=" + this.f476428b + ')';
    }
}
