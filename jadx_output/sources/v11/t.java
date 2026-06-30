package v11;

/* loaded from: classes11.dex */
public final class t implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f432462d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f432463e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f432464f;

    /* renamed from: g, reason: collision with root package name */
    public final v11.e0 f432465g;

    /* renamed from: h, reason: collision with root package name */
    public final v11.h f432466h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f432467i;

    /* renamed from: m, reason: collision with root package name */
    public final long f432468m;

    public t(java.util.List blocks, boolean z17, java.lang.String rawContent, v11.e0 e0Var, v11.h hVar, yz5.l lVar, long j17) {
        kotlin.jvm.internal.o.g(blocks, "blocks");
        kotlin.jvm.internal.o.g(rawContent, "rawContent");
        this.f432462d = blocks;
        this.f432463e = z17;
        this.f432464f = rawContent;
        this.f432465g = e0Var;
        this.f432466h = hVar;
        this.f432467i = lVar;
        this.f432468m = j17;
    }

    public java.lang.Object clone() {
        return super.clone();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.t)) {
            return false;
        }
        v11.t tVar = (v11.t) obj;
        return kotlin.jvm.internal.o.b(this.f432462d, tVar.f432462d) && this.f432463e == tVar.f432463e && kotlin.jvm.internal.o.b(this.f432464f, tVar.f432464f) && kotlin.jvm.internal.o.b(this.f432465g, tVar.f432465g) && kotlin.jvm.internal.o.b(this.f432466h, tVar.f432466h) && kotlin.jvm.internal.o.b(this.f432467i, tVar.f432467i) && this.f432468m == tVar.f432468m;
    }

    public int hashCode() {
        int hashCode = ((((this.f432462d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f432463e)) * 31) + this.f432464f.hashCode()) * 31;
        v11.e0 e0Var = this.f432465g;
        int hashCode2 = (hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31;
        v11.h hVar = this.f432466h;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        yz5.l lVar = this.f432467i;
        return ((hashCode3 + (lVar != null ? lVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f432468m);
    }

    public java.lang.String toString() {
        return "MarkdownViewModel(blocks=" + this.f432462d + ", isStreaming=" + this.f432463e + ", rawContent=" + this.f432464f + ", renderConfig=" + this.f432465g + ", interactOptions=" + this.f432466h + ", onDoubleTap=" + this.f432467i + ", msgSvrId=" + this.f432468m + ')';
    }

    public /* synthetic */ t(java.util.List list, boolean z17, java.lang.String str, v11.e0 e0Var, v11.h hVar, yz5.l lVar, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? kz5.p0.f313996d : list, (i17 & 2) != 0 ? false : z17, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? null : e0Var, (i17 & 16) != 0 ? null : hVar, (i17 & 32) == 0 ? lVar : null, (i17 & 64) != 0 ? 0L : j17);
    }
}
