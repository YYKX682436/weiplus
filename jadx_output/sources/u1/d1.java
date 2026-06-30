package u1;

/* loaded from: classes14.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.w f423572a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.j f423573b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f423574c;

    /* renamed from: d, reason: collision with root package name */
    public final u1.l1 f423575d;

    /* renamed from: e, reason: collision with root package name */
    public final o0.i f423576e;

    /* renamed from: f, reason: collision with root package name */
    public final long f423577f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f423578g;

    /* renamed from: h, reason: collision with root package name */
    public p2.c f423579h;

    public d1(u1.w root) {
        kotlin.jvm.internal.o.g(root, "root");
        this.f423572a = root;
        this.f423573b = new u1.j(false);
        this.f423575d = new u1.l1();
        this.f423576e = new o0.i(new u1.q1[16], 0);
        this.f423577f = 1L;
        this.f423578g = new java.util.ArrayList();
    }

    public final void a() {
        o0.i iVar = this.f423576e;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                u1.c1 c1Var = ((u1.w) ((u1.q1) objArr[i18])).I;
                for (u1.p0 p0Var = c1Var.f423568y[4]; p0Var != null; p0Var = p0Var.f423656f) {
                    ((s1.i1) ((u1.a2) p0Var).f423655e).i(c1Var);
                }
                i18++;
            } while (i18 < i17);
        }
        iVar.e();
    }

    public final void b(boolean z17) {
        u1.l1 l1Var = this.f423575d;
        if (z17) {
            l1Var.getClass();
            u1.w rootNode = this.f423572a;
            kotlin.jvm.internal.o.g(rootNode, "rootNode");
            o0.i iVar = l1Var.f423619a;
            iVar.e();
            iVar.b(rootNode);
            rootNode.V = true;
        }
        u1.k1 k1Var = u1.k1.f423615d;
        o0.i iVar2 = l1Var.f423619a;
        iVar2.getClass();
        java.lang.Object[] objArr = iVar2.f341850d;
        int i17 = iVar2.f341852f;
        kotlin.jvm.internal.o.g(objArr, "<this>");
        java.util.Arrays.sort(objArr, 0, i17, k1Var);
        int i18 = iVar2.f341852f;
        if (i18 > 0) {
            int i19 = i18 - 1;
            java.lang.Object[] objArr2 = iVar2.f341850d;
            do {
                u1.w wVar = (u1.w) objArr2[i19];
                if (wVar.V) {
                    l1Var.a(wVar);
                }
                i19--;
            } while (i19 >= 0);
        }
        iVar2.e();
    }

    public final boolean c(u1.w wVar, p2.c cVar) {
        boolean z17;
        u1.e0 e0Var = u1.e0.NotUsed;
        if (cVar != null) {
            if (wVar.F == e0Var) {
                wVar.b();
            }
            z17 = wVar.f423682J.Q(cVar.f351377a);
        } else {
            u1.n1 n1Var = wVar.f423682J;
            p2.c cVar2 = n1Var.f423641m ? new p2.c(n1Var.f402053g) : null;
            if (cVar2 != null) {
                if (wVar.F == e0Var) {
                    wVar.b();
                }
                z17 = wVar.f423682J.Q(cVar2.f351377a);
            } else {
                u1.d0 d0Var = u1.w.f423678p0;
                wVar.getClass();
                z17 = false;
            }
        }
        u1.w p17 = wVar.p();
        if (z17 && p17 != null) {
            u1.e0 e0Var2 = wVar.E;
            if (e0Var2 == u1.e0.InMeasureBlock) {
                i(p17, false);
            } else if (e0Var2 == u1.e0.InLayoutBlock) {
                h(p17, false);
            }
        }
        return z17;
    }

    public final void d(u1.w layoutNode) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        u1.j jVar = this.f423573b;
        if (jVar.f423606a.isEmpty()) {
            return;
        }
        if (!this.f423574c) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!(!layoutNode.X)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        o0.i r17 = layoutNode.r();
        int i17 = r17.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = r17.f341850d;
            int i18 = 0;
            do {
                u1.w wVar = (u1.w) objArr[i18];
                if (wVar.X && jVar.b(wVar)) {
                    g(wVar);
                }
                if (!wVar.X) {
                    d(wVar);
                }
                i18++;
            } while (i18 < i17);
        }
        if (layoutNode.X && jVar.b(layoutNode)) {
            g(layoutNode);
        }
    }

    public final boolean e(yz5.a aVar) {
        boolean z17;
        u1.j jVar = this.f423573b;
        u1.w wVar = this.f423572a;
        if (!wVar.x()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!wVar.A) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f423574c)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        boolean z18 = false;
        if (this.f423579h != null) {
            this.f423574c = true;
            try {
                boolean isEmpty = jVar.f423606a.isEmpty();
                u1.b2 b2Var = jVar.f423606a;
                if (!isEmpty) {
                    z17 = false;
                    while (!b2Var.isEmpty()) {
                        u1.w node = (u1.w) b2Var.first();
                        kotlin.jvm.internal.o.f(node, "node");
                        jVar.b(node);
                        boolean g17 = g(node);
                        if (node == wVar && g17) {
                            z17 = true;
                        }
                    }
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else {
                    z17 = false;
                }
                this.f423574c = false;
                z18 = z17;
            } catch (java.lang.Throwable th6) {
                this.f423574c = false;
                throw th6;
            }
        }
        a();
        return z18;
    }

    public final void f(u1.w layoutNode, long j17) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        u1.w wVar = this.f423572a;
        if (!(!kotlin.jvm.internal.o.b(layoutNode, wVar))) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!wVar.x()) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!wVar.A) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(!this.f423574c)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.f423579h != null) {
            this.f423574c = true;
            try {
                this.f423573b.b(layoutNode);
                c(layoutNode, new p2.c(j17));
                if (layoutNode.Y && layoutNode.A) {
                    layoutNode.G();
                    u1.l1 l1Var = this.f423575d;
                    l1Var.getClass();
                    l1Var.f423619a.b(layoutNode);
                    layoutNode.V = true;
                }
            } finally {
                this.f423574c = false;
            }
        }
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((r3.f423637h != null) != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(u1.w r15) {
        /*
            r14 = this;
            boolean r0 = r15.A
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2f
            boolean r0 = r15.X
            u1.n0 r3 = r15.f423702z
            if (r0 == 0) goto L20
            u1.e0 r0 = r15.E
            u1.e0 r4 = u1.e0.InMeasureBlock
            if (r0 == r4) goto L1e
            r3.c()
            u1.w r0 = r3.f423637h
            if (r0 == 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r2
        L1c:
            if (r0 == 0) goto L20
        L1e:
            r0 = r1
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 != 0) goto L2f
            r3.c()
            u1.w r0 = r3.f423637h
            if (r0 == 0) goto L2c
            r0 = r1
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto Laf
        L2f:
            boolean r0 = r15.X
            u1.w r3 = r14.f423572a
            if (r0 == 0) goto L43
            if (r15 != r3) goto L3d
            p2.c r0 = r14.f423579h
            kotlin.jvm.internal.o.d(r0)
            goto L3e
        L3d:
            r0 = 0
        L3e:
            boolean r0 = r14.c(r15, r0)
            goto L44
        L43:
            r0 = r2
        L44:
            boolean r4 = r15.Y
            if (r4 == 0) goto L87
            boolean r4 = r15.A
            if (r4 == 0) goto L87
            if (r15 != r3) goto L78
            r7 = 0
            r8 = 0
            u1.e0 r3 = r15.F
            u1.e0 r4 = u1.e0.NotUsed
            if (r3 != r4) goto L59
            r15.c()
        L59:
            s1.m1 r5 = s1.n1.f402041a
            u1.n1 r3 = r15.f423682J
            int r3 = r3.y()
            p2.s r4 = r15.f423700x
            int r12 = s1.n1.f402043c
            p2.s r13 = s1.n1.f402042b
            s1.n1.f402043c = r3
            s1.n1.f402042b = r4
            u1.n1 r6 = r15.f423682J
            r9 = 0
            r10 = 4
            r11 = 0
            s1.n1.e(r5, r6, r7, r8, r9, r10, r11)
            s1.n1.f402043c = r12
            s1.n1.f402042b = r13
            goto L7b
        L78:
            r15.G()
        L7b:
            u1.l1 r3 = r14.f423575d
            r3.getClass()
            o0.i r3 = r3.f423619a
            r3.b(r15)
            r15.V = r1
        L87:
            java.util.List r15 = r14.f423578g
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            boolean r3 = r15.isEmpty()
            r1 = r1 ^ r3
            if (r1 == 0) goto Lae
            int r1 = r15.size()
            r3 = r2
        L97:
            if (r3 >= r1) goto Lab
            java.lang.Object r4 = r15.get(r3)
            u1.w r4 = (u1.w) r4
            boolean r5 = r4.x()
            if (r5 == 0) goto La8
            r14.i(r4, r2)
        La8:
            int r3 = r3 + 1
            goto L97
        Lab:
            r15.clear()
        Lae:
            r2 = r0
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d1.g(u1.w):boolean");
    }

    public final boolean h(u1.w layoutNode, boolean z17) {
        kotlin.jvm.internal.o.g(layoutNode, "layoutNode");
        int ordinal = layoutNode.f423691o.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        if ((layoutNode.X || layoutNode.Y) && !z17) {
            return false;
        }
        layoutNode.Y = true;
        if (layoutNode.A) {
            u1.w p17 = layoutNode.p();
            if (!(p17 != null && p17.Y)) {
                if (!(p17 != null && p17.X)) {
                    this.f423573b.a(layoutNode);
                }
            }
        }
        return !this.f423574c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r6 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(u1.w r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "layoutNode"
            kotlin.jvm.internal.o.g(r5, r0)
            u1.c0 r0 = r5.f423691o
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L62
            r2 = 1
            if (r0 == r2) goto L5b
            r3 = 2
            if (r0 != r3) goto L55
            boolean r0 = r5.X
            if (r0 == 0) goto L1b
            if (r6 != 0) goto L1b
            goto L62
        L1b:
            r5.X = r2
            boolean r6 = r5.A
            if (r6 != 0) goto L3b
            u1.e0 r6 = r5.E
            u1.e0 r0 = u1.e0.InMeasureBlock
            if (r6 == r0) goto L38
            u1.n0 r6 = r5.f423702z
            r6.c()
            u1.w r6 = r6.f423637h
            if (r6 == 0) goto L32
            r6 = r2
            goto L33
        L32:
            r6 = r1
        L33:
            if (r6 == 0) goto L36
            goto L38
        L36:
            r6 = r1
            goto L39
        L38:
            r6 = r2
        L39:
            if (r6 == 0) goto L4f
        L3b:
            u1.w r6 = r5.p()
            if (r6 == 0) goto L47
            boolean r6 = r6.X
            if (r6 != r2) goto L47
            r6 = r2
            goto L48
        L47:
            r6 = r1
        L48:
            if (r6 != 0) goto L4f
            u1.j r6 = r4.f423573b
            r6.a(r5)
        L4f:
            boolean r5 = r4.f423574c
            if (r5 != 0) goto L62
            r1 = r2
            goto L62
        L55:
            jz5.j r5 = new jz5.j
            r5.<init>()
            throw r5
        L5b:
            java.util.List r6 = r4.f423578g
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r5)
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.d1.i(u1.w, boolean):boolean");
    }

    public final void j(long j17) {
        p2.c cVar = this.f423579h;
        if (cVar == null ? false : p2.c.b(cVar.f351377a, j17)) {
            return;
        }
        if (!(!this.f423574c)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.f423579h = new p2.c(j17);
        u1.w wVar = this.f423572a;
        wVar.X = true;
        this.f423573b.a(wVar);
    }
}
