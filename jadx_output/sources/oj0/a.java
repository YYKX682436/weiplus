package oj0;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f345721a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345722b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f345723c;

    public a(int i17, java.lang.String name, java.lang.String fileName) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(fileName, "fileName");
        this.f345721a = i17;
        this.f345722b = name;
        this.f345723c = fileName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj0.a)) {
            return false;
        }
        oj0.a aVar = (oj0.a) obj;
        return this.f345721a == aVar.f345721a && kotlin.jvm.internal.o.b(this.f345722b, aVar.f345722b) && kotlin.jvm.internal.o.b(this.f345723c, aVar.f345723c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f345721a) * 31) + this.f345722b.hashCode()) * 31) + this.f345723c.hashCode();
    }

    public java.lang.String toString() {
        return "FilterInfo(type=" + this.f345721a + ", name=" + this.f345722b + ", fileName=" + this.f345723c + ')';
    }
}
