package yq5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f464606a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.e f464607b;

    /* renamed from: c, reason: collision with root package name */
    public final int f464608c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f464609d;

    /* renamed from: e, reason: collision with root package name */
    public yq5.p f464610e;

    /* renamed from: f, reason: collision with root package name */
    public int f464611f;

    /* renamed from: g, reason: collision with root package name */
    public int f464612g;

    /* renamed from: h, reason: collision with root package name */
    public final yq5.l f464613h;

    public m(long j17, zq5.e srcRect, int i17, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(srcRect, "srcRect");
        this.f464606a = j17;
        this.f464607b = srcRect;
        this.f464608c = i17;
        this.f464613h = new yq5.l();
    }

    public final void a() {
        b(null, 0, false);
    }

    public final void b(yq5.p pVar, int i17, boolean z17) {
        if (kotlin.jvm.internal.o.b(pVar, this.f464610e)) {
            return;
        }
        this.f464610e = pVar;
        this.f464611f = i17;
        yq5.l lVar = this.f464613h;
        if (pVar != null && z17) {
            lVar.getClass();
            int i18 = s26.f.f402379b;
            lVar.f464603a = java.lang.System.nanoTime() - s26.f.f402378a;
            lVar.a(0.0f);
            lVar.f464605c = 0;
            return;
        }
        if (lVar.f464604b < 1.0f) {
            int i19 = s26.f.f402379b;
            lVar.f464603a = java.lang.System.nanoTime() - s26.f.f402378a;
            lVar.a(1.0f);
            lVar.f464605c = 255;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.m.class != obj.getClass()) {
            return false;
        }
        yq5.m mVar = (yq5.m) obj;
        int i17 = zq5.c.f475058c;
        return ((this.f464606a > mVar.f464606a ? 1 : (this.f464606a == mVar.f464606a ? 0 : -1)) == 0) && kotlin.jvm.internal.o.b(this.f464607b, mVar.f464607b) && this.f464608c == mVar.f464608c;
    }

    public int hashCode() {
        int i17 = zq5.c.f475058c;
        return (((java.lang.Long.hashCode(this.f464606a) * 31) + this.f464607b.hashCode()) * 31) + this.f464608c;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Tile(coordinate=");
        sb6.append(zq5.d.b(this.f464606a));
        sb6.append(",srcRect=");
        zq5.e eVar = this.f464607b;
        sb6.append(zq5.f.b(eVar));
        sb6.append(",srcSize=");
        sb6.append(eVar.f475063c - eVar.f475061a);
        sb6.append('x');
        sb6.append(eVar.f475064d - eVar.f475062b);
        sb6.append(",state=");
        int i17 = yq5.t.f464625c;
        int i18 = this.f464612g;
        java.lang.String str = "UNKNOWN";
        sb6.append(i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? "UNKNOWN" : "ERROR" : "LOADED" : "LOADING" : "NONE");
        sb6.append(",from=");
        int i19 = yq5.q.f464617b;
        int i27 = this.f464611f;
        if (i27 == 1) {
            str = "MEMORY_CACHE";
        } else if (i27 == 2) {
            str = "LOCAL";
        }
        sb6.append(str);
        sb6.append(",sampleSize=");
        sb6.append(this.f464608c);
        sb6.append(",bitmap=");
        sb6.append(this.f464610e);
        sb6.append(')');
        return sb6.toString();
    }
}
