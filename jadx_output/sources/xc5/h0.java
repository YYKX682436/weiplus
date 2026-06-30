package xc5;

/* loaded from: classes12.dex */
public final class h0 extends pf3.g implements rf3.h {
    public final jz5.g A;

    /* renamed from: v, reason: collision with root package name */
    public em.z1 f453464v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f453465w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f453466x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f453467y;

    /* renamed from: z, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f453468z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.MsgHistoryGalleryImageBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f453468z = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.A = jz5.h.b(xc5.y.f453592d);
    }

    public static final void g0(xc5.h0 h0Var, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = h0Var.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) h0Var.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, h0Var.f353826s, qVar);
    }

    @Override // rf3.h
    public void D() {
        if (this.f453466x) {
            b0();
            return;
        }
        e0();
        j0();
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        if (this.f453466x) {
            b0();
            return;
        }
        super.F();
        j0();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ekj, (android.view.ViewGroup) null);
        this.f453464v = new em.z1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        this.f453466x = true;
        Y(this, xc5.w.f453579d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new xc5.x(this));
        a0();
    }

    public final com.tencent.mm.storage.f9 h0() {
        mf3.s sVar = this.f326110m;
        mf3.k kVar = sVar != null ? sVar.f326117a : null;
        uh5.i iVar = kVar instanceof uh5.i ? (uh5.i) kVar : null;
        if (iVar != null) {
            return iVar.b();
        }
        return null;
    }

    public final boolean i0() {
        return ((java.lang.Boolean) this.A.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0() {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.h0.j0():void");
    }

    @Override // mf3.l
    public void onResume() {
        if (this.f453466x) {
            b0();
        } else {
            e0();
            a0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f453466x = false;
        this.f453467y = false;
        mf3.k kVar = bindContext.f326117a;
        if (kVar != null) {
            kVar.f(mf3.w.f326128d);
        }
        j0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.z1 z1Var = this.f453464v;
        if (z1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (z1Var.f254981g == null) {
            z1Var.f254981g = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) z1Var.f254975a.findViewById(com.tencent.mm.R.id.u9w);
        }
        z1Var.f254981g.setPriority(0);
        em.z1 z1Var2 = this.f453464v;
        if (z1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (z1Var2.f254979e == null) {
            z1Var2.f254979e = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) z1Var2.f254975a.findViewById(com.tencent.mm.R.id.uzd);
        }
        z1Var2.f254979e.setPriority(1);
        em.z1 z1Var3 = this.f453464v;
        if (z1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        z1Var3.b().setPriority(0);
        em.z1 z1Var4 = this.f453464v;
        if (z1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = z1Var4.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new xc5.q(this), 1, null);
        em.z1 z1Var5 = this.f453464v;
        if (z1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        this.f453465w = z1Var5.b();
        em.z1 z1Var6 = this.f453464v;
        if (z1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = z1Var6.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        pf3.d.W(this, f17, null, 1, null);
        pf3.d.U(this, f17, null, new xc5.r(this), 1, null);
        em.z1 z1Var7 = this.f453464v;
        if (z1Var7 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = z1Var7.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        pf3.d.W(this, e17, null, 1, null);
        pf3.d.U(this, e17, null, new xc5.s(this), 1, null);
        em.z1 z1Var8 = this.f453464v;
        if (z1Var8 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox c17 = z1Var8.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLocate(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new xc5.t(this), 1, null);
        em.z1 z1Var9 = this.f453464v;
        if (z1Var9 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox a17 = z1Var9.a();
        kotlin.jvm.internal.o.f(a17, "getBtnGrid(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new xc5.u(this), 1, null);
        if (i0()) {
            em.z1 z1Var10 = this.f453464v;
            if (z1Var10 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            z1Var10.a().setVisibility(8);
        } else {
            em.z1 z1Var11 = this.f453464v;
            if (z1Var11 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            z1Var11.c().setVisibility(8);
        }
        em.z1 z1Var12 = this.f453464v;
        if (z1Var12 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = z1Var12.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        pf3.d.W(this, d17, null, 1, null);
        pf3.d.U(this, d17, null, new xc5.v(this), 1, null);
    }
}
