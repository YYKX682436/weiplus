package gm2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f273424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f273425b;

    /* renamed from: c, reason: collision with root package name */
    public int f273426c;

    public l(android.graphics.drawable.BitmapDrawable bitmapDrawable, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        bitmapDrawable = (i19 & 1) != 0 ? null : bitmapDrawable;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        this.f273424a = bitmapDrawable;
        this.f273425b = i17;
        this.f273426c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.l)) {
            return false;
        }
        gm2.l lVar = (gm2.l) obj;
        return kotlin.jvm.internal.o.b(this.f273424a, lVar.f273424a) && this.f273425b == lVar.f273425b && this.f273426c == lVar.f273426c;
    }

    public int hashCode() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f273424a;
        return ((((bitmapDrawable == null ? 0 : bitmapDrawable.hashCode()) * 31) + java.lang.Integer.hashCode(this.f273425b)) * 31) + java.lang.Integer.hashCode(this.f273426c);
    }

    public java.lang.String toString() {
        return "ImageSpanParams(bitmapDrawable=" + this.f273424a + ", leftMargin=" + this.f273425b + ", rightMargin=" + this.f273426c + ')';
    }
}
