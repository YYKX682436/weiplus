package xc5;

/* loaded from: classes12.dex */
public final class s2 extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public em.i2 f453564v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f453565w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f453566x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f453567y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f453568z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(mf3.p apiCenter) {
        super(apiCenter, "MicroMsg.MsgHistoryGalleryVideoBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.f453568z = jz5.h.b(xc5.n2.f453542d);
    }

    public static final void g0(xc5.s2 s2Var, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = s2Var.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) s2Var.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, s2Var.f353826s, qVar);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        if (this.f453566x) {
            b0();
            return;
        }
        super.F();
        i0();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ekw, (android.view.ViewGroup) null);
        this.f453564v = new em.i2(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // fg3.a
    public void b() {
        this.f453566x = true;
        Y(this, xc5.m2.f453535d);
        b0();
    }

    @Override // pf3.g, pf3.h
    public void c() {
        if (this.f453566x) {
            return;
        }
        super.c();
    }

    @Override // pf3.g
    public void f0() {
        if (this.f453566x) {
            return;
        }
        super.f0();
    }

    public final boolean h0() {
        return ((java.lang.Boolean) ((jz5.n) this.f453568z).getValue()).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:34|35|(11:39|40|41|42|43|44|(1:59)(1:50)|51|(1:53)|54|(2:56|57)(1:58))|63|41|42|43|44|(1:46)|59|51|(0)|54|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0129, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i0() {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.s2.i0():void");
    }

    @Override // mf3.l
    public void onResume() {
        if (this.f453566x) {
            b0();
        } else {
            reset();
            a0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void recycle() {
        mf3.s sVar;
        mf3.k kVar;
        gg3.b bVar;
        super.recycle();
        if (this.f453567y && (sVar = this.f326110m) != null && (kVar = sVar.f326117a) != null && (bVar = (gg3.b) H(gg3.b.class)) != null) {
            bVar.H5(kVar);
        }
        this.f453567y = false;
    }

    @Override // pf3.g, pf3.h
    public void reset() {
        if (this.f453566x) {
            b0();
        } else {
            e0();
            i0();
        }
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        gg3.b bVar;
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.f453566x = false;
        boolean z17 = this.f453567y;
        mf3.k kVar = bindContext.f326117a;
        if (z17 && kVar != null && (bVar = (gg3.b) H(gg3.b.class)) != null) {
            bVar.H5(kVar);
        }
        this.f453567y = false;
        if (kVar != null) {
            kVar.f(mf3.w.f326128d);
        }
        i0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.i2 i2Var = this.f453564v;
        if (i2Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (i2Var.f254432g == null) {
            i2Var.f254432g = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) i2Var.f254426a.findViewById(com.tencent.mm.R.id.u9w);
        }
        i2Var.f254432g.setPriority(0);
        em.i2 i2Var2 = this.f453564v;
        if (i2Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (i2Var2.f254430e == null) {
            i2Var2.f254430e = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) i2Var2.f254426a.findViewById(com.tencent.mm.R.id.uzd);
        }
        i2Var2.f254430e.setPriority(1);
        em.i2 i2Var3 = this.f453564v;
        if (i2Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        i2Var3.b().setPriority(0);
        em.i2 i2Var4 = this.f453564v;
        if (i2Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.download.MediaDownloadText b17 = i2Var4.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new xc5.g2(this), 1, null);
        em.i2 i2Var5 = this.f453564v;
        if (i2Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        this.f453565w = i2Var5.b();
        em.i2 i2Var6 = this.f453564v;
        if (i2Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = i2Var6.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        pf3.d.W(this, f17, null, 1, null);
        pf3.d.U(this, f17, null, new xc5.h2(this), 1, null);
        em.i2 i2Var7 = this.f453564v;
        if (i2Var7 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = i2Var7.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        pf3.d.W(this, e17, null, 1, null);
        pf3.d.U(this, e17, null, new xc5.i2(this), 1, null);
        em.i2 i2Var8 = this.f453564v;
        if (i2Var8 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox c17 = i2Var8.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLocate(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new xc5.j2(this), 1, null);
        em.i2 i2Var9 = this.f453564v;
        if (i2Var9 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox a17 = i2Var9.a();
        kotlin.jvm.internal.o.f(a17, "getBtnGrid(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new xc5.k2(this), 1, null);
        if (h0()) {
            em.i2 i2Var10 = this.f453564v;
            if (i2Var10 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            i2Var10.a().setVisibility(8);
        } else {
            em.i2 i2Var11 = this.f453564v;
            if (i2Var11 == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            i2Var11.c().setVisibility(8);
        }
        em.i2 i2Var12 = this.f453564v;
        if (i2Var12 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = i2Var12.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        pf3.d.W(this, d17, null, 1, null);
        pf3.d.U(this, d17, null, new xc5.l2(this), 1, null);
    }
}
