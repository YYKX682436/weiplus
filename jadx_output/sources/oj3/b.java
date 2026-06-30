package oj3;

/* loaded from: classes14.dex */
public final class b extends ej3.a {

    /* renamed from: a, reason: collision with root package name */
    public final nj3.a f345802a;

    /* renamed from: b, reason: collision with root package name */
    public final mj3.g f345803b;

    /* renamed from: c, reason: collision with root package name */
    public final nj3.e f345804c;

    public b(nj3.a data, mj3.g renderInfo, nj3.e yuvTextureGroupWrapper) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        this.f345802a = data;
        this.f345803b = renderInfo;
        this.f345804c = yuvTextureGroupWrapper;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj3.b)) {
            return false;
        }
        oj3.b bVar = (oj3.b) obj;
        return kotlin.jvm.internal.o.b(this.f345802a, bVar.f345802a) && kotlin.jvm.internal.o.b(this.f345803b, bVar.f345803b) && kotlin.jvm.internal.o.b(this.f345804c, bVar.f345804c);
    }

    public int hashCode() {
        return (((this.f345802a.hashCode() * 31) + this.f345803b.hashCode()) * 31) + this.f345804c.hashCode();
    }

    public java.lang.String toString() {
        return "GLUploadMTRTaskInput(data=" + this.f345802a + ", renderInfo=" + this.f345803b + ", yuvTextureGroupWrapper=" + this.f345804c + ')';
    }
}
