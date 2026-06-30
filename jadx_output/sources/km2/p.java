package km2;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public r45.fa2 f309166a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f309167b;

    /* renamed from: c, reason: collision with root package name */
    public r45.lp1 f309168c;

    public p(r45.fa2 fa2Var, com.tencent.mm.protobuf.g gVar, r45.lp1 lp1Var, int i17, kotlin.jvm.internal.i iVar) {
        fa2Var = (i17 & 1) != 0 ? null : fa2Var;
        gVar = (i17 & 2) != 0 ? null : gVar;
        lp1Var = (i17 & 4) != 0 ? null : lp1Var;
        this.f309166a = fa2Var;
        this.f309167b = gVar;
        this.f309168c = lp1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.p)) {
            return false;
        }
        km2.p pVar = (km2.p) obj;
        return kotlin.jvm.internal.o.b(this.f309166a, pVar.f309166a) && kotlin.jvm.internal.o.b(this.f309167b, pVar.f309167b) && kotlin.jvm.internal.o.b(this.f309168c, pVar.f309168c);
    }

    public int hashCode() {
        r45.fa2 fa2Var = this.f309166a;
        int hashCode = (fa2Var == null ? 0 : fa2Var.hashCode()) * 31;
        com.tencent.mm.protobuf.g gVar = this.f309167b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        r45.lp1 lp1Var = this.f309168c;
        return hashCode2 + (lp1Var != null ? lp1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLiveGuidePageData(container=" + this.f309166a + ", navBuffer=" + this.f309167b + ", extInfo=" + this.f309168c + ')';
    }
}
