package mi5;

/* loaded from: classes9.dex */
public final class f implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326828a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326829b;

    /* renamed from: c, reason: collision with root package name */
    public lb5.a f326830c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326828a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view == null) {
            em.v0 a17 = em.v0.a(context);
            this.f326828a = a17;
            c(null, this.f326830c);
            view = a17.f254859a;
        }
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        view.setScaleX(0.7f);
        view.setScaleY(0.7f);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        lb5.a aVar = (lb5.a) pVar;
        lb5.a aVar2 = this.f326830c;
        this.f326830c = aVar;
        c(aVar2, aVar);
    }

    public final void c(lb5.a aVar, lb5.a aVar2) {
        em.v0 v0Var = this.f326828a;
        if (aVar2 == null || v0Var == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        z01.k kVar = new z01.k();
        kVar.q(c01.id.c());
        kVar.s(0);
        java.lang.String j17 = aVar2.j();
        if (j17 == null) {
            j17 = "";
        }
        kVar.t(j17);
        ot0.q v17 = ot0.q.v(aVar2.k());
        java.lang.String str = v17 != null ? v17.f348646d : null;
        if (str == null) {
            str = "";
        }
        kVar.o(str);
        java.lang.String str2 = v17 != null ? v17.H : null;
        kVar.p(str2 != null ? str2 : "");
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326829b;
        if (mvvmView != null) {
            mvvmView.setViewModel(kVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326829b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingEmojiMvvmView(context, null, 0, 6, null);
        v0Var.b().addView(this.f326829b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326829b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(kVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326830c;
    }
}
