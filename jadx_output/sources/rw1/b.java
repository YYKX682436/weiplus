package rw1;

/* loaded from: classes14.dex */
public final class b extends hw1.a {

    /* renamed from: a, reason: collision with root package name */
    public final qw1.a f400584a;

    /* renamed from: b, reason: collision with root package name */
    public final pw1.g f400585b;

    /* renamed from: c, reason: collision with root package name */
    public final qw1.e f400586c;

    public b(qw1.a data, pw1.g renderInfo, qw1.e yuvTextureGroupWrapper) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(renderInfo, "renderInfo");
        kotlin.jvm.internal.o.g(yuvTextureGroupWrapper, "yuvTextureGroupWrapper");
        this.f400584a = data;
        this.f400585b = renderInfo;
        this.f400586c = yuvTextureGroupWrapper;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw1.b)) {
            return false;
        }
        rw1.b bVar = (rw1.b) obj;
        return kotlin.jvm.internal.o.b(this.f400584a, bVar.f400584a) && kotlin.jvm.internal.o.b(this.f400585b, bVar.f400585b) && kotlin.jvm.internal.o.b(this.f400586c, bVar.f400586c);
    }

    public int hashCode() {
        return (((this.f400584a.hashCode() * 31) + this.f400585b.hashCode()) * 31) + this.f400586c.hashCode();
    }

    public java.lang.String toString() {
        return "GLUploadMTRTaskInput(data=" + this.f400584a + ", renderInfo=" + this.f400585b + ", yuvTextureGroupWrapper=" + this.f400586c + ')';
    }
}
