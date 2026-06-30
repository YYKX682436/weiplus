package j0;

/* loaded from: classes14.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f296403a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.o1 f296404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f296405c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f296406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296407e;

    /* renamed from: f, reason: collision with root package name */
    public final p2.f f296408f;

    /* renamed from: g, reason: collision with root package name */
    public final f2.g f296409g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f296410h;

    /* renamed from: i, reason: collision with root package name */
    public a2.j f296411i;

    /* renamed from: j, reason: collision with root package name */
    public p2.s f296412j;

    public k3(a2.d dVar, a2.o1 o1Var, int i17, boolean z17, int i18, p2.f fVar, f2.g gVar, java.util.List list, kotlin.jvm.internal.i iVar) {
        this.f296403a = dVar;
        this.f296404b = o1Var;
        this.f296405c = i17;
        this.f296406d = z17;
        this.f296407e = i18;
        this.f296408f = fVar;
        this.f296409g = gVar;
        this.f296410h = list;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b8, code lost:
    
        if ((r6 == 2) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cd, code lost:
    
        if (p2.c.g(r31) == p2.c.g(r7)) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final a2.k1 a(long r31, p2.s r33, a2.k1 r34) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.k3.a(long, p2.s, a2.k1):a2.k1");
    }

    public final void b(p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        a2.j jVar = this.f296411i;
        if (jVar == null || layoutDirection != this.f296412j || jVar.a()) {
            this.f296412j = layoutDirection;
            jVar = new a2.j(this.f296403a, a2.p1.a(this.f296404b, layoutDirection), this.f296410h, this.f296408f, this.f296409g);
        }
        this.f296411i = jVar;
    }

    public /* synthetic */ k3(a2.d dVar, a2.o1 o1Var, int i17, boolean z17, int i18, p2.f fVar, f2.g gVar, java.util.List list, int i19, kotlin.jvm.internal.i iVar) {
        this(dVar, o1Var, (i19 & 4) != 0 ? Integer.MAX_VALUE : i17, (i19 & 8) != 0 ? true : z17, (i19 & 16) != 0 ? 1 : i18, fVar, gVar, (i19 & 128) != 0 ? kz5.p0.f313996d : list, null);
    }
}
