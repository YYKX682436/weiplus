package u1;

/* loaded from: classes14.dex */
public final class u extends u1.c1 implements p2.f {
    public static final e1.n0 G;
    public final /* synthetic */ s1.x0 F;

    static {
        e1.g gVar = new e1.g();
        int i17 = e1.y.f246321l;
        gVar.e(e1.y.f246316g);
        gVar.k(1.0f);
        gVar.l(1);
        G = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(u1.w layoutNode) {
        super(layoutNode);
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        this.F = layoutNode.f423699w;
    }

    @Override // u1.c1, s1.o1
    public void B(long j17, float f17, yz5.l lVar) {
        super.B(j17, f17, lVar);
        u1.c1 c1Var = this.f423555i;
        if (c1Var != null && c1Var.f423566w) {
            return;
        }
        for (u1.p0 p0Var = this.f423568y[4]; p0Var != null; p0Var = p0Var.f423656f) {
            ((s1.i1) ((u1.a2) p0Var).f423655e).i(this);
        }
        u1.w wVar = this.f423554h;
        u1.w p17 = wVar.p();
        u1.c1 c1Var2 = wVar.I;
        float f18 = c1Var2.f423565v;
        u1.c1 c1Var3 = wVar.f423682J.f423640i;
        while (!kotlin.jvm.internal.o.b(c1Var3, c1Var2)) {
            u1.e1 e1Var = (u1.e1) c1Var3;
            f18 += e1Var.f423565v;
            c1Var3 = e1Var.F;
        }
        if (!(f18 == wVar.K)) {
            wVar.K = f18;
            if (p17 != null) {
                p17.D();
            }
            if (p17 != null) {
                p17.u();
            }
        }
        if (!wVar.A) {
            if (p17 != null) {
                p17.u();
            }
            wVar.z();
        }
        if (p17 == null) {
            wVar.B = 0;
        } else if (!wVar.W && p17.f423691o == u1.c0.LayingOut) {
            if (!(wVar.B == Integer.MAX_VALUE)) {
                throw new java.lang.IllegalStateException("Place was called on a node which was placed already".toString());
            }
            int i17 = p17.D;
            wVar.B = i17;
            p17.D = i17 + 1;
        }
        wVar.y();
    }

    @Override // p2.f
    public int G(float f17) {
        return this.F.G(f17);
    }

    @Override // p2.f
    public float H(long j17) {
        return this.F.H(j17);
    }

    @Override // p2.f
    public float R(float f17) {
        return this.F.R(f17);
    }

    @Override // u1.c1
    public int S(s1.a alignmentLine) {
        kotlin.jvm.internal.o.g(alignmentLine, "alignmentLine");
        u1.w wVar = this.f423554h;
        boolean z17 = wVar.f423682J.f423643o;
        u1.n0 n0Var = wVar.f423702z;
        if (!z17) {
            if (wVar.f423691o == u1.c0.Measuring) {
                n0Var.f423635f = true;
                if (n0Var.f423631b) {
                    wVar.Y = true;
                }
            } else {
                n0Var.f423636g = true;
            }
        }
        wVar.y();
        java.lang.Integer num = (java.lang.Integer) ((java.util.HashMap) n0Var.f423638i).get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p2.f
    public long e(long j17) {
        return this.F.e(j17);
    }

    @Override // u1.c1
    public s1.x0 f0() {
        return this.f423554h.f423699w;
    }

    @Override // p2.f
    public float getDensity() {
        return this.F.getDensity();
    }

    @Override // p2.f
    public float getFontScale() {
        return this.F.getFontScale();
    }

    @Override // s1.t
    public int i(int i17) {
        u1.v vVar = this.f423554h.f423697u;
        s1.t0 a17 = vVar.a();
        u1.w wVar = vVar.f423673a;
        return a17.b(wVar.f423699w, wVar.n(), i17);
    }

    @Override // s1.t
    public int j(int i17) {
        u1.v vVar = this.f423554h.f423697u;
        s1.t0 a17 = vVar.a();
        u1.w wVar = vVar.f423673a;
        return a17.c(wVar.f423699w, wVar.n(), i17);
    }

    @Override // s1.t
    public int k(int i17) {
        u1.v vVar = this.f423554h.f423697u;
        s1.t0 a17 = vVar.a();
        u1.w wVar = vVar.f423673a;
        return a17.a(wVar.f423699w, wVar.n(), i17);
    }

    @Override // s1.t
    public int l(int i17) {
        u1.v vVar = this.f423554h.f423697u;
        s1.t0 a17 = vVar.a();
        u1.w wVar = vVar.f423673a;
        return a17.e(wVar.f423699w, wVar.n(), i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        O(j17);
        u1.w wVar = this.f423554h;
        o0.i r17 = wVar.r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar2 = (u1.w) objArr[i18];
                u1.e0 e0Var = u1.e0.NotUsed;
                wVar2.getClass();
                wVar2.E = e0Var;
                i18++;
            } while (i18 < i17);
        }
        s1.u0 measureResult = wVar.f423696t.d(wVar.f423699w, wVar.n(), j17);
        wVar.getClass();
        kotlin.jvm.internal.o.g(measureResult, "measureResult");
        wVar.I.A0(measureResult);
        w0();
        return this;
    }

    @Override // p2.f
    public float n(int i17) {
        return this.F.n(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // u1.c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0(u1.v0 r19, long r20, u1.s r22, boolean r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.u.n0(u1.v0, long, u1.s, boolean, boolean):void");
    }

    @Override // p2.f
    public float o(float f17) {
        return this.F.o(f17);
    }

    @Override // p2.f
    public long t(long j17) {
        return this.F.t(j17);
    }

    @Override // u1.c1
    public void y0(e1.u canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        u1.w wVar = this.f423554h;
        u1.r1 a17 = u1.q0.a(wVar);
        o0.i q17 = wVar.q();
        int i17 = q17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = q17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar2 = (u1.w) objArr[i18];
                if (wVar2.A) {
                    wVar2.f(canvas);
                }
                i18++;
            } while (i18 < i17);
        }
        if (a17.getShowLayoutBounds()) {
            b0(canvas, G);
        }
    }

    @Override // p2.f
    public long z(float f17) {
        return this.F.z(f17);
    }
}
