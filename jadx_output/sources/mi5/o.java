package mi5;

/* loaded from: classes9.dex */
public final class o implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326885a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326886b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.f f326887c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326885a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326885a = a17;
        c(null, this.f326887c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.f fVar = (fc5.f) pVar;
        fc5.f fVar2 = this.f326887c;
        this.f326887c = fVar;
        c(fVar2, fVar);
    }

    public final void c(fc5.f fVar, fc5.f fVar2) {
        java.lang.String coverUrl;
        em.v0 v0Var = this.f326885a;
        java.lang.String str = null;
        java.lang.String j17 = fVar2 != null ? fVar2.j() : null;
        if (fVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(j17);
        x05.k kVar = (x05.k) bVar.getCustom(bVar.f432315e + 37);
        if (kVar == null) {
            return;
        }
        x05.n K = kVar.K();
        if (K != null) {
            x05.n K2 = kVar.K();
            if (K2 != null && (coverUrl = K2.getCoverUrl()) != null) {
                str = r26.i0.t(coverUrl, "&amp;", "&", false);
            }
            K.j(str);
        }
        if (kVar.getSourceType() == 0) {
            kVar.U(kVar.I());
        }
        if (kVar.getAuthIconType() == 0) {
            kVar.S(com.tencent.mm.sdk.platformtools.b8.a(kVar.j()));
        }
        if (kVar.getLiveStatus() != 1 && kVar.getLiveStatus() != 2) {
            kVar.T(1);
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.o oVar = new z01.o();
        oVar.f469134d = kVar;
        oVar.f469135e = new mi5.n(kVar, j17);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326886b;
        if (mvvmView == null) {
            i95.m c17 = i95.n0.c(q31.r.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((q31.t) ((q31.r) c17)).Ai();
            kotlin.jvm.internal.o.d(context);
            this.f326886b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderLiveMvvmView(context, null, 0, 6, null);
            v0Var.b().addView(this.f326886b, -1, -1);
            com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326886b;
            if (mvvmView2 != null) {
                mvvmView2.setViewModel(oVar);
            }
        } else {
            mvvmView.setViewModel(oVar);
        }
        ((com.tencent.mm.feature.finder.live.c) ((s40.p0) i95.n0.c(s40.p0.class))).wi(kVar.A(), kVar.C());
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326887c;
    }
}
