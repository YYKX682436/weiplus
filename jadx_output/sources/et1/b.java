package et1;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pointers.PString f256564a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.pointers.PString f256565b;

    public b(com.tencent.mm.pointers.PString digestStr, com.tencent.mm.pointers.PString digestUser) {
        kotlin.jvm.internal.o.g(digestStr, "digestStr");
        kotlin.jvm.internal.o.g(digestUser, "digestUser");
        this.f256564a = digestStr;
        this.f256565b = digestUser;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et1.b)) {
            return false;
        }
        et1.b bVar = (et1.b) obj;
        return kotlin.jvm.internal.o.b(this.f256564a, bVar.f256564a) && kotlin.jvm.internal.o.b(this.f256565b, bVar.f256565b);
    }

    public int hashCode() {
        return (this.f256564a.hashCode() * 31) + this.f256565b.hashCode();
    }

    public java.lang.String toString() {
        return "DigestData(digestStr=" + this.f256564a + ", digestUser=" + this.f256565b + ')';
    }
}
