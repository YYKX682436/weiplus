package ct2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f222255a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f222256b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f222257c;

    public g(java.lang.String session, java.lang.String productId, java.lang.String source, int i17, kotlin.jvm.internal.i iVar) {
        session = (i17 & 1) != 0 ? "" : session;
        productId = (i17 & 2) != 0 ? "" : productId;
        source = (i17 & 4) != 0 ? "" : source;
        kotlin.jvm.internal.o.g(session, "session");
        kotlin.jvm.internal.o.g(productId, "productId");
        kotlin.jvm.internal.o.g(source, "source");
        this.f222255a = session;
        this.f222256b = productId;
        this.f222257c = source;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct2.g)) {
            return false;
        }
        ct2.g gVar = (ct2.g) obj;
        return kotlin.jvm.internal.o.b(this.f222255a, gVar.f222255a) && kotlin.jvm.internal.o.b(this.f222256b, gVar.f222256b) && kotlin.jvm.internal.o.b(this.f222257c, gVar.f222257c);
    }

    public int hashCode() {
        return (((this.f222255a.hashCode() * 31) + this.f222256b.hashCode()) * 31) + this.f222257c.hashCode();
    }

    public java.lang.String toString() {
        return "session:" + this.f222255a + ",productId:" + this.f222256b + ",source:" + this.f222257c;
    }
}
