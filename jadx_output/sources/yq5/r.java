package yq5;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f464618a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.e f464619b;

    /* renamed from: c, reason: collision with root package name */
    public final int f464620c;

    /* renamed from: d, reason: collision with root package name */
    public final yq5.p f464621d;

    /* renamed from: e, reason: collision with root package name */
    public final int f464622e;

    /* renamed from: f, reason: collision with root package name */
    public final int f464623f;

    /* renamed from: g, reason: collision with root package name */
    public final int f464624g;

    public r(long j17, zq5.e srcRect, int i17, yq5.p pVar, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(srcRect, "srcRect");
        this.f464618a = j17;
        this.f464619b = srcRect;
        this.f464620c = i17;
        this.f464621d = pVar;
        this.f464622e = i18;
        this.f464623f = i19;
        this.f464624g = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.r)) {
            return false;
        }
        yq5.r rVar = (yq5.r) obj;
        long j17 = rVar.f464618a;
        int i17 = zq5.c.f475058c;
        return ((this.f464618a > j17 ? 1 : (this.f464618a == j17 ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f464619b, rVar.f464619b) && this.f464620c == rVar.f464620c && kotlin.jvm.internal.o.b(this.f464621d, rVar.f464621d) && this.f464622e == rVar.f464622e && this.f464623f == rVar.f464623f && this.f464624g == rVar.f464624g;
    }

    public int hashCode() {
        int i17 = zq5.c.f475058c;
        int hashCode = ((((java.lang.Long.hashCode(this.f464618a) * 31) + this.f464619b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f464620c)) * 31;
        yq5.p pVar = this.f464621d;
        return ((((((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f464622e)) * 31) + java.lang.Integer.hashCode(this.f464623f)) * 31) + java.lang.Integer.hashCode(this.f464624g);
    }

    public java.lang.String toString() {
        return "TileSnapshot(coordinate=" + ((java.lang.Object) zq5.c.b(this.f464618a)) + ", srcRect=" + this.f464619b + ", sampleSize=" + this.f464620c + ", tileImage=" + this.f464621d + ", state=" + this.f464622e + ", from=" + this.f464623f + ", alpha=" + this.f464624g + ')';
    }
}
