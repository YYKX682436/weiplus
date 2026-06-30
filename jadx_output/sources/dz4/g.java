package dz4;

/* loaded from: classes11.dex */
public final class g extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final int f245244m;

    /* renamed from: n, reason: collision with root package name */
    public final int f245245n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f245246o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f245247p;

    /* renamed from: q, reason: collision with root package name */
    public final int f245248q;

    /* renamed from: r, reason: collision with root package name */
    public final long f245249r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f245250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i17, int i18, boolean z17, java.lang.String xml, int i19, long j17, boolean z18) {
        super(i19, z17, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        kotlin.jvm.internal.o.g(xml, "xml");
        this.f245244m = i17;
        this.f245245n = i18;
        this.f245246o = z17;
        this.f245247p = xml;
        this.f245248q = i19;
        this.f245249r = j17;
        this.f245250s = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.g)) {
            return false;
        }
        dz4.g gVar = (dz4.g) obj;
        return this.f245244m == gVar.f245244m && this.f245245n == gVar.f245245n && this.f245246o == gVar.f245246o && kotlin.jvm.internal.o.b(this.f245247p, gVar.f245247p) && this.f245248q == gVar.f245248q && this.f245249r == gVar.f245249r && this.f245250s == gVar.f245250s;
    }

    public int hashCode() {
        return (((((((((((java.lang.Integer.hashCode(this.f245244m) * 31) + java.lang.Integer.hashCode(this.f245245n)) * 31) + java.lang.Boolean.hashCode(this.f245246o)) * 31) + this.f245247p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f245248q)) * 31) + java.lang.Long.hashCode(this.f245249r)) * 31) + java.lang.Boolean.hashCode(this.f245250s);
    }

    public java.lang.String toString() {
        return "Fav(favId=" + this.f245244m + ", favUpdateSeq=" + this.f245245n + ", editable=" + this.f245246o + ", xml=" + this.f245247p + ", scene=" + this.f245248q + ", noteLocalId=" + this.f245249r + ", openFromFavConvertNote=" + this.f245250s + ')';
    }
}
