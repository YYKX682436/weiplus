package mi5;

/* loaded from: classes9.dex */
public final class q implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f326897a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f326898b;

    /* renamed from: c, reason: collision with root package name */
    public fc5.g f326899c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f326897a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f326897a = a17;
        c(null, this.f326899c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        fc5.g gVar = (fc5.g) pVar;
        fc5.g gVar2 = this.f326899c;
        this.f326899c = gVar;
        c(gVar2, gVar);
    }

    public final void c(fc5.g gVar, fc5.g gVar2) {
        x05.c cVar;
        em.v0 v0Var = this.f326897a;
        java.lang.String j17 = gVar2 != null ? gVar2.j() : null;
        if (gVar2 == null || v0Var == null || j17 == null) {
            return;
        }
        android.content.Context context = v0Var.f254859a.getContext();
        l15.c cVar2 = new l15.c();
        cVar2.fromXml(j17);
        v05.b k17 = cVar2.k();
        if (k17 == null || (cVar = (x05.c) k17.getCustom(k17.f432315e + 57)) == null) {
            return;
        }
        z01.p pVar = new z01.p();
        pVar.f469136d = cVar;
        pVar.f469138f = new mi5.p(this, context, cVar, gVar2);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f326898b;
        if (mvvmView != null) {
            mvvmView.setViewModel(pVar);
            return;
        }
        i95.m c17 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        kotlin.jvm.internal.o.d(context);
        this.f326898b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingFinderNameCardMvvmView(context, null, 0, 6, null);
        v0Var.b().addView(this.f326898b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f326898b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(pVar);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f326899c;
    }
}
