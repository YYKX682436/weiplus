package hu3;

/* loaded from: classes5.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f285213a;

    /* renamed from: b, reason: collision with root package name */
    public int f285214b;

    /* renamed from: c, reason: collision with root package name */
    public int f285215c;

    /* renamed from: d, reason: collision with root package name */
    public int f285216d;

    public w0(int i17, int i18, int i19, int i27, int i28, kotlin.jvm.internal.i iVar) {
        i17 = (i28 & 1) != 0 ? 0 : i17;
        i18 = (i28 & 2) != 0 ? 0 : i18;
        i19 = (i28 & 4) != 0 ? 0 : i19;
        i27 = (i28 & 8) != 0 ? 0 : i27;
        this.f285213a = i17;
        this.f285214b = i18;
        this.f285215c = i19;
        this.f285216d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.w0)) {
            return false;
        }
        hu3.w0 w0Var = (hu3.w0) obj;
        return this.f285213a == w0Var.f285213a && this.f285214b == w0Var.f285214b && this.f285215c == w0Var.f285215c && this.f285216d == w0Var.f285216d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f285213a) * 31) + java.lang.Integer.hashCode(this.f285214b)) * 31) + java.lang.Integer.hashCode(this.f285215c)) * 31) + java.lang.Integer.hashCode(this.f285216d);
    }

    public java.lang.String toString() {
        return "VideoFrameInfo(width=" + this.f285213a + ", height=" + this.f285214b + ", rowStride=" + this.f285215c + ", pixelStride=" + this.f285216d + ')';
    }
}
