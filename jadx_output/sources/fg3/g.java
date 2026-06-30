package fg3;

/* loaded from: classes12.dex */
public final class g extends pf3.g implements fg3.a {

    /* renamed from: v, reason: collision with root package name */
    public em.m1 f262433v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.VideoBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        super.F();
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f262433v = new em.m1(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eji, (android.view.ViewGroup) null));
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryLocatePreviewEnabled()) == 1) {
            em.m1 m1Var = this.f262433v;
            if (m1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            if (m1Var.f254597e == null) {
                m1Var.f254597e = (com.tencent.mm.ui.widget.imageview.WeImageView) m1Var.f254593a.findViewById(com.tencent.mm.R.id.bhi);
            }
            m1Var.f254597e.setImageResource(com.tencent.mm.R.raw.icons_gallery_filled);
        }
        em.m1 m1Var2 = this.f262433v;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.view.View view = m1Var2.f254593a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // fg3.a
    public void b() {
        Y(this, fg3.e.f262431d);
        b0();
    }

    @Override // mf3.l
    public void onResume() {
        reset();
    }

    @Override // pf3.g, pf3.h
    public void reset() {
        e0();
        Y(this, new fg3.f(this));
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        em.m1 m1Var = this.f262433v;
        if (m1Var == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout a17 = m1Var.a();
        kotlin.jvm.internal.o.f(a17, "getBtnMore(...)");
        pf3.d.W(this, a17, null, 1, null);
        pf3.d.U(this, a17, null, new fg3.b(this), 1, null);
        em.m1 m1Var2 = this.f262433v;
        if (m1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout b17 = m1Var2.b();
        kotlin.jvm.internal.o.f(b17, "getBtnSave(...)");
        pf3.d.W(this, b17, null, 1, null);
        pf3.d.U(this, b17, null, new fg3.c(this), 1, null);
        em.m1 m1Var3 = this.f262433v;
        if (m1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.widget.FrameLayout c17 = m1Var3.c();
        kotlin.jvm.internal.o.f(c17, "getBtnShare(...)");
        pf3.d.W(this, c17, null, 1, null);
        pf3.d.U(this, c17, null, new fg3.d(this), 1, null);
    }
}
