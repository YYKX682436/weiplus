package rf3;

/* loaded from: classes12.dex */
public final class p extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public em.m1 f394998v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ImageBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    public static final void g0(rf3.p pVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar = pVar.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar = (dg3.m) pVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, pVar.f353826s, qVar);
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new rf3.o(this));
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
        a0();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eji, (android.view.ViewGroup) null);
        this.f394998v = new em.m1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        Y(this, rf3.m.f394995d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new rf3.n(this));
        a0();
    }

    @Override // mf3.l
    public void onResume() {
        e0();
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryLocatePreviewEnabled()) == 1) {
            em.m1 m1Var = this.f394998v;
            if (m1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            if (m1Var.f254597e == null) {
                m1Var.f254597e = (com.tencent.mm.ui.widget.imageview.WeImageView) m1Var.f254593a.findViewById(com.tencent.mm.R.id.bhi);
            }
            m1Var.f254597e.setImageResource(com.tencent.mm.R.raw.icons_gallery_filled);
        }
        em.m1 m1Var2 = this.f394998v;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var2.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new rf3.i(this), 1, null);
        em.m1 m1Var3 = this.f394998v;
        if (m1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (m1Var3.f254595c == null) {
            m1Var3.f254595c = (android.widget.FrameLayout) m1Var3.f254593a.findViewById(com.tencent.mm.R.id.smc);
        }
        android.widget.FrameLayout frameLayout = m1Var3.f254595c;
        kotlin.jvm.internal.o.f(frameLayout, "getBtnGrid(...)");
        pf3.d.W(this, frameLayout, null, 1, null);
        pf3.d.U(this, frameLayout, null, new rf3.j(this), 1, null);
        em.m1 m1Var4 = this.f394998v;
        if (m1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var4.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new rf3.k(this), 1, null);
        em.m1 m1Var5 = this.f394998v;
        if (m1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var5.c();
        kotlin.jvm.internal.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new rf3.l(this), 1, null);
    }
}
