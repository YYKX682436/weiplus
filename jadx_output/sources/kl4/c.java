package kl4;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f308890a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f308891b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f308892c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f308893d;

    public c(float[] fArr, boolean z17, java.lang.String mimeType, boolean z18) {
        kotlin.jvm.internal.o.g(mimeType, "mimeType");
        this.f308890a = fArr;
        this.f308891b = z17;
        this.f308892c = mimeType;
        this.f308893d = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl4.c)) {
            return false;
        }
        kl4.c cVar = (kl4.c) obj;
        return kotlin.jvm.internal.o.b(this.f308890a, cVar.f308890a) && this.f308891b == cVar.f308891b && kotlin.jvm.internal.o.b(this.f308892c, cVar.f308892c) && this.f308893d == cVar.f308893d;
    }

    public int hashCode() {
        float[] fArr = this.f308890a;
        return ((((((fArr == null ? 0 : java.util.Arrays.hashCode(fArr)) * 31) + java.lang.Boolean.hashCode(this.f308891b)) * 31) + this.f308892c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f308893d);
    }

    public java.lang.String toString() {
        return "DecoderResult(data=" + java.util.Arrays.toString(this.f308890a) + ", isHardwareAccelerated=" + this.f308891b + ", mimeType=" + this.f308892c + ", isFfmepgDecode=" + this.f308893d + ')';
    }
}
