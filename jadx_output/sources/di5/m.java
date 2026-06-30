package di5;

/* loaded from: classes12.dex */
public final class m extends pf3.g implements rf3.h {

    /* renamed from: v, reason: collision with root package name */
    public em.j1 f232805v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.FinderPostImageBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    public static final void g0(di5.m mVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar2;
        mf3.s sVar = mVar.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (mVar2 = (dg3.m) mVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar2.Z0(kVar, mVar.f353826s, qVar);
    }

    @Override // rf3.h
    public void D() {
        e0();
        Y(this, new di5.l(this));
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
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejf, (android.view.ViewGroup) null);
        this.f232805v = new em.j1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        Y(this, di5.j.f232802d);
        b0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        Y(this, new di5.k(this));
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
            em.j1 j1Var = this.f232805v;
            if (j1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            if (j1Var.f254462f == null) {
                j1Var.f254462f = (com.tencent.mm.ui.widget.imageview.WeImageView) j1Var.f254457a.findViewById(com.tencent.mm.R.id.bhi);
            }
            j1Var.f254462f.setImageResource(com.tencent.mm.R.raw.icons_gallery_filled);
        }
        em.j1 j1Var2 = this.f232805v;
        if (j1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = j1Var2.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new di5.e(this), 1, null);
        em.j1 j1Var3 = this.f232805v;
        if (j1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (j1Var3.f254459c == null) {
            j1Var3.f254459c = (android.widget.FrameLayout) j1Var3.f254457a.findViewById(com.tencent.mm.R.id.smc);
        }
        android.widget.FrameLayout frameLayout = j1Var3.f254459c;
        kotlin.jvm.internal.o.f(frameLayout, "getBtnGrid(...)");
        pf3.d.W(this, frameLayout, null, 1, null);
        pf3.d.U(this, frameLayout, null, new di5.f(this), 1, null);
        em.j1 j1Var4 = this.f232805v;
        if (j1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = j1Var4.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new di5.g(this), 1, null);
        em.j1 j1Var5 = this.f232805v;
        if (j1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = j1Var5.c();
        kotlin.jvm.internal.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new di5.h(this), 1, null);
        em.j1 j1Var6 = this.f232805v;
        if (j1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.LinearLayout d17 = j1Var6.d();
        kotlin.jvm.internal.o.f(d17, "getGalleryFinderPostBtn(...)");
        pf3.d.U(this, d17, null, new di5.i(this), 1, null);
    }
}
