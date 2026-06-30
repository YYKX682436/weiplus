package p36;

/* loaded from: classes16.dex */
public final class i implements l36.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f351722a;

    /* renamed from: b, reason: collision with root package name */
    public final o36.j f351723b;

    /* renamed from: c, reason: collision with root package name */
    public final p36.d f351724c;

    /* renamed from: d, reason: collision with root package name */
    public final o36.d f351725d;

    /* renamed from: e, reason: collision with root package name */
    public final int f351726e;

    /* renamed from: f, reason: collision with root package name */
    public final l36.w0 f351727f;

    /* renamed from: g, reason: collision with root package name */
    public final l36.n f351728g;

    /* renamed from: h, reason: collision with root package name */
    public final l36.f0 f351729h;

    /* renamed from: i, reason: collision with root package name */
    public final int f351730i;

    /* renamed from: j, reason: collision with root package name */
    public final int f351731j;

    /* renamed from: k, reason: collision with root package name */
    public final int f351732k;

    /* renamed from: l, reason: collision with root package name */
    public int f351733l;

    public i(java.util.List list, o36.j jVar, p36.d dVar, o36.d dVar2, int i17, l36.w0 w0Var, l36.n nVar, l36.f0 f0Var, int i18, int i19, int i27) {
        this.f351722a = list;
        this.f351725d = dVar2;
        this.f351723b = jVar;
        this.f351724c = dVar;
        this.f351726e = i17;
        this.f351727f = w0Var;
        this.f351728g = nVar;
        this.f351729h = f0Var;
        this.f351730i = i18;
        this.f351731j = i19;
        this.f351732k = i27;
    }

    public l36.a1 a(l36.w0 w0Var, o36.j jVar, p36.d dVar, o36.d dVar2) {
        java.util.List list = this.f351722a;
        int size = list.size();
        int i17 = this.f351726e;
        if (i17 >= size) {
            throw new java.lang.AssertionError();
        }
        this.f351733l++;
        p36.d dVar3 = this.f351724c;
        if (dVar3 != null) {
            if (!this.f351725d.j(w0Var.f315681a)) {
                throw new java.lang.IllegalStateException("network interceptor " + list.get(i17 - 1) + " must retain the same host and port");
            }
        }
        if (dVar3 != null && this.f351733l > 1) {
            throw new java.lang.IllegalStateException("network interceptor " + list.get(i17 - 1) + " must call proceed() exactly once");
        }
        java.util.List list2 = this.f351722a;
        p36.i iVar = new p36.i(list2, jVar, dVar, dVar2, i17 + 1, w0Var, this.f351728g, this.f351729h, this.f351730i, this.f351731j, this.f351732k);
        l36.m0 m0Var = (l36.m0) list2.get(i17);
        l36.a1 a17 = m0Var.a(iVar);
        if (dVar != null && i17 + 1 < list.size() && iVar.f351733l != 1) {
            throw new java.lang.IllegalStateException("network interceptor " + m0Var + " must call proceed() exactly once");
        }
        if (a17 == null) {
            throw new java.lang.NullPointerException("interceptor " + m0Var + " returned null");
        }
        if (a17.f315461m != null) {
            return a17;
        }
        throw new java.lang.IllegalStateException("interceptor " + m0Var + " returned a response with no body");
    }
}
