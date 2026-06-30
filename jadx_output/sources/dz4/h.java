package dz4;

/* loaded from: classes11.dex */
public final class h extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f245268m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f245269n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f245270o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f245271p;

    /* renamed from: q, reason: collision with root package name */
    public final int f245272q;

    /* renamed from: r, reason: collision with root package name */
    public final long f245273r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String snsFeedLocalId, java.lang.String snsServerId, java.lang.String snsNoteCoverPath, java.lang.String xml, int i17, long j17) {
        super(i17, false, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        kotlin.jvm.internal.o.g(snsFeedLocalId, "snsFeedLocalId");
        kotlin.jvm.internal.o.g(snsServerId, "snsServerId");
        kotlin.jvm.internal.o.g(snsNoteCoverPath, "snsNoteCoverPath");
        kotlin.jvm.internal.o.g(xml, "xml");
        this.f245268m = snsFeedLocalId;
        this.f245269n = snsServerId;
        this.f245270o = snsNoteCoverPath;
        this.f245271p = xml;
        this.f245272q = i17;
        this.f245273r = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.h)) {
            return false;
        }
        dz4.h hVar = (dz4.h) obj;
        return kotlin.jvm.internal.o.b(this.f245268m, hVar.f245268m) && kotlin.jvm.internal.o.b(this.f245269n, hVar.f245269n) && kotlin.jvm.internal.o.b(this.f245270o, hVar.f245270o) && kotlin.jvm.internal.o.b(this.f245271p, hVar.f245271p) && this.f245272q == hVar.f245272q && this.f245273r == hVar.f245273r;
    }

    public int hashCode() {
        return (((((((((this.f245268m.hashCode() * 31) + this.f245269n.hashCode()) * 31) + this.f245270o.hashCode()) * 31) + this.f245271p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f245272q)) * 31) + java.lang.Long.hashCode(this.f245273r);
    }

    public java.lang.String toString() {
        return "Sns(snsFeedLocalId=" + this.f245268m + ", snsServerId=" + this.f245269n + ", snsNoteCoverPath=" + this.f245270o + ", xml=" + this.f245271p + ", scene=" + this.f245272q + ", noteLocalId=" + this.f245273r + ')';
    }
}
