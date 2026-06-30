package io;

/* loaded from: classes9.dex */
public final class v implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.v0 f293434a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f293435b;

    /* renamed from: c, reason: collision with root package name */
    public xd5.a f293436c;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        em.v0 v0Var = this.f293434a;
        android.view.View view = v0Var != null ? v0Var.f254859a : null;
        if (view != null) {
            return view;
        }
        em.v0 a17 = em.v0.a(context);
        this.f293434a = a17;
        c(null, this.f293436c);
        return a17.f254859a;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        xd5.a aVar = (xd5.a) pVar;
        xd5.a aVar2 = this.f293436c;
        this.f293436c = aVar;
        c(aVar2, aVar);
    }

    public final void c(xd5.a aVar, xd5.a aVar2) {
        android.content.Context context;
        em.v0 v0Var = this.f293434a;
        l15.c k17 = aVar2 != null ? aVar2.k() : null;
        if (aVar2 == null || v0Var == null || k17 == null || (context = v0Var.f254859a.getContext()) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(ct.t2.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        z01.b0 wi6 = ((te5.y) ((ct.t2) c17)).wi(context, k17);
        wi6.f468954f = com.tencent.mm.R.drawable.d4q;
        wi6.f468955g = new io.u(aVar2, context, k17);
        com.tencent.mm.mvvm.MvvmView mvvmView = this.f293435b;
        if (mvvmView != null) {
            mvvmView.setViewModel(wi6);
            return;
        }
        i95.m c18 = i95.n0.c(q31.r.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((q31.t) ((q31.r) c18)).Ai();
        this.f293435b = new com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingRecordMvvmView(context, null, 0, 6, null);
        v0Var.b().addView(this.f293435b, -1, -1);
        com.tencent.mm.mvvm.MvvmView mvvmView2 = this.f293435b;
        if (mvvmView2 == null) {
            return;
        }
        mvvmView2.setViewModel(wi6);
    }

    @Override // q31.n
    public q31.p getViewModel() {
        return this.f293436c;
    }
}
