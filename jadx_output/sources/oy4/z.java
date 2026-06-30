package oy4;

/* loaded from: classes13.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.Buffer f350089a;

    /* renamed from: b, reason: collision with root package name */
    public final int f350090b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350091c;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f350092d;

    public z(java.nio.Buffer buffer, int i17, int i18, android.graphics.RectF rectF) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.f350089a = buffer;
        this.f350090b = i17;
        this.f350091c = i18;
        this.f350092d = rectF;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy4.z)) {
            return false;
        }
        oy4.z zVar = (oy4.z) obj;
        return kotlin.jvm.internal.o.b(this.f350089a, zVar.f350089a) && this.f350090b == zVar.f350090b && this.f350091c == zVar.f350091c && kotlin.jvm.internal.o.b(this.f350092d, zVar.f350092d);
    }

    public int hashCode() {
        int hashCode = ((((this.f350089a.hashCode() * 31) + java.lang.Integer.hashCode(this.f350090b)) * 31) + java.lang.Integer.hashCode(this.f350091c)) * 31;
        android.graphics.RectF rectF = this.f350092d;
        return hashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public java.lang.String toString() {
        return "ImageBufferDataWrapper(buffer=" + this.f350089a + ", width=" + this.f350090b + ", height=" + this.f350091c + ", codeRect=" + this.f350092d + ')';
    }
}
