package u1;

/* loaded from: classes14.dex */
public final class n1 extends s1.o1 implements s1.r0 {

    /* renamed from: h, reason: collision with root package name */
    public final u1.w f423639h;

    /* renamed from: i, reason: collision with root package name */
    public u1.c1 f423640i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f423641m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f423642n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f423643o;

    /* renamed from: p, reason: collision with root package name */
    public long f423644p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f423645q;

    /* renamed from: r, reason: collision with root package name */
    public float f423646r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Object f423647s;

    public n1(u1.w layoutNode, u1.c1 outerWrapper) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        kotlin.jvm.internal.o.g(outerWrapper, "outerWrapper");
        this.f423639h = layoutNode;
        this.f423640i = outerWrapper;
        int i17 = p2.m.f351389c;
        this.f423644p = p2.m.f351388b;
    }

    @Override // s1.o1
    public void B(long j17, float f17, yz5.l lVar) {
        this.f423644p = j17;
        this.f423646r = f17;
        this.f423645q = lVar;
        u1.c1 c1Var = this.f423640i;
        u1.c1 c1Var2 = c1Var.f423555i;
        if (c1Var2 != null && c1Var2.f423566w) {
            s1.m1 m1Var = s1.n1.f402041a;
            if (lVar == null) {
                m1Var.c(c1Var, j17, f17);
                return;
            } else {
                m1Var.i(c1Var, j17, f17, lVar);
                return;
            }
        }
        this.f423642n = true;
        u1.w wVar = this.f423639h;
        wVar.f423702z.f423636g = false;
        u1.w1 snapshotObserver = u1.q0.a(wVar).getSnapshotObserver();
        u1.m1 m1Var2 = new u1.m1(this, j17, f17, lVar);
        snapshotObserver.getClass();
        snapshotObserver.a(wVar, snapshotObserver.f423713d, m1Var2);
    }

    public final void P() {
        u1.w wVar = this.f423639h;
        wVar.I(false);
        u1.w p17 = wVar.p();
        if (p17 == null || wVar.F != u1.e0.NotUsed) {
            return;
        }
        int ordinal = p17.f423691o.ordinal();
        u1.e0 e0Var = ordinal != 0 ? ordinal != 1 ? p17.F : u1.e0.InLayoutBlock : u1.e0.InMeasureBlock;
        kotlin.jvm.internal.o.g(e0Var, "<set-?>");
        wVar.F = e0Var;
    }

    public final boolean Q(long j17) {
        u1.w layoutNode = this.f423639h;
        u1.r1 a17 = u1.q0.a(layoutNode);
        u1.w p17 = layoutNode.p();
        boolean z17 = true;
        layoutNode.H = layoutNode.H || (p17 != null && p17.H);
        if (!layoutNode.X && p2.c.b(this.f402053g, j17)) {
            kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
            ((androidx.compose.ui.platform.AndroidComposeView) a17).f10456J.d(layoutNode);
            layoutNode.J();
            return false;
        }
        layoutNode.f423702z.f423635f = false;
        o0.i r17 = layoutNode.r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                ((u1.w) objArr[i18]).f423702z.f423632c = false;
                i18++;
            } while (i18 < i17);
        }
        this.f423641m = true;
        long j18 = this.f423640i.f402052f;
        O(j17);
        u1.c0 c0Var = u1.c0.Measuring;
        layoutNode.f423691o = c0Var;
        layoutNode.X = false;
        u1.w1 snapshotObserver = u1.q0.a(layoutNode).getSnapshotObserver();
        u1.l0 l0Var = new u1.l0(layoutNode, j17);
        snapshotObserver.getClass();
        snapshotObserver.a(layoutNode, snapshotObserver.f423711b, l0Var);
        if (layoutNode.f423691o == c0Var) {
            layoutNode.Y = true;
            layoutNode.f423691o = u1.c0.Idle;
        }
        if (p2.q.a(this.f423640i.f402052f, j18)) {
            u1.c1 c1Var = this.f423640i;
            if (c1Var.f402050d == this.f402050d && c1Var.f402051e == this.f402051e) {
                z17 = false;
            }
        }
        u1.c1 c1Var2 = this.f423640i;
        N(p2.r.a(c1Var2.f402050d, c1Var2.f402051e));
        return z17;
    }

    @Override // s1.o1, s1.t
    public java.lang.Object g() {
        return this.f423647s;
    }

    @Override // s1.t
    public int i(int i17) {
        P();
        return this.f423640i.i(i17);
    }

    @Override // s1.t
    public int j(int i17) {
        P();
        return this.f423640i.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        P();
        return this.f423640i.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        P();
        return this.f423640i.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        u1.e0 e0Var;
        u1.w wVar = this.f423639h;
        u1.w p17 = wVar.p();
        u1.e0 e0Var2 = u1.e0.NotUsed;
        if (p17 != null) {
            if (!(wVar.E == e0Var2 || wVar.H)) {
                throw new java.lang.IllegalStateException(("measure() may not be called multiple times on the same Measurable. Current state " + wVar.E + ". Parent state " + p17.f423691o + '.').toString());
            }
            int ordinal = p17.f423691o.ordinal();
            if (ordinal == 0) {
                e0Var = u1.e0.InMeasureBlock;
            } else {
                if (ordinal != 1) {
                    throw new java.lang.IllegalStateException("Measurable could be only measured from the parent's measure or layout block.Parents state is " + p17.f423691o);
                }
                e0Var = u1.e0.InLayoutBlock;
            }
            wVar.getClass();
            wVar.E = e0Var;
        } else {
            wVar.getClass();
            wVar.E = e0Var2;
        }
        Q(j17);
        return this;
    }

    @Override // s1.y0
    public int s(s1.a alignmentLine) {
        kotlin.jvm.internal.o.g(alignmentLine, "alignmentLine");
        u1.w wVar = this.f423639h;
        u1.w p17 = wVar.p();
        if ((p17 != null ? p17.f423691o : null) == u1.c0.Measuring) {
            wVar.f423702z.f423632c = true;
        } else {
            u1.w p18 = wVar.p();
            if ((p18 != null ? p18.f423691o : null) == u1.c0.LayingOut) {
                wVar.f423702z.f423633d = true;
            }
        }
        this.f423643o = true;
        int s17 = this.f423640i.s(alignmentLine);
        this.f423643o = false;
        return s17;
    }

    @Override // s1.o1
    public int x() {
        return this.f423640i.x();
    }

    @Override // s1.o1
    public int y() {
        return this.f423640i.y();
    }
}
