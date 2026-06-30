package ws5;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f449212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f449213b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f449214c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f449215d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.wo1 f449216e;

    public h(java.lang.String cacheBusinessKey, int i17, java.lang.String fromCommentScene, com.tencent.mm.protobuf.g gVar, r45.wo1 wo1Var) {
        kotlin.jvm.internal.o.g(cacheBusinessKey, "cacheBusinessKey");
        kotlin.jvm.internal.o.g(fromCommentScene, "fromCommentScene");
        this.f449212a = cacheBusinessKey;
        this.f449213b = i17;
        this.f449214c = fromCommentScene;
        this.f449215d = gVar;
        this.f449216e = wo1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws5.h)) {
            return false;
        }
        ws5.h hVar = (ws5.h) obj;
        return kotlin.jvm.internal.o.b(this.f449212a, hVar.f449212a) && this.f449213b == hVar.f449213b && kotlin.jvm.internal.o.b(this.f449214c, hVar.f449214c) && kotlin.jvm.internal.o.b(this.f449215d, hVar.f449215d) && kotlin.jvm.internal.o.b(this.f449216e, hVar.f449216e);
    }

    public int hashCode() {
        int hashCode = ((((this.f449212a.hashCode() * 31) + java.lang.Integer.hashCode(this.f449213b)) * 31) + this.f449214c.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f449215d;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        r45.wo1 wo1Var = this.f449216e;
        return hashCode2 + (wo1Var != null ? wo1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LiveSquarePreloadExt(cacheBusinessKey=" + this.f449212a + ", commentScene=" + this.f449213b + ", fromCommentScene=" + this.f449214c + ", lastBuffer=" + this.f449215d + ", customPreloadConfig=" + this.f449216e + ')';
    }
}
