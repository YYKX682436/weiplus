package y1;

/* loaded from: classes14.dex */
public final class g implements java.lang.Comparable {

    /* renamed from: h, reason: collision with root package name */
    public static y1.d f458707h = y1.d.Stripe;

    /* renamed from: d, reason: collision with root package name */
    public final u1.w f458708d;

    /* renamed from: e, reason: collision with root package name */
    public final u1.w f458709e;

    /* renamed from: f, reason: collision with root package name */
    public final d1.g f458710f;

    /* renamed from: g, reason: collision with root package name */
    public final p2.s f458711g;

    public g(u1.w subtreeRoot, u1.w node) {
        kotlin.jvm.internal.o.g(subtreeRoot, "subtreeRoot");
        kotlin.jvm.internal.o.g(node, "node");
        this.f458708d = subtreeRoot;
        this.f458709e = node;
        this.f458711g = subtreeRoot.f423700x;
        u1.c1 c1Var = subtreeRoot.I;
        u1.c1 c17 = y1.q0.c(node);
        d1.g gVar = null;
        if (c1Var.p0() && c17.p0()) {
            gVar = s1.y.a(c1Var, c17, false, 2, null);
        }
        this.f458710f = gVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(y1.g other) {
        kotlin.jvm.internal.o.g(other, "other");
        d1.g gVar = this.f458710f;
        if (gVar == null) {
            return 1;
        }
        d1.g gVar2 = other.f458710f;
        if (gVar2 == null) {
            return -1;
        }
        if (f458707h == y1.d.Stripe) {
            if (gVar.f225632d - gVar2.f225630b <= 0.0f) {
                return -1;
            }
            if (gVar.f225630b - gVar2.f225632d >= 0.0f) {
                return 1;
            }
        }
        if (this.f458711g == p2.s.Ltr) {
            float f17 = gVar.f225629a - gVar2.f225629a;
            if (!(f17 == 0.0f)) {
                return f17 < 0.0f ? -1 : 1;
            }
        } else {
            float f18 = gVar.f225631c - gVar2.f225631c;
            if (!(f18 == 0.0f)) {
                return f18 < 0.0f ? 1 : -1;
            }
        }
        float f19 = gVar.f225630b;
        float f27 = gVar2.f225630b;
        float f28 = f19 - f27;
        if (!(f28 == 0.0f)) {
            return f28 < 0.0f ? -1 : 1;
        }
        float f29 = (gVar.f225632d - f19) - (gVar2.f225632d - f27);
        if (!(f29 == 0.0f)) {
            return f29 < 0.0f ? 1 : -1;
        }
        float f37 = (gVar.f225631c - gVar.f225629a) - (gVar2.f225631c - gVar2.f225629a);
        if (!(f37 == 0.0f)) {
            return f37 < 0.0f ? 1 : -1;
        }
        u1.w wVar = this.f458709e;
        d1.g b17 = s1.a0.b(y1.q0.c(wVar));
        u1.w wVar2 = other.f458709e;
        d1.g b18 = s1.a0.b(y1.q0.c(wVar2));
        u1.w a17 = y1.q0.a(wVar, new y1.e(b17));
        u1.w a18 = y1.q0.a(wVar2, new y1.f(b18));
        return (a17 == null || a18 == null) ? a17 != null ? 1 : -1 : new y1.g(this.f458708d, a17).compareTo(new y1.g(other.f458708d, a18));
    }
}
