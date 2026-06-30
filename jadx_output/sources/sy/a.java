package sy;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f413775a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f413776b;

    public a(java.lang.String url, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        this.f413775a = url;
        this.f413776b = aesKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy.a)) {
            return false;
        }
        sy.a aVar = (sy.a) obj;
        return kotlin.jvm.internal.o.b(this.f413775a, aVar.f413775a) && kotlin.jvm.internal.o.b(this.f413776b, aVar.f413776b);
    }

    public int hashCode() {
        return (this.f413775a.hashCode() * 31) + this.f413776b.hashCode();
    }

    public java.lang.String toString() {
        return "CdnFileLocator(url=" + this.f413775a + ", aesKey=" + this.f413776b + ')';
    }
}
