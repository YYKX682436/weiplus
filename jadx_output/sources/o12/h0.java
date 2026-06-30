package o12;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f342154a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f342155b;

    public h0(long j17, android.graphics.Bitmap bitmap, int i17, kotlin.jvm.internal.i iVar) {
        bitmap = (i17 & 2) != 0 ? null : bitmap;
        this.f342154a = j17;
        this.f342155b = bitmap;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o12.h0)) {
            return false;
        }
        o12.h0 h0Var = (o12.h0) obj;
        return this.f342154a == h0Var.f342154a && kotlin.jvm.internal.o.b(this.f342155b, h0Var.f342155b);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f342154a) * 31;
        android.graphics.Bitmap bitmap = this.f342155b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public java.lang.String toString() {
        return "Frame(time=" + this.f342154a + ", bitmap=" + this.f342155b + ')';
    }
}
