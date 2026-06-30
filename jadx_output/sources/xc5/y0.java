package xc5;

/* loaded from: classes12.dex */
public final class y0 extends pf3.g implements uf3.a {
    public long A;
    public final pf3.a B;
    public final pf3.a C;
    public final pf3.a D;
    public final pf3.a E;
    public final jz5.g F;

    /* renamed from: v, reason: collision with root package name */
    public em.b2 f453593v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f453594w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f453595x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f453596y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f453597z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.MsgHistoryGalleryLiveBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.B = Z(this, "disabled", xc5.t0.f453570d);
        this.C = Z(this, "translate", new xc5.x0(this));
        this.D = Z(this, "normal", new xc5.w0(this));
        this.E = Z(this, "normalHd", new xc5.u0(this));
        this.F = jz5.h.b(xc5.v0.f453576d);
    }

    public static final void g0(xc5.y0 y0Var, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = y0Var.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) y0Var.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, y0Var.f353826s, qVar);
    }

    @Override // rf3.h
    public void D() {
        mf3.k kVar;
        e0();
        mf3.s sVar = this.f326110m;
        if (((sVar == null || (kVar = sVar.f326117a) == null) ? null : kVar.getLevel()) == mf3.w.f326128d) {
            S(this, this.D);
        } else {
            S(this, this.E);
        }
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        k0();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ekl, (android.view.ViewGroup) null);
        this.f453593v = new em.b2(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        S(this, this.B);
        b0();
    }

    @Override // pf3.g, pf3.h
    public void c() {
        if (this.f453595x) {
            return;
        }
        super.c();
    }

    @Override // pf3.g
    public void c0() {
        super.c0();
        b0();
    }

    @Override // pf3.g
    public void f0() {
        if (this.f453595x) {
            return;
        }
        super.f0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        S(this, this.C);
        a0();
    }

    public final boolean h0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.b T4;
        mf3.s sVar = this.f326110m;
        return (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (T4 = aVar.T4(kVar)) == null || T4.f436366b <= 0 || T4.f436368d <= 0 || T4.f436370f) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i0() {
        /*
            r6 = this;
            mf3.s r0 = r6.f326110m
            r1 = 0
            if (r0 == 0) goto L4c
            mf3.k r0 = r0.f326117a
            if (r0 != 0) goto La
            goto L4c
        La:
            java.lang.Class<vf3.a> r2 = vf3.a.class
            pf5.c r2 = r6.H(r2)
            vf3.a r2 = (vf3.a) r2
            boolean r3 = r2 instanceof xc5.k1
            r4 = 0
            if (r3 == 0) goto L1a
            xc5.k1 r2 = (xc5.k1) r2
            goto L1b
        L1a:
            r2 = r4
        L1b:
            if (r2 == 0) goto L4c
            boolean r3 = r0 instanceof uh5.i
            if (r3 == 0) goto L24
            r4 = r0
            uh5.i r4 = (uh5.i) r4
        L24:
            if (r4 != 0) goto L28
        L26:
            r0 = r1
            goto L48
        L28:
            com.tencent.mm.storage.f9 r3 = r4.b()
            mf3.w r5 = mf3.w.f326129e
            l70.d r3 = r2.e7(r3, r5)
            if (r3 != 0) goto L35
            goto L26
        L35:
            com.tencent.mm.storage.f9 r4 = r4.b()
            l70.d r4 = r2.f7(r4, r5)
            if (r4 != 0) goto L40
            goto L26
        L40:
            java.lang.String r3 = r3.f316805f
            java.lang.String r4 = r4.f316805f
            boolean r0 = r2.i7(r0, r5, r3, r4)
        L48:
            r2 = 1
            if (r0 != r2) goto L4c
            r1 = r2
        L4c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.y0.i0():boolean");
    }

    public final boolean j0() {
        return ((java.lang.Boolean) ((jz5.n) this.F).getValue()).booleanValue();
    }

    public final void k0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null) {
            return;
        }
        lg3.a aVar2 = this.f453594w;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar, X6);
        }
        if (X6.f436389a == vf3.e.f436384n) {
            S(this, this.C);
        } else if (kVar.getLevel() == mf3.w.f326128d) {
            S(this, this.D);
        } else {
            S(this, this.E);
        }
    }

    public final void l0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        vf3.e eVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null || !((eVar = X6.f436389a) == vf3.e.f436378e || eVar == vf3.e.f436381h || eVar == vf3.e.f436384n)) {
            Q("isResourceNotReady, delay startPlay", new java.lang.Object[0]);
            this.f453596y = true;
        } else {
            uf3.c cVar = (uf3.c) g(uf3.c.class);
            if (cVar != null) {
                ((uf3.g) cVar).X();
            }
        }
    }

    @Override // uf3.a
    public void m(vf3.e state, vf3.f extraInfo) {
        mf3.k kVar;
        lg3.a aVar;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        wh5.v vVar = obj instanceof wh5.v ? (wh5.v) obj : null;
        if (vVar == null) {
            return;
        }
        if (vVar.f446098c == mf3.w.f326129e) {
            vf3.e eVar = extraInfo.f436389a;
            if (sVar != null && (kVar = sVar.f326117a) != null && (aVar = this.f453594w) != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(kVar, extraInfo);
            }
            if (eVar == vf3.e.f436380g) {
                a0();
            }
            if (eVar == vf3.e.f436383m) {
                S(this, this.D);
            }
        }
        if (state == vf3.e.f436386p) {
            this.f453595x = true;
            c0();
        } else {
            this.f453595x = false;
            f0();
        }
        if (state == vf3.e.f436381h) {
            if (this.f453596y) {
                Q("startPlay after onLiveLoadSuccess", new java.lang.Object[0]);
                l0();
                this.f453596y = false;
            }
            if (this.f453597z) {
                Q("tryDownloadHD after onLiveLoadSuccess", new java.lang.Object[0]);
                m0();
                this.f453597z = false;
            }
        }
    }

    public final void m0() {
        mf3.k kVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || kVar.getLevel() != mf3.w.f326128d) {
            return;
        }
        Q("tryDownloadHD execute", new java.lang.Object[0]);
        kVar.f(mf3.w.f326129e);
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).V();
        }
    }

    @Override // mf3.l
    public void onPause() {
        b0();
    }

    @Override // mf3.l
    public void onResume() {
        e0();
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        lg3.a aVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f453597z = false;
        this.f453596y = false;
        mf3.k kVar = bindContext.f326117a;
        wh5.v vVar = kVar instanceof wh5.v ? (wh5.v) kVar : null;
        if (vVar != null && (aVar = this.f453594w) != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(vVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
        }
        k0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.b2 b2Var = this.f453593v;
        if (b2Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (b2Var.f254127h == null) {
            b2Var.f254127h = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) b2Var.f254120a.findViewById(com.tencent.mm.R.id.u9w);
        }
        b2Var.f254127h.setPriority(0);
        em.b2 b2Var2 = this.f453593v;
        if (b2Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (b2Var2.f254125f == null) {
            b2Var2.f254125f = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) b2Var2.f254120a.findViewById(com.tencent.mm.R.id.uzd);
        }
        b2Var2.f254125f.setPriority(1);
        em.b2 b2Var3 = this.f453593v;
        if (b2Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        b2Var3.b().setPriority(0);
        em.b2 b2Var4 = this.f453593v;
        if (b2Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        b2Var4.c().setPriority(1);
        em.b2 b2Var5 = this.f453593v;
        if (b2Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = b2Var5.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new xc5.m0(this), 1, null);
        em.b2 b2Var6 = this.f453593v;
        if (b2Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        this.f453594w = b2Var6.b();
        em.b2 b2Var7 = this.f453593v;
        if (b2Var7 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.live.LivePlayButton c17 = b2Var7.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLive(...)");
        pf3.d.W(this, c17, null, 1, null);
        T(c17, new pf3.j(0, kg3.c.a(java.lang.Double.valueOf(1.5d)), 0, kg3.c.a(java.lang.Double.valueOf(1.5d))), new xc5.n0(this));
        em.b2 b2Var8 = this.f453593v;
        if (b2Var8 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox g17 = b2Var8.g();
        kotlin.jvm.internal.o.f(g17, "getBtnShare(...)");
        pf3.d.W(this, g17, null, 1, null);
        pf3.d.U(this, g17, null, new xc5.o0(this), 1, null);
        em.b2 b2Var9 = this.f453593v;
        if (b2Var9 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = b2Var9.f();
        kotlin.jvm.internal.o.f(f17, "getBtnSave(...)");
        pf3.d.W(this, f17, null, 1, null);
        pf3.d.U(this, f17, null, new xc5.p0(this), 1, null);
        em.b2 b2Var10 = this.f453593v;
        if (b2Var10 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = b2Var10.d();
        kotlin.jvm.internal.o.f(d17, "getBtnLocate(...)");
        pf3.d.W(this, d17, null, 1, null);
        pf3.d.U(this, d17, null, new xc5.q0(this), 1, null);
        em.b2 b2Var11 = this.f453593v;
        if (b2Var11 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox a17 = b2Var11.a();
        kotlin.jvm.internal.o.f(a17, "getBtnGrid(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new xc5.r0(this), 1, null);
        if (j0()) {
            em.b2 b2Var12 = this.f453593v;
            if (b2Var12 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            b2Var12.a().setVisibility(8);
        } else {
            em.b2 b2Var13 = this.f453593v;
            if (b2Var13 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            b2Var13.d().setVisibility(8);
        }
        em.b2 b2Var14 = this.f453593v;
        if (b2Var14 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = b2Var14.e();
        kotlin.jvm.internal.o.f(e17, "getBtnMore(...)");
        pf3.d.W(this, e17, null, 1, null);
        pf3.d.U(this, e17, null, new xc5.s0(this), 1, null);
    }

    @Override // uf3.a
    public void v(vf3.b bVar) {
        lg3.a aVar = this.f453594w;
        if (aVar != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(bVar);
        }
        k0();
    }
}
