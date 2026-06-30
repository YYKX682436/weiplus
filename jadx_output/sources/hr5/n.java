package hr5;

/* loaded from: classes15.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f284414a;

    /* renamed from: b, reason: collision with root package name */
    public final long f284415b;

    /* renamed from: c, reason: collision with root package name */
    public final long f284416c;

    /* renamed from: d, reason: collision with root package name */
    public final int f284417d;

    /* renamed from: e, reason: collision with root package name */
    public final gr5.n f284418e;

    /* renamed from: f, reason: collision with root package name */
    public final gr5.b f284419f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f284420g;

    /* renamed from: h, reason: collision with root package name */
    public final gr5.e0 f284421h;

    /* renamed from: i, reason: collision with root package name */
    public final gr5.h0 f284422i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f284423j;

    /* renamed from: k, reason: collision with root package name */
    public final float f284424k;

    /* renamed from: l, reason: collision with root package name */
    public final gr5.f f284425l;

    public n(long j17, long j18, long j19, int i17, gr5.n contentScale, gr5.b alignment, boolean z17, gr5.e0 e0Var, gr5.h0 scalesCalculator, boolean z18, float f17, gr5.f containerWhitespace, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(scalesCalculator, "scalesCalculator");
        kotlin.jvm.internal.o.g(containerWhitespace, "containerWhitespace");
        this.f284414a = j17;
        this.f284415b = j18;
        this.f284416c = j19;
        this.f284417d = i17;
        this.f284418e = contentScale;
        this.f284419f = alignment;
        this.f284420g = z17;
        this.f284421h = e0Var;
        this.f284422i = scalesCalculator;
        this.f284423j = z18;
        this.f284424k = f17;
        this.f284425l = containerWhitespace;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr5.n)) {
            return false;
        }
        hr5.n nVar = (hr5.n) obj;
        return zq5.g.a(this.f284414a, nVar.f284414a) && zq5.g.a(this.f284415b, nVar.f284415b) && zq5.g.a(this.f284416c, nVar.f284416c) && this.f284417d == nVar.f284417d && kotlin.jvm.internal.o.b(this.f284418e, nVar.f284418e) && kotlin.jvm.internal.o.b(this.f284419f, nVar.f284419f) && this.f284420g == nVar.f284420g && kotlin.jvm.internal.o.b(this.f284421h, nVar.f284421h) && kotlin.jvm.internal.o.b(this.f284422i, nVar.f284422i) && this.f284423j == nVar.f284423j && java.lang.Float.compare(this.f284424k, nVar.f284424k) == 0 && kotlin.jvm.internal.o.b(this.f284425l, nVar.f284425l);
    }

    public int hashCode() {
        int i17 = zq5.g.f475066c;
        int hashCode = ((((((((((((java.lang.Long.hashCode(this.f284414a) * 31) + java.lang.Long.hashCode(this.f284415b)) * 31) + java.lang.Long.hashCode(this.f284416c)) * 31) + java.lang.Integer.hashCode(this.f284417d)) * 31) + this.f284418e.hashCode()) * 31) + this.f284419f.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f284420g)) * 31;
        gr5.e0 e0Var = this.f284421h;
        return ((((((((hashCode + (e0Var == null ? 0 : e0Var.hashCode())) * 31) + this.f284422i.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f284423j)) * 31) + java.lang.Float.hashCode(this.f284424k)) * 31) + this.f284425l.hashCode();
    }

    public java.lang.String toString() {
        return "ResetParams(containerSize=" + ((java.lang.Object) zq5.g.c(this.f284414a)) + ", contentSize=" + ((java.lang.Object) zq5.g.c(this.f284415b)) + ", contentOriginSize=" + ((java.lang.Object) zq5.g.c(this.f284416c)) + ", rotation=" + this.f284417d + ", contentScale=" + this.f284418e + ", alignment=" + this.f284419f + ", rtlLayoutDirection=" + this.f284420g + ", readMode=" + this.f284421h + ", scalesCalculator=" + this.f284422i + ", limitOffsetWithinBaseVisibleRect=" + this.f284423j + ", containerWhitespaceMultiple=" + this.f284424k + ", containerWhitespace=" + this.f284425l + ')';
    }
}
