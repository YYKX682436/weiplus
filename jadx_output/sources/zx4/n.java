package zx4;

/* loaded from: classes8.dex */
public final class n extends zx4.o {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f477167a;

    /* renamed from: b, reason: collision with root package name */
    public final int f477168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f477169c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.graphics.Bitmap bitmap, int i17, int i18) {
        super(null);
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        this.f477167a = bitmap;
        this.f477168b = i17;
        this.f477169c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx4.n)) {
            return false;
        }
        zx4.n nVar = (zx4.n) obj;
        return kotlin.jvm.internal.o.b(this.f477167a, nVar.f477167a) && this.f477168b == nVar.f477168b && this.f477169c == nVar.f477169c;
    }

    public int hashCode() {
        return (((this.f477167a.hashCode() * 31) + java.lang.Integer.hashCode(this.f477168b)) * 31) + java.lang.Integer.hashCode(this.f477169c);
    }

    public java.lang.String toString() {
        return "Success(bitmap=" + this.f477167a + ", width=" + this.f477168b + ", height=" + this.f477169c + ')';
    }
}
